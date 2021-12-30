package com.listaEncadeada;

public class ListaEncadeada {
	
	No<T> referenciaEntrada;
	
	
	// construtor da ListaEncadeada setado nulo
	public ListaEncadeada() {
		this.referenciaEntrada = null;
	}
	
	
	// metodo add que adiciona conteudo ao No ou proximoNo caso o No esteja vazio nulo
	public void add(T conteudo) {
		
		No<T> novoNo = new No<>(conteudo);
		
		if(this.isEmpt()) {
			referenciaEntrada = novoNo;
			return;
		}
		
		No<T> noAuxiliar = referenciaEntrada;
		for(int i = 0; i < this.size()-1; i++) {
			noAuxiliar = noAuxiliar.getProximoNo();
		}
		
		noAuxiliar.setProximoNo(novoNo);
	}
	
	// matodo get para acessar o conteudo da lista
	public T get(int index) {
		return getNo(index).getConteudo();
	}
	
	// metodo getNo para acessar um determinado indice da lista
	private No<T> getNo(int index) {
		
		validaIndice(index);
		
		No<T> noAuxiliar = referenciaEntrada;
		
		No<T> noRetorno = null;
		
		int ultimoIndice = size() - 1;
		
		for(int i = 0; i < this.size()-1; i++) {
			noRetorno = noAuxiliar;
			noAuxiliar = noAuxiliar.getProximoNo();
			
		} return noRetorno;
	}
	
	// metodo para remover um no em determinado indice
	public T remove(int index) {
		
		No<T> noPivor = this.getNo(index);
		
		if(index == 0) {
			referenciaEntrada = noPivor.getProximoNo();
		} return noPivor.getConteudo();
	
		No<T> noAnterior = getNo(index - 1);
		noAnterior.setProximoNo(noPivor.getProximoNo());
		return noPivor.getConteudo();
	}
	
	// metodo size para retornar o tamanho da lista
	public int size() {
		
		No<T> referenciaAux = referenciaEntrada;
		
		int tamanhoLista = 0;
		
		while(true) {
			if(referenciaAux != null) {
				tamanhoLista++;
				if(referenciaAux.getProximoNo() != null) {
					referenciaAux = referenciaAux.getProximoNo();
				}else {
					return break;
				}
			}else {
				return break;
			}
		}
	} return tamanhoLista;
	
	// metodo valida de o indice existe criando uma excessao de nullpointerexception tratando o erro
	private void validaIndice(int index) {
				
		if(index >= size()) {
			throw new IndexOutOfBoundsException("Não existe conteudo no indice" + index + "desta lista.\n Essa lista vai até o indice" + ultimoIndice);
		}
				
	}
			
	// metodo isEmpt para verificar se a lista esta vazia
	public boolean isEmpt() {
		return referenciaEntrada == null ? true : false;
	}
	
	// metodo toString para percorrer e imprimir a lista
	@Override
	public String toString() {
		String strRetorno = "";
		
		No<T> noAuxiliar = referenciaEntrada;
		
		if(int i = 0; i < this.size(); i++) {
			
			strRetorno += "No [conteudo= " + noAuxiliar.getConteudo() + "]==>";
			noAuxiliar = noAuxiliar.getProximoNo();
		}
		strRetorno += "null";
		
		return strRetorno;
	}


			
}
