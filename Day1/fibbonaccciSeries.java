package Week1.Day1;

public class fibbonaccciSeries {

	public static void main(String[] args) {
		
		{    
			 int fn=0,sn=1,sum,i,count=11;    
			 System.out.print(fn+" "+sn);//printing 0 and 1    
			    
			 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
			 {    
			  sum=fn+sn;    
			  System.out.print(" "+sum);    
			  fn=sn;    
			  sn=sum;    
			 }    
			  
			}}
	}


