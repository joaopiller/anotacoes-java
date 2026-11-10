// Caderno 02 — Exercício 4: Fatura com BigDecimal
package c02.exercicios.ex4;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Fatura {
    public static void main(String[] args) {
        BigDecimal mensal = new BigDecimal("29.90"); // sempre a partir de String
        BigDecimal subtotal = mensal.multiply(new BigDecimal("7"));
        BigDecimal desconto = subtotal.multiply(new BigDecimal("0.10")).setScale(2, RoundingMode.HALF_UP); // sem setScale sairia 20.9300
        BigDecimal total = subtotal.subtract(desconto);
        System.out.println(subtotal + " " + desconto + " " + total); // 209.30 20.93 188.37
        System.out.println(total.compareTo(new BigDecimal("180.00")) > 0); // true, comparar é com compareTo
        System.out.println(29.90 * 7 - 29.90 * 7 * 0.10); // 188.36999999999998, o double erra
    }
}
