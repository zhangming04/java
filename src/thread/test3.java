package thread;
import java.lang.*;

public class test3 implements Runnable
{
	private int count = 20 ;
	
    public void run()   
    {
        while(true)
        {
            System.out.println("线程 " + Thread.currentThread().getName() + "运行     " + count--);
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
    	Runnable t = new test3();
    	Thread deamon = new Thread(t, "A") ;
    	deamon.setDaemon(true) ;
    	deamon.start() ;
    }
 }
