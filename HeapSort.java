public class HeapSort {
    public static void ordenar(int[] v) {
        // Primeiro, constrói um max-heap.
        for (int i = v.length / 2 - 1; i >= 0; i--) {
            ajustar(v, v.length, i);
        }
        // Coloca o maior no fim e refaz o heap com os restantes.
        for (int fim = v.length - 1; fim > 0; fim--) {
            int temp = v[0];
            v[0] = v[fim];
            v[fim] = temp;
            ajustar(v, fim, 0);
        }
    }

    private static void ajustar(int[] v, int tamanho, int raiz) {
        int maior = raiz;
        int esquerda = 2 * raiz + 1;
        int direita = 2 * raiz + 2;
        if (esquerda < tamanho && v[esquerda] > v[maior]) maior = esquerda;
        if (direita < tamanho && v[direita] > v[maior]) maior = direita;
        if (maior != raiz) {
            int temp = v[raiz];
            v[raiz] = v[maior];
            v[maior] = temp;
            ajustar(v, tamanho, maior);
        }
    }
}
