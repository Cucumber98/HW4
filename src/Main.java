//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //1
        System.out.println("Задача 1");

        int age = 16;
        System.out.printf("Если возраст человека равен "+age+", то ");
        if (age>=18) {
            System.out.println("он совершеннолетний");
        }
        else {
            System.out.println("он несовершеннолетний, стоит немного подождать");
        }

    //2
        System.out.println("Задача 2");

        int temp = 4;
        System.out.printf("На улице "+temp+" градусов, ");
        if (temp>=5){
            System.out.println("сегодня тепло, можно без шапки");
        }
        else {
            System.out.println("сегодня холодно, не забудь шапку");
        }

    //3
        System.out.println("Задача 3");

        int speed = 45;
        System.out.printf("Если скорость "+speed+" км/ч ");
        if (speed>60){
            System.out.println("вы превысили, придется заплатить штраф");
        }
        else {
            System.out.println("все порядке, можно ехать спокойно");
        }
    //4
        System.out.println("Задача 4");

        int aGe = 18;
        System.out.printf("Если возраст человек равен "+aGe);
        if (aGe>=2&&aGe<=6) {
            System.out.println(" то ему нужно ходить в сад");
        }
        else if(aGe>=7&&aGe<=17) {
            System.out.println(" то ему нужно ходить в школу");
        }
        else if(aGe>=18&&aGe<=24) {
            System.out.println(" то его место в университете");
        }
        else if(aGe>24) {
            System.out.println(" то ему пора ходить на работу");
        }
    //5
        System.out.println("Задача 5");

        int kid = 4;
        System.out.printf("Если возраст ребенка равен "+kid+" то ему ");
        if (kid<5){
            System.out.println("нельзя кататься на атракционе");
        } else if (kid>=5&&kid<14){
            System.out.println("можно кататься на аттракционе в сопровождении взрослого");
        } else if (kid>=14) {
            System.out.println("можно кататься на аттракционебез сопровождения взрослого");
        }
    //6
        System.out.println("Задача 6");

        int sits = 62;
        System.out.printf("Если номер места в вагоне - "+sits);
        if (sits<=60){
            System.out.println(" ваше место сидячее");
        } else if (sits>60&&sits<=102) {
            System.out.println(" ваше место стоячее");
        } else {
                System.out.println(" нет мест в вагоне");
            }
    //7
        System.out.println("Задача 7");

        int one = 5;
        int two = 7;
        int three = 2;
        if (one==two&&one==three){
            System.out.println("Все числа равны");
        } else if (one>two&&one>three){
            System.out.println("Число one наибольшее");
        } else if (two>one&&two>three){
            System.out.println("Число two наибольшее");
        } else if (three>one&&three>two){
            System.out.println("Число three наибольшее");
        } else if (one==two&&one>three){
            System.out.println("Числа one и two равны и наибольшие");
        } else if (two==three&&two>one){
            System.out.println("Числа two и three равны и наибольшие");
        } else if (one==three&&one>two){
            System.out.println("Числа one и three равны и наибольшие");
        }

    }

}