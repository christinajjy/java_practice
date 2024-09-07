class Poly_B{
    void function(int x){
        System.out.println("inside funciton(int x)");
    }
    void function(A a1){
        System.out.println("inside function(A a1)");
    }
    void function(B b1){
        System.out.println("inside function(B b1)");
    }
    public static void main(String args[]){
        Poly_B p = new Poly_B();
        p.function(6);
        p.function(new B());
        p.function(new A());
        //p.function(null);//compilation error- poly_B has two functions that accept objects as arguments, they have the same priority, since the argument is null - not sure which class's obj is being sent

    }

}
/* 
inside funciton(int x)
inside function(B b1)
inside function(A a1)
*/
