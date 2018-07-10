package com.maufonseca.mauriciocv.infrastructure;

import com.maufonseca.mauriciocv.model.Snippet;

import java.util.ArrayList;

public class ComplementRequester {

  //Let it be here while not getting it from api
  public static ArrayList<Snippet> getComplement() {
    ArrayList<Snippet> complement = new ArrayList<>();
    Snippet google = new Snippet("Google Cloud OnBoard SP/2018",
        "(cloud.google.com/training)",
        "Treinamento sobre o uso das ferramentas do Google Cloud ministrado por instrutores do Google",
        "");
    complement.add(google);

    Snippet devConf = new Snippet("DevConf 2018",
        "(devconf.opensanca.com.br)",
        "Evento com palestras sobre desenvolvimento de software ocorrido em São Carlos/SP",
        "");
    complement.add(devConf);

    Snippet army = new Snippet("Serviço Militar Obrigatório - 2006",
        "Exercito Brasileiro - Botucatu/SP",
        "• Organização de campanhas sociais municipais (agasalho, remédios, alimentos)\n" +
            "• Aplicação de instruções aos soldados e população sobre assuntos variados\n" +
            "• Comando de Pelotão e Porta-Bandeira do Brasil\n" +
            "• Certificação militar de Honra ao Mérito\n" +
            "• Promoção a Cabo do Exército",
        "");
    complement.add(army);
    return complement;
  }
}
