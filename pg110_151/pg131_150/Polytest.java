class A4{
    void functionA(int i){
        System.out.println("class A - functionA");
        int j = i*i;
        System.out.println("square of "+i+"is: "+j);
    }
}
class B4 extends A4{
    void functionA(int i){
        System.out.println("class B function A");
        int sum =0;
        for (int j = 0; j < i; j++) {
            sum = sum+j;
        }
        System.out.println("sum of "+i+"numbers: "+sum);
    }
}
class C4 extends A4{
    void functionA(int i){
        System.out.println("class C functionA");
        int fact =1;
        for (int j = 1; j <=i; j++) {
            fact = fact*j;
            //System.out.println(j);
        }
        System.out.println("factorial of"+i+"is :"+fact);
        super.functionA(i);
    }
}
class Polytest{
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0].trim());
        A4 a1 = new A4();
        if(i>10 && i<20)
            a1 = new C4();
        a1.functionA(i);
        


    }
}
