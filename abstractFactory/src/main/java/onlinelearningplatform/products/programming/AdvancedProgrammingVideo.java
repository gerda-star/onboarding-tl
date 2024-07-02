package onlinelearningplatform.products.programming;

import onlinelearningplatform.products.typeofcontent.Video;

public class AdvancedProgrammingVideo extends Video {

    public AdvancedProgrammingVideo() {
    }

    @Override
    public void uploadVideo() {
        System.out.println("Успех!"
                + "\n Вы загрузили видео-рассуждение о продвинутом программировании");
    }

    @Override
    public void playVideo() {
        System.out.println("Пуск! Вы смотрите видео о продвинутом программировании и вдохновляетесь");
    }

}
