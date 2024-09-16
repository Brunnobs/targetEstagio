public class Fibonacci {
    public static void main(String[] args) {

        int numero = 6;

        if (isFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " NÃO pertence à sequência de Fibonacci.");
        }

    }

    public static boolean isFibonacci(int numero) {
        int primeiroNumero = 0;
        int segundoNumero = 1;

        if (numero == primeiroNumero || numero == segundoNumero) {
            return true;
        }

        int proximoNumero = primeiroNumero + segundoNumero;

        while (proximoNumero <= numero) {
            if (proximoNumero == numero) {
                return true; // O número pertence à sequência de Fibonacci
            }
            primeiroNumero = segundoNumero;
            segundoNumero = proximoNumero;
            proximoNumero = primeiroNumero + segundoNumero;
        }

        return false; // O número não pertence à sequência de Fibonacci
    }
}
