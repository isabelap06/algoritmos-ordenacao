import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] original = {5, -2, 8, 5, 1, 0}; // Altere os números aqui.

        int[] v = original.clone();
        Selecao.ordenar(v);
        System.out.println("Seleção: " + Arrays.toString(v));

        v = original.clone();
        BubbleSort.ordenar(v);
        System.out.println("Bubble Sort: " + Arrays.toString(v));

        v = original.clone();
        Insercao.ordenar(v);
        System.out.println("Inserção: " + Arrays.toString(v));

        v = original.clone();
        MergeSort.ordenar(v);
        System.out.println("Merge Sort: " + Arrays.toString(v));

        v = original.clone();
        HeapSort.ordenar(v);
        System.out.println("Heap Sort: " + Arrays.toString(v));

        v = original.clone();
        QuickSort.ordenar(v);
        System.out.println("Quick Sort: " + Arrays.toString(v));
    }
}
