// Caderno 01 — seção "Lendo um erro de compilação"
package c01.anotacoes.s13_erro_de_compilacao;

public class CompileError {
    public static void main(String[] args) {
        // formato: Arquivo.java:LINHA: error: DESCRIÇÃO, e um ^ na coluna
        // corrigir o PRIMEIRO erro e recompilar, um ; faltando gera erro falso em cascata
        // int quantidade = 3                         // ';' expected
        // System.out.println("Total: " + quantidad); // cannot find symbol (só aparece depois de corrigir o ;)
        int quantidade = 3;
        System.out.println("Total: " + quantidade);

        // cannot find symbol = digitei errado, não declarei ou faltou import
        // incompatible types = tipo errado na atribuição
        // class X is public, should be declared in a file named X.java = nome do arquivo diferente da classe
        // variable x might not have been initialized = li antes de atribuir
        // missing return statement = caminho sem return
    }
}
