package com.ada.project.linkedlist;

import com.ada.project.model.Detran;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class RegistroLinkedList {

    private LinkedList<Detran> registros;

    public RegistroLinkedList() {
        registros = new LinkedList<>();
    }
    public void lerRegistrosDoArquivo(String nomeArquivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            boolean primeiraLinha = true; // Indicador da primeira linha para ignorar o cabeçalho
            while ((linha = reader.readLine()) != null) {
                if (primeiraLinha) {
                    primeiraLinha = false;
                    continue;
                }
                String[] campos = linha.split(","); // Utilize ';' como separador

                Detran detran = new Detran();
                detran.setId(campos[0]);
                detran.setDataInversa(campos[1]);
                detran.setDiaSemana(campos[2]);
                detran.setHorario(campos[3]);
                detran.setUf(campos[4]);
                detran.setBr(campos[5]);
                detran.setKm(campos[6]);
                detran.setMunicipio(campos[7]);
                detran.setCausaAcidente(campos[8]);
                detran.setTipoAcidente(campos[9]);
                detran.setClassificacaoAcidente(campos[10]);
                detran.setFaseDia(campos[11]);
                detran.setSentidoVia(campos[12]);
                detran.setCondicaoMeteorologica(campos[13]);
                detran.setTipoPista(campos[14]);
                detran.setTracadoVia(campos[15]);
                detran.setUsoSolo(campos[16]);
                detran.setAno(campos[17]);
                detran.setPessoas(campos[18]);
                detran.setMortos(campos[19]);
                detran.setFeridosLeves(campos[20]);
                detran.setFeridosGraves(campos[21]);
                detran.setIlesos(campos[22]);
                detran.setIgnorados(campos[23]);
                detran.setFeridos(campos[24]);
                registros.add(detran);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public LinkedList<Detran> getRegistro() {
        return registros;
    }

}

