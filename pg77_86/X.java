class X{
    int a,b;
    X(int i){
        a =i;
        System.out.println("inside X(int i)");
    }
    X(int i,int j){
        a =i;b =j;
        System.out.println("inside X(int i,int j)");
    }
    public static void main(String args[]){
        X x1 = new X(6);
        //X x2 = new X();//compilation error- since there are parameterised constructors in the class - default no argument constructor is not provided by the compiler
        //X x3 = new X(true);//compilation error
    }
}