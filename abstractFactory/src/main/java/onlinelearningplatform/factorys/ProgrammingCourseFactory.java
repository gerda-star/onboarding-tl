package onlinelearningplatform.factorys;

import onlinelearningplatform.Reader;
import onlinelearningplatform.products.programming.AdvancedProgrammingVideo;
import onlinelearningplatform.products.programming.ProgrammerSkillsQuiz;
import onlinelearningplatform.products.programming.PythonInAnalyticsArticle;
import onlinelearningplatform.products.typeofcontent.IArticle;
import onlinelearningplatform.products.typeofcontent.IQuiz;
import onlinelearningplatform.products.typeofcontent.IVideo;

public class ProgrammingCourseFactory implements ILearningMaterialFactory {

    IVideo video;
    IArticle article;
    IQuiz quiz;

    public ProgrammingCourseFactory() {
    }

    @Override
    public void createVideo() {
        this.video = new AdvancedProgrammingVideo();
        this.video.chooseAct();
    }

    @Override
    public void createArticle() {
        this.article = new PythonInAnalyticsArticle();
        this.article.chooseAct();
    }

    @Override
    public void createQuiz() {
        this.quiz = new ProgrammerSkillsQuiz();
        this.quiz.chooseAct();
    }

    @Override
    public void chooseProduct() {
        System.out.println("***********"
                + "\nВыбираем продукт:");
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
                System.out.println("- Такого продукта неть");
        }
    }
}
