package threads;
/*
*
* multiple task running at the same time??
* they share time, one task say now you can run, other
* says you run
* it is possible multiple process run at the same time
* that is where we have threads
* multiple threads also can share resources
*
* its not like we are gonna write thread conceps in real world projects
* but we need to understand the underlying idea
*
* */



class Z {

}
class X extends Thread {
    // EXTENDS THREAD OR IMPLEMENTS RUNNABLE
    public void run(){
        for (int i=0;i<=100;i++){
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
/*class A implements Runnable {
    // EXTENDS THREADS OR IMPLEMENTS RUNNABLE
    public void run(){
        for (int i=0;i<=25;i++){
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}*/
/*class B implements Runnable  {
    public void run(){
        for (int i=0;i<=25;i++){
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}*/

public class Main {

    public static void main(String[] args) throws InterruptedException {
        //ANONYMOUS CLASS CREATION
        Runnable obj1 = () -> {
            for (int i=0;i<=25;i++){
                System.out.println("hi");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable obj2 = () -> {
            for (int i=0;i<=25;i++){
                System.out.println("hello");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };


        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        System.out.println(t1.getPriority());// 1 to 10, 5 is normal priorty

        t2.setPriority(1);
        t2.setPriority(Thread.MAX_PRIORITY);//10
        // its not like scheduler will give obj2 priority, we are only suggesting
        // scheduler says THREAD A you can execute 1 ms, then it prints some number of hi's
        //how can we prevent too many printing hi's??? with sleep
        //we can optimize it we cannot control it completely



        t1.start();
        t1.start();

        t1.join(); // join allows main method to wait for threads which are working
        t2.join(); // if these two threads executing same increment1 method on same variable
        // sometimes they execute at the same time so increment works once
        // how can we control this?
        // we need to use synchronized at the method signature so that one thread can use it at a time
        // we will talk about thread states
        // NEW STATE: newly created stated
        // RUNNABLE STATE: when we say start, it goes into runnable state
        // RUNNING STATE: when thread is actually running on cpu its on running state
        // WAITING STATE: when thread is waiting for scheduler its in waiting state (wait,sleep)
        // with the help of notify() method it goes into RUNNABLE STATE
        // DEAD STATE: if we wanna kill it we can use stop() but its deprecated



        

    }

}

class Counter{
    int count;
    public synchronized void increment(){
        count++;
    }

}

//we complete threading with start and run method
//they are running in parallel
// nowadays we have multiple cores, if we have 4 cores we can arrange 4 threads to execute at same time
// but os gives some time to start the thread and that is why we see hi's
// IMPORTANT NOTE: if thread1 and thread2 are working on same variable this causes instability
// or you make sure, you work with immutable data
// or you can make sure you work thread safe, only one thread can work with that one point
// only one thread1 executing a method, only thread1 can execute that at that moment
//race condition
