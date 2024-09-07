class A1{
    A1()throws Exception{
        System.out.println(1);
    }

}
class B1 extends A1{
    public static void main(String[] args) {
        try{
            B1 b1 = new B1();
        }
        catch(Exception e){
            System.out.println(e);
        }
           
    }
}
