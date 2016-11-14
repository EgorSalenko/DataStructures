package org.esalenko.designpatterns.builder;

public class EnterpriseWebsiteBuilder extends WebSiteBuilder {
    @Override
    void buildName() {
        webSite.setName("Enterprise web site");
    }

    @Override
    void buildCms() {
        webSite.setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildPrice() {
        webSite.setPrice(10000);
    }
}
