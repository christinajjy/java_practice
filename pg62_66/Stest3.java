class Stest3{
    void function1(){
        System.out.println(Sdemo3.i);
        Sdemo3.i = 15;
        System.out.println("inside fun1");
    }
    public static void main(String args[]){
        Stest3 s1 = new Stest3();
        Sdemo3.i = 2;
        s1.function1();
        System.out.println(Sdemo3.i);
        Sdemo3 d = new Sdemo3();
        d.i =4;
        System.out.println(Sdemo3.i);
        s1.function1();
    }
}
/* 
2
inside fun1
15
4
4
inside fun1
 */