import java.util.Scanner;
class Cuboid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of length,breadth and height:");
        int l = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();

        int totalArea = 2*(l*b+b*h+l*h);
        System.out.println("Total area of Cuboid:"+totalArea);

        int volume = l*b*h;
        System.out.println("Volume of Cuboid:"+volume);

    }
}