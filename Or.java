
public class Or {
	   int out,c,d;
	   public int orgate(int a, int b) {
	   Nand NANDGATE = new Nand();
	   c = NANDGATE.nand(a, a);
	   d = NANDGATE.nand(b, b);
	   out = NANDGATE.nand(c, d);
	   return(out);
	   }
	   
}
