package onlinelearningplatform.products.typeofcontent;

import onlinelearningplatform.Reader;

public class Video implements IVideo{
    public Video() {

    }

    @Override
    public void uploadVideo() {
        System.out.println("Успех!"
                +"\n Видео-лекция загружена на платформу");
    }

    @Override
    public void playVideo() {
        System.out.println("Воспроизводим видео");
    }

    @Override
    public void convertVideoToText() {
        System.out.println("Наша ИИ конвертирует текст из видео. Результат будет отправлен на ваш e-mail ");
    }

    public void chooseAct() {
        System.out.println("Доступные действия c видео: загрузить, запустить, преобразовать в текст");
        String action = Reader.scan.nextLine().toLowerCase();
        switch (action) {
            case "загрузить":
                this.uploadVideo();
                break;
            case "запустить":
                this.playVideo();
                break;
            case "преобразовать в текст":
                this.convertVideoToText();
                break;
            default:
                System.out.println("- Такой возможносити пока нет -");
        }
    }
}
