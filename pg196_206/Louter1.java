class Louter1 {
    int x;
    public void fun1(){
        int i=10;
        final int j=30;
        class Linner1{
            public void funL(){
                System.out.println("inside funL of Linner");
                System.out.println(x);
                System.out.println(i);//variable i might not have been initialised
                System.out.println(j);
            }
        }
        Linner1 l = new Linner1();
        l.funL();
        System.out.println("end of fun1()");
    }
    public static void main(String args[]){
        Louter1 l = new Louter1();
        l.fun1();
    }
}
