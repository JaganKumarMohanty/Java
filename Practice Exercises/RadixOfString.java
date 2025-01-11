import java.util.Scanner;
class RadixOfString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String num = sc.nextLine();
        if(num.matches("[01]+")){
            System.out.println("Binary Radix = 2.");
        }else if(num.matches("[0-7]+")){
            System.out.println("Octal Radix = 8.");
        }else if(num.matches("[0-9]+")){
            System.out.println("Decimal Radix = 10.");
        }else if(num.matches("[0-9A-F]+")){
            System.out.println("Hexadecimal Radix = 16.");
        }else{
            System.out.println("String is not a valid radix.");
        }

    }
}