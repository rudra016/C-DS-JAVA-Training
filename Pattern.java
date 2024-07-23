package OOP;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pattern1(4);
        System.out.println();


        Pattern3(4);
        System.out.println();
        Pattern4(4);
    }
    static void Pattern1(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void Pattern3(int n){
        for (int i = 0; i <=2*n; i++) {
            int totalcols = i > n ? 2*n-i:i;
            for (int j = 1; j <totalcols ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void Pattern4(int n){
        for (int i = 1; i <=n; i++) {
            for (int k = 0; k <n-i ; k++) {
                System.out.print("  ");
            }

            for (int j = i; j >=1 ; j--) {
                System.out.print(j+" ");
            }
            for (int j = 2; j <=i; j++) {
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}
