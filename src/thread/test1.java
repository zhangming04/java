package thread;
import java.lang.*;

public class test1 extends Thread
{
	private int count = 20 ;
 
    public void run() 
    {
        while(count > 0)
        {
            System.out.println("�߳� " + Thread.currentThread().getName() + "����     " + count--);
            try 
            {
				Thread.sleep(10) ;
			} 
            catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
        }
    }
 
    public static void main(String[] args)
    {
    	Thread t1 = new test1() ;
    	Thread t2 = new test1() ;
    	Thread t3 = new test1() ;
    	t1.start() ;
    	t2.start() ;
    	t3.start() ;
    }
 }
