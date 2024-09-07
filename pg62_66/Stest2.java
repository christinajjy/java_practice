/* when we create the context of a class from a function, then when the control comes out of the function the function gets deleted from the ram, but the context of the class still persists in the ram */

class Stest2{
    void function1(){
        Sdemo3.i = 115;
        System.out.println("inside fun1");

    }
    public static void main(String args[]){
        Stest2 s1 = new Stest2();
        s1.function1();
        System.out.println(Sdemo3.i);
    }
}