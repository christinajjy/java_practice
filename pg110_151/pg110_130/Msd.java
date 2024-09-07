class Abc /*extends Msd//error:cyclic inheritance involving Abc*/{
    int i,j;
    void function1(){
        System.out.println("inside function1() of class Abc");
    }
    void functionA(){
        System.out.println("inside functionA of class Abc");
        System.out.println(j);
    }

}

class Msd extends Abc{
    int x,j;
    void functionB(){
        System.out.println("inside functionB() of class Msd");
    }
    void function1(){
        System.out.println(j);
        System.out.println("inside function1() of class Msd");
    }
    public static void main(String[] args) {
        Msd m1 = new Msd();
        m1.j = 30;//j of msd will change
        m1.function1();
        m1.functionA();
        m1.i=115;//i of abc will change


    }
}
/* 
30
inside function1() of class Msd
inside functionA of class Abc
0

 */