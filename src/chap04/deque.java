package chap04;

public class deque {
    private int[] que;
    private int capacity;
    private int front;
    private int rear;
    private int num;

    //실행 시 예외: 큐가 비어있음
    public class EmptyIntQueueException extends RuntimeException{
        public EmptyIntQueueException() {}
    }
    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() { }

    }
    //생성자
    public deque(int maxlen) {
        num = front = rear = 0;
        capacity  = maxlen;
        try {
            que = new int[capacity];

        }catch (OutOfMemoryError e){
            capacity = 0;
        }
    }

    public int enque(int x)  throws OverflowIntQueueException {
        if(num >= capacity)
            throw new OverflowIntQueueException();
        que[rear++] = x;
        num++;
        if (rear == capacity)
            rear =0;
        return x;
    }
    public int deque() throws EmptyIntQueueException {
        if (num <= 0)
            throw new EmptyIntQueueException();
        int x = que[front++];
        num--;

        if (front == capacity)
            front = 0;
        return x;
    }
    public int peek() throws EmptyIntQueueException{
        if(num <= 0)
            throw new EmptyIntQueueException();
        return que[front];
    }
        // 큐를 비움
    public void clear(){
        num = front = rear = 0;
    }
    public int indexOf(int x) {
        for( int i =0; i < num; i++) {
            int idx = (i + front) % capacity;
            if(que[idx] == x)
                return idx;
        }
            return -1;
    }

    public int search(int x) {
        for(int i =0; i < num; i++)
            if(que[front+i] %capacity == x)
                return i+1;

        return 0;
    }

    public int getCapacity() {
        return capacity;
    }
    // 큐에 쌓여있는 데이터 개수 반환
    public int size() {
        return num;
    }
    public boolean isEmpty() {
        return num <= 0;
    }

    public boolean isFull() {
        return num >= capacity;
    }
    public void dump() {
        if(num <= 0 )
            System.out.println("큐가 비어있습니다.");
        else{
            for(int i = 0; i < num; i++)
                System.out.print(que[(i + front) % capacity] + " ");
            System.out.println();
        }
    }
}
