public class Questao4_logica {
    public static void main(String[] args) {
        int numeroImpar = 0;
        String resultado = "a) ";

        while (numeroImpar<10){
            if (numeroImpar % 2 != 0){
               resultado = resultado + numeroImpar+",";

            }
            numeroImpar++;
        }
        System.out.println(resultado);

        int contador = 1;
        int numeroDobro = 1;
        resultado = "b) ";

        while (contador <= 7){
            numeroDobro = numeroDobro * 2;
            contador++;
            resultado = resultado + numeroDobro +",";
        }
        System.out.println(resultado);

        int total = 0;
        contador = 1;
        resultado = "c) ";
        numeroImpar = 0;
        while (contador<=14){
            if (numeroImpar % 2 !=0 || numeroImpar == 0){
                total = total+numeroImpar;
                resultado=resultado + total+",";
            }
            contador++;
            numeroImpar++;
        }
        System.out.println(resultado);

        int numeroPar = 1;
        contador = 1;
        resultado = "d) ";
        total = 0;

        while (contador <=10){
            if (numeroPar % 2 ==0){
                total = numeroPar * numeroPar;
                resultado = resultado + total +",";
            }
            contador++;
            numeroPar++;
        }
        System.out.println(resultado);

        contador = 0;
        resultado = "e) ";
        total = 1;
        int total2 = 0;
        int total3 = 1;

        while (contador < 7) {
            resultado = resultado + total3+ ",";
            total3 = total+total2; // 0,1,1,2
            total2 = total;
            total = total3;
            contador++;
        }
        System.out.println(resultado);
    }
}
