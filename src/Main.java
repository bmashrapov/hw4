import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        int age = 7;
        if (age >= 18) {
            System.out.println("Поздравляю с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Совершеннолетие ещё не наступило, подожди немного");
        }
        //Задание 2
        int personsAge = 7;
        if (personsAge >= 7 && personsAge < 18) {
            System.out.println("Ребёнок ходит в школу");
        }
        if (personsAge >= 18 && personsAge < 24) {
            System.out.println("Человек закончил школу и должен пойти в университет");
        }
        if (personsAge >= 24) {
            System.out.println("Человек должен найти работу");
        }
        //Задание 3
        int capacity = 102;
        int seatPlace = 60;
        int standingPlace = capacity - seatPlace;
        int usedSeatPlace = 61;
        int usedStandingPlace = 40;
        if (usedStandingPlace < standingPlace) {
            System.out.println("В вагоне еще " + (standingPlace - usedStandingPlace) + " стоячих мест");
        }
        if (usedSeatPlace < seatPlace) {
            System.out.println("В вагоне еще " + (seatPlace - usedSeatPlace) + " сидячих мест");
        }
        if (usedStandingPlace >= standingPlace) {
            System.out.println("Нет стоячих мест");}
        if (usedSeatPlace >= seatPlace) {
            System.out.println("Нет сидячих мест");
            }
        //Задание 4
        int age1 = 7;
        if (age1 >= 18) {
            System.out.println("Поздравляю с совершеннолетием!");}
       else {System.out.println("Совершеннолетие ещё не наступило, подожди немного");
        }
        //Задание 5
        int personsAge1 = 7;
        if (personsAge1 >= 7 && personsAge1 < 18) {
            System.out.println("Ребёнок ходит в школу");
        }
        else if (personsAge1 >= 18 && personsAge1 < 24) {
            System.out.println("Человек закончил школу и должен пойти в университет");
        }
       else{System.out.println("Человек должен найти работу");
        }
        //Задание 6
        int capacity1 = 102;
        int seatPlace1 = 60;
        int standingPlace1 = capacity1 - seatPlace1;
        int usedSeatPlace1 = 61;
        int usedStandingPlace1 = 40;
        if (usedStandingPlace1 < standingPlace1) {
            System.out.println("В вагоне еще " + (standingPlace1 - usedStandingPlace1) + " стоячих мест");
        }
        else {System.out.println("Нет стоячих мест");}
        if (usedSeatPlace1 < seatPlace1) {System.out.println("В вагоне еще " + (seatPlace - usedSeatPlace) + " сидячих мест");
        }
        else {System.out.println("Нет сидячих мест");
        }
        //Задание 7
    int age2 = 26;
        if (age2 > 2 && age2 <= 6) {
            System.out.println ("Если возраст человека равен " + age2 + " то ему нужно ходить в детский сад");}
        else if (age2 >= 7 && age2 < 18) {
            System.out.println("Если возраст человека равен " + age2 + " то ему нужно ходить в школу");}
        else if (age2 >= 18 && age2 < 24) {
            System.out.println("Если возраст человека равен " + age2 + " то ему нужно ходить в университет");}
        else {
            System.out.println( "Если возраст человека равен " + age2 + " то ему нужно ходить на работу");}
        //Задание 8
        int age3 = 14;
        if (age3 < 5){
            System.out.println("Тебе еще нельзя кататься на аттракционе, ведь тебе всего " + age3 + " лет");}
        else if ( age3 >= 5 && age3 < 14) {
            System.out.println("Тебе можно кататься только со взрослыми");}
        else {
            System.out.println("Тебе можно кататься!");}
        //Задание 9
        int one = 2;
        int two = 3;
        int three = 1;
        if (one > two) {
            if (one >= three) {
                System.out.println("Максимальное число - " + one);
            } else {
                System.out.println("Максимальное число - " + three);
            }
        }
        else if ( two > one) {
            if (two >= three) {
                System.out.println("Максимальное число " + two);
            } else {
                System.out.println("Максимальное число " + three);
            }
        } else {
             if (one > three) {
                 System.out.println("Максимальное число " + one);}
             else if (three > one) {
                 System.out.println("Максимальное число " + three);}
             else  {
                 System.out.println("Все 3 числа равны");}
             }
            }
            }





