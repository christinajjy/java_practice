class A1{
    int i,j;
    void function1(){
        System.out.println("inside function1() of class A1");
    }
    void functionA(){
        System.out.println("inside functionA() of class A1");
    }
}
class B extends A1{
    int i,k;
    void function1(){
        System.out.println("inside function2() of class B");
    }
    void function2(){
        System.out.println("inside function1() of class B");
    }
    public static void main(String[] args) {
        A1 a1 = new A1();
        A1 a2 = new B();

        a2.function1();
        a2.functionA();
        //a2.function2();//The method function2() is undefined for the type A1

    }
}