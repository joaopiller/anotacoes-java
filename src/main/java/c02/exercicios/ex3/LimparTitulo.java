// Caderno 02 — Exercício 3: Limpar um título digitado
package c02.exercicios.ex3;

public class LimparTitulo {
    public static void main(String[] args) {
        String entrada = "   revisar   pull request   ";
        String[] palavras = entrada.strip().split(" +"); // " +" = um ou mais espaços. strip antes senão vem palavra vazia
        String limpo = String.join(" ", palavras);
        limpo = limpo.substring(0, 1).toUpperCase() + limpo.substring(1); // String é imutável, tem que guardar de volta
        boolean valido = !limpo.isBlank() && limpo.length() >= 5;
        System.out.println("[" + limpo + "]"); // [Revisar pull request]
        System.out.println(palavras.length); // 3
        System.out.println(valido); // true
    }
}
