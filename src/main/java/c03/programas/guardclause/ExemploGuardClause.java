// Caderno 03 — programa completo "ExemploGuardClause.java", seção "Guard clause: retorno cedo"
package c03.programas.guardclause;

public class ExemploGuardClause {
    public static void main(String[] args) {
        System.out.println(validar("Revisar PR", 3, false)); // ok: pode editar
        System.out.println(validar("", 3, false)); // erro: título obrigatório
        System.out.println(validar("Reunião", 9, false)); // erro: prioridade fora de 1..5
        System.out.println(validar("Reunião", 2, true)); // erro: tarefa concluída
    }

    // método: bloco com nome que devolve String (caderno 04)
    static String validar(String titulo, int prioridade, boolean concluida) {
        // guarda: testa o caso INVÁLIDO primeiro e sai na hora com return
        if (titulo == null || titulo.isBlank()) return "erro: título obrigatório"; // null antes do isBlank, senão NullPointerException
        if (prioridade < 1 || prioridade > 5) return "erro: prioridade fora de 1..5";
        if (concluida) return "erro: tarefa concluída";

        return "ok: pode editar"; // caminho feliz, sem indentação e sem escada de if aninhado
    }
}
