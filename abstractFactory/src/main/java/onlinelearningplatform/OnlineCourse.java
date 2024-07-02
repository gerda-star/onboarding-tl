package onlinelearningplatform;

import onlinelearningplatform.factorys.ILearningMaterialFactory;
import onlinelearningplatform.factorys.MathematicsCourseFactory;
import onlinelearningplatform.factorys.ProgrammingCourseFactory;

public class OnlineCourse {
    ILearningMaterialFactory factory;
    boolean isStop = false;

    public OnlineCourse() {
        act();
    }

    public void act() {
        while (!isStop) {
            factory = chooseFactory();
            factory.chooseProduct();
        }
    }

    public ILearningMaterialFactory chooseFactory() {
        System.out.println("********************"
                + "\nДобро пожаловать на онлайн-платформу!"
                + "\nВыбирай направление: математика, программирование"
                + "\nПокинуть платформу: введи 0");
        String choice = Reader.scan.nextLine().toLowerCase();

        switch (choice) {
            case "математика":
                System.out.println("==== Выбрана математика ====");
                factory = new MathematicsCourseFactory();
                break;
            case "программирование":
                System.out.println("==== Выбрано программирование ====");
                factory = new ProgrammingCourseFactory();
                break;
            case "0":
                System.out.println("==== Пока-пока ====");
                System.exit(0);
            default:
                System.out.println("- Направление пока недоступно, мы над этим работаем -");
                System.out.println("====== Пока предлагаем подтянуть математику ======");
                factory = new MathematicsCourseFactory();
        }
        return factory;
    }

}
