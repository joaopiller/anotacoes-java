// Caderno 02 — seção "String ↔ número, e Math"
package c02.anotacoes.s12_string_numero_math;

public class StringNumberMath {
    public static void main(String[] args) {
        // tudo que vem de fora é texto. parseInt converte, se não for número lança NumberFormatException
        int id = Integer.parseInt("42");
        long grande = Long.parseLong("9000000000");
        double h = Double.parseDouble("1.75"); // com vírgula lança NumberFormatException
        String texto = String.valueOf(42); // "42"
        System.out.println(id + " " + grande + " " + h + " " + texto);
        System.out.println("42" + 1); // 421, String + int concatena!
        System.out.println(Integer.parseInt("42") + 1); // 43

        System.out.println(Math.max(3, 9)); // 9
        System.out.println(Math.abs(-7)); // 7
        System.out.println(Math.pow(2, 10)); // 1024.0, devolve double
        System.out.println(Math.sqrt(144)); // 12.0
        System.out.println(Math.ceil(2.1)); // 3.0
        System.out.println(Math.round(2.5)); // 3, devolve long
        // no Spring o id que chega na URL como texto ele faz o parseLong sozinho
    }
}
