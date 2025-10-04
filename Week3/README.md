# Week3 - Software Development

The first exercise is to complete the missing piece of the code provided, which is an example of how to implement an instantiable `EggBox` class in Java and the respective app. bserve that the file provided as `EggBox.java` will compile thanks to extra fixes I added to the required modifications, because the get methods are returning variables declared with a wrong name (lines 24 and 27 returned `leftover` and `boxes` which were never declared). In addition to that, from my point of view, we should make use of the computational declaration of our class variable `boxSize` that is not implemented when hardcoding `6` instead (line 17) but does not affect our program so I'll leave it.

Second exercise is the `WageCalculator` from Week2, also implemented with instantiation. In week2 you can see the operations encounter a logic issue: Inputs either hours or wages shouldn't be 0 or negative numbers. I provided a solution to this in the main app with an aditional debugging step (declared the class variable with assigned value of 0, checking that before input using `while` loops and after with `if` statements)

*Note that this fix won't prevent the programm to crash if user input is not numeric!*

Please find attached the files mentioned above:

EggBox.java
EggBoxApp.java
WageCalculator.java
WageCalculatorApp.java