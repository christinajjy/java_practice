class Edemo3{
    public void fun1(int i,int j)throws NullPointerException{
        int x=i/j;
        System.out.println(x);
        A a1= null;
        if(x>10)
            a1 = new A();
        a1.funA();

    }
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        Edemo3 e1 = new Edemo3();
        try{
            e1.fun1(x,y);
        }
        catch(NullPointerException e){}
            System.out.println(e);
        }
        
        System.out.println(x);
        System.out.println(y);
        
    }
}