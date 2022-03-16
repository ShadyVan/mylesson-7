package ua.lviv.lgs;

public class Su27 extends Plane {
    private int maxSpeed;
    private String color;

    public void doTurbo(){
        int s = maxSpeed + (int) (Math.random() * 4000);
        System.out.println("Putler is dead, the plane is going to a base at turbo speed of " + s + "km/h");
    }

    public void doStealth(){
        int t = (int) Math.random() + 10;
        System.out.println("The plane is in the stealth for " + t + " minutes");
    }

    public void doNuclearAttack(){
        int a = 2 + (int) (Math.random() * 11);
        System.out.println( a + " nuclear bombs were dropped on putin's bunker ");

    }

    Su27(int length, int weight, int width, int maxSpeed, String color) {
        super(length, weight, width);
        this.maxSpeed = maxSpeed;
        this.color = color;
    }



}
