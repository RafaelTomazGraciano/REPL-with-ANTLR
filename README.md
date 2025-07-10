# REPL-with-ANTLR

Projeto desenvolvido para a disciplina de Compiladores na [UENP](https://uenp.edu.br/).

## Sobre o Projeto
Este projeto é um interpretador REPL (Read-Eval-Print Loop) desenvolvido em C#, utilizando o [ANTLR](https://www.antlr.org/) para geração do analisador léxico e sintático. O REPL permite executar operações matemáticas básicas, manipular variáveis e avaliar expressões em tempo real via console interativo.

## Funcionalidades
- Operações matemáticas básicas (+, -, *, /)
- Definição e uso de variáveis
- Interface de linha de comando interativa
- Tratamento de erros com mensagens claras
- Análise sintática robusta via ANTLR

## ANTLR e Automação
Este projeto utiliza o ANTLR para gerar o parser a partir de uma gramática definida. Para facilitar o processo, dois arquivos batch (.bat) estão incluídos:

- **`gerar_gramatica.bat`**: Gera os arquivos do parser e lexer a partir da gramática ANTLR.

### Como gerar a gramática
Execute o arquivo `gerar_gramatica.bat` para gerar os arquivos necessários do ANTLR.

### Como executar o REPL
Após gerar a gramática, execute o comando abaixo para compilar e iniciar o REPL:

```
dotnet run --project REPL
```

## Exemplos de Uso
```
>>> a = 10
>>> b = 5
>>> a + b
15
>>> c = a * b
>>> c
50
```

## Operações Suportadas
- Atribuição de variáveis: `x = 5`
- Adição: `x + y`
- Subtração: `x - y`
- Multiplicação: `x * y`
- Divisão: `x / y`

## Requisitos
- .NET 9.0 ou superior
- [ANTLR](https://www.antlr.org/)

## Estrutura do Projeto
- `REPL/Program.cs`: Ponto de entrada do REPL
- `REPL/EvalVisitor.cs`: Avaliador de expressões baseado na gramática ANTLR
- `REPL/ErrorListener.cs`: Tratamento customizado de erros de parsing
- `REPL/Grammar/*.g4`: Arquivos de gramática ANTLR
- `gerar_gramatica.bat`: Script para gerar o parser/lexer
