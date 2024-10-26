# DoublyLinkedList

Uma **DoublyLinkedList** (Lista Duplamente Ligada) é uma estrutura de dados linear que consiste em uma sequência de elementos, onde cada elemento (ou nó) contém referências tanto para o próximo nó quanto para o nó anterior. Essa estrutura permite a inserção e remoção eficientes de elementos em qualquer posição da lista, além de permitir a iteração em ambas as direções.

## Estrutura

Uma `DoublyLinkedList` é composta por nós que possuem três partes:

1. **Valor**: Armazena o dado do nó.
2. **Ponteiro para o próximo nó**: Aponta para o próximo nó na lista.
3. **Ponteiro para o nó anterior**: Aponta para o nó anterior na lista.

### Vantagens da DoublyLinkedList

- **Inserção e remoção eficientes**: É fácil adicionar ou remover elementos em qualquer posição da lista, especialmente no início e no final.
- **Navegação bidirecional**: Permite percorrer a lista em ambas as direções (da cabeça para a cauda e da cauda para a cabeça).

### Desvantagens da DoublyLinkedList

- **Maior uso de memória**: Cada nó requer espaço adicional para armazenar dois ponteiros (para o próximo e o nó anterior).
- **Complexidade adicional**: A implementação e manutenção da estrutura são um pouco mais complexas em comparação com listas simplesmente ligadas.

## Métodos Comuns

Aqui estão alguns métodos comuns que podem ser implementados em uma `DoublyLinkedList`:

- **add(value)**: Adiciona um novo nó ao final da lista.
- **addFirst(value)**: Adiciona um novo nó no início da lista.
- **remove(value)**: Remove o primeiro nó que contém o valor especificado.
- **removeFirst()**: Remove o primeiro nó da lista.
- **removeLast()**: Remove o último nó da lista.
