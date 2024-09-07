interface Xyz{
    public void funX();
    public void funY();

}
class Anony1{
    static Xyz x1 = new Xyz(){
        public void funX(){
            System.out.println("x1-- funX()");
        }
        public void funY(){
            System.out.println("x2-- funY()");
        }
    };
}
class Test1 {
    public static void main(String[] args) {
        Anony1.x1.funX();
        Anony1.x1.funY();
    }
}
