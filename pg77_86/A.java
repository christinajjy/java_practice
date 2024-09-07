class A{
    int i,j;
    A(){
        System.out.println("inside constructor A");
        // i =5;
        // j=10;
    }
    void function(){
        System.out.println("inside function");
        System.out.println(i+" "+j);
    }
    public static void main(String args[]){
        A a1 = new A();
        A a2 = new A();
        a2.function();
    }

}
/* 
when lines 5 and 6 are not commented out
 inside constructor A
inside constructor A
inside function
5 10

when lines 5 and 6 are commented out
inside constructor A
inside constructor A
inside function
0 0

jvm creates the object 
loads the constructor
executes it 
deletes it
then address of the obj will be assigned to its reference variable

constructor will not be loaded into the object

each constructor will have a default statement

it is not the role of the default constructor to initialize the uninitialised variable -jvm does it
 */
