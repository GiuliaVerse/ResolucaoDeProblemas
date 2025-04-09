public class FilaV {
    private int primeiro;
    private int ultimo;
    private int[] dados;
    private int capacidade;
    private int itens;

    public FilaV(int capacidade) {
        dados = new int[capacidade];
        this.capacidade = capacidade;
        itens = 0;
        primeiro = 0;
        ultimo = -1;
    }
    public FilaV() {
        this(10);
    }

    public boolean cheia() {
        return ( itens == capacidade );
    }

    public boolean vazia() {
        return ( itens == 0 );
    }

    public void inserir(int elemento) {
        if( cheia() ) {
            System.out.println("Fila cheia!");
        } else {
            ultimo = (ultimo + 1) % capacidade;
            dados[ultimo] = elemento;
            itens++;
        }
    }

    public int consultar() {
        if( vazia() ) {
            return -1;
        } else {
            return dados[primeiro];
        }
    }

    public int remover() {
        if( vazia() ) {
            System.out.println("Fila vazia!");
            return -1;
        } else {
            int dado = dados[primeiro];
            primeiro = (primeiro + 1) % capacidade;
            itens--;
            return dado;
        }
    }

    public void listar() {
        int atual = primeiro;
        for( int i = 1; i <= itens; i++ ) {
            System.out.print(dados[atual]+" ");
            atual = (atual + 1) % capacidade;
        }
        System.out.println();
    }
}
