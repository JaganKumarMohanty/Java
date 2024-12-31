import java.util.Scanner;
class LargestNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a,b&c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //Checking Largest Number among given 3 numbers
        if(a>b && a>c){
            System.out.println(a+" is the lasrgest number among "+a+" "+b+" "+c);
        }else{
            if(b>c){
                System.out.println(b+" is the lasrgest number among "+a+" "+b+" "+c);
            }else{
                System.out.println(c+" is the lasrgest number among "+a+" , "+b+" & "+c);
            }
        }
    }
}