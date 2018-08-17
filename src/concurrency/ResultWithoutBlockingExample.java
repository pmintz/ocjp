package concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultWithoutBlockingExample {

    public static void main(String[] args) throws Exception {
        //create a thread pool of two threads
        ExecutorService es = Executors.newFixedThreadPool(2);
        
        MyTask task1 = new MyTask();
        Future<String> result = es.submit(task1);
        System.out.println("Proceeding without blocking... ");
        while(!result.isDone()){
            try {
                //check later
            	System.out.println("Inside try");
                Thread.sleep(5000);
                System.out.println("Exiting try");
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("Result is "+result.get());
        es.shutdown();
    }
    
    public static class MyTask implements Callable<String>{
        public String call(){
            try {
                //simulate a long running task;
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            return "Data from "+Thread.currentThread().getName();
        }
    }
}