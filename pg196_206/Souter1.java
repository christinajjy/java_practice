class Souter1{
    int x;
    static int y;
    static class Sinner1{
        public static void funs1(){
            System.out.println("inside funs1() of Sinner1");
            y = y+1;
            //funs2();//non static can not be accessed from static
            
        }
        public void funs2(){
            System.out.println("inside funs2() of sinner1");
            //x = x+1;//even if function is declared static it is non static in inner outer class context hence can not access non static member of outer class
            funs2();//static can  be accessed from static
            funs3();//non static can be accessed from non static
        }
        public void funs3(){
            System.out.println(".");
        }
    }
    public void funou(){
        System.out.println("inside funou() of Souter1");
        Sinner1 s = new Sinner1();
        s.funs2();
        Sinner1.funs1();
    }
    public static void main(String[] args) {
        y = y+1;
        Sinner1 s= new Sinner1();
        s.funs2();
        Sinner1.funs1();
    }
}