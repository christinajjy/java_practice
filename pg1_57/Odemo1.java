import java.net.Socket;

class A{
    int i,j;
    void functionA(){
        System.out.println(i+10);
        System.out.println(i+20);
    }
    public static void main(String[] args) {
        A a1 = new A();
        int x=10;
        System.out.println(x);
        System.out.println(a1);
    }
}
class Odemo1{
    int i=10;
    A a1 = new A();
    A a2;
    public static void main(String[] args) {
        Odemo1 d1 = new Odemo1();
        System.out.println(d1.a2);
        System.out.println(d1.i);
        int x = d1.i;
        System.out.println(d1.a1);
        d1.i=25;
        d1.a1.i=10;
        d1.a1.functionA();
        System.out.println();
        System.out.println(d1.a2);
        //d1.a2.functionA();
        d1.a2=d1.a1;
        System.out.println(d1.a2.i);
        //d1.j=d1.i;
        d1.a2 =new A();
        System.out.println(d1.a2.i);

    }

}