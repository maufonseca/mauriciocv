package com.maufonseca.mauriciocv.infrastructure;

import com.maufonseca.mauriciocv.model.Snippet;

import java.util.ArrayList;

public class WorkHistoryRequester {

  public WorkHistoryRequester() {

  }

  public void requestWorkHistory() {
    ArrayList<Snippet> workArray = new ArrayList<>();
    workArray = getWorkHistory();
  }

  //Let it be here while not getting it from api
  public static ArrayList<Snippet> getWorkHistory() {
    ArrayList<Snippet> work = new ArrayList<>();

    Snippet devRinga = new Snippet("Jan/2016 ao presente\n" + "Ringa (www.ringa.com.br)",
      "Desenvolvedor Mobile (Android/iOS)",
      "Aprimoramento do desenvolvimento, teste e manutenção diários de aplicativos iOS e Android, utilizando metodologias ágeis",
      "Análise e Manutenção de aplicativos já publicados\n" +
        "Supervisão e instrução de estagiários da empresa no desenvolvimento mobile\n" +
        "Interação com clientes da empresa para buscar soluções para os aplicativos\n" +
        "Prática avançada com repositórios git (utilizando o padrão GitFlow ou qualquer outro)\n" +
        "Programação em linguagens:\n" +
        " - Java, Objective-C e Swift\n" +
        "Migração de sistemas legado de Objective-C para Swift\n" +
        "Teste de software para aplicativos\n" +
        " - Testes unitários (JUnit, Mockito, XCTest)\n" +
        " - Testes de interface/instrumentação Android e iOS\n" +
        " - Desenvolvimento Guiado por Testes (TDD)\n" +
        " - Análise de comportamento, desempenho e uso racional de recursos do dispositivo (Instruments, Traceview)\n" +
        "Conhecimentos sólidos de UI/UX, Material design e fluxos de navegação Android/iOS\n" +
        " - Trabalho com layouts para várias dimensões de tela\n" +
        " - Uso eficiente dos componentes nativos Android e Android Support Library\n" +
        " - Criação de layouts complexos com os componentes do UIKit para iOS\n" +
        "Experiência em Desenvolvimento Ágil (Scrum e XP)\n" +
        " - Entregas sistemáticas de Sprints/Milestones (Scrum)\n" +
        " - Uso de sistemas de gerenciamento de trabalho (Jira/Trello/GitHub)\n" +
        " - Publicação de features completas em um dia (XP)\n" +
        "Desenvolvimento com diferentes padrões de projeto\n" +
        " - MVC\n" +
        " - MVVM\n" +
        " - MVP\n" +
        " - VIPER\n" +
        " - Clean-Architecture\n" +
        "Conhecimento básico em programação reativa\n" +
        " - Programação com o padrão Observador/Observável\n" +
        " - Prática com RxJava/RxAndroid\n" +
        "Uso de APIs\n" +
        " - Autenticação por redes sociais (Google/Facebook/LinkedIn)\n" +
        " - Google Places/Maps\n" +
        " - Firebase Cloud Messaging (Push notifications)\n" +
        " - Prática na criação de APIs utilizando Ruby on Rails\\n\n" +
        " - Consumo de APIs REST com uso das bibliotecas Volley, Retrofit e AlamoFire\n" +
        " - Parsing de dados no formato JSON\n" +
        "Prática com e-commerce\n" +
        " - Gerenciamento de pagamentos/cobranças seguras utilizando Stripe e PagSeguro\n" +
        " - Criação de aplicativos de compra/venda de artigos, lojas virtuais e marketplaces\n" +
        "Persistência de dados básica em aplicativos\n" +
        " - Uso de banco de dados (Realm/SQLite)\n" +
        "Prática com criptografia de arquivos no padrão AES\n" +
        "Análise e rastreamento de uso do aplicativo\n" +
        "Rastreamento do comportamento do usuário no aplicativo (Crashlytics/Analytics)\n" +
        "Prática com configuração e análise de histórico de erros\n" +
        "Publicação de aplicativos no Google Play e App Store\\n\n" +
        " - Geração/Assinatura de APKs e utilização do Google Developer Console\n" +
        " - Testes Alfa/Beta e publicação fracionada/percentual\n" +
        "Integração contínua e publicação automática\n" +
        " - Experiência com Travis/Fastlane e Jenkins\n" +
        " - Configuração de Flavors do mesmo projeto pelo Gradle\n" +
        " - Configuração de Build Schemes do mesmo projeto no Xcode\n" +
        " - Publicação automática dos Flavors/Schemes através do Fastlane");

    Snippet qaRinga = new Snippet("Jan/2018 ao Presente\n" + "Ringa (www.ringa.com.br)",
      "Engenheiro de QA (Android/iOS/Web)",
      "Responsável pelo planejamento e implantação de QA na empresa, introduzindo testes automatizados de comportamento a Web e Mobile",
      "Extração de requisitos de sistemas legado por análise exploratória\n" +
        "Manutenção de documentação ágil sobre o sistema através de mapas mentais com a ferramenta XMind\n" +
        "Elaboração de casos de teste na linguagem Gherkin e supervisão da execução de BDD em projetos Mobile/Web\n" +
        "Automatização de testes BDD utilizando o Katalon Studio na linguagem Groovy\n" +
        "Prática com Selenium IDE/Appium\n" +
        "Configuração da execução periódica dos testes pela ferramenta Jenkins integrada com repositório git em um container do Docker\n" +
        "Aplicação de testes em ambiente de desenvolvimento Ágil\n" +
        "Testes de desempenho de sistemas Web/Mobile\n" +
        "Análise de melhoria/regressão nos sistemas desenvolvidos\n" +
        "Integração de ferramentas de teste com o software JIRA para análises de qualidade do desenvolvimento e da equipe");

    Snippet internRinga = new Snippet("Fev/2015 a Jan/2016\n" + "Ringa (www.ringa.com.br)",
      "Estagiário em Desenvolvimento Mobile (Android/iOS)",
      "Aprendizado do uso de Objective-C e Java para criar aplicativos iOS e Android, respectivamente",
      "Desenvolvimento nativo para sistemas Android e iOS.\n" +
        "Trabalho diário em sistemas baseados em UNIX como Linux e macOS.\n" +
        "Uso diário das IDEs Android Studio e Xcode.\n" +
        "Forte uso de linguagens orientadas a objetos\n" +
        " - Java e Objective-C");

    work.add(devRinga);
    work.add(qaRinga);
    work.add(internRinga);
    return work;
  }

}
