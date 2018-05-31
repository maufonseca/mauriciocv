package com.maufonseca.mauriciocv.model;

import java.util.ArrayList;

public class AppSnippet extends Snippet {
  private String urlAndroid, urliOS;
  private boolean androidApp, iosApp, webApp;
  public AppSnippet(String title,
                    String subtitle,
                    String shortDescription,
                    String longDescription,
                    String urlAndroid,
                    String urliOS,
                    boolean androidApp,
                    boolean iosApp,
                    boolean webApp) {
    super(title, subtitle, shortDescription, longDescription);
    this.androidApp = androidApp;
    this.iosApp = iosApp;
    this.webApp = webApp;
    this.urlAndroid = urlAndroid;
    this.urliOS = urliOS;
  }

  public String getUrlAndroid() {
    return urlAndroid;
  }
  public String getUrliOS() {
    return urliOS;
  }

  public String getHtmlUrlAndroid() {
    return "<a href=\"" + urlAndroid + "\">Ver na Play Store</a>";
  }
  public String getHtmlUrliOS() {
    return "<a href=\"" + urliOS + "\">Ver na iTunes Store</a>";
  }

  public void setUrlAndroid(String url) {
    this.urlAndroid = url;
  }
  public void setUrliOS(String url) {
    this.urliOS = url;
  }

  public boolean isAndroidApp() {
    return androidApp;
  }

  public void setAndroidApp(boolean androidApp) {
    this.androidApp = androidApp;
  }

  public boolean isIosApp() {
    return iosApp;
  }

  public void setIosApp(boolean iosApp) {
    this.iosApp = iosApp;
  }

  public boolean isWebApp() {
    return webApp;
  }

  public void setWebApp(boolean webApp) {
    this.webApp = webApp;
  }

  public static ArrayList<AppSnippet> getApps() {
    ArrayList<AppSnippet> apps = new ArrayList<>();

    AppSnippet cedim = new AppSnippet("CEDIMTech",
      "Tempo de trabalho no aplicativo: 5 meses",
      "Este aplicativo foi feito para uma clínica de radiologia veterinária " +
        "e serve para que os donos dos animais ou veterinários responsáveis " +
        "consigam visualizar laudos e imagens de Raio-X publicados pela clínica. No" +
        "desenvolvimento utilizou-se Arquitetura Clean com chamadas à API pela biblioteca Retrofit(Android) e Moya (iOS).",
      "",
      "https://play.google.com/store/apps/details?id=br.com.ringa.cedimtech",
      "https://itunes.apple.com/us/app/cedimtech/id1353133156?mt=8",
      true,
      true,
      false);
    apps.add(cedim);

    AppSnippet whatsgood = new AppSnippet("WhatsGood Marketplace",
      "Tempo de trabalho no aplicativo: 1 ano e 2 meses",
      "Este é um aplicativo que visa facilitar a compra e venda " +
        "de produtos agrícolas entre fazendeiros, mercadores e consumidores " +
        "finais. É um marketplace lançado nos Estados Unidos que possui algumas " +
        "variações (Flavors) para regiões específicas do país, por exemplo, uma " +
        "versão do App funciona apenas na região de Nova Iorque. Além disso, utiliza chamadas REST, " +
        "Clean Architecture, armazenamento de dados, geolocalização, tratamento de imagens, " +
        "gerenciamento de pagamentos pela plataforma Stripe, notificações por push e RxAndroid.",
      "",
      "https://play.google.com/store/apps/details?id=br.com.ringa.whatsgood",
      "https://itunes.apple.com/us/app/whatsgood-marketplace/id1005581267",
      true,
      true,
      false);
    apps.add(whatsgood);

    AppSnippet queima = new AppSnippet("Queima Diária",
      "Tempo de trabalho no aplicativo: 6 meses",
      "Este aplicativo exibe videoaulas de exercícios a seus usuários. É necessária " +
        "a compra de pacotes de aulas para visualizar os vídeos. Os vídeos são salvos " +
        "no dispositivo após passarem por um processo de criptografia AES para " +
        "que não possam ser divulgados fora do aplicativo.",
      "",
      "https://play.google.com/store/apps/details?id=com.queimadiaria",
      "",
      true,
      false,
      false);
    apps.add(queima);

    AppSnippet whego = new AppSnippet("Whego",
      "Tempo de trabalho no aplicativo: 6 meses",
      "Este aplicativo serve para que o usuário encontre restaurantes e bares " +
        "movimentados ao seu redor. Utiliza a API do Google Places e sistema de " +
        "localização do dispositivo para encontrar locais de interesse próximos.",
      "",
      "https://play.google.com/store/apps/details?id=br.com.ringa.whego",
      "",
      true,
      false,
      false);
    apps.add(whego);

    AppSnippet mercadao = new AppSnippet("Mercadão",
      "Tempo de trabalho no aplicativo: 6 meses",
      "Mercadão é um aplicativo de compra, troca, e doação de itens usados. " +
        "Mesmo estando ainda funcional, essa Startup não deu sequência ao seu " +
        "projeto e a API não está mais em funcionamento, impossibilitando a " +
        "utilização. Ele ainda pode ser baixado no Google Play. Utilizou-se no " +
        "projeto: localização, push notifications, login com redes sociais e gerenciamento de pagamentos " +
        "pela plataforma PagSeguro.",
      "",
      "https://play.google.com/store/apps/details?id=br.com.ringa.mercadao",
      "",
      true,
      false,
      false);
    apps.add(mercadao);

    AppSnippet delivve = new AppSnippet("Delivve",
      "Tempo de trabalho no aplicativo: 6 meses",
      "Este aplicativo serve para combinar a entrega de encomendas entre " +
        "motoristas e remetentes. Utiliza chamadas a uma API REST e localização " +
        "para traçar rotas de entrega e casar possíveis entregas.",
      "",
      "",
      "https://itunes.apple.com/br/app/delivve/id1124146353",
      false,
      true,
      false);
    apps.add(delivve);

    AppSnippet miss = new AppSnippet("MissTess",
      "Tempo de trabalho no aplicativo: 6 meses",
      "Este aplicativo é uma rede social relacionada a beleza e moda. Seus " +
        "usuários podem publicar fotos e vídeos utilizando roupas e produtos de " +
        "beleza em geral. Além disso é possível cadastrar-se como um " +
        "profissional de beleza e conversar com seus clientes marcando horários " +
        "ou divulgando um salão de beleza.",
      "",
      "",
      "https://itunes.apple.com/br/app/miss-tess/id970424477?mt=8",
      false,
      true,
      false);
    apps.add(miss);

    return apps;
  }
}
