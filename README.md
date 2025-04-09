# 📚 Estruturas de Dados com Java

**Resolução de Problemas - 4º semestre - PUCPR**

Este repositório contém atividades práticas sobre estruturas de dados utilizando Java, desenvolvidas durante o curso de Engenharia de Software.

---

## Atividades

### ATV Pilha e Fila
Implementação básica de **Pilha** e **Fila** utilizando vetores.

### Atividade Prática Supervisionada
- **Pilha Dinâmica**
- **Fila Dinâmica**
- **Merge de Filas Ordenadas**
  - Usando listas encadeadas
  - Usando vetores circulares

---

## ✅ Requisitos

- Java 8 ou superior
- Compilador Java (ex: `javac`)
- Terminal ou console de comandos

---

## ⚙️ Como compilar e executar a Atv Prática Supervisionada

```bash
# Clone o repositório
https://github.com/GiuliaVerse/ResolucaoDeProblemas.git

# Acesse a pasta do projeto
cd ResolucaoDeProblemas

# Compile os arquivos Java
javac *.java

# Execute o programa
java NomeDoArquivoPrincipal

Dentro do Programa temos o  Menu de Operações
===== MENU =====
1 - Operações com Pilha
2 - Operações com Fila
3 - Merge em Fila com Lista
4 - Merge em Fila com Vetor
0 - Sair

----------------------------------------------


Exemplos de Validação
1. Pilha
Inserir valores: 5, 10, 20

Remover um valor: deve sair o 20 (último inserido)

Listar: deve mostrar 5 10

2. Fila (com lista encadeada)
Inserir valores: 1, 2, 3

Remover: sai o 1 (primeiro inserido)

Listar: mostra 2 3

3. Merge de Filas (com lista encadeada)
Fila A: 1 3 5

Fila B: 2 4 6

Resultado: 1 2 3 4 5 6

4. Merge de Filas (com vetor)
Fila A: 10 20 30

Fila B: 5 15 25

Resultado: 5 10 15 20 25 30

Obs: Digite -1 para encerrar a entrada de dados em operações de merge.
