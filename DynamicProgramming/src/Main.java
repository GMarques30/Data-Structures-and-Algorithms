import java.util.HashMap;
import java.util.Map;

//Programação Dinâmica (DP) é uma técnica de resolução de problemas usada para otimizar algoritmos recursivos que envolvem subproblemas sobrepostos. A ideia central da programação dinâmica é evitar o recalculo de resultados já computados, armazenando-os para reutilização, o que melhora a eficiência do algoritmo.
//Memorização: Armazena o resultado dos subproblemas enquanto a solução é construída de forma recursiva. A memorização geralmente é implementada usando uma estrutura de dados como Array ou Map (ou outro tipo de cache).
//Tabulação: Em vez de usar recursão, a tabulação resolve os subproblemas de forma iterativa (geralmente com laços como for, while, forEach), preenchendo uma tabela de baixo para cima. A tabulação é mais eficiente em termos de memória e tempo, pois não depende da pilha de chamadas (Call Stack) e pode ser feita de forma iterativa.


public class Main {
  public static void main(String[] args) {
    Map<Integer, Integer> map = new HashMap<>();
    int res = fibonacci(22, map);
    System.out.println(res);
  }

  public static int fibonacci(int n, Map<Integer, Integer> map) {
    if(n <= 1) {
      return n;
    }
    if(map.containsKey(n)) {
      return map.get(n);
    }
    int res = fibonacci(n-1, map) + fibonacci(n-2, map);
    map.put(n, res);
    return res;
  }
}