import java.util.Scanner;
class FactorialNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = sc.nextInt();
        int fact = 1;

        //To find factorial of a given number
        if(n==0){
            System.out.println("Factorial of a given number is: "+fact);
        }else{
            for(int i=n;i>=1;i--){
                fact *= i ;
            }
            System.out.println("Factorial of "+n+" is: "+fact);
        }
    }
}