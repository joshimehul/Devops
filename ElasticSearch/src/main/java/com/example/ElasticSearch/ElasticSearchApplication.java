package com.example.ElasticSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.lang.reflect.Field;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElasticSearchApplication {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		SpringApplication.run(ElasticSearchApplication.class, args);
		
	
        
        String m = "Mehul";
        System.out.println("Printing the hashcode>>>"+m.hashCode());
        System.out.println("printing the index>>>"+(m.hashCode()&15));
        
        //ArrayList
        List<String> al = new ArrayList<String>();//creates empty ArrayList
        al.add(null);
        al.add(null);
        al.add(null);
//        al.add("two");
//        al.add("three");
        System.out.println(al);
//        
//        List<String> al2 = new ArrayList<String>();
//        al2.add("four");
//        al2.add("five");
//        
//        al.addAll(al2);
//        System.out.println(al);
//        
//        for(String str:al) {
//        	System.out.println(str);
//        }
//        
//        Iterator<String> itr = al.iterator();
//        
//        while(itr.hasNext()) {
//        	itr.next();
//        }
        
        //Stack
        
//        Stack<String> animals = new Stack<>();
//        animals.push("cat");
//        animals.push("Dog");
//        animals.push("Lion");
//        animals.push("Horse");
//        
//        System.out.println(animals.peek());
        
        //Priority queue
        List<String> ll = new LinkedList<>();	
        
        Set<Integer> se = new HashSet<>();
        se.add(null);
        se.add(null);
        System.out.println(se);
        
        HashMap<String,String> hm = new HashMap<>();
        
        Set<String> friendsA = new HashSet<>(Arrays.asList("Alice", "Bob", "Charlie"));
        Set<String> friendsB = new HashSet<>(Arrays.asList("Bob", "David", "Eve"));

        friendsA.retainAll(friendsB);
        System.out.println("Common friends: " + friendsA); 
	}
	

}
