package org.example;


public class Main {
    public static void main(String[] args) {
        User user = new User();// создание пользователя
        user.setUserLocation(new Location(228,1337));// присваивание полю пользователя новой локации
        System.out.println(user); // вывод всей информации о пользователу
        AlarmApi alarmApi = new AlarmApi();// создание объекта AlarmApi
        user.sendLocation(alarmApi);// отправка локации юзера на AlarmApi
        alarmApi.getDangerAndType();// вывод значений
    }}