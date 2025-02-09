import java.util.Scanner;
class FibonacciSeries{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the 1st term of the series:");
        int a = sc.nextInt();
        System.out.println("Please enter the 2nd term of the series:");
        int b = sc.nextInt();
        System.out.println("Enter the size of Fabonacci Series:");
        int n = sc.nextInt();
        int c;
        System.out.println("Fibonacci Series is :");
        System.out.print(a+"\t"+b+"\t");
        for(int i=1;i<n-1;i++){
            c = a+b;
            System.out.print(c+"\t");
            a = b;
            b = c;

        }
    }

}