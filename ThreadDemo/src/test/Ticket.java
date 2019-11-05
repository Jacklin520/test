package test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: jacklin
 * @Date: 2019/10/27 14:27
 * @Version 1.0
 */
public class Ticket implements Runnable{
    private int ticketNum =100;
    private Object object = new Object();//使用同步代码块解决线层同步问题
    private Lock lock = new ReentrantLock(true);//true是公平锁
    @Override
    public void run() {
        while (true){
            lock.lock();//在需要同步的代码块上加锁lock与unlick是一对
            try {
                if (ticketNum > 0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    String name = Thread.currentThread().getName();
                    System.out.println("线程名" + name +"销售电影票" + ticketNum--);
                }
            } finally {
                lock.unlock();
            }
        }
    }
    private synchronized  void saleTicket(){

    }
}
