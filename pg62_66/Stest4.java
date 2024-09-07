class Sdemo4{
    static int i = 10;
    static A a1 = new A();

}
class Stest4{
    public static void main(String args[]){
        Sdemo4.i =15;
        Sdemo4.a1.functionA();
    }
}
/* 
 function A

 this statement indicates that functionA is a non static method of a1 object where a1 is a static variable of Stest4 class
 
 */