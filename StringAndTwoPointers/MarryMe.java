package StringAndTwoPointers;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MarryMe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String a = sc.next();
            String b = sc.next();
            String s1, s2;
            if (a.length() < b.length()) {
                s1 = a;
                s2 = b;
            } else {
                s1 = b;
                s2 = a;
            }
            int i = 0, j = 0;
            while (i < s1.length() && j < s2.length()) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    i++;
                    j++;
                } else {
                    j++;
                }
            }
            if (i == s1.length()) {
                System.out.println("#SadLife");
            } else {
                System.out.println("#DieSingle");
            }
            t--;
        }
    }
}
/*
 * Marry Me (Contest)
 * medium
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Ram is a single boy in his village, everyone in his family are searching a
 * bride for him and recommending for Ram but Ram wants to Die Single, so for
 * prevention of his marriage he came up a plan. He says that he will marry that
 * girl only If recommending member's name is a subsequence of girl name or
 * girl's name is a subsequence of recommending member. Don't worry Ram has a
 * Huge Family. Your task is to determine wether Ram will Die Single or will be
 * married.
 * Input
 * The first line of the input contains an integer T denoting number of test
 * cases.
 * In each test case there contains two space separated strings R and G.
 * 
 * Constraint's
 * 1 ≤ T ≤ 100
 * 1 ≤ |R|, |G| ≤ 25000 (|X| denotes the length of the string X).
 * All names consist of english lower case letter's only.
 * Output
 * For each test case print "#DieSingle" if Ram's family can't find a perfect
 * match, else print "#SadLife". (quotes are meant for clarity, please don't
 * print them).
 * Example
 * Sample Input
 * 2
 * nirali nirali
 * salie galie
 * 
 * Sample Output
 * #SadLife
 * #DieSingle
 * 
 * Explanation
 * Case 1: Any string is a subsequence of it self, as it is formed after
 * removing "0" characters. Hence the answer is "#SadLife".
 * 
 * Case 2: "salie" can not be attained from "galie" as removing any character
 * from "salie" would make the string length smaller than "galie", also there is
 * no 'g' in "salie". Similar reasoning can be applied to see why "galie" can't
 * be attained from "salie". Hence the answer is "#DieSingle".
 */