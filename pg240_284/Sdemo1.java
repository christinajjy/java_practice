class Sdemo1 extends Thread{
    public void run(){
        try{
            Thread.sleep(837);
        }
        catch(Exception e){
            System.out.println(e);
        }
        for (int i = 0; i < 37; i++) {
            System.out.println("run of Sdemo1:"+i);
        }
        System.out.println("end of run()");
    }
    public static void main(String args[]){
        Sdemo1 s1 = new Sdemo1();
        s1.start();
        for (int i = 400; i < 440; i++) {
            System.out.println("inside main:"+i);          
        }
        System.out.println("End of main");
    }
}
