import java.util.Scanner;
class ArithmaticProgressionSeries{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the value for Common Difference: ");
        int d = sc.nextInt();
        System.out.println("Enter the size of series:");
        int n = sc.nextInt();
        System.out.println("The AP will be:");
        for(int i=0;i<n;i++){
            System.out.print(a+"\t");
            a= a+d;
        }
    }
}