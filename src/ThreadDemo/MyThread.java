package ThreadDemo;

import java.util.Date;

/**
 * @Author: jacklin
 * @Date: 2019/10/26 15:09
 * @Version 1.0
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <10; i++) {
            System.out.println("Thread执行了：" + new Date().getTime());
        }
    }
}

