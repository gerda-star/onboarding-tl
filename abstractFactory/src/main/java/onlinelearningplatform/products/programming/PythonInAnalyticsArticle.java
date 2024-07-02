package onlinelearningplatform.products.programming;

import onlinelearningplatform.products.typeofcontent.Article;

public class PythonInAnalyticsArticle extends Article {

    public PythonInAnalyticsArticle() {
        super();
    }

    @Override
    public void publishArticle() {
        System.out.println("Успех!"
                + "\n Вы опубликовали статью про анализ данных с ипользлванием пайтон: " + super.title);
    }

    @Override
    public void showBriefReport() {
        System.out.println("В кратце - сконвертирую мого циферок в красивые визулизации");
    }

}