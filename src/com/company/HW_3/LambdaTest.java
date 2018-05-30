package com.company.HW_3;

import javax.naming.ldap.SortKey;
import java.util.*;

interface Operationable {
    int calculate(int a, int b);
}

public class LambdaTest {
    public static final String[] peoples = new String[]{"Сидоров Мартын Михаилович", "Князев Авдей Кондратович", "Никитина Евдокия Геннадьевна", "Лаврентьева Светлана Станиславовна",
            "Колесников Авксентий Христофорович", "Симонова Валентина Руслановна", "Хохлов Вячеслав Игоревич", "Куликов Авдей Фролович", "Владимиров Еремей Васильевич", "Кулагина Алевтина Христофоровна", "Беляева Валентина Олеговна",
            "Симонова Елизавета Борисовна", "Филиппова София Геласьевна", "Прохорова Зоя Мэлсовна", "Панфилов Виталий Арсеньевич", "Савельева Марина Варламовна", "Осипов Мэлс Степанович", "Мамонтов Юрий Всеволодович",
            "Шубин Еремей Павлович", "Фокина Регина Агафоновна", "Бобылёв Агафон Германович", "Горбачёва Ксения Ильяовна", "Котов Валентин Федотович", "Титова Кира Анатольевна", "Куликов Ириней Мэлорович",
            "Сергеева Зоя Юрьевна", "Николаев Авксентий Ростиславович", "Комарова Валентина Пётровна", "Тихонов Федосей Егорович", "Горбунов Святослав Созонович", "Емельянов Лукьян Всеволодович", "Дьячкова Ульяна Иринеевна",
            "Фомина Ия Альвиановна", "Боброва Полина Всеволодовна", "Сергеева Зоя Авдеевна", "Богданова Иванна Валерьевна", "Петров Павел Мстиславович", "Шарапов Валентин Филатович", "Кириллов Юлиан Станиславович", "Воробьёва Фаина Пантелеймоновна",
            "Русаков Серапион Ильяович", "Фролов Константин Фролович", "Комиссарова Галина Аристарховна", "Красильникова Фаина Еремеевна", "Сорокин Митрофан Мстиславович", "Ершов Руслан Тихонович",
            "Котов Улеб Вячеславович", "Петров Лаврентий Тихонович", "Козлова Регина Созоновна"};

    public static void main(String[] args){
        ArrayList<String> person = new ArrayList<>(30);

        for (String people: peoples) {
            person.add(people);
        }

        System.out.println(person.size());

    }
}