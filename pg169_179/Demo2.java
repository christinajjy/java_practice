abstract class Abs2{
    public void functionA(){
        System.out.println("functionA in Abs2");
    }
}
class Demo2 extends Abs2{
    //void functionA();
    void functionD(){
        System.out.println("functionD in Demo2");
    }
    public static void main(String[] args) {
        Demo2 d1 = new Demo2();
        d1.functionA();
        d1.functionD();

    }
}
