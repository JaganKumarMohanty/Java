class StringMethods{
    public static void main(String[] args){
        String str1 = "Jagan";
        System.out.println(str1.length());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        String str2 = "  Jagan Mohanty  ";
        System.out.println(str2.trim());
        System.out.println(str1.substring(2));
        System.out.println(str1.substring(2,4));
        //System.out.println(str1.substring(2,6)); // Out of bound exception
        System.out.println(str1.replace('j','n'));
        System.out.println(str1.replace('J','n'));
        System.out.println(str1);
        System.out.println(str1.startsWith("J"));
        System.out.println(str1.endsWith("M"));
        System.out.println(str1.charAt(3));

    }
}