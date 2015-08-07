echo off
set path ="C:\Program Files\Java\jdk1.6.0_06\bin"
cls
:change
ECHO  STARX INC
ECHO  THIS IS FOR  **co5g** 
set /p id = Enter Name of program: 
set y=y
:starx
ECHO/compilation starts/
javac %id %.java
echo /compilation ends/
pause
cls
ECHO  STARX INC
ECHO  THIS IS FOR **co5g** 
echo /program starts/
echo /..
java %id %
echo ../
echo /program ends/
set /p ch=Repeat(y/n)
if %ch% == %y% goto starx
cls
goto change
