package ThreadDemo;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: jacklin
 * @Date: 2019/10/26 15:21
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        //创建自定义线程类实例
//        MyThread myThread = new MyThread();
//        myThread.start();
//        for (int i = 0; i <10 ; i++) {
//            System.out.println("main线程执行了：" + new Date().getTime());
//        }


//        Thread thread = new Thread(new MyRunnableThread(),"Thread11");
//        thread.start();

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(new MyRunnableThread());
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName() + "执行了：" + new Date().getTime() + ";执行次数是：" + i);
        }
    }
}
