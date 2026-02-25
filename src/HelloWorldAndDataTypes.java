public class HelloWorldAndDataTypes {
    public static void main(String[] args)
    {
        System.out.println("Hello");
        int myFirst;
        myFirst=3;
        System.out.println(myFirst);
        System.out.println("myFirst");
        String name="Poonam";
        String textToPrint="Favourite number of "+name+" is : "+myFirst;
        System.out.println(textToPrint);
        byte myByte=10;
        short myShort=1000;
        int myInt=100000;
        long myLong=10000000000L;
        float myFloat=3.14f;
        double myDouble=3.14;
        char myChar='A';
        int newInt=myByte;
        System.out.println(newInt);
        int newIntFromDouble= (int) myDouble;
        System.out.println(newIntFromDouble);





    }
}
