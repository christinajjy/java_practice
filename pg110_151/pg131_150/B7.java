class A7{
    public void function1(){
        System.out.println("1- class A");
    }
    public void functionA(){
        System.out.println("A- class A");
    }
}
class B7 extends A7{
    public void function1(){
        System.out.println("1- class B");
    }
    public void function2(){
        System.out.println("2-class B");
    }
    public void functionB(){
        System.out.println("B-class B");
    }
    public static void main(String args[]){
        System.out.println("-------a ref b obj--------");
        A7 a1 = new B7();
        a1.function1();
        a1.functionA();
        //a1.function2();
        //a1.functionB();
        System.out.println("--------b ref b obj----------");
        B7 a2 = new B7();
        a2.function1();
        a2.functionA();
        a2.function2();
        a2.functionB();
        System.out.println("--------a ref a obj----------");
        A7 a3 = new A7();
        a3.function1();
        a3.functionA();
        //a3.function2();
        //a3.functionB();
        System.out.println("----------typecasting a1 to B----------");
        B7 b1 = (B7)a1;
        b1.function1();
        b1.functionA();
        b1.function2();
        b1.functionB();

        

    }
}