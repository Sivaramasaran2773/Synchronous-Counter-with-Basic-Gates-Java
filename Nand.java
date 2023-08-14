
public class Nand {
	 int out;
	 public  int nand(int a , int b) 
    {
		 if ((a==1 || a==0) && (b==1 || b==0) ) 
		 {
		 out = (a==1 && b==1)?0:1 ;
		 }
		 return (out); 
	}
	
	public static void main(String[] args)
	{
		Nand obj = new Nand();
		System.out.println(obj.nand(0, 0));
	}
	
}
