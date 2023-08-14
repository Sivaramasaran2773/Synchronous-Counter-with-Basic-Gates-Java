
public class Not {
	   int out;
	   
	   public int notgate(int in) {
	   Nand NANDGATE = new Nand();
	   
	   out=NANDGATE.nand(in, in);
	   return(out);
	   }

}
