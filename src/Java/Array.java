package Java;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Array {


    public static void main(String[] args) {
        //declaration
        int [] numbers = new int [5];
        numbers[0] = 10;
        numbers[3] = 20;
        numbers[2] = 30;
        numbers[4] = 40;
        numbers[1] = 50;

        String [] ages = {"One", "Two", "Three", "Four", "Five"};
        String [] zipcodes = {"Five", "Three", "Two", "One", "Four"};

        System.out.println("Original "+ Arrays.toString(numbers));
        System.out.println("Original "+ Arrays.toString(ages));

        System.out.println(numbers.length);
        System.out.println(ages.length);

        /* methods
        toString()
        sort()
        equals()
        copyOf()
        copyOfRange()
        */

        Arrays.sort(ages);
        System.out.println("Sorted " + Arrays.toString(ages));


        Arrays.sort(numbers);
        System.out.println("Sorted " + Arrays.toString(numbers));

        Arrays.sort(zipcodes);
        System.out.println(Arrays.equals(ages, zipcodes));



    }

}

