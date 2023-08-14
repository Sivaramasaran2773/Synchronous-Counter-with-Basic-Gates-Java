import java.util.Scanner;

public class Syncc {
	
	public int[] DTB(int in) {
		int out[] = new int[4];
		int binary[] = new int[4];    
	     int index = 0;    
	     while(in > 0){    
	       binary[index++] = in%2;    
	       in = in/2;    }         
	       out[0] = binary[3] ; 
	       out[1] = binary[2] ; 
	       out[2] = binary[1] ; 
	       out[3] = binary[0] ; 
	       return out;
	}    
		
	public int[] not4(int[] in){
	        Not NOT = new Not();
	        int[] out = new int[4];
	        for (int i=0; i<=3; i++) {
	        	out[i]=NOT.not(in[i]);
	        }
	        return out; }
	
	public int[] add4(int[] a, int[] b) {

		HalfAdder HALFADDER  = new HalfAdder();
		FullAdder FULLADDER = new FullAdder();
		
		int[] out = new int[4];
		
		out[3] = HALFADDER.sum(a[3],b[3]);
		int c = HALFADDER.carry(a[3],b[3]);
		
		out[2] = FULLADDER.sum(a[2],b[2],c);
		int d = FULLADDER.carry(a[2],b[2],c);
		
		out[1] = FULLADDER.sum(a[1],b[1],d);
		int e = FULLADDER.carry(a[1],b[1],d);
		
		out[0] = FULLADDER.sum(a[0],b[0],e);
		int f = FULLADDER.carry(a[0],b[0],e);
		
		return out;
	}
	
	public int[] inc4(int[] a) {
		
		Syncc syncc = new Syncc();
		int tr[] = {0,0,0,1};
		int[] out = syncc.add4(a, tr);
 	   return out;
	}
	
	public int[] syncc(int m) {
		
		Syncc syncc = new Syncc();
		if (m==-1) {
	 		   int out[] = {0,0,0,0};
	 	   
		return out;}
		else {
		int[] in = syncc.DTB(m);
        int[] out = syncc.inc4(in);
	    return out;
		}}

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);  
	    System.out.println("Enter the clock time");

	    int t = myObj.nextInt(); 
	    
	    if (t<=15) {
	    System.out.println("Output = Qd Qc Qb Qa:"); 
	    Syncc SYNCC = new Syncc();
	    int[] out = SYNCC.syncc(t-1);
	    
        for (int i=0;i<=3;i++) {
        System.out.print(out[i]);}}
	    
	    if (t>=16) {
	    	System.out.println("Output = Qd Qc Qb Qa:"); 
		    Syncc SYNCC = new Syncc();
		    
		    int[] temp = SYNCC.syncc(t-16);
		    int[] out = SYNCC.not4(temp);
		    
	        for (int i=0;i<=3;i++) {
	        System.out.print(out[i]);}
	    }
	
	
	}
}
