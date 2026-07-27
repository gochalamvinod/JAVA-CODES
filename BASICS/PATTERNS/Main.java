@echo off
title JAVA-CODES Auto Sync
cd /d "C:\Users\gocha\Desktop\JAVA FOR GITHUB"

echo ========================================
echo       JAVA-CODES AUTO SYNC
echo ========================================
echo Repository: %CD%
echo.
echo Press Ctrl+C to stop.
echo.

:LOOP

git add .

git diff --cached --quiet

if %errorlevel% EQU 1 goto CHANGES

echo [%date% %time%] No changes.
goto WAIT

:CHANGES
echo.
echo [CHANGE DETECTED]
echo [COMMITTING...]

git commit -m "Auto sync"

echo [PUSHING TO GITHUB...]

git push

if %errorlevel% EQU 0 (
    echo [SYNC SUCCESSFUL]
) else (
    echo [PUSH FAILED - WILL TRY AGAIN]
)

:WAIT
timeout /t 10 /nobreak >nul
goto LOOP