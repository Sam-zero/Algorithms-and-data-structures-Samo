import java.util.Scanner;
public class Main {

    //1.Complexity: linear - O(N)
    public static int mini(int[] a, int n) {
        if (n==1) return a[0];
        return Math.min(a[n-1], mini(a,n-1));
    }
    public static void task1() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(mini(a, n));
    }

    //2.Complexity: linear - O(N)
    public static double avarage(int[] a, int n) {
        if(n==1) return a[0];
        return (a[n-1]+(n-1)*avarage(a,n-1))/n;
    }
    public static void task2() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(avarage(a, n));
    }

    //3.Complexity: O(sqrt(N))
    public static int prime(int n) {
        if (n < 2) return 0;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }
    public static void task3() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (prime(n)==0) {
            System.out.println("Composite");
        }
        else {
            System.out.println("Prime");
        }
    }

    //4.Complexity: linear - O(N)
    public static int factorial(int n) {
        if (n <= 0) return 1;
        return factorial(n - 1) * n;
    }
    public static void task4() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(factorial(n));
    }

    //5.Complexity: exponential - O(2^N)
    public static int fibonnacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonnacci(n - 1) + fibonnacci(n - 2);
    }
    public static void task5() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonnacci(n));
    }

    //6.Complexity: linear - O(B)
    public static int pow(int a, int b) {
        if (b == 0) return 1;
        return pow(a, b - 1) * a;
    }
    public static void task6() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(pow(a, b));
    }

    //7.Complexity: O(N!)
    private static void permutation(String previousstr, String startstr) {
        if (startstr.length() == 0) {
            System.out.println(previousstr);
            return;
        }

        for (int i = 0; i < startstr.length(); i++) {
            String nextstr = previousstr + startstr.charAt(i);
            String endstr = startstr.substring(0, i) + startstr.substring(i + 1);
            permutation(nextstr, endstr);
        }
    }

    public static void task7() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        permutation("",str);
    }

    //8.Complexity: linear - O(N)
    public static int digit(String str) {
        if(str.length()==0) return 1;
        if((str.charAt(0)<'0') || (str.charAt(0)>'9')) return 0;
        return digit(str.substring(1));
    }
    public static void task8() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (digit(str) == 1) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

    //9.Complexity: exponential - O(2^N)
    public static int Ckn(int n, int k) {
        if (k == 0 || k == n) return 1;
        return Ckn(n - 1, k - 1) + Ckn(n - 1, k);
    }

    public static void task9() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        System.out.println(Ckn(n,k));
    }

    //10.Complexity: logarithmic - O(log(min(A,B))
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    public static void task10() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(gcd(a, b));
    }
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }
}
