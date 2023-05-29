package Week1.Day1.Assignment;

public class isPrime {

	public static void main(String[] args) {
		
int n=8,count=0;
for(int i=2;i<n;i++)
	if(n%i==0)
	{
		count++;	
	}
if(count==0)
		System.out.println("The Number " +n+ " is a prime number");
else 
System.out.println("The Number " +n+ " is not a prime number");
	}
	}	
