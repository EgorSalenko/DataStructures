package org.esalenko.designpatterns.builder;

public class BuildWebSiteRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new EnterpriseWebsiteBuilder());
        WebSite webSite = director.buildWebSite();

        System.out.println(webSite);
    }
}
