class ThreadA extends Thread{
    public void run(){
        for(int i=100;i<140;i++){
            System.out.println("run of ThreadA:"+i);
        }
        System.out.println("end of ThreadA");
    }
}
class ThreadB extends Thread{
    public void run(){
        for(int i=400;i<437;i++){
            System.out.println("run of ThreadB:"+i);
        }
        System.out.println("end of ThreadB");
    }
}
class ThreadC extends Thread{
    public void run(){
        for(int i=4;i<40;i++){
            System.out.println("run of ThreadC:"+i);
        }
        System.out.println("end of ThreadC");
    }
}
class ThreadTest{
    public static void main(String args[]){
        Thread ta = new ThreadA();
        Thread tb = new ThreadB();
        Thread tc = new ThreadC();
        ta.start();
        tb.start();
        tc.start();
        for(int j=0;j<40;j++){
            System.out.println("inside main:"+j);
        }
        System.out.println("end of main");
    }
}