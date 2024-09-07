class Poly1{
    void function1(){
        System.out.println("inside function1");
    }
    void function1(int x){
        System.out.println("inside function1(int x)");
    }
    void function1(int x,int y){
        System.out.println("inside function1(int x, int y)");
    }
    // int function1(){//return type doesn't matter - it is considered already defined as there is another function1 with no parameters
    //     return ;
    // }
    int function1(boolean flag){
        System.out.println("inside function1(boolean flag)");
        return 1;
    }
    public static void main(String args[]){
        Poly1 p = new Poly1();
        p.function1(6,7);
    }
}
//inside function1(int x, int y)
//static polymorphism - during compile time