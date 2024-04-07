package org.example;

public class Location {
    private int xPos;
    // позиция по плоскости х
    private int yPos; // позиция по плоскости у
    private int radius;

    public Location(){

    }

    /*
    Конструктор:
    входные параметры:
     позиция по плоскости х
     позиция по плоскости у
     */
    public Location(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public int getxPos() {
        return xPos;
    }

    public <T> boolean setPosition(T xPos, T yPos) {
        if(xPos instanceof String || yPos instanceof String ){
            throw new PositionException();
        } else if (xPos instanceof Integer && yPos instanceof Integer){
            this.xPos = (int) xPos;
            this.yPos = (int) yPos;
            return true;
        }
        return false;
    }

    public int getyPos() {
        return yPos;
    }


    @Override
    public String toString() {
        return "Location{" +
                "xPos=" + xPos +
                ", yPos=" + yPos +
                '}';
    }

    public <T> boolean sendLocation(T xPos, T yPos, T radius){

        if((xPos instanceof String || yPos instanceof String) && radius instanceof String ){
            throw new RadiusAndLocationException();
        }

        if(xPos instanceof String || yPos instanceof String ){
            throw new PositionException();
        } else if (xPos instanceof Integer && yPos instanceof Integer){
            this.xPos = (int) xPos;
            this.yPos = (int) yPos;
        }

        if(radius instanceof String){
            throw new RadiusException();
        }

        if((Integer) radius > 15 || (Integer)radius < 0){
            throw  new RadiusException();
        }
        this.radius = (int) radius;
        return true;
    }


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if(radius > 15 || radius < 0){
            throw  new RadiusException();
        }
        this.radius = radius;
    }
}
