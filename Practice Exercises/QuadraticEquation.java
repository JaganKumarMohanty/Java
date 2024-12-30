import java.util.Scanner;
class QuadraticEquation{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a,b,c:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double r1 = (-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
        double r2 = (-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);

        System.out.println("r1 ="+r1);
        System.out.println("r2 ="+r2);

    }
}