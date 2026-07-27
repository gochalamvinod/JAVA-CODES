@echo off
setlocal enabledelayedexpansion
title JAVA-CODES Auto Sync

set "REPO_DIR=C:\Users\gocha\Desktop\JAVA FOR GITHUB"
set "LOG_FILE=%REPO_DIR%\sync_log.txt"
set "SYNC_INTERVAL=10"
set "MAX_RETRIES=3"

cd /d "%REPO_DIR%" || (
    echo [ERROR] Could not find directory: %REPO_DIR%
    pause
    exit /b 1
)

if not exist ".git" (
    echo [ERROR] This is not a git repository. Run "git init" first.
    pause
    exit /b 1
)

echo ========================================
echo       JAVA-CODES AUTO SYNC
echo ========================================
echo Repository : %CD%
echo Interval   : %SYNC_INTERVAL% seconds
echo Log file   : %LOG_FILE%
echo Press Ctrl+C to stop.
echo ========================================
echo.

:LOOP

git rev-parse --is-inside-work-tree >nul 2>&1
if errorlevel 1 (
    call :LOG "[ERROR] Not inside a git working tree. Skipping cycle."
    goto WAIT
)

git add -A

git diff --cached --quiet
if %errorlevel% EQU 0 (
    call :LOG "[%date% %time%] No changes detected."
    goto WAIT
)

call :LOG "[%date% %time%] Change detected. Committing..."

git commit -m "Auto sync %date% %time%" >nul 2>&1
if errorlevel 1 (
    call :LOG "[ERROR] Commit failed."
    goto WAIT
)

set "PUSH_OK=0"
for /L %%i in (1,1,%MAX_RETRIES%) do (
    if "!PUSH_OK!"=="0" (
        call :LOG "[PUSH] Attempt %%i of %MAX_RETRIES%..."
        git push >nul 2>&1
        if !errorlevel! EQU 0 (
            set "PUSH_OK=1"
            call :LOG "[SUCCESS] Push completed successfully."
        ) else (
            call :LOG "[WARN] Push attempt %%i failed. Retrying..."
            timeout /t 5 /nobreak >nul
        )
    )
)

if "%PUSH_OK%"=="0" (
    call :LOG "[FAIL] Push failed after %MAX_RETRIES% attempts. Will retry next cycle."
)

:WAIT
timeout /t %SYNC_INTERVAL% /nobreak >nul
goto LOOP

:LOG
echo %~1
echo %~1 >> "%LOG_FILE%"
goto :eof