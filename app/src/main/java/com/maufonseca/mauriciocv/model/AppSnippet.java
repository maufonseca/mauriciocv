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
}
