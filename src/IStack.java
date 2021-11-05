/*
 * @author Tevfik KESICI
 * @since 04.11.2021
 */

public interface IStack<E> {

    void clear();

    int size();

    boolean isEmpty();

    void push(E e);

    E top();

    E pop();

}
