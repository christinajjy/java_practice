interface Xyz{
    public void functionX();
}
class A implements Xyz{
    public void functionX(){
        System.out.println("inside functionX of class A");
        //Xyz x1 = new A();
        //x1.functionX();
    }

}
class B extends A{
    public void functionB(){
        System.out.println("inside functin");
    }
    public void functionX(){
        System.out.println("inside functionX of class B");
    }
}
class Test {
    public static void main(String[] args) {
        A a1 =new B();
        A a2 = new A();
        Xyz x1 = new B();
        Xyz x2 = new A();
        x1.functionX();
        x2.functionX();
        a1.functionX();
        a2.functionX();
    }
}
