package day08.practice;

import java.util.HashMap;
import java.util.TreeMap;

//Question#1: Read comma separated list of names from the user and print count 
//
//HINT: Use a `HashMap<String, Integer>`
//
//Sample Input
//
//Enter the string: Ram, Ram, Superman, spider, hey, hello, hey, Spider
//
//Output
//
//Ram: 2
//
//Superman: 1
//
//Spider: 2
//
//hey: 2
//
//hello: 1

class Demo{

	static TreeMap<String, Integer> HashMapDemo = new TreeMap<String, Integer>();
	static boolean runs(String[] args) throws IllegalArgumentException{
		
		  
	  if(args==null) {
		  throw new IllegalArgumentException("Array cann't be null") ;
	  }
	  else {
	 
		for(int i=0; i<args.length; i++) {
			if(HashMapDemo.get(args[i].toLowerCase())==null) {
				HashMapDemo.put(args[i].toLowerCase(), 1);
			}
			else {
				int count = HashMapDemo.get(args[i].toLowerCase());
				count++;
				HashMapDemo.put(args[i].toLowerCase(), count);
				
			}
		}
		return true;
	}
	}
	static boolean out() {
		 System.out.println(HashMapDemo);
		return true;
	 }
	}

 
	 
	 
 

public class HashMapDemo {

	public static void main(String[] args) {
		String[] name = { "Ram", "Ram", "Superman", "spider", "hey", "hello", "hey", "Spider" };
		Demo.runs(name);
		
		Demo.out();

	}

	 
}
