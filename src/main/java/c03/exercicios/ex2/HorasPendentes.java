// Caderno 03 — Exercício 2: Somar só as horas pendentes com continue
package c03.exercicios.ex2;

public class HorasPendentes {
    public static void main(String[] args) {
        double[] horas = {2.0, 0.5, 1.5, 1.0};
        boolean[] concluidas = {true, false, false, true}; // a posição i de um bate com a do outro
        double total = 0;
        int pendentes = 0;
        for (int i = 0; i < horas.length; i++) { // for com índice porque leio os dois arrays com o mesmo i
            if (concluidas[i]) continue; // concluída: pula pra próxima volta sem somar
            total += horas[i];
            pendentes++;
        }
        System.out.println(pendentes + " pendentes, " + total + "h"); // 2 pendentes, 2.0h
        // concatenar double com + sempre usa ponto, não depende do idioma (diferente do printf)
    }
}
