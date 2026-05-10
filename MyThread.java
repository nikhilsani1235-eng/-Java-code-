class MyThread extends Thread {

    public void run(){

        System.out.println("Thread running using start()");
    }

    public static void main(String[] args)
    {
        MyThread t1 = new MyThread();
        
        // Starts a new thread
        t1.start(); 
    }
}