// Caderno 02 — seção "var e final"
package c02.anotacoes.s04_var_final;

public class VarAndFinal {
    public static void main(String[] args) {
        var titulo = "Revisar PR"; // compilador infere String, o tipo continua fixo
        var prioridade = 3; // infere int
        prioridade = 4; // var não é final
        final double horas = 1.5; // não dá pra reatribuir
        // horas = 2.0; // não compila: cannot assign a value to final variable
        // var semValor; // não compila, var precisa de valor inicial
        var valid = true;
        System.out.println(titulo + " " + prioridade + " " + horas + " " + valid);
        // usar var só quando o tipo é óbvio e só em variável local
    }
}
