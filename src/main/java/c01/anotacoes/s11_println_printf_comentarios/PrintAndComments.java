// Caderno 01 — seção "println, printf e comentários"
package c01.anotacoes.s11_println_printf_comentarios;

public class PrintAndComments {
    static final int LIMITE_DE_TAREFAS = 5; // constante, não pode ser declarada dentro de método

    public static void main(String[] args) {
        // %s texto, %d inteiro, %.2f decimal com 2 casas, %b true/false, %n quebra de linha
        String titulo = "Estudar Java";
        int prioridade = 2;
        System.out.println("Tarefa: " + titulo + " (" + prioridade + ")");
        System.out.printf("Tarefa: %s (%d)%n", titulo, prioridade); // mesma coisa sem +
        System.out.printf("%.2f%n", 1.5); // 1.50 (aqui sai 1,50 pq segue o idioma do sistema)
        System.out.printf("%s concluída? %b%n", titulo, false);
        System.out.print("sem quebra "); // print não quebra linha
        System.out.println("de linha");
        System.out.println(1.6);

        int limite = 20; // comentário até o fim da linha
        /*
        * várias linhas de comentário
        * */
        /** JavaDoc: a IDE lê (caderno 04) */
        // comentário não vai pro .class. comentar o porquê, não o quê

        boolean concluida = false; // boolean le como pergunta (concluida?)
    }
}
