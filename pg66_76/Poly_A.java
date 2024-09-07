//program illustrating disadvantage of static polymorphism
class Poly_A{
    // void function(int x,int y){
    //     System.out.println("inside function(int x,int y)");
    // }
    void function(int x,float y){
        System.out.println("inside function(int x,float y)");
    }
    void function(float x,int y){
        System.out.println("inside function(float x,int y)");
    }
    public static void main(String[] args) {
        int a =6;
        float b=7.8f;
        Poly_A p = new Poly_A();
        p.function(a,b);
        p.function(b,a);
        p.function(a,a);
    }
}
/* when function(int x,int y) is not commented out

inside function(int x,float y)
inside function(float x,int y)
inside function(int x,int y)
 */
/* when function(int x,int y) is  commented out

    Poly_A.java:17: error: reference to function is ambiguous
        p.function(a,a);
         ^
    both method function(int,float) in Poly_A and method function(float,int) in Poly_A match
    1 error
 */
