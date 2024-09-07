interface Xyz{
    public void functionX();
    public void functionY();
}
interface Ijk{
    public void functionI();
    public void functionX();
}
class Idemo1 implements Xyz,Ijk{
    public void functionX(){
        System.out.println("x");
    }
    public void functionY(){
        System.out.println("y");
    }
    public void functionI(){
        System.out.println("i");

    }
    public void functionK(){
        System.out.println("k");
    }
    public static void main(String args[]){
        Idemo1 d1 = new Idemo1();
        Xyz obj1 = new Idemo1();
        Ijk obj2 = new Idemo1();
        d1.functionI();
        d1.functionX();
        d1.functionY();
        System.out.println("idemo1 obj with interface Xyz reference");
        obj1.functionX();
        obj1.functionY();
        System.out.println("idemo1 obj with interface Ijk reference");
        obj2.functionI();
        obj2.functionX();
        //obj1.functionI();//with interface reference only methods defined in the interface, and are present in the class can be called


        
    }

}