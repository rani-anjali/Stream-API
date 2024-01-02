package work;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamdemo {
    public static void main(String[] args) {
    // create a list
        List<Integer> l1=new ArrayList<>();
        l1.add(10);
        l1.add(5);
        l1.add(8);
        l1.add(7);
        l1.add(9);
        l1.add(20);
        l1.add(30);
        l1.add(40);

        //without using stream api

//        List<Integer> leven=new ArrayList<Integer>();
//        for (Integer i:l1) {
//            if(i%2==0)
//            {
//                leven.add(i);
//            }
//        }
//        System.out.println(l1);
//        System.out.println(leven);
//        Iterator itr=l1.iterator();
//        while(itr.hasNext()){
//            Integer n=(Integer)itr.next();
//            if(n%2==0)
//            {
//                System.out.println(n);
//            }
//        }
//        List<Integer> l2=new ArrayList<>(l1);
//        l2.addAll(l1);
//        System.out.println("This is second list"+l2);

        //using stream api

//        Stream<Integer> stream =l1.stream();
        List<Integer> newList = l1.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.print(newList);
//        Stream<Integer> stream2 =l2.stream();
        List<Integer> newlist2=l1.stream().filter(i->i>=10).collect(Collectors.toList());
        System.out.println(newlist2);

    }
}

/*
Problem may occur:- Exception in thread "main" java.lang.IllegalStateException:
  stream has already been operated upon or closed

solution:- We've defined the streamSupplier object with the type Stream<String>, which is exactly
the same type which the #get() method returns. The Supplier is based on a lambda expression
that takes no input and returns a new Stream.

Invoking the functional method get() on the Supplier returns a freshly created Stream object,
on which we can safely perform another Stream operation.*/
