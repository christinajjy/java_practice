class Anony2{
    public static Xyz getXyz(){
        Xyz x1 = null;
        x1 = new Xyz() {
            public void funX(){
                System.out.println("anon2-x1-- funX");
            }        
            public void funY(){
                System.out.println("anon2-x1-- funY");
            }
        };
        return(x1);
    }
}
class Test2 {
    public static void main(String args[]){
        Xyz x1= Anony2.getXyz();
        x1.funX();
        x1.funY();
    }
}
