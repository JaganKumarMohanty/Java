import java.util.Scanner;
class DisplayMultiplicationTable{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number to get multiplication table: ");
        int n = sc.nextInt();

        //It will print multiplication table for a given number
        for(int i=1;i<=10;i++){
            int mul = n*i ;
            System.out.println(mul);
        }
    }
}