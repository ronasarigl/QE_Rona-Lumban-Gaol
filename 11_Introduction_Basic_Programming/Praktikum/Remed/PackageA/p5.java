package PackageA;

import java.util.Scanner;

public class p5 {
    private static boolean primenumber(int n){
        if (n < 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(primenumber(1));//True
        System.out.println(primenumber(13));//True
        System.out.println(primenumber(17));//True
        System.out.println(primenumber(20));//False
        System.out.println(primenumber(35));//False
    }
    }

