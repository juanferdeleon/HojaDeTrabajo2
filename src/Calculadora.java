/**
 * La clase calculadora realiza los calculos de una expresion en formato postfix
 */
public class Calculadora implements iCalculadora {

    Stack stack = new Stack();
    double resultado;
    
    /**
     * Método para hacer la suma de la calculadora
     * @param a double - sumando
     * @param b double - sumando
     * @return - El resultado de la suma de a y b
     */
    public double sumar(double a, double b){
        double x = (Double)this.stack.pop();
        double y = (Double)this.stack.pop();
        this.resultado = x + y;
        stack.push(resultado);
        return this.resultado;
    }

    /**
     * Método para hacer la resta de la calculadora
     * @param a double -
     * @param b double -
     * @return double - El resultado de la resta entre a y b
     */
    public double restar(double a, double b){
        double x = (Double)this.stack.pop();
        double y = (Double)this.stack.pop();
        this.resultado = x - y;
        stack.push(resultado);
        return this.resultado;
    }

    /**
     * Método para hacer la multiplicación de la calculadora
     * @param a double - factor
     * @param b double - factor
     * @return double - El resultado de la multiplicación entre a y b
     */
    public double multiplicar(double a, double b){
        double x = (Double)this.stack.pop();
        double y = (Double)this.stack.pop();
        this.resultado = x * y;
        stack.push(resultado);
        return this.resultado;
    }

    /**
     * Método para hacer la división de la calculadora
     * @param a double - dividendo
     * @param b double - divisor
     * @return double - El resultado de la división entre a y b
     */
    public double dividir(double a, double b){
        double x = (Double)this.stack.pop();
        double y = (Double)this.stack.pop();
        this.resultado = x / y;
        stack.push(resultado);
        return this.resultado;
    }
}
