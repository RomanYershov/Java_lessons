package com.company.HW_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/*public class HW3_Lambda {
    public static final String[] peoples = new String[]{"Сидоров Мартын Михаилович", "Князев Авдей Кондратович", "Никитина Евдокия Геннадьевна", "Лаврентьева Светлана Станиславовна",
            "Колесников Авксентий Христофорович", "Симонова Валентина Руслановна", "Хохлов Вячеслав Игоревич", "Куликов Авдей Фролович", "Владимиров Еремей Васильевич", "Кулагина Алевтина Христофоровна", "Беляева Валентина Олеговна",
            "Симонова Елизавета Борисовна", "Филиппова София Геласьевна", "Прохорова Зоя Мэлсовна", "Панфилов Виталий Арсеньевич", "Савельева Марина Варламовна", "Осипов Мэлс Степанович", "Мамонтов Юрий Всеволодович",
            "Шубин Еремей Павлович", "Фокина Регина Агафоновна", "Бобылёв Агафон Германович", "Горбачёва Ксения Ильяовна", "Котов Валентин Федотович", "Титова Кира Анатольевна", "Куликов Ириней Мэлорович",
            "Сергеева Зоя Юрьевна", "Николаев Авксентий Ростиславович", "Комарова Валентина Пётровна", "Тихонов Федосей Егорович", "Горбунов Святослав Созонович", "Емельянов Лукьян Всеволодович", "Дьячкова Ульяна Иринеевна",
            "Фомина Ия Альвиановна", "Боброва Полина Всеволодовна", "Сергеева Зоя Авдеевна", "Богданова Иванна Валерьевна", "Петров Павел Мстиславович", "Шарапов Валентин Филатович", "Кириллов Юлиан Станиславович", "Воробьёва Фаина Пантелеймоновна",
            "Русаков Серапион Ильяович", "Фролов Константин Фролович", "Комиссарова Галина Аристарховна", "Красильникова Фаина Еремеевна", "Сорокин Митрофан Мстиславович", "Ершов Руслан Тихонович",
            "Котов Улеб Вячеславович", "Петров Лаврентий Тихонович", "Козлова Регина Созоновна"};


    public static void main(String[] args) {
        Sorted2 sorted2 = new Sorted2() {
            @Override
            public void sortedByLastName(String[] peoples) {
                Arrays.sort(peoples, ((o1, o2) -> o1.split(" ")[0].compareTo(o2.split(" ")[0]) == 0 ?
                        o1.split(" ")[1].compareTo(o2.split(" ")[1])
                        : o1.split(" ")[0].compareTo(o2.split(" ")[0])));
            }

            @Override
            public void sortedByFirstName(String[] peoples) {
                Arrays.sort(peoples, ((o1, o2) -> o1.split(" ")[1].compareTo(o2.split(" ")[1]) == 0 ?
                        o1.split(" ")[2].compareTo(o2.split(" ")[2])
                        : o1.split(" ")[1].compareTo(o2.split(" ")[1])));
            }
        };

        Sorted sorted = (String[] peoples) -> {
            Arrays.sort(peoples, ((o1, o2) -> o1.split(" ")[0].compareTo(o2.split(" ")[0]) == 0 ?
                    o1.split(" ")[1].compareTo(o2.split(" ")[1])
                    : o1.split(" ")[0].compareTo(o2.split(" ")[0])));
        };


       *//* sorted2.sortedByLastName(peoples);
        sorted2.print(peoples);
        sorted2.sortedByFirstName(peoples);
        sorted2.print(peoples);*//*

     *//*   sorted.sortedByLastName(peoples);
        sorted.print(peoples);*//*
    }


};


interface Sorted2 {
    void sortedByLastName(String[] peoples);

    void sortedByFirstName(String[] peoples);

    default void print(String[] peoples) {
        for (String people : peoples) {
            System.out.println(people);
        }
        System.out.println("_____________________________");
    }
}

interface Sorted {
    void sortedByLastName(String[] peoples);

    default void print(String[] peoples) {
        for (String people : peoples) {
            System.out.println(people);
        }
    }
}*/

public class HW3_Lambda {
    public static void main(String[] args) {

        Ihw abstr = new Ihw() {

            public void exercise1(List<String> peoples) {
                Collections.sort(peoples, ((o1, o2) -> o1.split(" ")[0].compareTo(o2.split(" ")[0]) == 0 ?
                        o1.split(" ")[1].compareTo(o2.split(" ")[1])
                        : o1.split(" ")[0].compareTo(o2.split(" ")[0])));
                peoples.forEach(System.out::println);
            }


            public void exercise2(List<String> peoples) {
                Collections.sort(peoples, (o1, o2) -> o1.substring(o1.indexOf(" ")+1, o1.indexOf(" ",o1.indexOf(" ")+1)).compareTo(o2.substring(o2.indexOf(" ")+1, o2.indexOf(" ",o2.indexOf(" ")+1))));
                peoples.forEach(System.out::println);
            }

            public void exercise3(List<String> peoples) {
                peoples.sort(this::sortByName);
                peoples.sort(String::compareTo);
            }

            public int sortByName(String person, String anotherPerson)
            {
                return person.substring(person.indexOf(" ")+1, person.indexOf(" ",person.indexOf(" ")+1)).compareTo(anotherPerson.substring(anotherPerson.indexOf(" ")+1, anotherPerson.indexOf(" ",anotherPerson.indexOf(" ")+1)));
            }
        };

        abstr.exercise1(Arrays.asList(peoples));
    }




    public static final String[] peoples = new String[]{"Сидоров Мартын Михаилович", "Князев Авдей Кондратович", "Никитина Евдокия Геннадьевна", "Лаврентьева Светлана Станиславовна",
            "Колесников Авксентий Христофорович", "Симонова Валентина Руслановна", "Хохлов Вячеслав Игоревич", "Куликов Авдей Фролович", "Владимиров Еремей Васильевич", "Кулагина Алевтина Христофоровна", "Беляева Валентина Олеговна",
            "Симонова Елизавета Борисовна", "Филиппова София Геласьевна", "Прохорова Зоя Мэлсовна", "Панфилов Виталий Арсеньевич", "Савельева Марина Варламовна", "Осипов Мэлс Степанович", "Мамонтов Юрий Всеволодович",
            "Шубин Еремей Павлович", "Фокина Регина Агафоновна", "Бобылёв Агафон Германович", "Горбачёва Ксения Ильяовна", "Котов Валентин Федотович", "Титова Кира Анатольевна", "Куликов Ириней Мэлорович",
            "Сергеева Зоя Юрьевна", "Николаев Авксентий Ростиславович", "Комарова Валентина Пётровна", "Тихонов Федосей Егорович", "Горбунов Святослав Созонович", "Емельянов Лукьян Всеволодович", "Дьячкова Ульяна Иринеевна",
            "Фомина Ия Альвиановна", "Боброва Полина Всеволодовна", "Сергеева Зоя Авдеевна", "Богданова Иванна Валерьевна", "Петров Павел Мстиславович", "Шарапов Валентин Филатович", "Кириллов Юлиан Станиславович", "Воробьёва Фаина Пантелеймоновна",
            "Русаков Серапион Ильяович", "Фролов Константин Фролович", "Комиссарова Галина Аристарховна", "Красильникова Фаина Еремеевна", "Сорокин Митрофан Мстиславович", "Ершов Руслан Тихонович",
            "Котов Улеб Вячеславович", "Петров Лаврентий Тихонович", "Козлова Регина Созоновна"};
}

interface Ihw
{
    void exercise1(List<String> peoples);
    void exercise2(List<String> peoples);
    void exercise3(List<String> peoples);
    int sortByName(String person, String anotherPerson);
}