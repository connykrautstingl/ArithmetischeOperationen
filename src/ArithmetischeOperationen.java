public class ArithmetischeOperationen {

    public static void main(String[] args) {

        int a = 3;
        int b = 5;

        System.out.println("a" + " + " + "b" + " = " + a + b);
        System.out.println("a" + " - " + "b" + " = " + (a - b));
        System.out.println("a" + " * " + "b" + " = " + (a * b));
        System.out.println("a" + " / " + "b" + " = " + (a / b));
        System.out.println("a" + " % " + "b" + " = " + (a % b));

int add = a+b;
int sub = a-b;
int multi = a*b;
int div = a/b;
int mod = a%b;

        System.out.println(add);
        System.out.println(sub);
        System.out.println(multi);
        System.out.println(div);
        System.out.println(mod);

        int c = 3;
        int r = ++a;

        System.out.println(c);
        System.out.println(r);


        String st = new String("a");
        String sta = new String("a");
        System.out.println(st.equals(sta));

        boolean t =!(2 == 2 || 3 == 4);
        System.out.println(t);
    }
}
