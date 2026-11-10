// Caderno 02 — seção "Valor vs referência"
package c02.anotacoes.s03_valor_vs_referencia;

public class ValueVsReference {
    public static void main(String[] args) {
        // por valor (os 8 primitivos): a variável guarda o número, copiar = outra gaveta
        int a = 5;
        int b = a;
        b = 6;
        System.out.println(a); // 5, a não mudou
        System.out.println(b); // 6

        // por referência (todo o resto): a variável guarda o endereço, copiar = mesmo objeto
        StringBuilder x = new StringBuilder("Backup");
        StringBuilder y = x; // copia o endereço
        y.append("!");
        System.out.println(x); // Backup! pq x e y são o mesmo objeto

        // pilha guarda as variáveis do método, heap guarda os objetos do new
        // objeto sem ninguém apontando = o garbage collector apaga sozinho
        // == em referência compara endereço, conteúdo é com equals
        // referência pode ser null, chamar método nela = NullPointerException
    }
}
