// Caderno 02 — seção "String é objeto e imutável"
package c02.anotacoes.s08_string_imutavel;

public class ImmutableString {
    public static void main(String[] args) {
        // String se compara com equals, == é "mesmo endereço?"
        // literal igual é reaproveitado pela JVM (string pool), por isso == às vezes dá certo
        // texto vindo de fora ou montado em execução é objeto novo, aí == não dá certo
        String a = "pendente";
        String b = "pendente";
        String c = new String("pendente"); // força um objeto novo
        System.out.println(a == b); // true por acaso
        System.out.println(a == c); // false
        System.out.println(a.equals(c)); // true
        System.out.println(a.equalsIgnoreCase("PENDENTE")); // true

        // imutável: criou, não muda mais. os métodos criam uma String nova e eu tenho que reatribuir
        String titulo = "tarefa";
        titulo.toUpperCase(); // resultado descartado, titulo continua "tarefa"
        titulo = titulo.toUpperCase(); // TAREFA, a variável aponta pro objeto novo
        System.out.println(titulo);
        // s = s + "x" funciona pq cria uma String nova toda vez, caro num loop (ver StringBuilder)

        String variavel = null;
        System.out.println("literal".equals(variavel)); // false, não dá erro
        variavel.equals("literal"); // erro em execução: NullPointerException
    }
}
