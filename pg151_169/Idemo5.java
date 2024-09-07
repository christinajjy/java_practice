class Idemo5 {
    public static void main(String[] args) {
        System.out.println("A1 ref Idemo4 obj");
        A1 a1 = new Idemo4();
        a1.functionA();
        a1.functionB();
        a1.functionI();
        a1.functionX();
        a1.functionY();
        System.out.println("typecasting above obj to Idemo4");
        Idemo4 d1 = (Idemo4)a1;
        d1.functionA();
        d1.functionB();
        d1.functionI();
        d1.functionX();
        d1.functionY();
        d1.function1();
        System.out.println("Xyz1 ref Idemo4 obj");
        Xyz1 x1 = new Idemo4();
        x1.functionX();
        x1.functionY();
        System.out.println("typecasting above obj to Idemo4");
        Idemo4 d2 = (Idemo4)x1;
        d2.functionA();
        d2.functionB();
        d2.functionI();
        d2.functionX();
        d2.functionY();
        d2.function1();
        

    }
}
