/*
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15
*/
import java.util.Scanner;
class Pattern4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int x = sc.nextInt();//5
        int count = 0;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                count++;
                System.out.print(count + " ");
                
            }
            System.out.println();
        }

    }
}