class A{
    void A1(int x){
        System.out.println("inside A(int x)");
    }
}
class B extends A{
    void B1(){
        System.out.println("inside B()");
    }

}
class C1_f extends B{
    void C1(){
        super.A1(6);
    }
    public static void main(String  args[]){
        C1_f c1 = new C1_f();
        c1.C1();
    }
}
//there is no problem in calling functions of indirect superclasses,only constructor don't allow it see C1.java