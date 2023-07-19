package com.ada.project.ordenacao;

import com.ada.project.model.Detran;

import java.util.*;

public class Ordenacao {
    public static List<Detran> ordenarPessoasPorNome(List<Detran> municipio) {
        municipio.sort(Comparator.comparing(Detran::getMunicipio));
        return municipio;
    }

}
