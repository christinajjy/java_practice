class Y1{
    Y1(){
        this(6);//if using this to call another constructor the statement must be the first in the constructor- if not this error occurs - call to this must be first statement in constructor
        System.out.println("inside constructor Y1()");
    }
    Y1(int i){
        this(i,i+1);
        System.out.println("inside constructor Y1(int i)");
        
    }
    Y1(int i,int j){
        System.out.println("inside constructor Y1(int i,int j)");
    }
    public static void main(String[] args) {
        Y1 y1 = new Y1();
        System.out.println("end of main");
    }
}
/* 
inside constructor Y1(int i,int j)
inside constructor Y1(int i)
inside constructor Y1()
end of main

 */