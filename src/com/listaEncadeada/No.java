package com.listaEncadeada;

	//utilizando generics na lista encadeada
public class No<T> { 
	
	private T conteudo;
	
	private No proximoNo;
	
	
	public No() { 
		this.proximoNo = null;
	}
	
	

	public No(T conteudo) {
		this.conteudo = conteudo;
		this.proximoNo = null;
	}



	public No(T conteudo, No proximoNo) {
		this.conteudo = conteudo;
		this.proximoNo = proximoNo;
	}


	// metodos acessores Geters e Seters
	public T getConteudo() {
		return conteudo;
	}



	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}



	public No getProximoNo() {
		return proximoNo;
	}



	public void setProximoNo(No proximoNo) {
		this.proximoNo = proximoNo;
	}


	// metodo toString para mostrar o conteudo e verificar se esta vazio e concatenar com proximoNo
	@Override
	public String toString() {
		return "No [conteudo = " + conteudo + "]";
	}
	
	public String toStringEncadeado() {
		 String str = "No[conteudo = " + conteudo + "]";
		
		if(proximoNo != null) {
			str += "=>" + proximoNo.toString();
		}else {
			str += "null";
		}
		return str;
		
	}
	
	

}
