
public class JKFF {
	 int qout;
	 
	    public int jkff(int j, int k, int clk) {
	    
	    Not NOT = new Not();
	    Nand NAND = new Nand();
	    DFF Dff = new DFF();
	    
	    int qout = 0;
	    int nqout = NOT.notgate(qout);
	    int ck = NOT.notgate(k);
	    int c1 = NAND.nand(j, nqout);
	    int c2 = NAND.nand(ck, qout);
	    int c3 = NAND.nand(c1, c2);
	    qout = Dff.dff(clk, c3);
	    	
	    
	    return qout;
	    
	}
	    public static void main(String[] args) {
			JKFF Jkff = new JKFF();
			Not NOT = new Not();
			int qout = Jkff.jkff(1, 1, 1);
			int nqout = NOT.notgate(qout);
			System.out.println(qout);
			System.out.println(nqout);
			
	}
}
