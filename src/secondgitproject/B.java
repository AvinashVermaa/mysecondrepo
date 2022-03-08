package secondgitproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class B {
	public static void main(String[] args) {
//		int[] a = {1,2,3,4,5,6};
//		int[][] b = {{1,2,3},{4,5,6},{6,7,8},{9,0,10}};
//		
//		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.deepToString(b));

//		int[] a = {1,2,3,4,5,6,7,8};
//		int sum=0,avg=0;
//		for(int i=0;i<a.length;i++) {
//			sum=sum+a[i];
//		}
//		avg=sum/a.length;
//		System.out.println("Sum : "+sum);
//		System.out.println("Average : "+avg);

		// Adding the two arrays:
//		System.out.println("Enter the size of 1st array:");
//		Scanner scan = new Scanner(System.in);
//		int a = scan.nextInt();
//		
//		System.out.println("Enter the size of 2nd array:");
//		int b = scan.nextInt();
//		
//		if(a!=b) {
//			System.out.println("Array is not equal size");
//		}else {
//			int[] a1 = new int[a];
//			int[] b1 = new int[b];
//			int[] c1 = new int[b];
//			for (int i = 0; i < a1.length; i++) {
//				System.out.println("Enter 1st array elements");
//				a1[i] = scan.nextInt();
//				
//			}
//			
//			for (int i = 0; i < b1.length; i++) {
//				System.out.println("Enter 2nd array elements");
//				b1[i] = scan.nextInt();
//				
//			}
//			
//			System.out.println("Sum of 1st and 2nd array is:");
//			
//			for (int j = 0; j < c1.length; j++) {
//				c1[j]=a1[j]+b1[j];
//				
//			}
//			
//			System.out.println(Arrays.toString(c1));
//		}

		// check the arrays are equal or not:
//		int[] a= {1,2,3};
//		int[] b =a;
//		int[] c = {2,3,4};
//		int[] d = {7,8,9};
//		
//		if(Arrays.equals(a, b)) {
//			System.out.println("Array a and b are equal");
//		}
//		else {
//			System.out.println("Array a and b are not equal");
//		}
//		
//		if(Arrays.equals(a, c)) {
//			System.out.println("Array a and c are equal");
//		}
//		else {
//			System.out.println("Array a and c are not equal");
//		}

		// merge two array:
//		int[] a = {1,2,3,4};
//		int[] b = {5,6,7,8,9};
//		
//		int c[]= new int[a.length+b.length];
//		
//		for(int i=0;i<a.length;i++) {
//			c[i]=a[i];
//		}
//		int d=a.length;
//		for (int i = 0,j=d; i <= a.length; i++,j++) {
//			c[j]=b[i];
//			
//		}
//		
//		
//		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.toString(b));
//		System.out.println(Arrays.toString(c));

		// sort the array:
//		Integer[] a = { 15, 6, 7, 8 };

//		for (int i = 0; i < a.length; i++) {
//			for (int j = i + 1; j < a.length; j++) {
//				if (a[j] < a[i]) {
//					int temp = a[j];
//					a[j] = a[i];
//					a[i] = temp;
//
//				}
//			}
//
//		}
//		Arrays.sort(a, Comparator.reverseOrder());
//		System.out.println(Arrays.toString(a));

		// max and min number in an array:
//		int[] a = {1,2,4,5};
//		//int max=a[0];
//		int min =a[0];
//		for (int i = 1; i < a.length; i++) {
//			if(max<a[i]) {
//				max=a[i];
//			}
//			
//		}

		// System.out.println("Max : "+max);

//		for (int i = 1; i < a.length; i++) {
//			if(min>a[i]) {
//				min=a[i];
//			}
//			
//		}
//		System.out.println("Min : "+min);

		// removed duplicate records from the array:
//		int[] a = { 1, 2, 4, 3, 3 };
//		int[] b = new int[5];
//		for (int i = 0; i < a.length; i++) {
//			for (int j = i + 1; j < a.length; j++) {
//				if(a[i]!=a[j]) {
//					b[i]=a[i];
//				}
//			}
//		}
//		
//		for (int i = 0; i < b.length; i++) {
//			if(b[i]!=0) {
//				System.out.print(b[i]+" ");
//			}
//			
//		}
		
//		Integer[] arr = {1,2,3,4,2,1};
//		
//		if(arr.length==0) {
//			System.out.println("Array is empty");
//		}
//		else {
//			List<Integer> originalArray = Arrays.asList(arr);
//			
//			List<Integer> duplicateArray = originalArray.stream().distinct().collect(Collectors.toList());
//			
//			System.out.println(duplicateArray);
//		}
		
		//adding element in existing array:
//		Integer[] a = {1,2,3,4,6};
//		
//		List<Integer> list = Arrays.asList(a);
//		//System.out.println(list);
//		
//		
//		
//		System.out.println(list);
		
		
		//Printing the alphabet in Capital form:
		
//		for(char c ='A';c<='Z';c++) {
//			System.out.print(c+" ");
//		}
		
		//Printing alphabet in small form:
		
//		for(char c='a';c<='z';c++) {
//			System.out.print(c+" ");
//		}
		
		//adding element to an array:
//		Integer[] a = {1,2,3,5};
//		
//		List<Integer> list = new ArrayList<Integer>(Arrays.asList(a));
//		System.out.println("Original Array : "+Arrays.toString(a));
//		
//		list.add(6);
//		list.add(8);
//		list.add(10);
//		
//		a = list.toArray(a);
//		
//		System.out.println("Modified Array : "+Arrays.toString(a));

		
		//Remove the element from an array:
//		
//		Integer[] a = {1,2,3,4,5,8};
//		
//		List<Integer> list = new ArrayList<Integer>(Arrays.asList(a));
//		
//		System.out.println("Original Array is : "+Arrays.toString(a));
//		
//		
//		list.remove(5);
//		
//		a=list.toArray(a);
//		
//		for (Integer integer : list) {
//			if(integer!=null) {
//				System.out.print(integer+" ");
//			}
//		}

		//reverse the string in Java:
//		
//		String s = "avinash";
//		String rev = "";
//		
//		for(int i=s.length()-1;i>=0;i--) {
//			rev=s.charAt(i)+rev;
//		}
//		System.out.println(rev)
		
		//compare the string in java with reference of its content:
		
//		String s1 = "avinash verma is good";
//		String s2 = "Avinash Verma is good";
//		
//		
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.equalsIgnoreCase(s2));
		
		
	}
}
