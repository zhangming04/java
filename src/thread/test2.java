package thread;
import java.lang.*;

public class test2 implements Runnable
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
    	Runnable t = new test2();
    	new Thread(t, "A").start() ;
    	new Thread(t, "B").start() ;
    	new Thread(t, "C").start() ;
    	new Thread(t, "D").start() ;
    }
 }
