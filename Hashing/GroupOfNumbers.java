package Hashing;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class GroupOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                int count = map.get(arr[i]);
                map.put(arr[i], count + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        ArrayList<Integer> li = new ArrayList<>(map.keySet());
        Collections.sort(li, (num1, num2) -> {
            if (map.get(num1) == map.get(num2))
                return num2 - num1;
            else
                return (map.get(num2) - map.get(num1));
        });

        for (int i : li) {
            System.out.print(i + " ");
        }

    }
}

/*
 * Group of Numbers
 * medium
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * You are given an array a that contains N integers. All the integers in the
 * array may not be distinct. The number of repetitions of each integer in the
 * array is represented by ri. Your task is to print the integers in the
 * decreasing order of their occurrence in the array.
 * 
 * Note
 * 1. If ri > rj, then ai must be printed before aj.
 * 2. If ri == rj, then among ai and aj whichever has a larger value, is printed
 * first.
 * 
 * Here ri and rj is the number of repetitions of integers ai and aj in the
 * array.
 * Input
 * The first line of the input contains an integer N.
 * The second line contains N space- separated integers representing the
 * elements of array a.
 * 
 * Constraints
 * 1<= N <= 1000
 * 1<= ai <= 1000
 * Output
 * Print the space separated integers in the decreasing order of their
 * occurrence in the array. The output must be printed in a single line.
 * Example
 * Sample input:
 * 6
 * 1 2 3 3 2 1
 * 
 * Sample Output
 * 3 2 1
 */