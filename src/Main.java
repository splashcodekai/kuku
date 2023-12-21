import static java.lang.System.*;

public class Main{


     public static void main(String args[]){
        out.println("Vamos testar o casting aqui e agora");

        //casting explicito
        long numL= 1111111112332l;
        out.println(numL);
        int numI= (int) numL;
        out.println(numI);

        //casting implicito
        long num7= 999999999;
        out.println(num7);
        double num8=num7;
        out.println(num8);

        //unboxing
        Integer num6=99988;
        int nu9;
        nu9 = new Integer(99988);
        out.print(nu9);

        //autoboxing
        Integer n2= 12;
    }
}