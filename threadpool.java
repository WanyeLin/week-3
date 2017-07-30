package src;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class FirstThreadPool{

    public static void main(String[] args)
    {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i=0 ;i<10;i++)
        {
            Runnable task = new taskdescription("gg"+i);
            executor.execute(task);
        }
        executor.shutdown();
        while(!executor.isTerminated())
        {}
        System.out.println("Over");
    }
}

class taskdescription implements Runnable{

    private String command ;

    public taskdescription(String s)
    {
        this.command = s ;
    }

    public void run()
    {
        System.out.println(Thread.currentThread().getName()+" outset "+command);
        ongoing();
        System.out.println(Thread.currentThread().getName()+" The end");
    }

    private void ongoing()
    {
        try{
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {e.printStackTrace();}
    }


    public String toString(){
        return this.command ;}


    }