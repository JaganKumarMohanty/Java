import java.util.Scanner;
class DisplayOfDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int n = sc.nextInt();
        System.out.println("Below are the digits of "+ n);
        while(n>0){
            int digit = n % 10;
            System.out.println(digit);
            n /= 10;
        }
    }
}