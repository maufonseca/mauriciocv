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
        "• Conclusão prevista para Out/2019");
    school.add(mba);

    Snippet engComp = new Snippet("USP - 2008 a 2017",
        "Campus de São Carlos/SP",
        "Graduação em Engenharia de Computação",
        "• TCC publicado em 2016: “Teste de software em aplicativos móveis no ambiente empresarial: um relato de experiência”\n\n"+
            "• Conclusão em Nov/2017");
    school.add(engComp);
    return school;
  }
}
