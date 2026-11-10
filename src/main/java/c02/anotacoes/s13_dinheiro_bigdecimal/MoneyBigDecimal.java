// Caderno 02 — seção "Dinheiro: double não serve, BigDecimal sim"
package c02.anotacoes.s13_dinheiro_bigdecimal;

import java.math.BigDecimal;

public class MoneyBigDecimal {
    public static void main(String[] args) {
        // double guarda em binário e 0.1 não tem representação exata, o erro acumula
        System.out.println(0.1 + 0.2); // 0.30000000000000004
        System.out.println(0.1 + 0.2 == 0.3); // false

        // BigDecimal guarda em decimal, exato. é imutável e sem operador, usa add/subtract/multiply/divide
        BigDecimal preco = new BigDecimal("0.10");
        BigDecimal total = preco.add(new BigDecimal("0.20")); // preco continua 0.10
        System.out.println(total); // 0.30

        // regra 1: criar a partir de String, nunca de double
        System.out.println(new BigDecimal(0.1)); // 0.1000000000000000055511151231257827... recebeu o double já errado
        System.out.println(new BigDecimal("0.1")); // 0.1
        System.out.println(BigDecimal.valueOf(0.1)); // 0.1, valueOf passa pelo texto do double

        // regra 2: comparar com compareTo, equals olha a escala também
        System.out.println(new BigDecimal("2.0").equals(new BigDecimal("2.00"))); // false!
        System.out.println(new BigDecimal("2.0").compareTo(new BigDecimal("2.00")) == 0); // true
        // exemplo completo em c02/programas/dinheiro/ExemploDinheiro. HALF_UP = de escola, HALF_EVEN = do banqueiro
    }
}
