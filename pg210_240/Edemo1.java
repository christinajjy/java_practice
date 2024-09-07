class A{
    void funA(){
        System.out.println("funA");
    }
}
class Edemo1{
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);
        int l = Integer.parseInt(args[3]);
        A a1 =null;
        try{
            System.out.println("inside try block");
            int x=i/j;
            System.out.println(x);
            int ar1[]=new int[k];
            ar1[l]=x;
            if(x>10)
                a1=new A();
            a1.funA();
            System.out.println("end of try block");
        }
        catch(ArithmeticException e1){
            System.out.println(e1);
        }
        catch(ArrayIndexOutOfBoundsException e2){
            System.out.println(e2);
        }
        catch(NullPointerException e3){
            System.out.println(e3);
        }
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
    }
}