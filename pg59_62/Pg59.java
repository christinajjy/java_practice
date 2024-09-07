class Pg59{
    int x;
    static int y;
    void function1(){
        System.out.println("inside non static method -function1");
        x=10;
        y=20;
        function2();

    }
    static void function2(){
        System.out.println("inside static function - function2()");
        System.out.println(y);
        
        

    }
    public static void main(String args[]){
        Pg59 s1 = new Pg59();
        //s1.function2();//does not give error but the contents of object pointer by s1 are not available to function 2
        function2();
        s1.function1();
        //Pg59 s2 = new Pg59();
        //System.out.println(y);//20

        

    }

}

/* 
inside static function - function2()
0
inside non static method -function1
inside static function - function2()
20
 */