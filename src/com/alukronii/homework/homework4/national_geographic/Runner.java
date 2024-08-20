package com.alukronii.homework.homework4.national_geographic;

import com.alukronii.homework.homework4.national_geographic.alive.DeadException;
import com.alukronii.homework.homework4.national_geographic.alive.herbivorous.Elephant;
import com.alukronii.homework.homework4.national_geographic.alive.herbivorous.Rabbit;
import com.alukronii.homework.homework4.national_geographic.alive.predator.Tiger;
import com.alukronii.homework.homework4.national_geographic.alive.predator.Wolf;

public class Runner {
    public static void main(String[] args) {
        Tiger tiger = new Tiger(300);
        Wolf wolf = new Wolf(50);
        Rabbit rabbit = new Rabbit(2);
        Elephant elephant = new Elephant(2000);

        try {
            rabbit.toRun();
            System.out.println("Кролик все еще живой, бежит по травке на встречу к волку.");
        } catch (DeadException e) {
            System.out.println(e.getMessage());
        }

        try {
            wolf.toAttack(rabbit);
            System.out.println("Волк встретил кролика и съел его из личных интересов. Теперь кролик мертв, а вес волка теперь равен " + wolf.getWeight());
        } catch (DeadException e) {
            System.out.println(e.getMessage());
        }

        try {
            tiger.toAttack(wolf);
            System.out.println("Волк потерял бдительность и попался в лапы тигра, который его в последствии его и съел. Вес тигра теперь равен " + tiger.getWeight());
        } catch (DeadException e) {
            System.out.println(e.getMessage());
        }

        try {
            tiger.toAttack(elephant);
        } catch (DeadException e) {
            System.out.println(e.getMessage());
        }

        try {
            elephant.toRun();
            System.out.println("Тигр вошел во вкус и решил атаковать слона. Бой был не равным и тигр погиб в этом сражении. Слон успешно покидает поле битвы.");
        } catch (DeadException e) {
            System.out.println(e.getMessage());
        }

        try {
            rabbit.toRun();
        } catch (DeadException e) {
            System.out.println(e.getMessage() + " Кролик съеден и поэтому не может бежать.");
        }
    }
}
