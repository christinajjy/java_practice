class X{
    int a,b;
    void functionX(){
        System.out.println("inside functionX()");

    }

}
class Y{
    int i;
    public static void main(String args[]){
        X x = new X();
        x.a = 10;
        x.functionX();
    }
}