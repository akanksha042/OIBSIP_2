# OIBSIP_2
Guess the Number Program in Java Task 2
This is a Java program called "GuessTheRandomNumber" which is a simple game where the user tries to guess a random number between 1 and 100 within 10 attempts. The program prompts the user to enter the number of rounds they want to play, and then for each round, it generates a new random number between 1 and 100, and the user tries to guess the number.

The program starts by importing the required Java classes, which are "java.util.Random" for generating random numbers, and "java.util.Scanner" for taking user input from the console.

Then, the "main" method is defined, which is the entry point of the program. The program first creates a new instance of the "Random" class using the "random_number" variable, and creates a new instance of the "Scanner" class using the "scan" variable to read user input from the console.

The program then prompts the user to enter the number of rounds they want to play, which is stored in the "num_rounds" variable. The total score is also initialized to zero.

Next, a "for" loop is used to iterate over each round, starting from round 1 and up to the number of rounds entered by the user. For each round, a new random number is generated using the "nextInt()" method of the "Random" class, and stored in the "right_guess" variable. The number of turns is initialized to zero.

The program then prompts the user to guess the number, and informs them that they have 10 turns to guess the number. The program also informs the user that each correct guess earns them 10 points, and the objective is to guess the number in fewer turns to get a higher score.

The program then starts a "while" loop that runs until the user either guesses the number correctly, runs out of turns, or chooses to quit the game. The user's guess is stored in the "guess" variable, and the number of turns is incremented.

If the user guesses the number correctly, the "win" variable is set to true, and the loop is exited. If the user runs out of turns without guessing the number correctly, the program informs the user that they lost the round, and the loop is also exited.

If the user's guess is higher or lower than the random number, the program informs the user that their guess is higher or lower than the right guess, and how many turns are left.

After the loop is exited, the program checks if the user won the round or not. If the user won the round, their score is calculated based on how many turns they took to guess the number, and added to the total score. If the user lost the round, the program informs them of this, but their score is not added to the total score.

After all rounds are completed, the program prints the user's total score for all rounds, and also thanks the user for playing the game.
