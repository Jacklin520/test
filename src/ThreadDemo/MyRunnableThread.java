package ThreadDemo;

import java.util.Date;

/**
 * @Author: jacklin
 * @Date: 2019/10/26 15:29
 * @Version 1.0
 */

/**
 * 自定义的run方法
 */
public class MyRunnableThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName() + "执行了：" + new Date().getTime());
        }
    }
}
