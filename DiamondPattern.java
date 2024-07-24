import java.util.Scanner;
public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PrintDiamondPattern(n);
        sc.close();
    }
    public static void PrintDiamondPattern(int n){
       for(int i=0;i<n+1;i++){
        for(int space=0;space<n-i;space++){
            System.out.print(" ");
        }
        for(int j=0;j<i;j++){
            System.out.print("*"+" ");

        }
        System.out.println();
       }
       for(int i=n-1;i>=1;i--){
        for(int space=0;space<n-i;space++){
            System.out.print(" ");
        }
        for(int j=i;j>=1;j--){
            System.out.print("*"+" ");
        }
        System.out.println();
       }
    }
}
