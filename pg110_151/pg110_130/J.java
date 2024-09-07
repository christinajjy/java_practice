class I{
    int a,b;
    I(int x){
        a =x;
        System.out.println("inside I(int x)");
    }
}
class J extends I{
    J(){
        super(6);
        System.out.println("inside J()");
    }
    public static void main(String args[]){
        J j1= new J();
    }
}