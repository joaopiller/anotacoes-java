// Caderno 02 — seção "Operadores"
package c02.anotacoes.s05_operadores;

public class Operators {
    public static void main(String[] args) {
        System.out.println(7 / 2); // 3, divisão inteira
        System.out.println(7 % 2); // 1, resto
        System.out.println(7 / 2.0); // 3.5, um lado double
        System.out.println((7 + 2 - 1) / 2); // 4, truque pra arredondar pra cima

        String titulo = null;
        boolean valido = titulo != null && !titulo.isEmpty(); // false. curto-circuito: o isEmpty nem roda
        System.out.println(valido);

        int c = 0;
        int a = c++; // a = 0, depois c = 1
        int b = ++c; // c = 2, depois b = 2
        String rotulo = c > 1 ? "muitos" : "poucos"; // ternário
        System.out.println(a + " " + b + " " + rotulo);
        // double m = 7 / 2 dá 3.0 e não 3.5, divide em int antes de virar double
    }
}
