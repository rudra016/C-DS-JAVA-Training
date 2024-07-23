package OOP;


import java.util.*;


public class Main {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        for( i = 1; i <= 10; i++){
            System.out.println(i);
            sum+=i;
        }
        System.out.println();
        
        for( i = 10; i > 0; i--){
            System.out.println(i);
        }
        
        System.out.println();
        
        int num = 0;
        while(num <= 10){
            System.out.println(num);
            num++;
        }
        
        System.out.println();
        
        int num2 = 0;
        do{
            System.out.println(num2);
            num2++;
        }while(num2<=10);
        
        System.out.println();
        System.out.println("sum "+sum);
        System.out.println();

        for( i = 1; i <= 10; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        System.out.println();
        for( i = 1; i <= 10; i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }

}
