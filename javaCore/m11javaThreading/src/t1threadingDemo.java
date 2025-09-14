public class t1threadingDemo {
    public static void main(String args[]) {
//        // 2- creating threads
//        ThreadExtendClass t1 = new ThreadExtendClass();
//
//        ThreadImplementsRunnableClass obj = new ThreadImplementsRunnableClass();
//        Thread t2 = new Thread(obj);
//
//        // 3- starting threads
//        t1.start();
//        t2.start();

//        // 4- behavior of threads
//        ThreadExtendClass t1 = new ThreadExtendClass();
//        t1.setName("firstThread");
//        t1.start();
//
//        ThreadExtendClass t2 = new ThreadExtendClass();
//        t2.setName("secondThread");
//        t2.start();
//
//        ThreadExtendClass t3 = new ThreadExtendClass();
//        t3.setName("thirdThread");
//        t3.start();

//        // 4- assigning priorities for thread execution
//        ThreadExtendClass t1 = new ThreadExtendClass();
//        t1.setName("FirstThread");
//        t1.setPriority(10);
//
//        ThreadExtendClass t2 = new ThreadExtendClass();
//        t2.setName("SecondThread");
//        t2.setPriority(5);
//
//        ThreadExtendClass t3 = new ThreadExtendClass();
//        t3.setName("thirdThread");
//        t3.setPriority(Thread.MIN_PRIORITY);
//
//        t3.start();
//        t2.start();
//        t1.start();

        // 5- thread execution prevention
        // 5.1- sleeping - (i) - sleep, (ii) - yield, (iii) - join
//        // for sleep and yield methods
//        ThreadExtendClass t1 = new ThreadExtendClass();
//        t1.setName("firstThread");
//        t1.setPriority(10);
//        ThreadExtendClass t2 = new ThreadExtendClass();
//        t2.setName("secondThread");
//        t2.setPriority(5);
//        t2.start();
//        t1.start();

        // for join method
        ThreadExtendClass t1 = new ThreadExtendClass();
        t1.setName("firstThread");
        t1.setPriority(1);
        ThreadExtendClass t2 = new ThreadExtendClass();
        t2.setName("secondThread");
        t2.setPriority(1);
        try{
            t1.start();
            t1.join();
            System.out.println("Before putting t2 in runnable state");
            t2.start();
        }catch(InterruptedException ie){
            System.err.print(ie);
        }
    }
}

// 1- Defining threads
class ThreadExtendClass extends Thread {
    public void run() {
//        System.out.println("thread extends example");

//        System.out.println("thread extends example and thread is::  "+Thread.currentThread().getName());

//        for(int i=0;i<5;i++){
//            System.out.println("for iteration i ::"+i+"::thread extends example and thread is::  "+Thread.currentThread().getName());
//        }

        try{
            for(int i=0;i<5;i++){
                System.out.println("for iteration i ::"+i+"::thread extends example and thread is::  "+Thread.currentThread().getName());

                // for sleeping methods
//                // (i) - sleep
//                Thread.currentThread().sleep(3000);
//                // (ii) - yield
//                if("secondThread".equals(Thread.currentThread().getName())){
//                    Thread.currentThread().yield();
//                }
            }
        }catch(Exception ie){
            System.err.print(ie);
        }

    }
}

class ThreadImplementsRunnableClass implements Runnable {
    public void run() {
        System.out.println("thread implements example");
    }
}

