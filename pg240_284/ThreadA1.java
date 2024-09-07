class ThreadA1 implements Runnable{
    public void run(){
        for(int i=0;i<40;i++){
            System.out.println("run of threadA1:"+i);
        }
    }
    public static void main(String[] args) {
            ThreadA1 ta = new ThreadA1();
            Thread t1 = new Thread(ta);
            t1.start();
            for (int i = 400; i < 437; i++){
                System.out.println("nain: "+i);
                
            }
    }
}


