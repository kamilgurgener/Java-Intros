package Java;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {

    // ArrayList is a collection type and Class of List Interface

    public static void main(String[] args) {

        ArrayList <Integer> numis = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        for (int i = 0; i < numis.size(); i++) {
            System.out.println(numis.get(i));
        }


        ArrayList <Integer> list = new ArrayList<Integer>();
       // Array list data type should be wrapper

        System.out.println(list);
        System.out.println(list.size());

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);

        System.out.println(list);


        //add()
        ArrayList <String> groceryList = new ArrayList<>();

        groceryList.add("Banana");
        groceryList.add("Apple");
        groceryList.add("Apple");
        groceryList.add("Apple");
        groceryList.add("Apple");
        groceryList.add("Apple");
        groceryList.add("Apple");
        groceryList.add("Apple");

        System.out.println(groceryList);

        //size()

        int sizeOfGraceryList = groceryList.size();

        System.out.println(sizeOfGraceryList + " elements are stored in this ArrayList");

        //get() provides the element at the given index from the arraylist
        System.out.println(groceryList.get(2));

        //set() replaces the elemetn of the arraylist at given index to the new element
        System.out.println("Before set " + groceryList);
        groceryList.set(2, "Egg");
        System.out.println("After set" + groceryList);
        //remove() removes the element at the given index

        groceryList.remove(0);
        System.out.println(groceryList);

        groceryList.remove("Apple");
        System.out.println(groceryList);

        ArrayList <Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        System.out.println("Before " +nums);
        nums.remove(Integer.valueOf(1));
        System.out.println("After " +nums);


        //clear() removes all the4 objects from the ArrayList

        nums.clear();
        System.out.println("After clear " +nums);

        //indexOf() returns the index number of the first macthing element return type is int

        int index = groceryList
                .indexOf("Apple");

        System.out.println(index);

        //lastIndexOf() returns the index number of the last matching element from the Arraylist, return type is int.

        System.out.println(groceryList.lastIndexOf("Apple"));

        //contains() check if the ArrayList contains the given element exist. Return type boolean
        boolean isContains = groceryList.contains("Apple");

        System.out.println(isContains);

        boolean isContains2 = groceryList.contains("Egg");

        System.out.println(isContains2);

        //equals() checks if ArrayList object equal to the given list, return type boolean.
        ArrayList <String> gc2 = new ArrayList<>();
        gc2.add("Banana");
        gc2.add("Egg");
        gc2.add("Sauce");
        gc2.add("Pasta");
        gc2.add("Orange");
        gc2.add("Bread");
        gc2.add("Pen");
        gc2.add("Apple");


        ArrayList <String> gc1  = new ArrayList<>();

        gc1.add("Banana");
        gc1.add("Apple");
        gc1.add("Egg");
        gc1.add("Sauce");
        gc1.add("Pasta");
        gc1.add("Orange");
        gc1.add("Bread");
        gc1.add("Pen");

        boolean r2 =gc1.equals(gc2);
        System.out.println("equals() " + r2);
        //isEmpty()

        System.out.println("isEmpty() " + nums.isEmpty());

        // All down below methods are called Bulk Operators in ArrayList
        //containsAll(CollectionType) check if all those aCollection of values contained. return boolean

        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);

       boolean isContainsAll =  numbers.containsAll( Arrays.asList(10, 20, 60, 70));
        System.out.println(isContainsAll);

        boolean isContainsAll2 =  numbers.containsAll( Arrays.asList(10, 20, 60, 90));
        System.out.println(isContainsAll);

        //addAll() adds all the given collection of values.
        System.out.println("Before addAll " + numbers);

        numbers.addAll( Arrays.asList(15,25,35,45,55,65));
        System.out.println("After addAll " + numbers);

        //removeAll() removes all teh matching values form the ArrayList

        numbers.removeAll(Arrays.asList(15, 20, 25,30));

        System.out.println("After removeAll " + numbers);

        //retainAll() remove all the unmatched values from the ArrayList, keeps the matching Values

        numbers.retainAll(Arrays.asList(10, 40, 50));
        System.out.println("After retrainAll " + numbers);

        //iteration

        ArrayList <Integer> numbers4 = new ArrayList<>();
        numbers4.add(10);
        numbers4.add(20);
        numbers4.add(30);
        numbers4.add(40);
        numbers4.add(50);
        numbers4.add(60);
        numbers4.add(70);

        for (int i=0; i<numbers4.size(); i++){
            System.out.println(numbers4.get(i));
        }
        System.out.println("==================");

        for(int i =numbers4.size()-1; i>=0; i--){
            System.out.println(numbers4.get(i));
        }

        System.out.println("==================");

        for (int i = 0; i < numbers4.size(); i++) {
            
        }
        System.out.println("==================");
        //for each iteration

        for(Integer each : numbers4){
            System.out.println("for each " + each);
        }
        System.out.println("==================");
        for (Integer integer : numbers4) {

            System.out.println("for each auto " + integer);

        }

        //removeIf(Predicate) removes all teh elements from the ArrayList that are matching with given predicate condition
        ArrayList <Integer> ages = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8));

        System.out.println("Before removeIf() " + ages);
        // syntax  (variable name -> ( arrow token comes from lambda) condition)
        ages.removeIf( each -> each < 5);

        System.out.println("After removeIf() " + ages);

        ArrayList <String> names = new ArrayList<>(Arrays.asList("Jon","Joe", "Brian", "Muthu", "Jon", "Kamil" ));

        System.out.println("Before removeIf() " + names);

        names.removeIf( p -> p.startsWith("J") );

        System.out.println("After removeIf() " + names);
    }



}
