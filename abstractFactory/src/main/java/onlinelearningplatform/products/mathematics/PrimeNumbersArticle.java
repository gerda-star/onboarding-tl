package onlinelearningplatform.products.mathematics;

import onlinelearningplatform.products.typeofcontent.Article;

public class PrimeNumbersArticle extends Article {

    public PrimeNumbersArticle() {
        super();
    }

    @Override
    public void publishArticle() {
        System.out.println("Успех!"
                + "\n Вы опубликовали статью о простых числах: " + super.title);
    }

}
