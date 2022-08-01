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
		
		/*
		 * System.out.println(curso1); System.out.println(curso2);
		 * System.out.println(mentoria);
		 */
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Aprimorando conceitos Java");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devLuan = new Dev ();
		devLuan.setNome("Luan Lucas Barbosa");
		devLuan.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos Luan:" + devLuan.getConteudosInscritos());
		devLuan.progredir();
		System.out.println("--");
		System.out.println("Conteúdos inscritos Luan:" + devLuan.getConteudosInscritos());
		System.out.println("Conteúdos concluídos Luan:" + devLuan.getConteudosConcluidos());
		System.out.println("XP:" + devLuan.calcularTotalXp());
		
		Dev devYuri = new Dev();
		devYuri.setNome("Yuri Klissman Barbosa");
		devYuri.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos Yuri:" + devYuri.getConteudosInscritos());
		devYuri.progredir();
		devYuri.progredir();
		devYuri.progredir();
		System.out.println("--");
		System.out.println("Conteúdos inscritos Yuri:" + devYuri.getConteudosInscritos());
		System.out.println("Conteúdos concluídos Yuri:" + devYuri.getConteudosConcluidos());
		System.out.println("XP:" + devYuri.calcularTotalXp());
	}

}
