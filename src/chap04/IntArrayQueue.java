package chap04;

public class IntArrayQueue {
    private int[] que;
    private int capacity;
    private int num;

    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() {}
    }
    public class OverflowIntQueueException  extends RuntimeException {
        public OverflowIntQueueException() { }
    }

    // 생성자
    public IntArrayQueue(int maxlen){
        num = 0;
        capacity = maxlen;
        try{
            que = new int[capacity];
        }catch (OutOfMemoryError e ){
            capacity = 0;
        }
    }
}
