echo off
set path ="C:\Program Files\Java\jdk1.6.0_06\bin"
:change
cls
ECHO  STARX INC
ECHO  THIS IS FOR  **co5g** 
set /p id = Enter Name of program: 
set y=y
set n=n
:starx
ECHO/compilation starts/
javac %id %.java
echo /compilation ends/
set /p ig=Enter args : 
echo /program starts/
echo /..
java %id % %ig% 
echo ../
echo /program ends/
set /p ch=Repeat(y=REPEAT/ n=Change PRogram name)
if %ch% == %y% goto :starx
cls
goto change