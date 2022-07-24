package chap04;

public class Stack2<E> {
    private E [] stk;
    private int capacity;
    private int ptr;

    public Stack2(int maxlen){
        ptr = 0;
        capacity = maxlen;
        try{
            stk = (E[]) new Object[capacity];

        }catch (OutOfMemoryError e){
            capacity = 0;
        }
    }
}
