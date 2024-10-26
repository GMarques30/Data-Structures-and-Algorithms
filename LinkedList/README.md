# LinkedList

Uma **LinkedList** (Lista Ligada) é uma estrutura de dados linear que consiste em uma sequência de elementos, onde cada elemento (ou nó) contém uma referência (ou ponteiro) para o próximo nó na sequência. Essa estrutura permite a inserção e remoção eficientes de elementos em qualquer posição da lista.

## Estrutura

Uma `LinkedList` é composta por nós que possuem duas partes:

1. **Valor**: Armazena o dado do nó.
2. **Ponteiro/Referência**: Aponta para o próximo nó na lista.

### Vantagens da LinkedList

- **Inserção e remoção eficientes**: É fácil adicionar ou remover elementos, especialmente no início ou no final da lista, pois não é necessário mover outros elementos.
- **Uso eficiente de memória**: Não há necessidade de alocação de memória contígua, como em um array.

### Desvantagens da LinkedList

- **Acesso sequencial**: Para acessar um elemento, é necessário percorrer a lista desde o início, o que pode ser menos eficiente do que um array que permite acesso direto.
- **Maior uso de memória**: Cada nó requer espaço adicional para armazenar o ponteiro para o próximo nó.

## Métodos Comuns

Aqui estão alguns métodos comuns que podem ser implementados em uma `LinkedList`:

- **add(value)**: Adiciona um novo nó ao final da lista.
- **addFirst(value)**: Adiciona um novo nó no início da lista.
- **addLast(value)**: Adiciona um novo nó no final da lista.
- **remove(value)**: Remove o primeiro nó que contém o valor especificado.
- **removeFirst()**: Remove o primeiro nó.
- **removeLast()**: Remove o último nó.
- **size()**: Retorna o número total de nós na lista.
- **isEmpty()**: Verifica se a lista está vazia.