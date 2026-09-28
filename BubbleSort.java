public class BubbleSort {
    public static void ordenar(int[] v) {
        for (int fim = v.length - 1; fim > 0; fim--) {
            boolean trocou = false;
            for (int j = 0; j < fim; j++) {
                if (v[j] > v[j + 1]) {
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                    trocou = true;
                }
            }
            if (!trocou) break;
        }
    }
}
