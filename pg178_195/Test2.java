class Demo1{
    public int i;
    private Demo1(){
        System.out.println("inside constructor of Demo1()");
    }
    public static Demo1 function1(){
        Demo1 d = new Demo1();
        return(d);
    }
}
class Test2 {
    public static void main(String[] args) {
        Demo1 d = Demo1.function1();
        System.out.println(d.i);
    }
}
