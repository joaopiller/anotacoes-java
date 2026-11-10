// Caderno 02 — seção "Tipagem estática"
package c02.anotacoes.s01_tipagem_estatica;

public class StaticTyping {
    public static void main(String[] args) {
        // toda variável nasce com tipo fixo, o compilador confere antes de rodar
        int prioridade = 2;
        String titulo = "Estudar";
        prioridade = prioridade + 1; // int + int
        titulo = titulo + " Java"; // String + String concatena
        // prioridade = "alta"; // não compila: incompatible types
        System.out.println(titulo + " " + prioridade);
    }
}
