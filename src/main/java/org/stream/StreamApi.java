package org.stream;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import org.w3c.dom.stylesheets.LinkStyle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApi {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        // int[] primes = {2,4,6,8,10,12,16,19,21,23, 3, 5, 7, 11, 13, 17};
        //IntStream intStream = Arrays.stream(primes).filter(x -> x%2 ==0).collect();


        arr.add(11);
        arr.add(22);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);
        arr.add(70);

        arr.stream().filter(integer -> integer%2==0).forEach(x-> System.out.println(x));                        //print without storing
        //filter
        List<Integer> list1 = arr.stream().filter(integer -> integer%2==0).collect(Collectors.toList());        //filter
        // map
        List<Integer> list2 = arr.stream().map(integer -> integer*10).collect(Collectors.toList());             //map
        //default sort
        List<Integer> DefaultSort = arr.stream().sorted().collect(Collectors.toList());
       //customize sort
        List<Integer> CustomizeSort = arr.stream().sorted((i1,i2)-> i2.compareTo(i1)).collect(Collectors.toList()); // -i1.compareTo(i2) optional
       //min function
        Integer min = arr. stream().min((i1,i2)->i1.compareTo(i2)).get();
        //max function
        Integer max = arr.stream().max((i1,i2)->i1.compareTo(i2)).get();
        //Stream.of() method for group of values
        Stream integer = Stream.of(9,99,999,9999,99999);
        System.out.println("Stream.of() method for group of values are as follows");
        integer.forEach(System.out::println);
        //Stream.of() method for random array
        Double[] doubles = {1.2,1.5,2.5,3.5,3.6,4.5,5.6};
        Stream double2 = Stream.of(doubles);
        System.out.println("Stream.of() method for random array are as follows");
        double2.forEach(System.out::println);
        System.out.println("minimum value from the list is "+ min);
        System.out.println("maximum value from the list is "+ max);
        System.out.println("default sorting is"+DefaultSort );
        System.out.println("customize sorting is "+CustomizeSort);
        System.out.println(list1);
        System.out.println(list2);
    }


}
