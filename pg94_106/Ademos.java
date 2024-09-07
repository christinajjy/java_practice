class Ademos{
    public static void main(String[] args) {
        //int i[];
        String s1[] = {"abc","xyz","MSD","SSA"};
        A a1[] = {new A(),new A(), new A()};
        System.out.println(s1.length);
        System.out.println(s1[3]);
        a1[0].i = 11;
        System.out.println(a1[0].i);
        //i[] = {1,2};when using {} brackets for arrays - declaration and initialisation should occur at the same time

    }
}