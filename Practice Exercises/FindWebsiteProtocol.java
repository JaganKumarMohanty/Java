import java.util.Scanner;
class FindWebsiteProtocol{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a URL: ");
        String url = sc.nextLine();
        String protocol = url.substring(0,url.indexOf(":"));
        if(protocol.equals("http")){
            System.out.println("Hyper Text Transefer Protocol");
        }else if(protocol.equals("https")){
            System.out.println("Hyper Text Transefer Protocol Secure");
        }else if(protocol.equals("ftp")){
            System.out.println("File Transefer Protocol");
        }else{
            System.out.println("Out of the list.");
        }

        String ext = url.substring(url.lastIndexOf(".")+1);
        if(ext.equals("com")){
            System.out.println("Commercial");
        } else if(ext.equals("net")){
            System.out.println("Network");
        } else if(ext.equals("org")){
            System.out.println("Organisational");
        }else{
            System.out.println("Out of the list.");
        }
    }
}