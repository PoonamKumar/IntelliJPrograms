public class MyString {
    public static void main(String[] args) {
        String myStr="Poonam";
        System.out.println(myStr);
        //Getting count of the variable myStr
        int myStrLength=myStr.length();
        System.out.println(myStrLength);
        String myStrToUp=myStr.toUpperCase();
        System.out.println(myStrToUp);
        String myStrToLow=myStr.toLowerCase();
        System.out.println(myStrToLow);
        String addStrings=myStrToUp+myStrToLow;
        System.out.println(addStrings);
        String stringWithInt=myStr+ " this string length is "+myStrLength;
        System.out.println(stringWithInt);
        String myMovie="My favourite movie is : \n\"Home Alone\"";
        System.out.println(myMovie);
    }
}
