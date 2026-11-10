// Caderno 02 — seção "Wrappers e autoboxing"
package c02.anotacoes.s07_wrappers_autoboxing;

public class WrappersAndAutoboxing {
    public static void main(String[] args) {
        // int não é objeto, não vai em List nem pode ser null. wrapper = Integer, Long, Double, Boolean
        Integer embrulhado = 5; // autoboxing, vira Integer.valueOf(5)
        int puro = embrulhado; // unboxing, vira embrulhado.intValue()
        int soma = embrulhado + 1; // desembrulha e soma
        System.out.println(puro + " " + soma);

        Integer a = 127, b = 127;
        Integer c = 128, d = 128;
        System.out.println(a == b); // true, java reaproveita os Integer de -128 a 127
        System.out.println(c == d); // false, dois objetos diferentes
        System.out.println(c.equals(d)); // true, equals compara o valor

        // primitivo com ==, objeto com equals
        // usar wrapper só em coleção e onde pode ser null, Integer é mais lento que int
        // no Spring o id da entidade é Long pq antes de salvar ele é null
        Integer idNaoSalvo = null;
        int x = idNaoSalvo; // erro em execução: NullPointerException ao desembrulhar null
    }
}
