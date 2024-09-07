import javax.print.attribute.standard.Sides;

class Sdemo2 extends Thread{
    public void run(){
        for (int i = 0; i < 40; i++) {
            System.out.println("inside run:"+i);
        }
    }
    public static void main(String args[]){
        Sdemo2 s1 = new Sdemo2();
        s1.start();
        try {
            Thread.sleep(800);
        } catch (Exception e) {
           System.out.println(e);
        }
        for(int i=100;i<140;i++){
            System.out.println("inside main:"+i);
        }
        System.out.println("end of main");
    }
}
