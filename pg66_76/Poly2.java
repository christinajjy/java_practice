class Poly2{
    void function1(int x){
        System.out.println("inside function1(int x)");
    }
    void function1(float x){
        System.out.println("inside function1(float x)");
    }
    void function1(long x){
        System.out.println("inside function1(long x)");
    }
    public static void main(String[] args) {
        Poly2 p = new Poly2();
        int i = 6;
        float j =6;
        long k =6;
        System.out.println(i+" "+j+" "+k);
        p.function1(6);//type of 6 is compatible to all the three members
        //highest priority is given to function whose parameters datatype is smae as that of the argument
        //long has higher priority to float
        //if two parameters have equal priority - ambiguity occurs- disadvantage of static polymorphism
    }
}
