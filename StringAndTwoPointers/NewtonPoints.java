package StringAndTwoPointers;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NewtonPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int point = sc.nextInt();
        String s = sc.next();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'o') {
                point++;
            } else if (s.charAt(i) == 'x') {
                point--;
                if (point < 0) {
                    point = 0;
                }
            }
        }
        System.out.print(point);
    }
}

/*
 * Newton Points
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Newton initially has P points and he wants to play a game to earn more
 * points. If he wins the game, he will gain 1 point but if he losses the game
 * he will lose 1 point. He will play the game N number of times.
 * 
 * You want to find the points that Newton has after he has finished playing.
 * Newton has given you a string of size N of o's and x's. In which 'o'
 * represents that newton won the game, 'x' represents that newton lost the
 * game.
 * 
 * Find the points that Newton has after all the game are finished.
 * 
 * ( Note: If after sometime Newton has 0 points and he loses another game, then
 * no point will be deducted )
 * Input
 * The first line of the input consists of 2 integers, N and P.
 * The second line of the input consists of a string of length N.
 * 
 * Constraints:
 * 1 <= N <= 5x10^5
 * 0 <= P <= 5x10^5
 * S is a string of length N consisting of o and x.
 * Output
 * Output the total points that Newton has in the end.
 * Example
 * Sample Input 1:
 * 3 0
 * xox
 * 
 * Sample Output 1:
 * 0
 * 
 * 
 * Sample Input 2:
 * 20 199999
 * oooooooooxoooooooooo
 * 
 * Sample Output 2:
 * 200017
 */