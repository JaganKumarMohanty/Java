import java.util.Scanner;
class CalculateArea{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       /* System.out.println("Enter Base of a triangle:");
        float b = sc.nextFloat();
        System.out.println("Enter Height of a triangle:");
        float h = sc.nextFloat();

        float area = (b*h)/2;

        System.out.println("Area of a triangle is:"+area);
*/
        //area of triangle using Heron's formula

         System.out.println("Enter a,b1,c value of a triangle:");

         float a = sc.nextInt();
         float b1 = sc.nextInt();
         float c = sc.nextInt();

         float s = (a+b1+c)/2f;

         double area1 = Math.sqrt(s*(s-a)*(s-b1)*(s-c));

         System.out.println("Area of a triangle is:"+area1);


    }
}