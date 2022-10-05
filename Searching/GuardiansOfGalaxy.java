package Searching;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class GuardiansOfGalaxy {

    public static boolean buildingCrossed(int[] a, int n, int energy) {
        for (int i = 0; i < n; i++) {
            energy = 2 * energy - a[i];
            if (energy >= 100000) {
                return true;
            }
            if (energy < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // we have to apply binary Search here
        int l = 0;
        int r = 100000;
        int ans = 0;

        while (l <= r) {
            int m = l + (r - l) / 2;
            if (buildingCrossed(a, n, m)) { // make a boolean funtion
                r = m - 1;
                ans = m;
            } else {
                l = m + 1;
            }
        }
        System.out.print(ans);
    }
}

/*
 * Guardians of Galaxy
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * After saving the planet of Xander in 2014 from Ronan, the guardians of the
 * galaxy decided to play a game on it. Between the vast furious oceans, they
 * discover a row of buildings. The buildings are of different heights arranged
 * at each index along a number line. Gamora starts at building 0 and a height
 * of 0. Groot gets the task to determine the minimum thrust that Gamora needs
 * at the start of the game so that she can jump to the top of each building
 * without her thrust going below zero. Write a code to help Groot with his
 * task.
 * The units of height relate directly to units of thrust. Gamora’s thrust level
 * is calculated as follows:
 * • If gamora's thrust is less than the height of the building, her new thrust
 * = gamora's thrust – (height – gamora's thrust)
 * • If gamora's thrust is greater than equal to the height of the building, her
 * new thrust = gamora's thrust + (gamora's thrust - height)
 * Input
 * The first line contains an integer n, the number of buildings.
 * The second line n space- separated integers, arr[1], arr[2]…arr[n], the
 * heights of the building.
 * 
 * Constraints:-
 * 1<=n<=100000
 * 1<=arr[i]<=100000
 * Output
 * The output contains a single integer denoting the minimum thrust Gamora needs
 * at the start of the game.
 * Example
 * Sample Input:-
 * 5
 * 3 4 3 2 4
 * 
 * Sample Output:-
 * 4
 * 
 * Explanation:-
 * If we take 3 then:-
 * at index 1:- 3 + 3-3 = 3
 * at index 2:- 3 - (4-3) = 2
 * at index 3:- 2 - (3-2) = 1
 * at index 4:- 1 - (2-1) = 0
 * 
 * Sample Input:-
 * 3
 * 4 4 4
 * 
 * Sample Output:-
 * 4
 */