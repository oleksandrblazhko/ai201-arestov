package org.example;

public class User {

    String name; // имя пользователя
    String surname; // фамилия пользователя
    Location userLocation; // местоположение пользователя

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Location getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(Location userLocation) {
        this.userLocation = userLocation;
    }

    public void sendLocation(AlarmApi alarmApi){
        alarmApi.setUserLocation(userLocation);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", userLocation=" + userLocation +
                '}';
    }
}
