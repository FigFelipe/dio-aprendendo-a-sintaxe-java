package estruturas_repeticao;

import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {

        double mesada = 50.0;

        //WHILE (Enquanto a expressão for verdadeira)
        while (mesada > 0)
        {
            double valorDoce = valorAleatorio();

            if(valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce valor: " + valorDoce + " --> adicionado ao carrinho.");

            mesada = mesada - valorDoce;
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Joaozinho gastou toda a sua mesada");

    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,15);
    }
}
