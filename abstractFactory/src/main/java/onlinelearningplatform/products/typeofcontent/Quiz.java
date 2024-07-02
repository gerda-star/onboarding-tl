package onlinelearningplatform.products.typeofcontent;

import onlinelearningplatform.Reader;

public class Quiz implements IQuiz {
    protected String topic;
    protected int count;

    public Quiz() {
    }

    @Override
    public void createQuiz() {
        describeQuiz();
        addQuestions();
        System.out.println("Создан тест: " + topic);
        System.out.println("В тесте " + count + " вопросов");
    }

    @Override
    public void runQuiz() {
        System.out.println("Тут должен открыться тест");
        System.out.println("*** " + "Вопрос про это" + " ***");
        System.out.println("*** " + "Вопрос про то" + " ***");
    }

    @Override
    public void showResults() {
        System.out.println("Тут будут показаны результаты теста");
    }
    @Override
    public void describeQuiz() {
        System.out.println("как будет называться тест?");
        this.topic = Reader.scan.nextLine();
    }
    @Override
    public void addQuestions() {
        System.out.println("Сколько добавим вопросов?");
        try {
            this.count = Integer.parseInt(Reader.scan.nextLine().toLowerCase());
        } catch (NumberFormatException e) {
            System.out.println("Неожиаднное кол-во вопросов, пусть будет 10");
            this.count = 10;
        }
    }

    @Override
    public void chooseAct() {
        System.out.println("Доступные действия: создать, пройти, показать результаты");
        String action = Reader.scan.nextLine().toLowerCase();
        switch (action) {
            case "создать":
                this.createQuiz();
                break;
            case "пройти":
                this.runQuiz();
                break;
            case "показать результаты":
                this.showResults();
                break;
            default:
                System.out.println("- Такой возможносити пока нет -");
        }
    }
}
