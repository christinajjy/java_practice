class Bdemo1{
    int i;
    Bdemo1(){
        System.out.println("inside the constructor");
    }
    static{
        System.out.println("inside the static block");
    }
    {
        System.out.println("inside the non static");
    }
    public static void main(String[] args) {
        System.out.println("inside main");
        Bdemo1 b1 = new Bdemo1();
    }
}