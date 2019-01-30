/**
 * Interfaz para la interaccion del Stack de la HDT 2.
 */

/**
 * @author Juan Fernando De Leon 17822
 * @date 29-01-2019
 */
public interface iPila<E> {

    /**
     * An item is added to stack
     * @param item
     */
    void push(E item);

    /**
     * The most recently pushed item is removed and returned
     * @return
     */
    E pop();


    /**
     * The top value (next to be popped) is returned
     * @return
     */
    E peek();

    /**
     * returns true if and only if the stack is empty
     * @return
     */
    boolean empty();

    /**
     * returns the number of elements in the stack
     * @return
     */
    int size();

}