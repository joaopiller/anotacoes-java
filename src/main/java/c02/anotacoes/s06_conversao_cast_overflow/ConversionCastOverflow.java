// Caderno 02 — seção "Conversão, cast e overflow"
package c02.anotacoes.s06_conversao_cast_overflow;

public class ConversionCastOverflow {
    public static void main(String[] args) {
        // implícita quando não perde nada (int -> long -> double), senão precisa de cast
        double doub = 7 / 2; // 3.0, primeiro calcula dps atribui e converte
        double promovido = 7; // vira 7.0
        int truncado = (int) 3.9; // vira 3, cast corta e não arredonda
        long arredondado = Math.round(3.9); // 4
        double somaReal = 7 + 2.5; // 9.5, int + double = double
        System.out.println(doub + " " + promovido + " " + truncado + " " + arredondado + " " + somaReal);

        int estourou = Integer.MAX_VALUE + 1; // estoura (da a volta), sem erro nem aviso
        long seguro = (long) Integer.MAX_VALUE + 1; // não dá a volta, o cast vem antes da soma
        long seguro2 = (long) (Integer.MAX_VALUE + 1); // estoura primeiro, converte depois
        System.out.println(estourou + " " + seguro + " " + seguro2);
        // contador que cresce = declarar long desde o início
    }
}
