package com.maufonseca.mauriciocv.infrastructure

import com.maufonseca.mauriciocv.model.Snippet

import java.util.ArrayList

object SynthesisRequester {

  //Let it be here while not getting it from api
  fun getSynthesis() : ArrayList<Snippet> {

    val nativeDev = Snippet("",
        "",
        "Experiência em desenvolvimento nativo para sistemas Android e iOS, domínio das IDEs Android Studio e Xcode e das linguagens de programação: Java, Kotlin, Objective-C e Swift",
        "• Prática diária com desenvolvimento nativo e migração de sistemas iOS legados de Objective-C para Swift\n\n" +
            "• Migração de código Java para Kotlin em aplicativos Android\n\n" +
            "• Experimentos com desenvolvimento híbrido utilizando o SDK Flutter, do Google, na linguagem Dart\n\n" +
            "• Profundo conhecimento dos componentes do CocoaTouch e Android SDK\n\n" +
            "• Conhecimento do paradigma de Programação Funcional e uso de lambdas")

    val arq = Snippet("",
        "",
        "Domínio das arquiteturas atuais e das bibliotecas mais comuns para suas implantações",
        "• Experiência com MVC, MVP, VIP, Clean-Architecture\n\n" + "• Experiência com RxAndroid, Dagger2, Retrofit, Volley, Alamofire, Realm")

    val uiux = Snippet("",
        "",
        "Conhecimentos sólidos de UI/UX e regras de design Android/iOS",
        "• Conhecimento Human Interface Guidelines\n\n" +
            "• Conhecimento do Material Design\n\n" +
            "• Experiência com testes de interface Web/Mobile\n\n" +
            "• Adepto dos princípios do KISS (Keep-It-Simple)\n\n" +
            "• Experiência com teste e melhoria de desempenho em aplicativos")

    val agile = Snippet("",
        "",
        "Trabalho com Desenvolvimento Ágil utilizando versionamento de código",
        "• Prática com GitFlow em equipes de desenvolvimento\n\n" +
            "• Trabalho constante com projetos de inovação utilizando Scrum/XP\n\n" +
            "• Uso do Clean e suas boas práticas para facilitar mudanças de plano e adptações no produto em desenvolvimento")

    val tests = Snippet("",
        "",
        "Prática com todas as etapas de teste de software, experiência em Desenvolvimento Guiado por Testes (TDD) e por Comportamento (BDD). Conhecimento das bibliotecas e ferramentas relacionadas",
        "• TCC e pesquisas na área de teste de software\n\n" + "• Automatização de teste Web e Mobile")

    val apis = Snippet("",
        "",
        "Uso de APIs de autenticação, pagamentos, localização e com APIs que seguem o padrão REST",
        "• Stripe, PagSeguro, PayPal, Google APIs, Firebase, Apple Push-Notification Service")

    val pub = Snippet("",
        "",
        "Experiência em publicações de aplicativos na Play Store e App Store, bem como técnicas de integração contínua, publicação contínua e configuração de variações do mesmo projeto através de Flavors e Build Schemes",
        "• Travis, Jenkins, Docker, Fastlane, Analytics")

    val english = Snippet("",
        "",
        "Inglês avançado para leitura, escrita e conversação",
        "")

    val qa = Snippet("", "",
        "Prática em QA, organização de equipes de desenvolvimento guiado a testes e utilização de ferramentas de automatização no processo produtivo de aplicativos mobile e Web",
        "• Uso das linguagens Groovy e Gherkin\n\n" + "• Prática com Selenium, JUnit, Expresso, XCTest Framework")

    return arrayListOf(nativeDev, arq, uiux, agile, tests, apis, pub, english, qa)
  }
}
