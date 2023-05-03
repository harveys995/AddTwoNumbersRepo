public class add {
    public static void main (String[] args) {
        int num1 = 10;
        int num2 = 300;
        int num3 = 5;
        int num4 = 5000000 * num3;
        for (int i = 0; i < num2; i++) {
            num1++;
        }
        System.out.println(num1);
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:")
        int age = sc.nextInt();
        if (age < 0) {
            System.out.println("Invalid age");
        }
    }
}