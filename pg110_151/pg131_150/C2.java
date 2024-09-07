class A2{
    int i,j;
    void function1(){
        System.out.println("class A2 - function1");
        System.out.println(i+" "+j);
    }
    void functionA(){
        System.out.println("class A2- functionA");
        System.out.println(i+" "+j);
    }

}

class B2 extends A2{
    int i,j;
    void function1(){
        System.out.println("class B2 - function1");
        System.out.println(i+" "+j);
    }
    void function2(){
        System.out.println("class B2- function2");
        System.out.println(i+" "+j);
    }
    
}

class C2 extends B2{
    int i,j;
    void functionA(){
        System.out.println("class C2 -functionA");
        System.out.println(i+" "+j);
    }
    void functionC(){
        System.out.println("class C2 - functionC");
        System.out.println(i+" "+j);
    }
    public static void main(String[] args) {
        A2 a1 = new C2();
        C2 c1 = new C2();
        B2 b1 = new B2();
        a1.i=25;
        b1.j=40;
        a1.function1();
        a1.functionA();
        //a1.function2();//error
        //a1.functionC();//error
        c1.functionC();
        c1.functionA();
        c1.function1();
        c1.function2();

        b1.function1();
        a1.function1();

        


    }
}