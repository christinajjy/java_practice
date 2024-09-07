class Ademo{
    public static void function1(String[] args) {
        if(args!=null)
            System.out.println(args.length);
        else
            System.out.println("null is passed as argument");
        
    }
    public static void main(String args[]){
        function1(args);
        System.out.println("inside main");
    }
}
/* 
java Ademo
0
inside main

java Ademo hello my name is christina//command line arguments
5
inside main
 */