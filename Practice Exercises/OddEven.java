import java.util.Scanner;
class OddEven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //Checking Even or Odd
        if (num % 2 == 0){
            System.out.println(num+" is even number.");
        }else{
            System.out.println(num+" is odd number.");
        }
    }
}