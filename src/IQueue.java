public interface IQueue<E> {
    void enqueue(E data);
    E dequeue();
    int size();
    boolean isEmpty();
    E first();
    void clear();
}
