import java.util.Scanner;
class MaskingAndSwapping{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("After Swapping value of A and B is:"+ a+" "+b);
    }
}