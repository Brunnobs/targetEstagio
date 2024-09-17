public class Lampadas_logicas {
    public static void main(String[] args) {

        boolean salaA = false;
        boolean salaB = false;
        boolean salaC = false;
        boolean interruptorA = false;
        boolean interruptorB = false;
        boolean interruptorC = false;

        System.out.println("Ligue o interruptor A.");
        interruptorA = true;

        System.out.println("----Primeira ida a sala das lâmpadas.");
        if (interruptorA || interruptorB == false || interruptorC == false) {
            salaA = true;
            if (salaA){
                System.out.println("Sala A:"+salaA+ ", Sala B:"+salaB+", Sala C:"+salaC);
            }
        }
        System.out.println("Desligue o interruptor A e ligue o interruptor B.");
        System.out.println("----Segunda ida a sala das lâmpadas.");
        interruptorA = false;
        interruptorB = true;

        if (!interruptorA || interruptorB || !interruptorC) {
            salaA = false;
            salaB = true;
            System.out.println("Sala A:"+salaA+ ", Sala B:"+salaB+", Sala C:"+salaC);

        }
        System.out.println("Vá à sala de controle para terminar o teste:");

        if (!salaA && interruptorB) {
           System.out.println("A lâmpada da Sala C do interruptor C está apagada :)");
        }
    }
}
