import java.util.Arrays;
public class Add16 {
	int[] out;
	
	public int[] add16(int[] a, int[] b) {
		
		HalfAdder HALFADDER  = new HalfAdder();
		FullAdder FULLADDER = new FullAdder();
		
		int[] out = new int[16];
		
		out[0] = HALFADDER.sum(a[0],b[0]);
		int c = HALFADDER.carry(a[0],b[0]);
		
		out[1] = FULLADDER.sum(a[1],b[1],c);
		int d = FULLADDER.carry(a[1],b[1],c);
		
		out[2] = FULLADDER.sum(a[2],b[2],d);
		int e = FULLADDER.carry(a[2],b[2],d);
		
		out[3] = FULLADDER.sum(a[3],b[3],e);
		int f = FULLADDER.carry(a[3],b[3],e);
		
		out[4] = FULLADDER.sum(a[4],b[4],f);
		int g = FULLADDER.carry(a[4],b[4],f);
		
		out[5] = FULLADDER.sum(a[5],b[5],g);
		int h = FULLADDER.carry(a[5],b[5],g);
		
		out[6] = FULLADDER.sum(a[6],b[6],h);
		int i = FULLADDER.carry(a[6],b[6],h);
		
		out[7] = FULLADDER.sum(a[7],b[7],i);
		int j = FULLADDER.carry(a[7],b[7],i);
		
		out[8] = FULLADDER.sum(a[8],b[8],j);
		int k = FULLADDER.carry(a[8],b[8],j);
		
		out[9] = FULLADDER.sum(a[9],b[9],k);
		int l = FULLADDER.carry(a[9],b[9],k);
		
		out[10] = FULLADDER.sum(a[10],b[10],l);
		int m = FULLADDER.carry(a[10],b[10],l);
		
		out[11] = FULLADDER.sum(a[11],b[11],m);
		int n = FULLADDER.carry(a[11],b[11],m);
		
		out[12] = FULLADDER.sum(a[12],b[12],n);
		int o = FULLADDER.carry(a[12],b[12],n);
		
		out[13] = FULLADDER.sum(a[13],b[13],o);
		int p = FULLADDER.carry(a[13],b[13],o);
		
		out[14] = FULLADDER.sum(a[14],b[14],p);
		int q = FULLADDER.carry(a[14],b[14],p);
		
		out[15] = FULLADDER.sum(a[15],b[15],q);
		FULLADDER.carry(a[15],b[15],q);
		
		return out;
	}
	 /**public static void main(String[] args) {
		Add16 obj = new Add16();
		int a[] = {1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0};
 	    int b[] = {0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1}; 
		int[] out = new int[16];
		out= obj.add16(a,b);
		System.out.print(Arrays.toString(out));
 		  
 	   
	}**/
	
	}

