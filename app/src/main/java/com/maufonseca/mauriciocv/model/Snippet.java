package com.maufonseca.mauriciocv.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class Snippet implements Parcelable {
  private String title, subtitle, shortDescription, longDescription;

  public Snippet() {
    this.title = "";
    this.subtitle = "";
    this.shortDescription = "";
    this.longDescription = "";
  }

  public Snippet(String title, String subtitle, String shortDescription, String longDescription) {
    this.title = title;
    this.subtitle = subtitle;
    this.shortDescription = shortDescription;
    this.longDescription = longDescription;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getSubtitle() {
    return subtitle;
  }

  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }

  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public String getLongDescription() {
    return longDescription;
  }

  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }

  public static ArrayList<Snippet> getSynthesis() {
    ArrayList<Snippet> synthesis = new ArrayList<>();

    Snippet nativeDev = new Snippet("Mauricio Fonseca",
      "Engenheiro de Software",
      "Experiência em desenvolvimento nativo para sistemas Android e iOS, domínio das IDEs Android Studio e Xcode e das linguagens de programação: Java, Objective-C e Swift",
      "• Prática diária com desenvolvimento nativo e migração de sistemas iOS legados de Objective-C para Swift\n\n"+
    "• Migração de código Java para Kotlin em aplicativos Android\n\n"+
    "• Experimentos com desenvolvimento híbrido utilizando o SDK Flutter, do Google, na linguagem Dart\n\n"+
    "• Profundo conhecimento dos componentes do CocoaTouch e Android SDK");
    synthesis.add(nativeDev);

    Snippet arq = new Snippet("",
      "",
      "Domínio das arquiteturas atuais e das bibliotecas mais comuns para suas implantações",
      "• Experiência com MVC, MVP, VIP, Clean-Architecture\n\n"+
        "• Experiência com RxAndroid, Dagger2, Retrofit, Volley, Alamofire, Realm");
    synthesis.add(arq);

    Snippet uiux = new Snippet("",
      "",
      "Conhecimentos sólidos de UI/UX e regras de design Android/iOS",
      "• Conhecimento Human Interface Guidelines\n\n"+
        "• Conhecimento do Material Design\n\n"+
        "• Experiência com testes de interface Web/Mobile\n\n"+
        "• Adepto dos princípios do KISS (Keep-It-Simple)\n\n"+
        "• Experiência com teste e melhoria de desempenho em aplicativos");
    synthesis.add(uiux);

    Snippet agile = new Snippet("",
      "",
      "Trabalho com Desenvolvimento Ágil utilizando versionamento de código",
      "• Prática com GitFlow em equipes de desenvolvimento\n\n"+
        "• Trabalho constante com projetos de inovação utilizando Scrum/XP\n\n"+
        "• Uso do Clean e suas boas práticas para facilitar mudanças de plano e adptações no produto em desenvolvimento");
    synthesis.add(agile);

    Snippet tests = new Snippet("",
      "",
      "Prática com todas as etapas de teste de software, experiência em Desenvolvimento Guiado por Testes (TDD) e por Comportamento (BDD). Conhecimento das bibliotecas e ferramentas relacionadas",
      "• TCC e pesquisas na área de teste de software\n\n"+
        "• Automatização de teste Web e Mobile");
    synthesis.add(tests);

    Snippet apis = new Snippet("",
      "",
      "Uso de APIs de autenticação, pagamentos, localização e com APIs que seguem o padrão REST",
      "• Stripe, PagSeguro, PayPal, Google APIs, Firebase, Apple Push-Notification Service");
    synthesis.add(apis);

    Snippet pub = new Snippet("",
      "",
      "Experiência em publicações de aplicativos na Play Store e App Store, bem como técnicas de integração contínua, publicação contínua e configuração de variações do mesmo projeto através de Flavors e Build Schemes",
      "• Travis, Jenkins, Docker, Fastlane, Analytics");
    synthesis.add(pub);

    Snippet english = new Snippet("",
      "",
      "Inglês avançado para leitura, escrita e conversação",
      "");
    synthesis.add(english);
    Snippet qa = new Snippet("","",
      "Prática em QA, organização de equipes de desenvolvimento guiado a testes e utilização de ferramentas de automatização no processo produtivo de aplicativos mobile e Web",
      "• Uso das linguagens Groovy e Gherkin\n\n"+
        "• Prática com Selenium, JUnit, Expresso, XCTest Framework");
    synthesis.add(qa);

    return synthesis;
  }

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

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(Parcel dest, int flags) {
    dest.writeString(this.title);
    dest.writeString(this.subtitle);
    dest.writeString(this.shortDescription);
    dest.writeString(this.longDescription);
  }

  protected Snippet(Parcel in) {
    this.title = in.readString();
    this.subtitle = in.readString();
    this.shortDescription = in.readString();
    this.longDescription = in.readString();
  }

  public static final Creator<Snippet> CREATOR = new Creator<Snippet>() {
    @Override
    public Snippet createFromParcel(Parcel source) {
      return new Snippet(source);
    }

    @Override
    public Snippet[] newArray(int size) {
      return new Snippet[size];
    }
  };
}
