@echo off
setlocal enabledelayedexpansion

rem Resolve script directory
set SCRIPT_DIR=%~dp0

rem Ensure .mvn\wrapper\install-maven.ps1 runs to install Maven locally
powershell -NoProfile -ExecutionPolicy Bypass -Command "& '%SCRIPT_DIR%\.mvn\wrapper\install-maven.ps1'"

set MAVEN_CMD=%SCRIPT_DIR%\.mvn\apache-maven\bin\mvn.cmd
if exist "%MAVEN_CMD%" (
  "%MAVEN_CMD%" %*
  exit /b %ERRORLEVEL%
) else (
  echo Failed to find local Maven after install.
  exit /b 1
)
