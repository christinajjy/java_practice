class First{
    int i,j;
    void functionA(){
        System.out.println("inside functionA of first class");
        System.out.println(i);
    }
}
class Second extends First{
    int i,k;
    void functionA(){
        System.out.println("inside functionA of second class");
        System.out.println(i);
        super.functionA();
    }
    void function1(){
        super.i=10;
        functionA();
        super.functionA();
        
    }
    public static void main(String[] args) {
        Second s = new Second();
        s.function1();
        //super.functionA();//error:super keyword can not be used in static blocks
    }
}
/* 
inside functionA of second class
0
inside functionA of first class
10
inside functionA of first class
10
 */