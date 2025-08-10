import java.util.ArrayList;

class PriorityQueue {

    public class Element<T> {
        T value;
        int priority;

        public Element(T value, int priority) {
            this.value = value;
            this.priority = priority;
        }
    }

    public class PriorityQueueException extends Exception {
        public PriorityQueueException(String message) {
            super(message);
        }
    }

    public class Priority_Queue<T> {
        private ArrayList<Element<T>> heap;

        public Priority_Queue() {
            heap = new ArrayList<>();
        }

        // minheap implementation
        public void insert(T value, int priority) {
            Element<T> e = new Element<>(value, priority);
            heap.add(e);
            int childIndex = heap.size() - 1;
            int parentIndex = (childIndex - 1) / 2;
            while (childIndex > 0) {
                if (heap.get(childIndex).priority < heap.get(parentIndex).priority) {
                    while (childIndex > 0 && heap.get(childIndex).priority < heap.get(parentIndex).priority) {
                        Element<T> temp = heap.get(childIndex);
                        heap.set(childIndex, heap.get(parentIndex));
                        heap.set(parentIndex, temp);
                        childIndex = parentIndex;
                        parentIndex = (childIndex - 1) / 2;
                    }
                } else {
                    return;
                }
            }
        }

        public T getMin() throws PriorityQueueException {
            if (isEmpty()) {
                throw new PriorityQueueException("Priority Queue is empty");
            }
            return heap.get(0).value;
        }

        public T removeMin() throws PriorityQueueException {
            if (isEmpty()) {
                throw new PriorityQueueException("Priority Queue is empty");
            }
            Element<T> removed = heap.get(0);
            T ans = removed.value;
            heap.set(0, heap.get(heap.size() - 1));
            heap.remove(heap.size() - 1);

            int parentIndex = 0;
            int leftChildIndex = 2 * parentIndex + 1;
            int rightChildIndex = 2 * parentIndex + 2;

            while (leftChildIndex < heap.size()) {
                int minIndex = parentIndex;
                if (heap.get(leftChildIndex).priority < heap.get(minIndex).priority) {
                    minIndex = leftChildIndex;
                }
                if (rightChildIndex < heap.size()
                        && (heap.get(rightChildIndex).priority < heap.get(minIndex).priority)) {
                    minIndex = rightChildIndex;
                }
                Element<T> temp = heap.get(minIndex);
                heap.set(minIndex, heap.get(parentIndex));
                heap.set(parentIndex, temp);
                leftChildIndex = 2 * parentIndex + 1;
                rightChildIndex = 2 * parentIndex + 2;
            }
            return ans;

        }

        public int size() {
            return heap.size();

        }

        public boolean isEmpty() {
            if (size() == 0) {
                return true;
            } else {
                return false;
            }

        }
    }

    public static void main(String[] args) {
        try {
            Priority_Queue<Integer> pq = new PriorityQueue().new Priority_Queue<>();
            pq.insert(10, 2);
            pq.insert(20, 1);
            pq.insert(30, 3);
            System.out.println("Minimum element: " + pq.getMin());
            System.out.println("Removing minimum element: " + pq.removeMin());
            System.out.println("New minimum element: " + pq.getMin());
            System.out.println("Size of priority queue: " + pq.size());
        } catch (PriorityQueueException e) {
            System.out.println(e.getMessage());
        }
    }
}
