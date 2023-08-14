
public class Mux {
	   int nsel, c, d, out;
	   public int muxgate(int a, int b, int sel) {
	   Not NOTGATE = new Not();
	   nsel = NOTGATE.notgate(sel);
	   
	   And ANDGATE = new And();
	   c = ANDGATE.andgate(a, nsel);
	   d = ANDGATE.andgate(b, sel);
	   
	   Or ORGATE = new Or();
	   out = ORGATE.orgate(c, d);
	   return(out);
	  }

}
