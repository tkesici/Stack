public class StackLinkedList<E> implements IStack<E> {
    public static void main(String[] args) {
        StackLinkedList sll = new StackLinkedList();
        sll.push(1);
        sll.push(2);
        sll.push(3);
        sll.push(4);
        System.out.println(sll.pop());
        System.out.println(sll);


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
    public void clear() {
        head = null;
        tail = null;
        size = 0;

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
    public void push(E e) {
        Node<E> newNode = new Node<E>(e);
        if (size == 0) {
            head = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;


    }

    @Override
    public E top() {
        return isEmpty() ? null : head.data;
    }

    @Override
    public E pop() {
        E data = head.data;
        head = head.next;
        size--;
        return data;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<E> iter = head;
        for (int i = 0; i < size; i++) {
            sb.append(iter.data).append(" ");
            iter = iter.next;

        }
        return sb.toString().trim();
    }


}
