package week1.day2;

public class MissingNumber {
public static void main(String[] args) {
	int[] arr= {1,2,3,4,7,6,8};
	int sum1=0;
	for(int i=0;i<arr.length;i++)
	{
		sum1=sum1+arr[i];
	}
	int sum2=0;
	for(int j=1;j<=8;j++)
	{
		sum2=sum2+j;
	}
	System.out.println("missing number"+(sum2-sum1));
	


}
}
	

