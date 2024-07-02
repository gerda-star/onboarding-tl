package onlinelearningplatform.factorys;

import onlinelearningplatform.Reader;
import onlinelearningplatform.products.mathematics.BasicMathQuiz;
import onlinelearningplatform.products.mathematics.PrimeNumbersArticle;
import onlinelearningplatform.products.mathematics.TheoryOfProbabilityVideo;
import onlinelearningplatform.products.typeofcontent.Article;
import onlinelearningplatform.products.typeofcontent.IVideo;
import onlinelearningplatform.products.typeofcontent.Quiz;


public class MathematicsCourseFactory implements ILearningMaterialFactory {
    IVideo video;
    Quiz quiz;
    Article article;

    public MathematicsCourseFactory() {
    }

    @Override
    public void createVideo() {
        this.video = new TheoryOfProbabilityVideo();
        this.video.chooseAct();
    }

    @Override
    public void createArticle() {
        this.article = new PrimeNumbersArticle();
        this.article.chooseAct();
    }

    @Override
    public void createQuiz() {
        this.quiz = new BasicMathQuiz();
        this.quiz.chooseAct();
    }

    @Override
    public void chooseProduct() {
        System.out.println("***********" +
                "\nВыбираем продукт:");
        for (String product : availableProducts) {
            System.out.println("- " + product);
        }
        String choice = Reader.scan.nextLine().toLowerCase();
        switch (choice) {
            case "видео":
                System.out.println("==== Поработаем с видео ====");
                this.createVideo();
                break;
            case "статья":
                System.out.println("==== Поработаем со статьями ====");
                this.createArticle();
                break;
            case "тест":
                System.out.println("==== Поработаем с тестами ====");
                this.createQuiz();
                break;
            default:
                System.out.println("Такого продукта неть");
        }
    }

}



