/*
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
*/
import java.util.Scanner;
class Pattern5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int x = sc.nextInt();//5
        for(int i=x;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
                
            }
            System.out.println();
        }

    }
}