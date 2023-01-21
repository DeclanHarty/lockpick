public class Lockpick {
    public static void main(String[] args){
        Lock lock = new Lock(5);

        lock.printLock();

        for(int i = 0; i < 5; i++){
            lock.pickPin(i);
        }

        lock.printLock();
    }
}
