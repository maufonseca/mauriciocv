package com.maufonseca.mauriciocv.infrastructure

import com.maufonseca.mauriciocv.model.Snippet

import java.util.ArrayList

object ComplementRequester {

  fun getComplement(): ArrayList<Snippet> {

    val kotlin = Snippet("Curso: Fundamentos de Programação Moderna com Kotlin/2018",
        "(udemy.com/curso-kotlin-pt)",
        "Aprendizado da linguagem Kotlin através de exemplos e exercícios com estruturas modernas de programação funcional",
        "• Funções top level\n" + "• Funcões como parâmetro\n" + "• Lambdas\n" + "• Generics\n" +
            "• Funções Inline\n")

    val web = Snippet("Curso: Web Moderno com JavaScript/2018",
        "(udemy.com/curso-web)",
        "Aborda o desenvolvimento Web de ponta a ponta com  Javascript, Node, HTML, CSS, Gulp, Webpack, jQuery, Bootstrap, React, VueJS, ExpressJS, MySQL e MongoDB",
        "")

    val google = Snippet("Google Cloud OnBoard SP/2018",
        "(cloud.google.com/training)",
        "Treinamento sobre o uso das ferramentas do Google Cloud ministrado por instrutores do Google",
        "Treinamento presencial com duração de um dia e execução de laboratórios práticos na Google Cloud Platform abrangendo: " + "computação em nuvem, armazenamento em nuvem, Kubernetes, big data, machine learning, Speech API e visão computacional")

    val devConf = Snippet("DevConf 2018",
        "(devconf.opensanca.com.br)",
        "Evento com palestras sobre desenvolvimento de software ocorrido em São Carlos/SP",
        "Entre os assuntos abordados pelos palestrantes estavam: computação distribuída, Clean-Code, sistemas resilientes, tolerância a falhas, criação de chatbots")

    val army = Snippet("Serviço Militar Obrigatório - 2006",
        "Exercito Brasileiro - Botucatu/SP",
        "Atividades de liderança em campanhas sociais",
        "• Organização de campanhas sociais municipais (agasalho, remédios, alimentos)\n" +
            "• Aplicação de instruções aos soldados e população sobre assuntos variados\n" +
            "• Comando de Pelotão e Porta-Bandeira do Brasil\n" +
            "• Certificação militar de Honra ao Mérito\n" +
            "• Promoção a Cabo do Exército")

    return arrayListOf(kotlin, web, google, devConf, army)
  }

}
