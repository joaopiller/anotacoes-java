// Caderno 02 — programa completo "ExemploDinheiro.java", seção "Dinheiro: double não serve, BigDecimal sim"
package c02.programas.dinheiro;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ExemploDinheiro {
    public static void main(String[] args) {
        BigDecimal mensal = new BigDecimal("49.90");
        BigDecimal anual = mensal.multiply(new BigDecimal("12")); // 598.80
        BigDecimal desconto = anual.multiply(new BigDecimal("0.15"))
                .setScale(2, RoundingMode.HALF_UP); // 89.82, sem setScale seria 89.8200
        BigDecimal total = anual.subtract(desconto); // 508.98
        BigDecimal parcela = total.divide(new BigDecimal("12"), 2, RoundingMode.HALF_UP); // 42.42, divide precisa da escala senão dízima dá ArithmeticException

        System.out.println("Anual " + anual + ", desconto " + desconto + ", total " + total);
        System.out.println("12x de " + parcela);
        System.out.println(total.compareTo(new BigDecimal("500")) > 0); // true
    }
}
