abstract class Abs1{
    public abstract void function1();
    void function2(){
        System.out.println("inside fun2 of abstract class Abs1");
    }
}
class Demo1 extends Abs1{
    public void function2(){
        System.out.println("inside fun2 inside Demo1");
    }
    public void function1(){
        System.out.println("inside function1 implemented in Demo1");
    }
    public void functionD(){
        System.out.println("funD in Abs1");
    }
    public static void main(String args[]){
        Demo1 d1 = new Demo1();
        d1.function1();
        d1.function2();
        d1.functionD();

        //Abs1 a1 = new Abs1();
        Abs1 a2 = new Demo1();
        a2.function1();
        a2.function2();
        //a2.functionD();method functionD is not defined for ref type Abs1

    }
    {
        System.out.println("hello");
    }
}
