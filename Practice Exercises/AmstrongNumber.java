import java.util.Scanner;
class AmstrongNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int n = sc.nextInt();
        int x =n;
        int y=n;
        int sum = 0;
        int c = 0;
        while(y>0){
            c++; 
            y /= 10;
        }
        while(x>0){
            int digit = x % 10;
            sum += Math.pow(digit,c);
            x /= 10;
        }
        if(n == sum){
            System.out.println(n +" is a amstrong number.");
        }else{
            System.out.println(n +" is not a amstrong number.");
        }
    }

}