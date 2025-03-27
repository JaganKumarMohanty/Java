/*
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
*/
import java.util.Scanner;
class pattern1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int x = sc.nextInt();
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}