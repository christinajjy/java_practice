class M1{
    int i,j;
    M1(int x){
        i =x;
        System.out.println("inside M1() of class M1");
    }
}
class N1 extends M1{
    int i,j;
    N1(){
        //super(6);
        System.out.println("inside N1() of class N1");
    }
    public static void main(String args[]){
        N1 n1 = new N1();
    }
}
/* 
without super(6)
 N1.java:10: error: constructor M1 in class M1 cannot be applied to given types;
    N1(){
        ^
  required: int
  found: no arguments
  reason: actual and formal argument lists differ in length

with super(6)-
inside M1() of class M1
inside N1() of class N1
 */