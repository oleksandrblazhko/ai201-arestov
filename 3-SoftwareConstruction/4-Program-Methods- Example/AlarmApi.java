package org.example;

import java.util.List;
import java.util.Random;

public class AlarmApi {

    private int dangerMeter; //уровень опачности
    private final List<String> weaponTypeList = List.of("БПЛА","Рзсо","Балістика");// список возможного вооружения
    private String weaponType;//тип вооружения
    private Location userLocation;//локация пользователя

    public int getDangerMeter() {
        return dangerMeter;
    }

    public void setDangerMeter(int dangerMeter) {
        if (dangerMeter > 5 || dangerMeter < 0){
            throw new DangerException();
        }
        this.dangerMeter = dangerMeter;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public Location getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(Location userLocation) {
        this.userLocation = userLocation;
    }


    public void getDangerAndType(){
        // вычисление значений по местоположению пользователя
        getSecurity(userLocation);
        // вывод значений на экран
        System.out.println("danger: " + dangerMeter + "% " + "weapon type: " + weaponType + "% on " + userLocation);
    }

    private void getSecurity(Location location){//входящие параметры: локация откуда берутся значения
        System.out.println("searching info in " + location + "...");
        Random rand = new Random();
        // установка значений параметров
        setDangerMeter(rand.nextInt(5));
        setWeaponType(weaponTypeList.get(rand.nextInt(weaponTypeList.size())));

    }
}
