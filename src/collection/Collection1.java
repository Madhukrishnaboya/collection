package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Collection1 {

	public static void main(String[] args) {
		LinkedList<String> s = new LinkedList<>();
		s.add("as");
		s.add("aso");
		s.add("asoifb");
		s.set(1, "madhu");
		 for(Object l:s) { System.out.println(l); }
		 
		
	}
	 
}

/*
 * class MySort implements Comparator<student1> {
 * 
 * @Override public int compare(student1 o1, student1 o2) { // TODO
 * Auto-generated method stub return o1.getSalary() - o2.getSalary(); }
 * 
 * }
 */





