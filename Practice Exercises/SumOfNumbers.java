import java.util.Scanner;
class SumOfNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = sc.nextInt();
        int sum =0;

        //Sum of n numbers
        for(int i=0; i<=n; i++){
            sum += i;
        }
        System.out.println("Sum of till given number "+n+" is: "+ sum);
    }
}