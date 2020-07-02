package com.springstart.spring.basics.lukman;

public class BinarySearchImp {
	
	private SortAlgorithm sortAlgorithm;
	
	public BinarySearchImp(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}
	
	public int binarySearch(int[] numbers, int numberSearchFor) {

		
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		
		return 3;
	}

}
