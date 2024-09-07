class Msd extends Thread{
    public void run(){
        for(int i=0;i<40;i++){
            System.out.println("inside run method:"+i);
        }
        System.out.println("end of run method");
    }
    public static void main(String[] args) {
        Msd a = new Msd();
        //a.run();
        a.start();
        for(int i=37;i<80;i++){
            System.out.println("main:" +i);
        }
        System.out.println("end of main");

    }
}
