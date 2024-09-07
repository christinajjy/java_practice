class M{
    int i,j;
    M(){
        System.out.println("inside M() of class M");
    }
}
class N extends M{
    int i,j;
    N(){
        System.out.println("inside N() of class N");
    }
    public static void main(String args[]){
        N n1 = new N();
    }
}
/* 
inside M() of class M
inside N() of class N
 */