package org.stream;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(11);
        arr.add(23);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);
        List<Integer> list1 = arr.stream().filter(integer -> integer%2==0).collect(Collectors.toList());
        List<Integer> list2 = arr.stream().map(integer -> integer*10).collect(Collectors.toList());
        System.out.println(list1);
        System.out.println(list2);
    }


}
