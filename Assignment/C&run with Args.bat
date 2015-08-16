echo off
set path ="C:\Program Files\Java\jdk1.6.0_06\bin"
:change
cls

ECHO  STARX INC
ECHO  THIS IS FOR  **co5g** 
set /p id = Enter Name of program: 
set /p ig=Enter args : 

javac %id %.java && java %id % %ig% 

pause
cls
goto change