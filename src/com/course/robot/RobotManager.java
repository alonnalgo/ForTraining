package robot;

import javax.swing.*;

public class RobotManager {
    public static void main(String[] args) {

        Robot[] rbts = new Robot[10];

        // Обратите внимание на запись rbts.length - это свойство
        // (неизменяемое) возращает размер массива
        for (int i = 0; i < rbts.length; i++) {
            // Создаем объект типа Robot
            rbts[i] = new Robot(i * 10, i * 10);
        }

        // Еще один цикл, который вызывает печать координат у каждого робота
        for (int i = 0; i < rbts.length; i++) {
            rbts[i].printCoordinates();
        }
    }
}
