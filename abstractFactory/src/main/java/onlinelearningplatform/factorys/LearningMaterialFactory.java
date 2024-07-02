package onlinelearningplatform.factorys;

import onlinelearningplatform.products.typeofcontent.IArticle;
import onlinelearningplatform.products.typeofcontent.Quiz;
import onlinelearningplatform.products.typeofcontent.Video;

import java.util.List;

public interface LearningMaterialFactory {

    public List<String> availableProducts = List.of("Видео", "Статья", "Тест");

    Video createVideo();

    IArticle createArticle();

    Quiz createQuiz();

}
