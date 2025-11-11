# Week 9 - Software Development

## Lab – String App

### Objective

In this lab we created a Java application which accepts a String input from the user and performs multiple string manipulation operations.

The program assumes the input may only contain:
letters, spaces and full stops (.).

Features:

| Requirement | Description |
|------------|-------------|
| Count letters | The program scans each character and counts only alphabetic characters using `Character.isLetter()`. |
| Count vowels | Counts total vowels (both upper & lowercase). |
| Store every second letter | Split into a `word` array, then return `index: 1` if the word has more that 2 characters. |
| Store positions of each space | Tracks all index positions where a space `' '` occurs. |
| Print new output where vowels are replaced | Builds a new String where `a,e,i,o,u` (upper/lower) are replaced with `!`. |

Structure:

App class `StringApp.java` use instantiable classes to call get methods in a modular approach.

The application uses multiple compute methods inside the same class to handle each separate task.

StringBuilder is used for efficient string manipulation following the reference material (similar to StringBuffer concepts).


Methods used:
```
charAt(), indexOf(), length(), split(), toString(), toCharArray(), trim()
```

User Flow:

User enters a sentence.

Application prints:
```
total letters
total vowels
every 2nd letter
the list of space index positions
the new string with vowels replaced as !
```
Input:

`Hello world.`

Output:

```
Total letters: 10
Total vowels: 3
Every second letter: e o
Space positions: 5
Vowels replaced: H!ll! w!rld.
```