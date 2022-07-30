package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Teste1");
		curso1.setCargaHoraria(13);
		curso1.setDescricao("Aulas e cursos");
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Gramática");
		curso2.setCargaHoraria(65);
		curso2.setDescricao("Português avançado");
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("descrição mentoria java");
		mentoria.setData(LocalDate.now());
		
		Conteudo conteudo = new Curso();
		Conteudo conteudo1 = new Mentoria();
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);

	}

}
