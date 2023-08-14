
public class FullAdder {
	int a,b,c,sum,carry,out;
	
	public int sum(int a,int b, int c) {
		Xor XOR = new Xor();
		out = XOR.xorgate(XOR.xorgate(a, b),c);
		return out;
	
	}
	public int carry(int a,int b, int c) {
		Or OR = new Or();
		And AND = new And(); 
		out = OR.orgate(OR.orgate(AND.andgate(a, b),AND.andgate(b, c)),AND.andgate(a, c));
		return out;
	}
	
	public static void main(String[] args) {
		FullAdder n = new FullAdder();
		System.out.println(n.sum(0,1,1));
		System.out.println(n.carry(0,1,1));
	}
}

