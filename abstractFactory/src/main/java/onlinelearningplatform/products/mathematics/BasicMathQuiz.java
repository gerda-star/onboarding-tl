package onlinelearningplatform.products.mathematics;

import onlinelearningplatform.Reader;
import onlinelearningplatform.products.typeofcontent.Quiz;


public class BasicMathQuiz extends Quiz {

    public BasicMathQuiz() {
    }

    @Override
    public void createQuiz() {
        super.describeQuiz();
        super.addQuestions();
        System.out.println("Создан тест по азам математики на тему: " + super.topic);
        System.out.println("В тесте " + super.count + " вопросов");
    }

    @Override
    public void runQuiz() {
        super.runQuiz();
        System.out.println("и юзер такой 'тык-тык-тык', как я хорош, может пойти учиться на прикладной математике?");
    }

    @Override
    public void showResults() {
        System.out.println("Результаты теста по азам математики: Впечатляюще!");
    }

    @Override
    public void describeQuiz() {
        System.out.println("Для какого раздела математики будет тест?");
        super.topic = Reader.scan.nextLine();

    }


}



