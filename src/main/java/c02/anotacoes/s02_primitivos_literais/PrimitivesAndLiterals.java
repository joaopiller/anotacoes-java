// Caderno 02 — seção "Primitivos e literais"
package c02.anotacoes.s02_primitivos_literais;

public class PrimitivesAndLiterals {
    public static void main(String[] args) {
        // primitivo = valor puro sem método. literal = o valor escrito no código (42, 2.5, 'a')
        // int por padrão, long pra id e número grande, double pra medida (nunca dinheiro), char quase nunca
        int abertas = 12;
        long id = 9_000_000_000L; // sem o L não compila, não cabe em int
        double horas = 2.5;
        boolean urgente = true;
        char inicial = 'T'; // 'T' é char, "T" é String
        int populacao = 215_000_000; // o _ é só visual
        System.out.println(Integer.MAX_VALUE); // 2147483647
    }
}
