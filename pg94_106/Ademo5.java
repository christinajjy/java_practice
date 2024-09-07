class Ademo5{
    String s1[]={"abc","xyz"};
    int i1[];
    public static void main(String[] args) {
        Ademo5 a1 = new Ademo5();
        //a1.i1={1,2,3};//not allowed
        a1.i1 = new int[6];
        a1.i1 = new int[6];
        //int j[] = new int[];//should give size of array
        int j[] = new int[0];
        System.out.println(j);
        System.out.println(j.length);
        //System.out.println(j[0]);//0 out of bounds for length 0
        String s1[] = new String[0];
        String s2[]= {};

    }
}