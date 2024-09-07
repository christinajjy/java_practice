final class A{
    final int x =115;
    void functionA(){
        System.out.println("inside functionA");
    }
}
class Test{
    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(a1.x);
        a1.x=10;//error: cannot assign a value to final variable x ,a1.x=10;
        
    }
}
