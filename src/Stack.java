import java.util.ArrayList;

/**
 * La clase Stack es la encargada de realizar la implementacion del stack, define sus comportamiento.
 */
public class Stack<E> implements iPila<E>{

    /**
     * la varaiable stack es el vector que almacenara la informacion
     */
    protected ArrayList<E> stack = new ArrayList();

    /**
     * Un item es agregado al arreglo en su ultima posicion
     * @param item generico
     */
    public void push(E item){
        this.stack.add(item);
    }

    /**
     * El ultimo item en el arreglo es removido
     * @return devuelve el item removido
     */
    public E pop(){
        return this.stack.remove(stack.size() - 1);
    }

    /**
     * Toma el ultimo item del arreglo
     * @return devuelve el ultimo item sin modificar el arreglo
     */
    public E peek(){
        return this.stack.get(stack.size() - 1);
    }

    /**
     * Verifica si el arreglo esta vacio
     * @return devuelve verdadero si esta vacio
     */
    public boolean empty(){
        if (stack != null){
            return false;
        }
        return true;
    }

    /**
     * Indica el tamaño del arreglo
     * @return devuelve el tamaño
     */
    public int size(){
        return this.stack.size();
    }
}
