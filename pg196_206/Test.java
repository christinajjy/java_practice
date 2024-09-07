class Test{
    public static void main(String[] args) {
        Souter1.y =10;
        Souter1.Sinner1 oi = new Souter1.Sinner1();
        oi.funs2();
        Souter1.Sinner1.funs1();
    }
}