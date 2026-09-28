public class Selecao {
    public static void ordenar(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[menor]) menor = j;
            }
            int temp = v[i];
            v[i] = v[menor];
            v[menor] = temp;
        }
    }
}
