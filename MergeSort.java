public class MergeSort {
    public static void ordenar(int[] v) {
        if (v.length < 2) return;
        ordenarTrecho(v, new int[v.length], 0, v.length - 1);
    }

    private static void ordenarTrecho(int[] v, int[] aux, int inicio, int fim) {
        if (inicio >= fim) return;
        int meio = inicio + (fim - inicio) / 2;
        ordenarTrecho(v, aux, inicio, meio);
        ordenarTrecho(v, aux, meio + 1, fim);

        int i = inicio, j = meio + 1, k = inicio;
        while (i <= meio && j <= fim) {
            if (v[i] <= v[j]) aux[k++] = v[i++];
            else aux[k++] = v[j++];
        }
        while (i <= meio) aux[k++] = v[i++];
        while (j <= fim) aux[k++] = v[j++];
        for (k = inicio; k <= fim; k++) v[k] = aux[k];
    }
}
