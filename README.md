# Árvore Binária com Código Morse

Este projeto tem como objetivo representar todos os caracteres do alfabeto (A-Z) e os números (0-9) por meio de uma **árvore binária**, seguindo a lógica do **código Morse**, onde cada caractere é inserido na árvore com base em sua codificação de pontos (.) e traços (-).

A árvore é implementada **manualmente em Java**, sem o uso de bibliotecas prontas como List, ArrayList, Arrays, StringBuilder, entre outras. Toda a estrutura foi construída utilizando **tipos primitivos, `String`, `int`, `float` e `length`**, conforme as exigências do projeto.

---

# Funcionamento

O sistema permite:

- **Construção automática** da árvore binária Morse, contendo todos os 26 caracteres do alfabeto e os 10 algarismos numéricos.
- **Busca** por um caractere com base em seu código Morse.
- **Tradução de frases** escritas em código Morse.
- **Exibição hierárquica** da árvore binária no console, com visualização clara do caminho em pontos e traços.

---

# Estrutura da Árvore Morse

A lógica de inserção e busca segue as seguintes regras:

- Um **ponto (.)** significa mover para o **filho à esquerda**.
- Um **traço (-)** significa mover para o **filho à direita**.

Cada caminho da raiz até uma folha forma a codificação de um caractere.

Exemplo visual de parte da árvore:

```
|  ' '     <- Raiz
   |. E
      |.. I
         |... S
         |..- U
      |.- A
         |.-. R
         |.-- W
   |- T
      |-. N
         |-.. D
         |-.- K
      |-- M
         |--. G
         |--- O
```

---

# Estrutura do Código

O projeto é dividido nas seguintes classes:

**Nodo:**  
Representa cada nó da árvore binária, contendo o caractere e seus filhos esquerdo e direito.

**ArvoreBinariaMorse:**  
Classe principal da árvore, responsável por inicializar, inserir, buscar, traduzir frases em Morse e exibir a estrutura da árvore.

**Principal:**  
Classe responsável pela interação com o usuário por meio do terminal. Permite a digitação de mensagens em código Morse para tradução e exibe a árvore formatada.

---

# Funcionalidades do Sistema

- Inserção de caracteres alfanuméricos de forma automática, baseada no código Morse padrão.
- Busca individual por um caractere a partir do seu código Morse.
- Tradução de frases completas com caracteres separados por espaço.
- Exibição visual da árvore binária com indentação e indicação do caminho em Morse.

---

# Exemplo de Uso

Usuário digita a seguinte mensagem em código Morse no console:

```
... --- ...
```

O sistema exibe:

```
Mensagem traduzida: SOS
```

Em seguida, a árvore é exibida com indentação, facilitando a visualização de cada caminho.

---

# Observações Importantes

A árvore binária foi implementada **manualmente**, respeitando as seguintes restrições do projeto:

- Sem uso de arrays, listas, vetores, StringBuilder, ou qualquer tipo abstrato.
- Apenas uso de `String`, `int`, `float`, `length`, `charAt` e estruturas básicas.
- Nenhum uso de `throws`, `exceptions` ou bibliotecas utilitárias.
- Estrutura 100% compatível com as regras de submissão.

O projeto foi desenvolvido para fortalecer o entendimento de estruturas de dados, árvores binárias e codificação Morse, com foco na lógica e manipulação manual de dados.

---

# Apresentação em Vídeo

O grupo elaborou um vídeo explicativo demonstrando o funcionamento do sistema, disponível no YouTube:  
(https://youtu.be/vOs4HY91lLs)

---
