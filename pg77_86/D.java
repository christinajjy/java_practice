class D{
    int a,b;
    D(){
        System.out.println("inside constructor");
    }
    void D(){
        System.out.println("inside function");
    }
    public static void main(String[] args) {
        D d1 = new D();
        d1.D();
    }
}
//D() function is not a constructor and is loaded on to the obj d1
// naming functions with class name is not advised and considered wrong by coding standards