
public class Synchronouscounter {
        int q4;
        
        public int Q4(int m, int clk) {
        	Not NOT = new Not();
    	    Nand NAND = new Nand();
    	    And AND = new And();
    	    Or OR = new Or();
    	    DFF Dff = new DFF();
    	    JKFF Jkff = new JKFF();
    	    
    	    int tr = 1;
    	    
    	    int q1=Jkff.jkff(tr,tr,clk);
    	    int cq1=Jkff.jkff(tr,tr,clk);
    	    int nq1=NOT.notgate(q1);
    	    int ncq1=NOT.notgate(cq1);
    	    int nm = NOT.notgate(m);
    	    
    	    int and1 = AND.andgate(nm, cq1);
    	    int and2 = AND.andgate(nm, ncq1);
    	    int or1 = OR.orgate(and1, and2);
    	    
    	    int q2=Jkff.jkff(or1,or1,clk);
    	    int cq2=Jkff.jkff(or1,or1,clk);
    	    int nq2=NOT.notgate(q2);
    	    int ncq2=NOT.notgate(cq2);
    	    
    	    int and3 = AND.andgate(and1, cq2);
    	    int and4 = AND.andgate(ncq2, and2);
    	    int or2 = OR.orgate(and3, and4);
    	    
    	    int q3=Jkff.jkff(or2,or2,clk);
    	    int cq3=Jkff.jkff(or2,or2,clk);
    	    int nq3=NOT.notgate(q3);
    	    int ncq3=NOT.notgate(cq3);
    	    
    	    int and5 = AND.andgate(and3, cq3);
    	    int and6 = AND.andgate(ncq3, and4);
    	    int or3 = OR.orgate(and5, and6);
    	    
    	    int q4=Jkff.jkff(or3,or3,clk);
    	    int cq4=Jkff.jkff(or3,or3,clk);
    	    
    	    int nq4=NOT.notgate(q4);
    	    int ncq4=NOT.notgate(cq4);
    	    
    	    return q4;
    	    
    	    
            }
    	    
    	    public int Q3 (int m, int clk) {
    	    	Not NOT = new Not();
        	    Nand NAND = new Nand();
        	    And AND = new And();
        	    Or OR = new Or();
        	    DFF Dff = new DFF();
        	    JKFF Jkff = new JKFF();
        	    
        	    int tr = 1;
        	    int q1=Jkff.jkff(tr,tr,clk);
        	    int cq1=Jkff.jkff(tr,tr,clk);
        	    int nq1=NOT.notgate(q1);
        	    int ncq1=NOT.notgate(cq1);
        	    int nm = NOT.notgate(m);
        	    
        	    int and1 = AND.andgate(nm, cq1);
        	    int and2 = AND.andgate(nm, ncq1);
        	    int or1 = OR.orgate(and1, and2);
        	    
        	    int q2=Jkff.jkff(or1,or1,clk);
        	    int cq2=Jkff.jkff(or1,or1,clk);
        	    int nq2=NOT.notgate(q2);
        	    int ncq2=NOT.notgate(cq2);
        	    
        	    int and3 = AND.andgate(and1, cq2);
        	    int and4 = AND.andgate(ncq2, and2);
        	    int or2 = OR.orgate(and3, and4);
        	    
        	    int q3=Jkff.jkff(or2,or2,clk);
        	    int cq3=Jkff.jkff(or2,or2,clk);
        	    int nq3=NOT.notgate(q3);
        	    int ncq3=NOT.notgate(cq3);
        	    
        	    int and5 = AND.andgate(and3, cq3);
        	    int and6 = AND.andgate(ncq3, and4);
        	    int or3 = OR.orgate(and5, and6);
        	    
        	    int q4=Jkff.jkff(or3,or3,clk);
        	    int cq4=Jkff.jkff(or3,or3,clk);
        	    
        	    int nq4=NOT.notgate(q4);
        	    int ncq4=NOT.notgate(cq4);
        	    
        	    return q3;
    	    
    	    }
    	    
    	    public int Q2 (int m, int clk) {
    	    	Not NOT = new Not();
        	    Nand NAND = new Nand();
        	    And AND = new And();
        	    Or OR = new Or();
        	    DFF Dff = new DFF();
        	    JKFF Jkff = new JKFF();
        	    
        	    int tr = 1;
        	    int q1=Jkff.jkff(tr,tr,clk);
        	    int cq1=Jkff.jkff(tr,tr,clk);
        	    int nq1=NOT.notgate(q1);
        	    int ncq1=NOT.notgate(cq1);
        	    int nm = NOT.notgate(m);
        	    
        	    int and1 = AND.andgate(nm, cq1);
        	    int and2 = AND.andgate(nm, ncq1);
        	    int or1 = OR.orgate(and1, and2);
        	    
        	    int q2=Jkff.jkff(or1,or1,clk);
        	    int cq2=Jkff.jkff(or1,or1,clk);
        	    int nq2=NOT.notgate(q2);
        	    int ncq2=NOT.notgate(cq2);
        	    
        	    int and3 = AND.andgate(and1, cq2);
        	    int and4 = AND.andgate(ncq2, and2);
        	    int or2 = OR.orgate(and3, and4);
        	    
        	    int q3=Jkff.jkff(or2,or2,clk);
        	    int cq3=Jkff.jkff(or2,or2,clk);
        	    int nq3=NOT.notgate(q3);
        	    int ncq3=NOT.notgate(cq3);
        	    
        	    int and5 = AND.andgate(and3, cq3);
        	    int and6 = AND.andgate(ncq3, and4);
        	    int or3 = OR.orgate(and5, and6);
        	    
        	    int q4=Jkff.jkff(or3,or3,clk);
        	    int cq4=Jkff.jkff(or3,or3,clk);
        	    
        	    int nq4=NOT.notgate(q4);
        	    int ncq4=NOT.notgate(cq4);
        	    
        	    return q2;
    	    
    	    }
    	    
    	    public int Q1 (int m, int clk) {
    	    	Not NOT = new Not();
        	    Nand NAND = new Nand();
        	    And AND = new And();
        	    Or OR = new Or();
        	    DFF Dff = new DFF();
        	    JKFF Jkff = new JKFF();
        	    
        	    int tr = 1;
        	    int q1=Jkff.jkff(tr,tr,clk);
        	    int cq1=Jkff.jkff(tr,tr,clk);
        	    int nq1=NOT.notgate(q1);
        	    int ncq1=NOT.notgate(cq1);
        	    int nm = NOT.notgate(m);
        	    
        	    int and1 = AND.andgate(nm, cq1);
        	    int and2 = AND.andgate(nm, ncq1);
        	    int or1 = OR.orgate(and1, and2);
        	    
        	    int q2=Jkff.jkff(or1,or1,clk);
        	    int cq2=Jkff.jkff(or1,or1,clk);
        	    int nq2=NOT.notgate(q2);
        	    int ncq2=NOT.notgate(cq2);
        	    
        	    int and3 = AND.andgate(and1, cq2);
        	    int and4 = AND.andgate(ncq2, and2);
        	    int or2 = OR.orgate(and3, and4);
        	    
        	    int q3=Jkff.jkff(or2,or2,clk);
        	    int cq3=Jkff.jkff(or2,or2,clk);
        	    int nq3=NOT.notgate(q3);
        	    int ncq3=NOT.notgate(cq3);
        	    
        	    int and5 = AND.andgate(and3, cq3);
        	    int and6 = AND.andgate(ncq3, and4);
        	    int or3 = OR.orgate(and5, and6);
        	    
        	    int q4=Jkff.jkff(or3,or3,clk);
        	    int cq4=Jkff.jkff(or3,or3,clk);
        	    
        	    int nq4=NOT.notgate(q4);
        	    int ncq4=NOT.notgate(cq4);
        	    
        	    return q1;
    	    
    	    }
    	    
    	    
    	   
    	    public static void main(String[] args) {
    	    	Synchronouscounter sc = new Synchronouscounter();
    	    	
    	    	int q4 = sc.Q4(0, 1);
    	    	int q3 = sc.Q3(0, 1);
    	    	int q2 = sc.Q2(0, 1);
    	    	int q1 = sc.Q1(0, 1);
    	    	
    	    	System.out.println(q4);
    	    	System.out.println(q3);
    	    	System.out.println(q2);
    	    	System.out.println(q1);
    	    
    	    }
    	    
  }

