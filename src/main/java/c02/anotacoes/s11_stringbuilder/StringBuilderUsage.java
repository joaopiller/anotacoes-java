// Caderno 02 — seção "StringBuilder"
package c02.anotacoes.s11_stringbuilder;

public class StringBuilderUsage {
    public static void main(String[] args) {
        // cada + em String cria objeto novo e copia tudo de novo. StringBuilder é mutável, um objeto só que cresce
        StringBuilder sb = new StringBuilder();
        sb.append("Tarefas: ");
        for (int i = 1; i <= 3; i++) { // for é do caderno 03
            sb.append(i).append(", "); // append devolve o próprio builder, dá pra encadear
        }
        sb.setLength(sb.length() - 2); // tira a última ", "
        System.out.println(sb.toString()); // Tarefas: 1, 2, 3
        // usar em loop ou muitas partes, pra 3 partes o + é mais legível
        // palíndromo: new StringBuilder(s).reverse().toString().equals(s) funciona mas copia tudo
        // o ótimo é dois índices (começo e fim) comparando charAt até se cruzarem
    }
}
