public class StringLetraA {
    public static void main(String[] args) {
        String nome = "A desenvolvedor de java back-end";
        char letraMinuscula='a';
        char letraMaiuscula='A';
        int maiuscula = 0;
        int minuscula = 0;

        for (int i = 0; i < nome.length(); i++){
            char letra = nome.charAt(i);
            if (letra == letraMinuscula){
                minuscula++;
            }
            if (letra == letraMaiuscula){
                maiuscula++;
            }
        }
        System.out.println("letra 'A' maiuscula apareceu "+maiuscula+ " vezes");
        System.out.println("letra 'a' minuscula apareceu "+minuscula+" vezes");
    }
}
