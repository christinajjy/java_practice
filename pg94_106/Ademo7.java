class Ademo7{
    void function1(int i[]){
        if(i!=null && i.length>0){
            System.out.println("length: "+i.length);
            System.out.println(i[i.length-1]);
        }
        else
            System.out.println("improper values supplied");
    }
    public static void main(String[] args) {
        Ademo7 a1 = new Ademo7();
        a1.function1(new int[0]);
        a1.function1(null);
        int i[] = {1,2,3,4};
        a1.function1(i);
    }
}
/* 
improper values supplied
improper values supplied
length: 4
4
 */