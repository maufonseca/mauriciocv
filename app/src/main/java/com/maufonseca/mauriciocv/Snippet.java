package com.maufonseca.mauriciocv;

import java.util.ArrayList;

public class Snippet {
  private String title, subtitle, shortDescription, longDescription;

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

  public static ArrayList<Snippet> getWorkHistory() {
    ArrayList<Snippet> work = new ArrayList<>();
    Snippet qaRinga = new Snippet("Jan/2018 ao Presente – Ringa (www.ringa.com.br)",
      "Empresa desenvolve aplicativos Android/iOS e Sistemas Web\nEngenheiro de QA (Android/iOS/Web)",
      "Responsável pela implantação da área de QA na empresa com testes automatizados utilizando Jenkins e Docker.\n" +
        "Extração de requisitos de sistemas legado por análise exploratória\n" +
        "Manutenção de documentação ágil sobre o sistema através de mapas mentais com a ferramenta XMind\n" +
        "Elaboração de casos de teste na linguagem Gherkin e supervisão da execução de BDD em projetos Mobile/Web\n" +
        "Automatização de testes BDD utilizando o Katalon Studio na linguagem Groovy\n" +
        "Prática com Selenium IDE/Appium\n" +
        "Configuração da execução periódica dos testes pela ferramenta Jenkins integrada com repositório git em um container do Docker\n" +
        "Aplicação de testes em ambiente de desenvolvimento Ágil\n" +
        "Testes de desempenho de sistemas Web/Mobile\n" +
        "Análise de melhoria/regressão nos sistemas desenvolvidos\n" +
        "Integração de ferramentas de teste com o software JIRA para análises de qualidade do desenvolvimento e da equipe",
      "");

    Snippet devRinga = new Snippet("Jan/2016 a Dez/2017 – Ringa (www.ringa.com.br)",
      "Empresa desenvolve aplicativos Android/iOS e Sistemas Web\nDesenvolvedor Mobile (Android/iOS)",
      "Análise e Manutenção de aplicativos já publicados\\n\n" +
        "Supervisão e instrução de estagiários da empresa no desenvolvimento mobile\\n\n" +
        "Interação com clientes da empresa para buscar soluções para os aplicativos\\n\n" +
        "Prática avançada com repositórios git (utilizando o padrão GitFlow ou qualquer outro)\\n\n" +
        "Programação em linguagens:\\n\n" +
        " - Java, Objective-C e Swift\\n\n" +
        "Migração de sistemas legado de Objective-C para Swift\\n\n" +
        "Teste de software para aplicativos\\n\n" +
        " - Testes unitários (JUnit, Mockito, XCTest)\\n\n" +
        " - Testes de interface/instrumentação Android e iOS\\n\n" +
        " - Desenvolvimento Guiado por Testes (TDD)\\n\n" +
        " - Análise de comportamento, desempenho e uso racional de recursos do dispositivo (Instruments, Traceview)\\n\n" +
        "Conhecimentos sólidos de UI/UX, Material design e fluxos de navegação Android/iOS\\n\n" +
        " - Trabalho com layouts para várias dimensões de tela\\n\n" +
        " - Uso eficiente dos componentes nativos Android e Android Support Library\\n\n" +
        " - Criação de layouts complexos com os componentes do UIKit para iOS\\n\n" +
        "Experiência em Desenvolvimento Ágil (Scrum e XP)\\n\n" +
        " - Entregas sistemáticas de Sprints/Milestones (Scrum)\\n\n" +
        " - Uso de sistemas de gerenciamento de trabalho (Jira/Trello/GitHub)\\n\n" +
        " - Publicação de features completas em um dia (XP)\\n\n" +
        "Desenvolvimento com diferentes padrões de projeto\\n\n" +
        " - MVC\\n\n" +
        " - MVVM\\n\n" +
        " - MVP\\n\n" +
        " - VIPER\\n\n" +
        " - Clean-Architecture\\n\n" +
        "Conhecimento básico em programação reativa\\n\n" +
        " - Programação com o padrão Observador/Observável\\n\n" +
        " - Prática com RxJava/RxAndroid\\n\n" +
        "Uso de APIs\\n\n" +
        " - Autenticação por redes sociais (Google/Facebook/LinkedIn)\\n\n" +
        " - Google Places/Maps\\n\n" +
        " - Firebase Cloud Messaging (Push notifications)\\n\n" +
        " - Prática na criação de APIs utilizando Ruby on Rails\\n\n" +
        " - Consumo de APIs REST com uso das bibliotecas Volley, Retrofit e AlamoFire\\n\n" +
        " - Parsing de dados no formato JSON\\n\n" +
        "Prática com e-commerce\\n\n" +
        " - Gerenciamento de pagamentos/cobranças seguras utilizando Stripe e PagSeguro\\n\n" +
        " - Criação de aplicativos de compra/venda de artigos, lojas virtuais e marketplaces\\n\n" +
        "Persistência de dados básica em aplicativos\\n\n" +
        " - Uso de banco de dados (Realm/SQLite)\\n\n" +
        "Prática com criptografia de arquivos no padrão AES\\n\n" +
        "Análise e rastreamento de uso do aplicativo\\n\n" +
        "Rastreamento do comportamento do usuário no aplicativo (Crashlytics/Analytics)\\n\n" +
        "Prática com configuração e análise de histórico de erros\\n\n" +
        "Publicação de aplicativos no Google Play e App Store\\n\n" +
        " - Geração/Assinatura de APKs e utilização do Google Developer Console\\n\n" +
        " - Testes Alfa/Beta e publicação fracionada/percentual\\n\n" +
        "Integração contínua e publicação automática\\n\n" +
        " - Experiência com Travis/Fastlane e Jenkins\\n\n" +
        " - Configuração de Flavors do mesmo projeto pelo Gradle\\n\n" +
        " - Configuração de Build Schemes do mesmo projeto no Xcode\\n\n" +
        " - Publicação automática dos Flavors/Schemes através do Fastlane",
      "");

    Snippet internRinga = new Snippet("Fev/2015 a Jan/2016 – Ringa (www.ringa.com.br)",
      "Empresa desenvolve aplicativos Android/iOS e Sistemas Web\nEstagiário em Desenvolvimento Mobile (Android/iOS)",
      "Desenvolvimento nativo para sistemas Android e iOS.\\n\n" +
        "Trabalho diário em sistemas baseados em UNIX como Linux e macOS. \\n\n" +
        "Uso diário das IDEs Android Studio e Xcode.\\n\n" +
        "Forte uso de linguagens orientadas a objetos\\n\n" +
        " - Java e Objective-C",
      "");

    work.add(qaRinga);
    work.add(devRinga);
    work.add(internRinga);
    return work;
  }

  public static ArrayList<Snippet> getSynthesis() {
    ArrayList<Snippet> synthesis = new ArrayList<>();
    Snippet qa = new Snippet("",
      "",
      "Prática em QA, organização de equipes de desenvolvimento guiado a testes e utilização de ferramentas de automatização no processo produtivo de aplicativos mobile e Web utilizando as linguagens Groovy e Gherkin",
      "");
    synthesis.add(qa);

    Snippet nativeDev = new Snippet("",
      "",
      "Experiência em desenvolvimento nativo para sistemas Android e iOS, domínio das IDEs Android Studio e Xcode e das linguagens de programação: Java, Objective-C e Swift",
      "");
    synthesis.add(nativeDev);

    Snippet arq = new Snippet("",
      "",
      "Domínio das arquiteturas atuais e das bibliotecas mais comuns para suas implantações",
      "");
    synthesis.add(arq);

    Snippet uiux = new Snippet("",
      "",
      "Conhecimentos sólidos de UI/UX e regras de design Android/iOS",
      "");
    synthesis.add(uiux);

    Snippet agile = new Snippet("",
      "",
      "Trabalho com Desenvolvimento Ágil utilizando versionamento de código",
      "");
    synthesis.add(agile);

    Snippet tests = new Snippet("",
      "",
      "Prática em todas as etapas de teste de software, experiência em Desenvolvimento Guiado por Testes (TDD) e por Comportamento (BDD). Conhecimento das bibliotecas e ferramentas relacionadas",
      "");
    synthesis.add(tests);

    Snippet apis = new Snippet("",
      "",
      "Prática com uso de APIs de autenticação, pagamentos, localização e com APIs que seguem o padrão REST",
      "");
    synthesis.add(apis);

    Snippet pub = new Snippet("",
      "",
      "Experiência em publicações de aplicativos na Play Store e App Store, bem como técnicas de integração contínua, publicação contínua e configuração de variações do mesmo projeto através de Flavors e Build Schemes",
      "");
    synthesis.add(pub);
    return synthesis;
  }

  public static ArrayList<Snippet> getSchool() {
    ArrayList<Snippet> school = new ArrayList<>();
    Snippet mba = new Snippet("MBA em Gestão de Projetos – Abr/2018 ao Presente",
      "USP – Campus de Piracicaba/SP",
      "",
      "");
    school.add(mba);

    Snippet engComp = new Snippet("Graduação em Engenharia de Computação – Concluído em 2017",
      "USP – Campus de São Carlos/SP",
      "TCC publicado em 2016: “Teste de software em aplicativos móveis no ambiente empresarial: um relato de experiência”",
      "");
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
      "Organização de campanhas sociais municipais (agasalho, remédios, alimentos)\n" +
        "Aplicação de instruções aos soldados e população sobre assuntos variados\n" +
        "Comando de Pelotão e Porta-Bandeira do Brasil\n" +
        "Certificação militar de Honra ao Mérito\n" +
        "Promoção a Cabo do Exército",
      "");
    complement.add(army);
    return complement;
  }
}
