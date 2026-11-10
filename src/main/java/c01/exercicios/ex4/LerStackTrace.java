// Caderno 01 — Exercício 4: Provocar e ler uma stack trace
package c01.exercicios.ex4;

public class LerStackTrace {
    public static void main(String[] args) {
        try {
            System.out.println(dividir(10, 0)); // segundo at: linha 7, quem chamou
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    static int dividir(int a, int b) {
        return a / b; // primeiro at: linha 14, onde estourou (/ by zero)
    }
}
// primeira linha da saída: java.lang.ArithmeticException: / by zero
// rodando com java Arquivo.java aparecem uns at do próprio java embaixo do main, é só ignorar
