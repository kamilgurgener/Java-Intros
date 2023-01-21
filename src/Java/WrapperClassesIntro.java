package Java;

public class WrapperClassesIntro {

    /*
    Used to wrap the primitive data type into an object of that class
    Provides the mechanism to convert primitive into object and object into primitive.
    For Example ArrayList only accepts objects as data type. That is why we use wrapper class of a primitive as datatype in Arraylist.
     */


    public static void main(String[] args) {

        byte a = 10;
        short b = 20;
        int c = 30;


        Byte x = a;
        Short y = b;
        Integer z = c;

        System.out.println(x +" "+ y +" "+ z);

        byte q = x;
        short w= y;
        int e = z;

        System.out.println(q +" "+ w +" "+ e);

        // parse method Converting String to the primitives, return primitive

        String str = "123";
        int num1 = Integer.parseInt(str);

        System.out.println(num1);

        //valuOf methods. Converting String to the wrapper class objects, returns wrapper class object.

        String str2 = "1.5";
        Double t= Double.valueOf(str2);

        double uy= Double.parseDouble(str2);
        System.out.println(uy);

        System.out.println(t);





    }



}
