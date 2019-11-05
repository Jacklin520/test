package test;

/**
 * @Author: jacklin
 * @Date: 2019/10/27 14:30
 * @Version 1.0
 */
public class TicketTest {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread thread =new Thread(ticket,"窗口一");
        Thread thread2 =new Thread(ticket,"窗口二");
        Thread thread3 =new Thread(ticket,"窗口三");
        thread.start();
        thread2.start();
        thread3.start();
    }
}
