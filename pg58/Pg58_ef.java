class Pg58_ef{
    int i;
    static int j;
    public static void main(String args[]){
        Pg58_ef s1 = null;
        //System.out.println(s1.i);//e:java.lang.NullPointerException
        System.out.println(s1.j);
        s1 = new Pg58_ef();//e:variable s1 is already defined in method main(String[])
        System.out.println(s1);
        s1.i = 25;
        s1.j = 35;
        System.out.println(s1.j);
        System.out.println(j);
        Pg58_ef s2 = new Pg58_ef();
        Pg58_ef s3 = new Pg58_ef();
        s2.i = 10;
        System.out.println(s3.i);
        s2.j = 115;
        System.out.println(s3.j);
        System.out.println(j);

        
    }
}
/* 
0
Pg58_ef@d716361
35
0
115
 */