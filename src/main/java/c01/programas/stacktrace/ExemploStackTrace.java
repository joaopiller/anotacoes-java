// Caderno 01 — programa completo "ExemploStackTrace.java", seção "Lendo uma stack trace"
package c01.programas.stacktrace;

public class ExemploStackTrace {
    public static void main(String[] args) {
        try {
            int[] prioridades = {1, 2, 3};
            System.out.println(terceira(prioridades));
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    static int terceira(int[] valores) { // um metodo static (main) so pode chamar metodos static
        return valores[3];
    }
}
