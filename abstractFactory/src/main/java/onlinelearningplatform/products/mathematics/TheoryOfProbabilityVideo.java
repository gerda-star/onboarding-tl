package onlinelearningplatform.products.mathematics;

import onlinelearningplatform.products.typeofcontent.Video;

public class TheoryOfProbabilityVideo extends Video {

    public TheoryOfProbabilityVideo() {
    }

    @Override
    public void uploadVideo() {
        System.out.println("Успех!"
                + "\n Видео-лекция по теории вероятностей успешно загружена на платформу");
    }

    @Override
    public void playVideo() {
        System.out.println("*** Свет, музыка, казино ***");
        System.out.println("Это мы учимся теории вероятностей по видео");
        System.out.println("Хотя такое лучше на практике...");
    }

    @Override
    public void convertVideoToText() {
        System.out.println("Перессказ видео: Вероятность выйгрыша крайне мала");
    }

}
