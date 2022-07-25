import java.util.Scanner;

public class Main {

    public static int last = 0;

    public static int[] q;
    public static int first = 0;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder stb = new StringBuilder();


        int N = s.nextInt();
        q = new int[N];

        while (N-- > 0) {
            String str = s.next();

            switch (str) {

                case "push":
                    push(s.nextInt());
                    break;
                case "pop":
                    stb.append(pop()).append('\n');
                    break;
                case "size":
                    stb.append(size()).append('\n');
                    break;
                case "empty":
                    stb.append(empty()).append('\n');
                    break;
                case "front":
                    stb.append(front()).append('\n');
                    break;
                case "back":
                    stb.append(back()).append('\n');
                    break;
            }

        }
        System.out.println(stb);
    }

    public static void push(int x) {
        q[last] = x;
        last++;
    }

    public static int pop() {
        if (last - first == 0)
            return -1;
        else {
            int P = q[first];
            first++;
            return P;
        }

        }
        public static int size() {
            return last - first;
        }
        public static int empty() {
            if (last - first == 0)
                return 1;
            return 0;
        }
        public static int front() {
            if (last - first == 0)
                return -1;
            return q[first];
        }
        public static int back() {
            if (last - first == 0)
                return -1;
            return q[last - 1];
        }

    }
