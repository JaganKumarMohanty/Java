import java.util.Scanner;
class CheckYoung{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age of the person:");
        int age = sc.nextInt();// Enter the age of the person

        //Checking the entered age is young or not.
        if(age >= 14 && age<= 55){
            System.out.println("Young");
        }else{
            System.out.println("Not Young");
        }
    }
} 