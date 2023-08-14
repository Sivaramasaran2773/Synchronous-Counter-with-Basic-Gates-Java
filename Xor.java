
public class Xor {
       int na, nb, c, d, out;
       public int xorgate(int a, int b) {
       
       Not NOTGATE = new Not();
       na = NOTGATE.notgate(a);
       nb = NOTGATE.notgate(b);
       
       And ANDGATE = new And();
       c = ANDGATE.andgate(na, b);
       d = ANDGATE.andgate(a, nb);
       
       Or ORGATE = new Or();
       out = ORGATE.orgate(c, d);
       return(out);
       
     }
}
