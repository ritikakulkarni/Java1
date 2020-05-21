public class DeadLockBetweenTwoThreads
 {
    String strone = "HAI";
    String strtwo = "HELLO";
    Thread t1 = new Thread("Thread One"){
        public void run(){
			while(true){
                synchronized(strone){
                    synchronized(strtwo){
                        System.out.println(strone + strtwo);
                    }
                }
            }
        }
    };
    Thread t2 = new Thread("Thread Two"){
        public void run(){
            while(true){
                synchronized(strtwo){
                    synchronized(strone){
                        System.out.println(strtwo + strone);
                    }
                }
            }
        }
    }
    public static void main(String a[]){
        DeadLockBetweenTwoThreads obj = new DeadLockBetweenTwoThreads();
        obj.t1.start();
        obj.t2.start();
    }
}
