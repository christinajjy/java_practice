interface Xyz1{
    public void functionX();
    public void functionY();
}
interface Ijk1{
    public void functionI();
    public void functionX();
}
interface A1 extends Xyz1,Ijk1{
    public void functionA();
    public void functionB();
}
class Idemo4 implements A1{
    public void functionA(){
        System.out.println("funA");
    }
    public void functionB(){
        System.out.println("funB");
    }
    public void functionX(){
        System.out.println("funX");
    }
    public void functionY(){
        System.out.println("funY");
    }
    public void functionI(){
        System.out.println("funI");
    }
    public void function1(){
        System.out.println("fun1");
    }
    public static void main(String[] args) {
        A1 a1 = new Idemo4();
        a1.functionA();
        a1.functionB();
        a1.functionI();
        a1.functionX();
        a1.functionY();
        System.out.println(".");
        Xyz1 x1 = new Idemo4();
        x1.functionX();
        x1.functionY();
        System.out.println(".");
        Ijk1 i1 = new Idemo4();
        i1.functionI();
        i1.functionX();
    }

}
