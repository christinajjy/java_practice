class Z{
    void function(final int j){
        final int i=10;
        System.out.println(i);//10
        //j = j+3;// error: final parameter j may not be assigned
        System.out.println(j+3);//23
        //i = i+1;//error: cannot assign a value to final variable i, i = i+1;
        
    }
    final void functionZ(){
        System.out.println("class Z funZ");
    }
    public static void main(String[] args) {
        Z z = new Z();
        z.function(20);
    }
}
class Y extends Z{
    // void functionZ(){//overridden method is final
    //     System.out.println("class Y funZ");

    // }
    public static void main(String[] args) {
        Y y = new Y();
        y.functionZ();
    }
}
