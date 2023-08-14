
public class And {
       int out,c;
       public int andgate(int a, int b) {
       Nand NANDGATE = new Nand();
      
       c = NANDGATE.nand(a, b);
       out = NANDGATE.nand(c, c);
       return(out);
       }
}
