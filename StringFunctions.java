class StringFunctions {
    public static void main(String args[]){
        String str1 = "HELLO";
        String str2 = "hello";

        String str3 = str1.toLowerCase();
        String str4 = str2.toLowerCase();

        if(str3.compareTo(str4)==0)
            System.out.println("Both strings are equal");
        else
            System.out.println("Both strings are not equal");
    }
}