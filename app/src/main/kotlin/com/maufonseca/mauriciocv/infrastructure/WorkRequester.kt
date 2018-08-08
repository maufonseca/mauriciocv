package com.maufonseca.mauriciocv.infrastructure

import com.maufonseca.mauriciocv.model.Snippet

import java.util.ArrayList

object WorkRequester {

  //Let it be here while not getting it from api
  fun getWorkHistory(): ArrayList<Snippet> {
    val devRinga = Snippet("Jan/2016 ao presente\n" + "Ringa (www.ringa.com.br)",
        "Desenvolvedor Mobile (Android/iOS)",
        "Aprimoramento do desenvolvimento, teste e manutenção diários de aplicativos iOS e Android, utilizando metodologias ágeis",
        "• Análise e Manutenção de aplicativos já publicados\n\n" +
            "• Supervisão e instrução de estagiários da empresa no desenvolvimento mobile\n\n" +
            "• Interação com clientes da empresa para buscar soluções para os aplicativos\n\n" +
            "• Prática avançada com repositórios git (utilizando o padrão GitFlow ou qualquer outro)\n\n" +
            "• Programação em linguagens:\n" +
            " - Java, Objective-C e Swift\n\n" +
            "• Migração de sistemas legado de Objective-C para Swift\n\n" +
            "• Teste de software para aplicativos\n" +
            " - Testes unitários (JUnit, Mockito, XCTest)\n" +
            " - Testes de interface/instrumentação Android e iOS\n" +
            " - Desenvolvimento Guiado por Testes (TDD)\n" +
            " - Análise de comportamento, desempenho e uso racional de recursos do dispositivo (Instruments, Traceview)\n\n" +
            "• Conhecimentos sólidos de UI/UX, Material design e fluxos de navegação Android/iOS\n" +
            " - Trabalho com layouts para várias dimensões de tela\n" +
            " - Uso eficiente dos componentes nativos Android e Android Support Library\n" +
            " - Criação de layouts complexos com os componentes do UIKit para iOS\n\n" +
            "• Experiência em Desenvolvimento Ágil (Scrum e XP)\n" +
            " - Entregas sistemáticas de Sprints/Milestones (Scrum)\n" +
            " - Uso de sistemas de gerenciamento de trabalho (Jira/Trello/GitHub)\n" +
            " - Publicação de features completas em um dia (XP)\n\n" +
            "• Desenvolvimento com diferentes padrões de projeto\n" +
            " - MVC\n" +
            " - MVVM\n" +
            " - MVP\n" +
            " - VIPER\n" +
            " - Clean-Architecture\n\n" +
            "• Conhecimento básico em programação reativa\n" +
            " - Programação com o padrão Observador/Observável\n" +
            " - Prática com RxJava/RxAndroid\n\n" +
            "• Uso de APIs\n" +
            " - Autenticação por redes sociais (Google/Facebook/LinkedIn)\n" +
            " - Google Places/Maps\n" +
            " - Firebase Cloud Messaging (Push notifications)\n" +
            " - Prática na criação de APIs utilizando Ruby on Rails\\n\n" +
            " - Consumo de APIs REST com uso das bibliotecas Volley, Retrofit e AlamoFire\n" +
            " - Parsing de dados no formato JSON\n\n" +
            "• Prática com e-commerce\n" +
            " - Gerenciamento de pagamentos/cobranças seguras utilizando Stripe e PagSeguro\n" +
            " - Criação de aplicativos de compra/venda de artigos, lojas virtuais e marketplaces\n\n" +
            "• Persistência de dados básica em aplicativos\n" +
            " - Uso de banco de dados (Realm/SQLite)\n\n" +
            "• Prática com criptografia de arquivos no padrão AES\n\n" +
            "• Análise e rastreamento de uso do aplicativo\n" +
            "- Rastreamento do comportamento do usuário no aplicativo (Crashlytics/Analytics)\n" +
            "- Prática com configuração e análise de histórico de erros\n\n" +
            "• Publicação de aplicativos no Google Play e App Store\n" +
            " - Geração/Assinatura de APKs e utilização do Google Developer Console\n" +
            " - Testes Alfa/Beta e publicação fracionada/percentual\n\n" +
            "• Integração contínua e publicação automática\n" +
            " - Experiência com Travis/Fastlane e Jenkins\n" +
            " - Configuração de Flavors do mesmo projeto pelo Gradle\n" +
            " - Configuração de Build Schemes do mesmo projeto no Xcode\n" +
            " - Publicação automática dos Flavors/Schemes através do Fastlane")

    val qaRinga = Snippet("Jan/2018 ao Presente\n" + "Ringa (www.ringa.com.br)",
        "Engenheiro de QA (Android/iOS/Web)",
        "Responsável pela melhoria de qualidade nos projetos da empresa através de inovações no gerenciamento dos projetos, supervisão do desenvolvimento e automatização de testes",
        "• Gerenciamento de projetos ágeis Mobile/Web focado em evitar desperdícios\n\n" +
            "• Ranqueamento de requisitos e gerenciamento de mudanças solicitadas por clientes\n\n" +
            "• Criação e validação de backlogs de produto/sprints\n\n" +
            "• Adaptação de ferramentas tradicionais de gerenciamento de projetos nos métodos ágeis da empresa, criando um framework híbrido\n\n" +
            "• Aprimoramento do uso da ferramenta JIRA na empresa\n" +
            " - Aferições de métricas, geração de relatórios sobre as sprints, uso de versões, epics e melhoria nas estimativas e na documentação das issues\n\n" +
            "• Implantação da área de QA na empresa com testes automatizados utilizando Jenkins e Docker.\n\n" +
            "• Extração de requisitos de sistemas legado por análise exploratória\n\n" +
            "• Manutenção de documentação ágil sobre o sistema através de mapas mentais com a ferramenta XMind\n\n" +
            "• Elaboração de casos de teste na linguagem Gherkin e supervisão da execução de BDD em projetos Mobile/Web\n\n" +
            "• Automatização de testes BDD utilizando o Katalon Studio na linguagem Groovy\n\n" +
            "• Configuração da execução periódica dos testes pela ferramenta Jenkins integrada com repositório git em um container do Docker\n\n" +
            "• Testes de desempenho de sistemas Web/Mobile\n\n" +
            "• Análise de melhoria/regressão nos sistemas desenvolvidos\n\n" +
            "• Integração de ferramentas de teste com o software JIRA para análises de qualidade do desenvolvimento e da equipe")

    val internRinga = Snippet("Fev/2015 a Jan/2016\n" + "Ringa (www.ringa.com.br)",
        "Estagiário em Desenvolvimento Mobile (Android/iOS)",
        "Aprendizado do uso de Objective-C e Java para criar aplicativos iOS e Android, respectivamente",
        "• Desenvolvimento nativo para sistemas Android e iOS.\n\n" +
            "• Trabalho diário em sistemas baseados em UNIX como Linux e macOS.\n\n" +
            "• Uso diário das IDEs Android Studio e Xcode.\n\n" +
            "• Forte uso de linguagens orientadas a objetos\n" +
            " - Java e Objective-C")

    return arrayListOf(qaRinga, devRinga, internRinga)
  }
}
