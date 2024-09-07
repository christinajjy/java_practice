class Ademo3{
    public static void main(String[] args) {
        A a1[] = new A[3];
        System.out.println(a1[0]);
        a1[0]= new A();
        System.out.println(a1[0]); 
        a1[0].i = 10;
        a1[0].j = 20;
        a1[0].functionA();
        a1[1]= a1[0];
        System.out.println(a1[1].i);
        a1[2]= new A();
        a1[2]= new A(); 
    }
}