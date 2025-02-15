# Jogo de Adivinhação em Kotlin

Este é um jogo simples de adivinhação escrito em Kotlin. O jogador deve escolher um número inteiro e tentar acertar o valor correto.

## Como Funciona

1. O programa solicita ao jogador seu nome.
2. O jogador deve escolher um número inteiro.
3. Se o número escolhido for menor que 10, o jogo incentiva a tentar um valor maior.
4. Se o número escolhido for maior que 10, o jogo incentiva a tentar um valor menor.
5. Se o jogador escolher o número 10, ele vence o jogo.
6. Se a entrada não for um número válido, o jogador é eliminado.

## Exemplo de Execução

```
Olá Jogador(a), Qual é seu nome?
> Alice
Escolha um número e boa sorte, jogador(a) Alice.
Escolha um número inteiro:
> 5
Tenha mais ambição, jogador(a)! Tente novamente.
Escolha um número inteiro:
> 15
Você voou alto demais, Alice! Tente de novo.
Escolha um número inteiro:
> 10
Parabéns, jogador(a) Alice! Você venceu!
```

## Estrutura do Código

O código utiliza:
- `readLine()` para capturar a entrada do jogador.
- `when` para validar o número escolhido.
- Um loop `do-while` para manter o jogo em execução até que o jogador acerte.

## Como Executar

1. Instale o [Kotlin](https://kotlinlang.org/).
2. Salve o código em um arquivo `main.kt`.
3. No terminal, execute:
   ```sh
   kotlinc main.kt -include-runtime -d jogo.jar
   java -jar jogo.jar
   ```

Divirta-se jogando!

