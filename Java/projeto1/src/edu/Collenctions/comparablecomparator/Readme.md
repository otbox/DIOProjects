# Comparator X Comparable 
## Comparable

- `Comparable` permite à nos podemos organizar uma coleção, a partir de um elemento, como id, nome, preço
- Ele afeta a classe original, então faz alterações nela
- Tem o método `compareTo` para ordenar elementos 
- está presente no `java.lang` 
- Conseguimos ordenar os elementos da lista do tipo `Comparable` usando o metódo `Collections.sort(List)`

## Comparator 
- fornece o método `compare()` para ordenar os elementos 
- Permite a organizar por mais de um elemento, como id e nome 
- não a feta a classe original
- está presente no `java.util`
- Podemos ordenar os elementos da lista do tipo `Comparator` usando o método `Collections.sort(List,Comparator)` 
