package onlinelearningplatform.factorys;

import java.util.List;

public interface ILearningMaterialFactory {

    List<String> availableProducts = List.of("Видео", "Статья", "Тест");

    void createVideo();

    void createArticle();

    void createQuiz();

    void chooseProduct();

}
