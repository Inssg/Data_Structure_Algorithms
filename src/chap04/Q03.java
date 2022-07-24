package chap04;

public class Q03 {
    private int [] stk;
    private int capacity;
    private int ptr;

    public class EmptyIntStackException extends RuntimeException{
        public EmptyIntStackException() {}
    }
    public class OverflowIntStackException extends RuntimeException{
        public OverflowIntStackException() {}
    }



    public Q03( int maxlen) {
        ptr =0;
        capacity =maxlen;
        try{
            stk = new int[capacity];

        }catch(OutOfMemoryError e){
            capacity = 0;
        }
    }
}
