public class QueueLinkedList<E> implements IQueue<E> {
    public static void main(String[] args) {
        QueueLinkedList qll = new QueueLinkedList();
        qll.enqueue("Tevfik");
        qll.enqueue("Batu");
        System.out.println(qll);

    }

    private Node<E> head = null;
    private Node<E> tail = null;
    int size;

    private static class Node<E> {
        private final E data;
        private Node<E> next;

        public Node(E data) {
            this.data = data;
            next = null;
        }
    }

    @Override
    public void enqueue(E data) {
        Node<E> newNode = new Node<>(data);
        if (size == 0) {
            head = newNode;
            tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;


    }

    @Override
    public E dequeue() {
        E data = head.data;
        head = head.next;
        size--;
        return data;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E first() {
        return isEmpty() ? null : head.data;
    }

    @Override
    public void clear() {

    }

    public String toString() {
        Node<E> iter = head;
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < size; i++) {
            s.append(iter.data).append(" ");
            iter = iter.next;

        }
        return s.toString().trim();

    }
}
