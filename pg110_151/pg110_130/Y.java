class X{
    int i;
    void functionX(){
        System.out.println("funX");
        System.out.println(i);
        //System.out.println(j);
    }
}
class Y extends X{
    int j;
    void functionY(){
        System.out.println("funy");
        System.out.println(j);
        System.out.println(i);
    }public static void main(String[] args) {
        Y y1 = new Y();
        y1.j = 20;
        y1.i = 30;
        y1.functionY();
        y1.functionX();
    }
}