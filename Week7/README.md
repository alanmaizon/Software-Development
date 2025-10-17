# Week7 - Software Development

Question 2
Alter the guessing game application so that every time it plays the user is asked do they want to play again. Depending on what the user enters the application should keep going until they wish to stop.


Bonus: store the user guesses and return them to the user when they finish or win.
Note this may necessitate the creation of a large blank array

`Random.java`
`RandomApp.java`

Included boolean TryAgain

For the bonus I needed to add an array of dimension 3:
attempt[count]=userInput 

to store the inputs and a reset method to restart count=0
That works just fine for our case and we use the getAttempts

Got a great time learning about the utility library and the specific function `Arrays.toString`
Also experimenting `JOptionPane` functions for boolean values: 
JOptionPane.YES_NO_OPTION --> BASE ON USER INPUT BUTTON RETURNS BOOLEAN JOptionPane.YES_OPTION (TRUE)
and how to add a title for our program windows with JOptionPane.INFORMATION_MESSAGE.



Question 4
Create a preset array of numbers. Create a piece of code that chooses the largest number from that array

`PresetArray.java`

Question 5
Return the mean and sum of an array of numbers

`SumArray.java`

