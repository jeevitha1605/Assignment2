package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=34343, tempVariable=0,remainder;
int originalValue=num;
while(num!=0)
{
	remainder=num%10;
	tempVariable=tempVariable*10+remainder;
	num/=10;
	
}
if(originalValue==tempVariable)
{
	System.out.println(originalValue+"is palindrome");
	
}
else
{
	System.out.println(originalValue+"is not palindrome");
}
	}

}
