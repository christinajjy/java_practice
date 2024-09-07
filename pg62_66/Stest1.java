import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

class Stest1{
    static int x;
    public static void main(String args[]){
        x = x+1;
        Sdemo3.i = 5;
        System.out.println(Sdemo3.i);
        Sdemo3 s1 = new Sdemo3();
        System.out.println(s1.i);
        s1.i = 203;
        System.out.println(Sdemo3.i);
        //System.out.println(i);//error: cannot find symbol
    }
}
/* 
5
5
203
 */