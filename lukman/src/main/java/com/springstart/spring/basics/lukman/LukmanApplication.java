package com.springstart.spring.basics.lukman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LukmanApplication {

	public static void main(String[] args) {
	
		BinarySearchImp binarySearch = new BinarySearchImp(new BubbleSortAlgorithm());
		int result = binarySearch.binarySearch(new int[] {12,3,56,77,22},3);
		System.out.println(result);
		SpringApplication.run(LukmanApplication.class, args);
	}

}
