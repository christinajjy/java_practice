class Access{
    public int i;
    private int j;
    public void functionA(){
        i=i+1;
        System.out.println(i);
        System.out.println(j);
    }
    private void functionB(){
        i = i*i;
        j = j*j;
        System.out.println(i);
        System.out.println(j);
    }
    public static void main(String[] args) {
        Access a1 = new Access();
        a1.functionA();
        a1.functionB();
        System.out.println(a1.j);
    }
}

class Test {
    public static void main(String[] args) {
        Access a1 = new Access();
        //a1.functionB();
        System.out.println(a1.i);
        //System.out.println(a1.j);
        a1.functionA();
        //Access.main(args);
    }
}
