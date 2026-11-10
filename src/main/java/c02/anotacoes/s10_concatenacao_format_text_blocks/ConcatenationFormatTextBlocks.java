// Caderno 02 — seção "Concatenação, String.format e text blocks"
package c02.anotacoes.s10_concatenacao_format_text_blocks;

public class ConcatenationFormatTextBlocks {
    public static void main(String[] args) {
        // + pra 2 ou 3 partes, mais que isso String.format (mesmos marcadores do printf)
        String titulo = "Revisar PR";
        int prio = 2;
        String a = "Tarefa " + titulo + " (prio " + prio + ")";
        String b = String.format("Tarefa %s (prio %d)", titulo, prio); // mesmo texto
        String c = String.format(java.util.Locale.US, "%.2f", 1.5); // "1.50" em qualquer idioma
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // text block = String de várias linhas, a indentação comum some e as quebras ficam
        String json = """
                {
                  "titulo": "%s",
                  "prioridade": %d
                }
                """.formatted(titulo, prio); // formatted = String.format no próprio texto
        System.out.print(json);
        // sem Locale.US o %.2f sai 1,50 aqui. texto que outro programa vai ler = fixar o Locale
    }
}
