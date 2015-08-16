echo off
echo I hope you have set path of javac and java 
cls
:change

ECHO  STARX INC
ECHO  THIS IS FOR  **co5g** 
set /p id = Enter Name of program: 

javac %id %.java && java %id %
pause
cls
goto change

