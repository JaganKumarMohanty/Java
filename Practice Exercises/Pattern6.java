/*
* * * * * 
  * * * * 
    * * * 
      * * 
        * 
*/
import java.util.Scanner;
class Pattern6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int x = sc.nextInt();//5
        for(int i=1;i<=x;i++){
            for(int j=1;j<=x;j++){
                if(j>=i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }

    }
}