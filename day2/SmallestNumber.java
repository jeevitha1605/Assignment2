package week1.day2;

import java.util.Arrays;



public class SmallestNumber {
	
	public static int getSecSmallestNum(int[]a,int size) {
		// TODO Auto-generated method stub
		
Arrays.sort(a);
return a[1];
}
	public static void main(String[] args) {
		int a[]= {24,45,67,32,20,22};
		System.out.println("second smallest value"+getSecSmallestNum(a,6));
	}
	
	

}
