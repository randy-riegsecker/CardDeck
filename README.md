# CardDeck
**CardDeck** is an application that uses a the modified Fisher-Yates algorithm to shuffle a deck of cards stored in an integer array, and then it displays the deck of 52 playing cards on the screen.

## Shuffling Algorithm
At first glance, you'd think using Random or SecureRandom classes would work well to randomly shuffle an array.  In reality, they don't give you the good "randomness" you expect when shuffling cards. These classes actually generate a stream of pseudorandom numbers, which are not truly random.  Frequently, you'd end up over-shuffling the same positions or missing some entirely. Fisher-Yates solves this problem by making sure all the cards participate in the shuffling.

I've developed a reusable **Randomizer** class based on the the Fisher-Yates algorithm with several methods that can be used if you need to perform a good shuffle.  For this example, the code uses the the modified Fisher-Yates algorithm to shuffle 52 numbers as a deck of cards, and then it displays the randomized cards.

The code is written in Java and the application was developed using IntelliJ Idea Community Edition.

## Randomizer Class

A class that creates a random sized array of integers of size passed.  This is based on a variant of the Fisher-Yates shuffle, and avoids the negative effects of over-shuffling.

## To Instantiate
```
Randomizer n = new Randomizer(sizePassed);
```
sizePassed = Length of array to randomize (integer)

Integer range starts at 0 and ends at {sizePassed-1}.  For example, if {sizePassed} is 10, the integer range is from 0-9.

## Methods
**int nextInt()** - Return the integer value in the current position from the ArrayList and increment the position; when the end of the array is reached, it automatically reshuffles the array and returns the first element of the reshuffled array.

## Output
```
Card Deck In Order
Ace of Clubs
2 of Clubs
3 of Clubs
4 of Clubs
5 of Clubs
{...}
9 of Diamonds
10 of Diamonds
Jack of Diamonds
Queen of Diamonds
King of Diamonds

Random Card Deck Order
7 of Hearts
5 of Clubs
2 of Clubs
8 of Hearts
5 of Diamonds
King of Diamonds
{...}
2 of Diamonds
Ace of Hearts
8 of Clubs
9 of Hearts
7 of Spades
4 of Diamonds
Ace of Spades

Process finished with exit code 0
```

## For More Information

Here is an excellent YouTube video demo by Adam Khoury showing the algorithm in action:  [Fisher-Yates Shuffle Modern Algorithm JavaScript Programming Tutorial](https://youtu.be/tLxBwSL3lPQ)

This is the Wikipedia explanation:  [Fisher-Yates Shuffle](https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle/)

Happy Coding!

Randy Riegsecker
