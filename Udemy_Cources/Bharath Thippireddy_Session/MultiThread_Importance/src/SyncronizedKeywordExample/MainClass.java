package SyncronizedKeywordExample;

public class MainClass {
    public static void main(String[] args) {
    	
        SyncronizationExample syncExample = new SyncronizationExample();

        ThreadClass thread1 = new ThreadClass(syncExample, "Thread 1");
        ThreadClass thread2 = new ThreadClass(syncExample, "Thread 2");

        thread1.start();
        thread2.start();
    }
}

