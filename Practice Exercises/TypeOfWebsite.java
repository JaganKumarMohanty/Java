import java.util.Scanner;
class TypeOfWebsite{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter domain name: ");
        String domain = sc.nextLine();
        String ext = domain.substring(domain.lastIndexOf(".")+1);
        switch(ext){
            case "com":
                System.out.println("Commercial");
                break;
            case "org":
                System.out.println("Organizational");
                break;
            case "edu":
                System.out.println("Education");
                break;
            default:
                System.out.println("Please enter a valid numberextension name.");
        }
    }

}