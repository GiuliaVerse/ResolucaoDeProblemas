public class Lista {
    private Node ini;

    public Lista() {
        ini = null;
    }

    public void inserir(int dado) {
        Node no = new Node(dado);
        if( ini == null ) {
            ini = no;
        } else {
            Node aux = ini;
            while( aux.getProx() != null ) {
                aux = aux.getProx();
            } 
            aux.setProx(no);
        }
    }

    public int remover() {
    	int dado;
        if( ini == null) {
            System.out.println("Lista vazia");
            dado = -1;
        } else if( ini.getProx() == null ) {
            dado = ini.getDado();
            ini = null;
        } else {
	        Node aux = ini;
	        Node ult = ini.getProx();
	        while( ult.getProx() != null ) {
	            aux = ult;
	            ult = ult.getProx();
	        }
	        dado = ult.getDado();
	        aux.setProx(null);
        }
        return dado;
    }

    public int removerInicio() {
    	int dado;
    	if( ini == null ) {
            System.out.println("Lista vazia");
            dado = -1;
        } else {
        	dado = ini.getDado();
        	ini = ini.getProx();
        }
        return dado;
    }

    public int consultarInicio() {
        if( ini == null )
            return -1;
        else
            return ini.getDado();
    }

    public void listar() {
    	if( vazia() ) {
    		System.out.println("Vazia");
    	} else {
    		Node aux = ini;
    		while( aux != null ) {
    			System.out.print(aux.getDado() + " ");
    			aux = aux.getProx();
    		}
    	}
    }

    public boolean vazia() {
        if( ini == null )
        	return true;
        else
        	return false;
    }

}