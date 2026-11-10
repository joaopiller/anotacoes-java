// Caderno 02 — seção "Métodos essenciais de String"
package c02.anotacoes.s09_metodos_de_string;

public class StringMethods {
    public static void main(String[] args) {
        // índice começa em 0. substring(i, f) inclui i e exclui f. strip é o trim moderno
        String s = "  Estudar Java, Revisar PR  ".strip(); // "Estudar Java, Revisar PR"
        System.out.println(s.length()); // 24
        System.out.println(s.charAt(0)); // E
        System.out.println(s.substring(0, 7)); // Estudar
        System.out.println(s.indexOf("Revisar")); // 14 (-1 se não encontrar)
        System.out.println(s.contains("Java")); // true
        System.out.println(s.toUpperCase()); // ESTUDAR JAVA, REVISAR PR
        System.out.println(s.replace(", ", " | ")); // Estudar Java | Revisar PR
        String[] partes = s.split(", "); // array de 2
        System.out.println(partes[1]); // Revisar PR
        System.out.println("   ".isEmpty()); // false (tem 3 caracteres)
        System.out.println("   ".isBlank()); // true
    }
}
