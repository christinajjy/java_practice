class A{
    int i,j;
    void functionA(){
        System.out.println(i);
        System.out.println(j);
    }
    public static void main(String[] args) {
        A a1 = new A();
        String s1 = a1.toString();
        System.out.println(s1);
    }
}
//A@d716361