class RegEx1{
    public static void main(String [] args){
        //If the email id is on gmail
        String str = "jaganmohanty@gmail.com";
        System.out.println(str.contains("gmail.com"));
        //Find user name and domain name from an email
        int l = str.length();
        //System.out.println(l);//22
        //System.out.println(str.indexOf("@"));//12
        String userName = str.substring(0,12);
        System.out.println("User name of the gmail: "+userName);
        String domainName = str.substring(13,22);
        System.out.println("Domain name of the gmail: "+domainName);
    }
}