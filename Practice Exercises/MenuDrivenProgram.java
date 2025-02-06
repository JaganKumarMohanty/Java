import java.util.Scanner;
class MenuDrivenProgram{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int a = sc.nextInt();
        System.out.println("Please enter second number: ");
        int b = sc.nextInt();
        sc.nextLine();
        System.out.println("Please choose an opertion you want to perform: \nADD\nSUB\nMUL\nDIV\nMOD");
        System.out.println("Please choose an operation from above you want to perform:");
        String ch = sc.nextLine();
        ch=ch.toUpperCase();
        switch(ch){
            case "ADD":
                int sum= a+b;
                System.out.println("Sum of "+a+" and "+b+" is: "+ sum);
                break;
             case "SUB":
                int sub= a-b;
                System.out.println("Sum of "+a+" and "+b+" is: "+ sub);
                break;
             case "MUL":
                int mul= a*b;
                System.out.println("Sum of "+a+" and "+b+" is: "+ mul);
                break;
             case "DIV":
                int div= a/b;
                System.out.println("Sum of "+a+" and "+b+" is: "+ div);
                break;
             case "MOD":
                int mod= a%b;
                System.out.println("Sum of "+a+" and "+b+" is: "+ mod);
                break;
            default:
                System.out.println("Please choose a vaild operation from given list.");
        }
    }
}