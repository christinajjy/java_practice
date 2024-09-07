class A{
    A(int x){
        System.out.println("inside A(int x)");
    }
}
class B extends A{
    B(){
        System.out.println("inside B()");
    }

}
class C extends B{
    C(){
        super(6);//constructor of C can only execute constructor of class B and not A
    }
    public static void main(String  args[]){
        C c1 = new C();
    }
}
/* 
C1.java:7: error: constructor A in class A cannot be applied to given types;
    B(){
       ^
  required: int
  found: no arguments
  reason: actual and formal argument lists differ in length
C1.java:14: error: constructor B in class B cannot be applied to given types;
        super(6);
        ^
  required: no arguments
  found: int
  reason: actual and formal argument lists differ in length
2 errors
see C1_f.java

 */