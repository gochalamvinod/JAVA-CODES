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

REM Add all changes from ALL subfolders
git add .

REM Check whether anything changed
git diff --cached --quiet

if %errorlevel% EQU 1 (
    echo.
    echo [CHANGE DETECTED]
    
    git commit -m "Auto sync"

    if %errorlevel% EQU 0 (
        echo [PUSHING TO GITHUB...]
        git push
    ) else (
        echo [COMMIT FAILED]
    )
) else (
    echo [%date% %time%] No changes.
)

REM Check every 10 seconds
timeout /t 10 /nobreak >nul

goto LOOP