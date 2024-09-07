class B6{
    int x,y;
    public String toString(){
        String s1 = "x = "+x+"\ny: "+y;
        return(s1);
    }
    public static void main(String[] args) {
        B6 b1 = new B6();
        System.out.println(b1);
        b1.x=115;
        b1.y =205;
        System.out.println(b1);
        
    }
}
