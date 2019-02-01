
import java.io.*;

public class HojaDeTrabajo2 {
    /**
     * Programa principal
     * @param args
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

        File file = new File("D:\\Users\\Juanfer De Leon\\Desktop\\Estructura de Datos\\Projects\\HojaDeTrabajo2\\datos.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        iPila<Double> stack = new Stack<Double>();
        iPila<Double> stack2 = new Stack<Double>();

        String line;
        while ((line = bufferedReader.readLine()) != null){
            stack2 = operar(line, stack);
            stack = stack2;
        }
        System.out.println("El resultado de las operaciones es: " + stack.peek());
    }

    /**
     * Este metodo es el encargado de realizar las operaciones del documento en formato postfix.
     * @param postfixText
     * @param stack
     * @return
     */
    public static iPila<Double> operar(String postfixText, iPila<Double> stack){


        iCalculadora calculadora = new Calculadora();

        for (int position = 0; position < postfixText.length(); ++position){

            char caracter = postfixText.charAt(position);

            if (Character.isLetter(caracter)){

                System.out.println("ERROR: El archivo contiene un caracter");
                break;

            }

            if (Character.isDigit(caracter)){

                stack.push((double)Character.digit(caracter, 10));

            } else if (String.valueOf(caracter).matches("[+]")){

                double a = stack.pop();
                double b = stack.pop();
                double sum = calculadora.sumar(a, b);
                stack.push(sum);

            } else if (String.valueOf(caracter).matches("[-]")){

                double a = stack.pop();
                double b = stack.pop();
                double sum = calculadora.restar(a, b);
                stack.push(sum);

            } else if (String.valueOf(caracter).matches("[*]")){

                double a = stack.pop();
                double b = stack.pop();
                double sum = calculadora.multiplicar(a, b);
                stack.push(sum);

            } else if (String.valueOf(caracter).matches("[/]") && stack.peek() != 0.0D){

                double a = stack.pop();
                double b = stack.pop();
                double sum = calculadora.dividir(b, a);
                stack.push(sum);

            } else if (String.valueOf(caracter).matches("[/]") && stack.peek() == 0.0D){

                System.out.println("ERROR: Se intenta realizar una division dentro de cero.");
                break;
            }
        }

        return stack;
    }

}
