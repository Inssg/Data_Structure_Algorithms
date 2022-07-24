package chap04;

public class IntStack {
    private int[] stk;
    private int capacity;
    private int ptr;

    public class EmptyIntStackException  extends RuntimeException {
        public EmptyIntStackException() {}
    }

    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {}
    }

    //생성자

    public IntStack(int maxlen) {
        ptr = 0;
        capacity = maxlen;
        try {
            stk = new int [capacity];

        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }

    public int push(int x) throws OverflowIntStackException {
        if(ptr >= capacity)
            throw new OverflowIntStackException();
        return stk[ptr++] = x;
    }

    // 스택에서 데이터를 팝(꼭대기에 있는 데이터를 꺼냄)
    public int pop() throws EmptyIntStackException {
        if(ptr <= 0)
            throw new EmptyIntStackException();
        return stk[--ptr];
    }

    public int peek() throws EmptyIntStackException {
        if(ptr <= 0)
            throw new EmptyIntStackException();
        return stk[ptr-1];
    }
    public void clear() {
        ptr = 0;
    }
    public int indexOf(int x) {
        for (int i = ptr -1; i >= 0; i--)
            if(stk[i] == x)
                return i;
            return -1;
    }
    // 스택 용량을 반환
        public int getCapacity() {
            return capacity;
        }
    public int size() {
        return ptr;
    }

    // 스택이 비어있는가?
    public boolean isEmpty() {
        return ptr <= 0;
    }

    public boolean isFull() {
        return ptr >= capacity;
    }

    //스택안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
    public void dump() {
        if(ptr <= 0)
            System.out.println("스택이 비어 있습니다.");
        else{
            for(int i =0; i < ptr; i++)
                System.out.print(stk[i] + " ");
            System.out.println();
        }
    }


}
