# Métodos de ordenação em Java

Um arquivo por método: `Selecao.java`, `BubbleSort.java`, `Insercao.java`,
`MergeSort.java`, `HeapSort.java` e `QuickSort.java`.
O `Main.java` testa os seis com o mesmo vetor.

## Executar

Abra o terminal **dentro desta pasta** e rode:

```bash
javac *.java
java Main
```

No Windows, os mesmos comandos funcionam no PowerShell se o JDK estiver instalado.
O resultado esperado para o vetor de exemplo é `[-2, 0, 1, 5, 5, 8]` em todas as linhas.

## Adaptar para a atividade

- Troque os números na linha `int[] original = {...};` de `Main.java`.
- Para usar só um método, mantenha apenas a chamada correspondente, por exemplo
  `QuickSort.ordenar(v);`. A classe do método recebe um `int[]` e altera esse vetor.
- Para ordenar em ordem decrescente, é necessário adaptar as comparações do
  método escolhido. Em `HeapSort`, as comparações `>` formam um max-heap;
  invertê-las forma um min-heap.
- Se a questão usar `String[]`, objetos, contagem de operações ou pedir etapas
  intermediárias, o código precisará ser adaptado ao enunciado.
