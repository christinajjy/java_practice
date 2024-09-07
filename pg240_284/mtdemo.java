class mtdemo implements Runnable{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i+Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        Runnable t1 = new mtdemo();
        Runnable t2 = new mtdemo();
        Thread ta = new Thread(t1);
        Thread tb = new Thread(t2);
        ta.start();
        tb.start();
    }

}