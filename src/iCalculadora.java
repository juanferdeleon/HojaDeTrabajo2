/**
 * Interfaz para las operaciones de la calculadora de la HDT 2.
 */

/**
 * @author Juan Fernando De Leon 17822
 * @date 29-01-2019
 */

public interface iCalculadora {

    /**
     * Método para hacer la suma de la calculadora
     * @param a double - sumando
     * @param b double - sumando
     * @return Double - El resultado de la suma de a y b
     */
    double sumar(double a, double b);

    /**
     * Método para hacer la resta de la calculadora
     * @param a double -
     * @param b double -
     * @return Double - El resultado de la resta entre a y b
     */
    double restar(double a, double b);

    /**
     * Método para hacer la multiplicación de la calculadora
     * @param a double - factor
     * @param b double - factor
     * @return Double - El resultado de la multiplicación entre a y b
     */
    double multiplicar(double a, double b);

    /**
     * Método para hacer la división de la calculadora
     * @param a double - dividendo
     * @param b double - divisor
     * @return Double - El resultado de la división entre a y b
     */
    double dividir(double a, double b);

}
