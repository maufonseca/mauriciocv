package com.maufonseca.mauriciocv.infrastructure;

import com.maufonseca.mauriciocv.model.Snippet;

import java.util.ArrayList;

public class SchoolRequester {

  //Let it be here while not getting it from api
  public static ArrayList<Snippet> getSchool() {
    ArrayList<Snippet> school = new ArrayList<>();
    Snippet mba = new Snippet("USP - Abr/2018 ao Presente",
        "Campus de Piracicaba/SP",
        "MBA em Gestão de Projetos",
        "• Conclusão prevista para Out/2019\n"+
            "• Fixação das boas práticas em gestão de projetos previstas no PMBOK\n"+
            "• Gerenciamento de Integração, Escopo, Cronograma, Custos, Qualidade, Recursos Humanos, Riscos, Aquisições, Comunicações e Stakeholders\n"+
            "• Contato com ferramentas de gerenciamento de projeto\n" +
            "• Liderança e motivação como gerente de projetos\n"+
            "• Gerenciamento com métodos ágeis e métodos híbridos");
    school.add(mba);

    Snippet engComp = new Snippet("USP - 2008 a 2017",
        "Campus de São Carlos/SP",
        "Graduação em Engenharia de Computação",
        "• TCC publicado em 2016: “Teste de software em aplicativos móveis no ambiente empresarial: um relato de experiência”\n"+
            "• Conclusão em Nov/2017");
    school.add(engComp);
    return school;
  }
}
