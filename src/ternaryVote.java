public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(vote(age));
    }

    private static String vote(int age) {
        return age >= 18 ? "Eligible" : "Not Eligible";
    }
}
