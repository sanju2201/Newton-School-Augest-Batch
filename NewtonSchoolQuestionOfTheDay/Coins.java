package NewtonSchoolQuestionOfTheDay;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int point1 = 0, count1 = 0, point2 = 0, count2 = 0;
        count1 = amount / 500;
        point1 = count1 * 1000;
        amount = amount % 500;
        count2 = amount / 5;
        point2 = point1 + count2 * 5;
        System.out.print(point2);

    }
}

/*
 * Alice loves coins
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Alice loves coins. He gets 1000 enjoyment points for each 500 rupees coin he
 * has and 5 enjoyment points for each 5 rupees coin he has.
 * 
 * Alice has X rupees. How many enjoyment points can he earn from X amount?
 * 
 * We assume that there are six kinds of coins available: 500- rupees, 100-
 * rupees, 50- rupees, 10- rupees, 5- rupees, and 1- rupees coins.
 * Input
 * The first line contains a single integer X.
 * 
 * Constraints:
 * 1 <= X <=10^9
 * X is an integer
 * Output
 * Find the maximum enjoyment points that Alice can earn.
 * Example
 * Sample Input 1:
 * 1024
 * 
 * Sample Output 1:
 * 2020
 * 
 * 
 * Sample Input 2:
 * 1000000000
 * 
 * Sample Output 2:
 * 2000000000
 * 
 */