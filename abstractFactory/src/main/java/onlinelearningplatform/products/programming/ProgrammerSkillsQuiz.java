package onlinelearningplatform.products.programming;

import onlinelearningplatform.products.typeofcontent.Quiz;

public class ProgrammerSkillsQuiz extends Quiz {

    public ProgrammerSkillsQuiz() {
    }

    @Override
    public void runQuiz() {
        super.runQuiz();
        System.out.println("и юзер такой 'клик, клик - как я хорош, да я не джун, я прям сеньер ╰(*︶*)╯'");
    }

    @Override
    public void showResults() {
        System.out.println("Результаты теста по навыкам программирования: еще есть над чем работать!");
    }

}
