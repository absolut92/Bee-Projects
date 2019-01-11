package com.beeeng.matriculas;

public class Gestao {

		
		 int userId;
		 String dataMatricula;
		 String nome;
		 String apelido;
		 String data;
		 int dataSaida;
		 int dataChegada;
		 int km;
		 float combustivel;
		 boolean aprovacao;
		 
		 
		public Gestao(String dataMatricula, String nome, String apelido, String data, int dataSaida, int dataChegada,
				int km, float combustivel, boolean aprovacao) {
			super();
			this.dataMatricula = dataMatricula;
			this.nome = nome;
			this.apelido = apelido;
			this.data = data;
			this.dataSaida = dataSaida;
			this.dataChegada = dataChegada;
			this.km = km;
			this.combustivel = combustivel;
			this.aprovacao = aprovacao;
		}
		
		
		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
		public String getDataMatricula() {
			return dataMatricula;
		}
		public void setMatricula(String dataMatricula) {
			this.dataMatricula = dataMatricula;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getApelido() {
			return apelido;
		}
		public void setApelido(String apelido) {
			this.apelido = apelido;
		}
		public String getData() {
			return data;
		}
		public void setData(String data) {
			this.data = data;
		}
		public int getDataSaida() {
			return dataSaida;
		}
		public void setDataSaida(int dataSaida) {
			this.dataSaida = dataSaida;
		}
		public int getHoraChegada() {
			return dataChegada;
		}
		public void setHoraChegada(int dataChegada) {
			this.dataChegada = dataChegada;
		}
		public int getKm() {
			return km;
		}
		public void setKm(int km) {
			this.km = km;
		}
		public float getCombustivel() {
			return combustivel;
		}
		public void setCombustivel(float combustivel) {
			this.combustivel = combustivel;
		}
		public boolean isAprovacao() {
			return aprovacao;
		}
		public void setAprovacao(boolean aprovacao) {
			this.aprovacao = aprovacao;
		}
		 
		 
	
	

}
