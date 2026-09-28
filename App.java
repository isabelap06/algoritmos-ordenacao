import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Produto[] produtos = {
            new Produto("Caderno", 25.0, 0.20), // venda: R$ 30
            new Produto("Caneta", 10.0, 0.20),  // venda: R$ 12
            new Produto("Estojo", 16.0, 0.25)  // venda: R$ 20
        };

        SelecaoProdutos.ordenar(produtos);

        System.out.println(Arrays.toString(produtos));
    }
}
