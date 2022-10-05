package RecursionAndGCD;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class PikachusCP {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int max = 0;
        int testcase = sc.nextInt();
        int[] init = new int[testcase];
        int[] fin = new int[testcase];
        int[] F = new int[testcase];
        for (int i = 0; i < testcase; i++) {
            init[i] = sc.nextInt();
            fin[i] = sc.nextInt();
            if (fin[i] > max) {
                max = fin[i];
            }
            F[i] = sc.nextInt();
        }
        boolean[] isprime = new boolean[max + 1];
        for (int i = 2; i <= max; i++) {
            isprime[i] = true;
        }
        for (int i = 2; i <= max; i++) {
            if (isprime[i]) {
                for (int j = 2 * i; j <= max; j += i) {
                    isprime[j] = false;
                }
            }
        }
        int[] arr = new int[max + 1];
        for (int j = 2; j <= max; j++) {
            for (int i = 1; i <= Math.sqrt(j); i++) {
                if (j % i == 0) {
                    if (j / i == i) {
                        if (isprime[i]) {
                            arr[j]++;
                        }
                    } else {
                        if (isprime[i]) {
                            arr[j]++;
                        }
                        if (isprime[j / i]) {
                            arr[j]++;
                        }
                    }
                }
            }
        }

        for (int t = 0; t < testcase; t++) {
            int count = 0;
            for (int j = init[t] + 1; j <= fin[t]; j++) {
                if (arr[j] == F[t]) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(-1);
            } else {
                System.out.println(count);
            }
        }
    }
}

/*
 * Pikachu's CP
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * You have entered the animated world of Pokémon and fortunately you have
 * started your career as a Pokémon Trainer. Your first Pokémon is a Pikachu
 * which is a cherry on top of the cake. Now it is your responsibility to
 * increase your Pikachu's CP (Combat Power) using Power Bics. Consider that
 * initially Cinitial is your Pikachu's CP and you can help him increase its CP
 * to a maximum value, Cfinal.
 * In order to increase your Pokémon's CP in an efficient way you must make sure
 * that after every increase in CP your Pokémon's CP value has exactly F unique
 * prime factors. What is the maximum number of steps in which you can increase
 * the CP of your Pokémon to the maximum possible (with F prime factors),
 * considering every increase in CP as a step. If it is not possible to increase
 * your Pikachu's CP then print -1.
 * Input
 * • The first line of the input contains an integer T denoting the number of
 * test cases. The description of
 * T-test cases follows:
 * • The first line of each test case contains three space-separated integers,
 * Cinitial, Cfinal and F.
 * 
 * Constraints:-
 * • 1 <= T <= 5000
 * • 1 ≤ Cinitial ≤ Cfinal ≤ 10^6
 * • 0 ≤ F ≤ 10
 * Output
 * For each test case, print an integer which is the maximum number of steps to
 * increase Pokémon's CP.
 * Example
 * Sample Input:-
 * 3
 * 3 5 1
 * 3 6 2
 * 3 10 3
 * 
 * Sample Output:-
 * 2
 * 1
 * -1
 */