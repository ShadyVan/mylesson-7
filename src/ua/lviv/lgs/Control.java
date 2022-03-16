package ua.lviv.lgs;

public class Control implements Possibilities{

    public void moveUp(){
        int l = (int) (Math.random() * 1000);
        System.out.println("The plane is going up on " + l + " meters");
    }

    public void moveDown(){
        int l = (int) (Math.random() * 1000);
        System.out.println("The plane is going down on " + l + " meters");
    }

    public void moveLeft(){
        int l = (int) (Math.random() * 1000);
        System.out.println("The plane is going left on " + l + " meters");
    }

    public void moveRight(){
        int l = (int) (Math.random() * 1000);
        System.out.println("The plane is going right on " + l + " meters");
    }


}
