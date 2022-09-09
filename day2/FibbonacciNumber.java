package week1.day2;

public class FibbonacciNumber {

	public static void main(String[] args) {
		int range=8,firstNum=0,secNum=1,sum;
		System.out.println("Fibbonacci series of 8:");
		// TODO Auto-generated method stub
		for(int i=0;i<=range;++i)
		{
			System.out.println(firstNum+",");
		 sum=firstNum+secNum;
			firstNum=secNum;
			secNum=sum;
		}

	}

}
