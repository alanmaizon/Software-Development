# Week6 - Software Development

Create an application that asks a user how many subjects they take, and will then ask what marks (0-100) they got in each subject. The application should then output their average result
Bonus: Tell the user their grade from A-F based on their results

Input NoSubj(INT), Mark(INT 100)
Output mean(DOUBLE) Grade(String:A-B-C-D-E-F)
Process 
start--> totalSub=0 and totalMarks=0, 
take input and start the condition 
--> for i=1, i<=subjects i++ in loop 
validation input if mark<100 && mark>0
--> store totalMarks=totalMarks+mark, compute mean=totalMarks/totalSub

Bonus: I apply the following logic in computeGrade:

if A(mark<=100&&mark>80), 
if else B(mark<=80&&mark>60), 
if else C(mark<=60&&mark>40), 
if else D(mark<=40&&mark>20), 
if else F(mark<=20&&mark>=0)


Take the previously created number guessing game application`RandomApp.java` and make it so that a user has 3 turns
Bonus: The loop should stop if the user gets the correct answer
Bonus: The game should alter the random number each turn

Input userInput (INT), newRandom(randomNum(INT))
Output Random(str(STRING)), i(turns remaining)

Bonus: We will use the for loop and if else for the turns, if the user gets the correct answer, we stop the process.