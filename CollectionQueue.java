import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


public class CollectionQueue {
    public CollectionQueue() {
    }

    public static void main(String[] args) {
        QueueExample queue = new QueueExample();
        queue.listExample();
        PriorityQueueExample priorityQueue = new PriorityQueueExample();
        priorityQueue.listExample();
    }

    public static class QueueExample {
        public QueueExample() {
        }

        public void listExample() {
            Queue<String> queue = new LinkedList();
            queue.add("a");
            queue.add("b");
            queue.add("c");
            queue.add("d");
            queue.add("e");
            queue.add("f");
            queue.remove("a");
            System.out.println("Queue:" + String.valueOf(queue));
        }
    }

    public static class PriorityQueueExample {
        public PriorityQueueExample() {
        }

        public void listExample() {
            PriorityQueue<Integer> queue = new PriorityQueue();
            queue.add(1);
            queue.add(2);
            queue.add(3);
            queue.add(4);
            queue.add(5);
            System.out.println("PriorityQueue:" + String.valueOf(queue));
            System.out.println("The First element of priority queue:" + String.valueOf(queue.peek()));
        }
    }
}
