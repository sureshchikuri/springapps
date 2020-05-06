package com.vcs.java.sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestStudent {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();
		list.add(new Student(113, "lucky"));
		list.add(new Student(111, "sri"));
		list.add(new Student(114, "mahi"));
		list.add(new Student(112, "raj"));

		// System.out.println(list);

		/*
		 * Collections.sort(list,new Comparator<Student>() {
		 * 
		 * @Override public int compare(Student o1, Student o2) {
		 * if(o1.getRollno()<o2.getRollno()){ return +1; }else if
		 * (o1.getRollno()>o2.getRollno()) { return -1; }else { return 0; } }
		 * });
		 * 
		 * Collections.sort(list);
		 */

		// list.stream().filter(i->i.getRollno()>112).forEach(System.out::println);

		// list.sort((i1,i2)->(i1.getRollno()>i2.getRollno())?-1:(i1.getRollno()<i2.getRollno())?+1:0);

		// list.stream().sorted((i1,i2)->i1.getRollno()>i2.getRollno()?-1:(i1.getRollno()<i2.getRollno())?+1:0).forEach(System.out::println);

		List<Student> stdList = list.stream()
				.sorted((i1, i2) -> i1.getRollno() > i2.getRollno() ? -1 : (i1.getRollno() < i2.getRollno()) ? +1 : 0)
				.filter(i -> i.getRollno() > 112).collect(Collectors.toList());

		// System.out.println(list);
		
		System.out.println(stdList);
	}
}
