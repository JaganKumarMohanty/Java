import java.util.Scanner;
class PallindromeNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = sc.nextInt();
        int x=n;
        int sum = 0;
        while(x>0){
            int rem = x % 10;
            sum = (sum*10)+rem;
            x /= 10;
        }
        if(n == sum){
            System.out.println(n +" is a Pallindrome number.");
        }else{
            System.out.println(n +" is not a not Pallindrome number.");
        }
    }
}