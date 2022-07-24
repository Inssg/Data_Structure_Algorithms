package chap04;

public class Q6 {

    class Queue<E> {
        private E[] que;
        private int capacity;
        private int num;
        private int front;
        private int rear;

        public Queue(int maxlength) {
            front = rear = num = 0;
            capacity = maxlength;
            try {
                que = (E[]) new Object[capacity];
            } catch (OutOfMemoryError e) {
                capacity = 0;
            }
        }
    }
}
