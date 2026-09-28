public class QuickSort {
    public static void ordenar(int[] v) {
        ordenarTrecho(v, 0, v.length - 1);
    }

    private static void ordenarTrecho(int[] v, int inicio, int fim) {
        if (inicio >= fim) return;
        int pivo = v[fim]; // Escolhe o último valor como pivô.
        int posicao = inicio;
        for (int j = inicio; j < fim; j++) {
            if (v[j] <= pivo) {
                int temp = v[posicao];
                v[posicao] = v[j];
                v[j] = temp;
                posicao++;
            }
        }
        int temp = v[posicao];
        v[posicao] = v[fim];
        v[fim] = temp;
        ordenarTrecho(v, inicio, posicao - 1);
        ordenarTrecho(v, posicao + 1, fim);
    }
}
