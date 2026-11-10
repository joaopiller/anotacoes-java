// Caderno 01 — Exercício 3: Corrigir três erros de compilação
package c01.exercicios.ex3;

public class CorrigirErros {
    public static void main(String[] args) {
        String titulo = "Estudar";
        int prioridade = 2; // erro 1: faltava o ; (';' expected), e só esse aparecia na primeira compilação
        System.out.println("Tarefa: " + titulo); // erro 2: tava Titulo com maiúscula (cannot find symbol)
        System.out.println("Prioridade: " + prioridade); // erro 3: a variável tava declarada como Prioridade
        // java diferencia maiúscula de minúscula, seguir o camelCase evita isso
    }
}
