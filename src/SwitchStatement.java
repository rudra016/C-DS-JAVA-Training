import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Grade :");
         int num = sc.nextInt();


    switch (num){
        case 10 :
            System.out.println("Fail");
            break;
        case 50:
            System.out.println("D");
            break;
        case 80:
            System.out.println("B");
            break;
        case 90:
            System.out.println("A");
            break;
        default:
            System.out.println("Average");
    }

    }
}
