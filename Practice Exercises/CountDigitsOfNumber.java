import java.util.Scanner;
class CountDigitsOfNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int n = sc.nextInt();
        int x = n;
        int c = 0;
        while(x>0){
            c++; 
            x /= 10;
        }
         System.out.println(n+ " number contains "+ c + " digits.");
    }
}