#include<bits/stdc++.h>
#pragma GCC optimize "03"
using namespace std;
#define Abhishek main
#define int long long int
#define ld long double
#define pi pair<int, int>
#define pb push_back
#define fi first
#define se second
#define IOS ios::sync_with_stdio(false); cin.tie(0); cout.tie(0)
#ifndef LOCAL
#define endl '\n'
#endif
 
const int N = 2e5 + 5;
const int mod = 1e9 + 7;
const int inf = 1e9 + 9;

int power(int a, int b){
	int ans = 1;
	b %= (mod-1);
	while(b){
		if(b&1)
			ans = (ans*a) % mod;
		b >>= 1;
		a = (a*a) % mod;
	}
	return ans;
}

int f(int n, int p){
	int ans = 1;
	int cur = 1;
	while(cur <= n/p){
		cur = cur*p;
		int z = power(p, n/cur);
		ans = (ans*z) % mod;
	}
	return ans;
}

signed Abhishek() {
	IOS;
	int x, n, ans = 1;
	cin >> x >> n;
	for(int i = 2; i*i <= x; i++){
		if(x%i != 0)	continue;
		ans = (ans*f(n, i)) % mod;
		while(x%i == 0)
			x /= i;
	}	
	if(x > 1)
		ans = (ans*f(n, x)) % mod;
	cout << ans;
	return 0;
}


// java  Soluutionn with   TLE

//-------------------------------------------------------------------------------------//
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
      static long mod = 1000000007;

    static long pow(long a, long b) { // logn
        long res = 1;
        while (b != 0) {
            if (b % 2 == 1)
                res = (res * a) % mod;
            a = (a * a) % mod;
            b = b / 2;
        }
        return res;
    }

    static long f(long x, long p) {
        long curr = 1;
        while (x % pow(p, curr) == 0) {
            curr++;
        }
        return pow(p, curr - 1);
    }

    static ArrayList<Long> getPrimes(long n) {
        ArrayList<Long> li = new ArrayList<>();
        if (n % 2 == 0) {
            li.add(2L);
            while (n % 2 == 0)
                n /= 2;
        }
        for (long i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                while (n % i == 0)
                    n /= i;
                li.add(i);
            }
        }
        if (n > 2)
            li.add(n);
        return li;
    }


    static long g(List<Long> primes, int y) {
        long ans = 1;
        for (long num : primes) {
            ans = (ans * f(y, num)) % mod;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long n = sc.nextLong();
        long ans = 1;
        ArrayList<Long> primes = getPrimes(x);
        for (int i = 1; i <= n; i++) {
            ans = (ans * g(primes, i)) % mod;
        }
        System.out.println(ans);
    }
}
