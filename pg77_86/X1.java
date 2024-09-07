class X1{
    int i;
    X1(int i){
        this.i = i+1;
        i = i+1;
        System.out.println(i);
        //System.out.println("this.i"+this.i);
    }
    void function(){
        int i = 67;
        System.out.println(i);
        System.out.println(this.i);
        this.i = this.i +1;
    }
    public static void main(String[] args) {
        X1 x1 =new X1(6);
        System.out.println(x1.i);
        x1.function();
        System.out.println(x1.i);
        //this.i = 203;//can not use in a static context
    }
}