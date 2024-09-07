class X{
    void function1(){
        System.out.println("inside function1 of class X");
        //System.out.println();
    }

}

class Y extends X{
    void function1(){
        System.out.println("inside function1 of class Y");
        super.function1();
        //System.out.println();
    }
}
class Z extends Y{
    void function1(){
        System.out.println("inside function1 of class Z");
        super.function1();
        //System.out.println();
    }
    public static void main(String[] args) {
        Z z1 = new Z();
        z1.function1();
    }
}
/*
inside function1 of class Z
inside function1 of class Y
inside function1 of class X
 */

