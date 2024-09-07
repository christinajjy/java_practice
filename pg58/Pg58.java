class Pg58{
    int i;
    static int j;
    public static void main(String args[]){
        Pg58 s1 = null;
        System.out.println(s1.i);//e:java.lang.NullPointerException
        System.out.println(s1.j);
        Pg58 s1 = new Pg58();//e:variable s1 is already defined in method main(String[])
        System.out.println(s1);
        s1.i = 25;
        s1.j = 35;
        System.out.println(s1.j);
        Pg58 s2 = new Pg58();
        Pg58 s3 = new Pg58();
        s2.i = 10;
        System.out.println(s3.i);
        s2.j = 115;
        System.out.println(s3.j);

        
    }
}