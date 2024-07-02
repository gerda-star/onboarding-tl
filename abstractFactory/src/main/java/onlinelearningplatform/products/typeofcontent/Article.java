package onlinelearningplatform.products.typeofcontent;

import onlinelearningplatform.Reader;

public class Article implements IArticle {
    protected String title;

    public Article() {
        enterTitle();
    }

    public void enterTitle() {
        System.out.println("Введи название статьи: ");
        this.title = Reader.scan.nextLine();
    }

    @Override
    public void publishArticle() {
        System.out.println("Успех!"
                +"\n Вы опубликовали статью" +  this.title);
    }

    @Override
    public void openArticle() {
        System.out.println("Тут открылась статья '" + title + "'");
    }

    @Override
    public void showBriefReport() {
        System.out.println("Тут будет краткий коспект статьи");
    }

    @Override
    public void chooseAct() {
        System.out.println("Доступные действия: опубликовать, открыть, краткий перессказ");
        String action = Reader.scan.nextLine().toLowerCase();
        switch (action) {
            case "опубликовать":
                this.publishArticle();
                break;
            case "открыть":
                this.openArticle();
                break;
            case "краткий перессказ":
                this.showBriefReport();
                break;
            default:
                System.out.println("- Такой возможносити пока нет -");
        }
    }

}
