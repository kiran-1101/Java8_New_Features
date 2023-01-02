package org.lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class myComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        return (o1>o2)?-1:(o1<o2)?1:0;
    }
}
public class ListWithoutLambda {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);
        System.out.println("before sorting:-"+arr);
        Collections.sort(arr,new myComparator());
        System.out.println(("after sorting:-"+arr));
    }

}
