package ua.lviv.lgs;

public abstract class Plane extends Control {

    private int length;
    private int width;
    private int weight;

    public void engineStart(){
        System.out.println("The plane will ready to go after " + (20 + (int) (Math.random()* 108)) + " minutes");
    }

    public void airplaneTakeoff (){
        System.out.println("The plane will fly " + (int) (Math.random()*3000) + " km");
    }

    public void PlaneLanding  (){
        System.out.println("The plane is landing");
    }

    Plane(int length, int weight, int width){
    }



}
