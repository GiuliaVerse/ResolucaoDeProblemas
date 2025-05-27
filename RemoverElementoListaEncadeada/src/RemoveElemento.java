public void removeElemento(int valor) {
    if (inicio == null) {
        System.out.println("Erro: Lista vazia");
        return;
    }

    // Caso especial: remover do início
    if (inicio.dado == valor) {
        inicio = inicio.proximo;
        return;
    }

    No atual = inicio;
    while (atual.proximo != null) {
        if (atual.proximo.dado == valor) {
            atual.proximo = atual.proximo.proximo;
            return;
        }
        atual = atual.proximo;
    }

    System.out.println("Erro: Elemento não encontrado");
}
