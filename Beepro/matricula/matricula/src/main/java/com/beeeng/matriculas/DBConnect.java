package com.beeeng.matriculas;

import java.sql.*;



public class DBConnect {
	
	private Connection Conn;
	private Statement Stmt;
	private ResultSet Rs;
	
	public DBConnect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/matricula", "root", "Poiu1###");
			
			
		}catch(Exception ex) {
			System.out.println("Erro: " +ex);
		}
	}

	public void getData() {
		try {
			String query = "select * from projeto";
			
			Rs = Stmt.executeQuery(query);
			System.out.println("Records from dartabase");
			while(Rs.next()) {
				String dataMatricula = Rs.getString("dataMatricula");
				 String nome = Rs.getString("nome");
				 String apelido = Rs.getString("apelido");
				 String data = Rs.getString("data");
				 int dataSaida = Rs.getInt("dataSaida");
				 int dataChegada = Rs.getInt("dataChegada");
				 int km = Rs.getInt("km");
				 float combustivel = Rs.getFloat("combustivel");
				 boolean aprovacao = Rs.getBoolean("aprovacao");
				
				 System.out.println("dataMatricula: "+dataMatricula+"  "
						+"nome: "+nome+"  "
						+"apelido: "+apelido+"  "
						+"data: "+data+"  "
						+"dataSaida: "+dataSaida+"  "
						+"dataChegada: "+dataChegada+"  "
						+"km: "+km+"  "
						+"combustivel: "+combustivel+"  "
						+"aprovacao: "+aprovacao+"  "
						 );
			}
		}catch(Exception ex) {
			System.out.println(ex);
		}
	}
}
