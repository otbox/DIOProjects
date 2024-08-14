## Primeiro Projeto Java DIO

Este projeto é um teste do bootcamp da DIO Desenvolvimento Java com AI

### Anotações 
É necessário para rodar um codigo compilado pela JVM, o JRE na máquina do cliente.
- CamelCase - Variaveis iniciam com miniscula depois maiscula caso composta minhaCalculadora, ja classes iniciam com maisculas e continuam
- Declarar váriaveis segue uma estrutura: Tipo NomeDaVariavel = Atribuição
- Identação forma hierarquica para a visualização do programa.
- Packages forma de criar subdiretórios, organizando com base na convenção 
- Java Beans: estruturação forma de escrever algoritmo, para classes, atributos, metodos e pacotes: 
    - Uma váriavel deve ser clara sem abreviações ou definição sem sentido
    - Uma váriavel sempre no singular, exceto com arrays ou coleção
    - Definir as váriaveis em apenas um idioma
    - Métodos precisão estar no infinitivo e ser um verbo

Documentação: 
- Codigo para documentar nossa classe para um html:`javadoc -encoding UTF-8 -docencoding ISO-8859-1  -d ../docs  src/*.java` 
- Saber mais: https://glysns.gitbook.io/java-basico/sintaxe/documentacao

Instalação e Terminais: 
- Copilação feita pelo javac execução pelo java, importante copilar todos as classes ao msmo tempo e executar do diretorio raiz

### POO:
A programação Orientada a Objetos tem como principais características o código feitos em classes, e sua instância é chamada de Objeto, foi criada para ter menos abstração, e trazendo aspectos da realidade, representando objetos da vida real para a programação
https://glysns.gitbook.io/java-basico/programacao-orientada-a-objetos/classes

Pacotes:
Mecanismo para organizar nosso projeto, sendo subdiretorios a partir do src, afim de organziar e separar as tarefas e serviços que precisemos em nossa aplicação.

Modificadores:
Default: Restrinje a visualização ao pacote
Public: Qualquer classe, de qualquer pacote consegue vê-la 
Private: Restringe apenas a classe
Protected:

#### Getters e Setters
Seguindo a convensão do JavaBeans, são utilizados, para pegar e adicionar atributos à nossa classe. E os atributos que serão manipulados serão privados

#### Constructor
Serve para colocar entradas de valores em seu objecto apartir do parenteses, geralmente iremos utilizar para valores imutáveis e que queremos já inicia-los.

#### Enum   
São objetos pre-estabelecidos.

