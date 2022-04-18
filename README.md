# Hangman
Java hangman game
In this homework, you will create an application for playing a modified and simple version of 
"AdamAsmaca" with numbers. The idea is just to guess numbers, not the correct places. In this 
application, your game should keep information about Player. In addition it should include 
a driver class named PlayGame. 
 Player objects will include information about the name of the player, the number of 
wins (numWin), the number of times game played (playCount) and the maximum 
level (maxLevel) she has reached.
 PlayGame should include a method called adamAsmaca() and generateReport()
Your application should satisfy the requirements given below:
1. Your program should start by displaying a menu as given below:
Enter your choice:
1. Start Game
2. End Game
2. If 1 is entered, your program should ask the user's name and create a new Player with 
this name. The default value for maxLevel is 1. playCount and numWin should be given 
default values appropriately so that at the end of the game for a user, your program 
should display the number of times the user played the game, the maximum level she has 
reached, the number of games she winned. Then the adamAsmaca() method will be 
called. This method will take the Player object created. It will start playing the game 
according to maxLevel field of the Player object.
3. There are 3 levels in your program, in Level 1 you will ask a number in 3 digits and the 
user has 8 guess chances. In Level 2 you will ask a number in 4 digits and the user has 10
guess chances. In Level 3 you will ask a number in 5 digits and the user has 12 guess 
chances.
4. The number you ask should be displayed as follows: (for four digits) :****
5. The user will than type a digit between 0-9, 0 and 9 included.
6. You will take the digit.
7. You will look whether digit exists in your hidden number.
8. If exists display the digit as: **0*
9. It is possible to have duplicate digits in a hidden number.
10. If user could not successfully guess the number at the end of the number of chances 
defined by her level, you will display "You lost the Game!"
11. If she wins, that is correctly guesses the number within the number of guess chances, you 
will display "You win the Game".
12. In either case of win or lose adamAsmaca() method will return.
13. If the user wins, you should increment the maxLevel of the player, and update playCount 
and numWin accordingly.
14. The maxLevel of the game is 4, after 4 you should not increment the level.
15. After a game completed, you will redisplay the menu
16. If user presses 1 again, this means she will start a new game. Therefore, you will recall 
adamAsmaca() with again the same player, but this time, if she wins the previous game, 
she will start with the next level.
17. This execution continues until 2 is entered for ending game after a game finished or 
endOfFile indicator for Windows is pressed at any time(Even during the execution of a 
game).
18. If user presses 2 at the end of a game, you will call generateReport() method of the 
PlayGame class with the player object as the argument. The method will display the 
name, numWin, maxLevel and playCount of the PlayerObject.
19. At any time, the user will exit the application by pressing end of file indicator of 
Windows. If this happens, your program should again call generateReport() first, then it 
should end execution
