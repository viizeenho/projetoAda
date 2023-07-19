package com.ada.project.map;

import com.ada.project.model.Detran;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PesquisaMunicipio {

    public static Map<String, List<Detran>> carregarDadosArquivo(String nomeArquivo) {
        Map<String, List<Detran>> municipiosDetran = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] campos = linha.split(",");
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
                detran.setVeiculos(campos[25]);

                String municipio = detran.getMunicipio();
                if (!municipiosDetran.containsKey(municipio)) {
                    municipiosDetran.put(municipio, new ArrayList<>());
                }
                municipiosDetran.get(municipio).add(detran);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return municipiosDetran;
    }
}
