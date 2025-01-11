import java.util.Scanner;
class SwapNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Value of a and b before swapping: "+ a + " "+b);

        //Swapping two numbers without using 3rd variable

        a= a+b;
        b = a-b;
        a = a-b;

        System.out.println("Value of a and b before swapping: "+ a + " "+b);

    }
}