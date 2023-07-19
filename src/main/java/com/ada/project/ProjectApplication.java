package com.ada.project;

import com.ada.project.linkedlist.RegistroLinkedList;
import com.ada.project.map.PesquisaMunicipio;
import com.ada.project.model.Detran;
import com.ada.project.set.RegistroSet;
import com.ada.project.ordenacao.Ordenacao;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ProjectApplication {

	public static void main(String[] args) {

		String arquivo = "src/main/resources/test.csv";

		PesquisaMunicipio pesquisaMunicipio = new PesquisaMunicipio();
		RegistroLinkedList registroLinkedList = new RegistroLinkedList();
		registroLinkedList.lerRegistrosDoArquivo(arquivo);

		RegistroSet registroSet = new RegistroSet();
		registroSet.lerRegistrosDoArquivo(arquivo);

		Set<Detran> registros = registroSet.getRegistro();
		LinkedList<Detran> linkedList = registroLinkedList.getRegistro();
		Map<String, List<Detran>> municipiosDetran = pesquisaMunicipio.carregarDadosArquivo(arquivo);
/*
		// Registros Ordenados por Municipio.
		List<Detran> munipiosOrdenadas = Ordenacao.ordenarPessoasPorNome(linkedList);
		System.out.println("Registros ordenados por municipio:");
		for (Detran detran: munipiosOrdenadas ){
			System.out.println(detran);
		}

		//Todos os registros
		System.out.println("Registro LinkedList");
		for (Detran detran : linkedList){
			System.out.println(detran);
		}

		// Registros sem duplicados
		System.out.println("Registro sem informacoes duplicadas");
		for (Detran detran : registros) {
			System.out.println(detran);
		}
*/
		//Pesquisa Por Municipio
		String municipioPesquisa = "BETIM";
		List<Detran> registrosSaoPaulo = municipiosDetran.get(municipioPesquisa);
		if (registrosSaoPaulo != null) {
			// Faça o que desejar com a lista de registros de São Paulo
			// Por exemplo, imprimir os registros na tela
			for (Detran detran : registrosSaoPaulo) {
				System.out.println(detran);
			}
		} else {
			System.out.println("Nenhum registro encontrado para o município: " + municipioPesquisa);
		}


	}

}
