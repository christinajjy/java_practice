interface Ijk{
    public void funI(int i);
}
class Anony3{
    public static Ijk getIjk(int x){
        Ijk i1 =null;
            if(x>10){
                i1 = new Ijk(){
                    public void funI(int j){
                        int sum =0;
                        for (int i = 0; i <= j; i++) 
                            sum = sum+i;
                        System.out.println("sum is"+sum);
                        
                    }
                };
            }
            else{
                i1 = new Ijk() {
                    public void funI(int j){
                        int sq=0;
                        sq =j*j;
                        System.out.println("square is"+sq);
                    }
                };
            }
        return (i1);
            
    }
}
class Test3{
    public static void main(String[] args) {
        Ijk i1 = Anony3.getIjk(25);
        Ijk i2 = Anony3.getIjk(6);
        i1.funI(5);
        i2.funI(5);
    }
}
