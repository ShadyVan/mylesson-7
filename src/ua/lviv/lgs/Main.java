package ua.lviv.lgs;

public class Main {
    public static void main(String[] args) {
        Su27 ghostOfKyiv = new Su27(22, 17000, 6, 2500, "yellow&blue" );

        ghostOfKyiv.engineStart();
        ghostOfKyiv.airplaneTakeoff();
        ghostOfKyiv.moveUp();
        ghostOfKyiv.moveLeft();
        ghostOfKyiv.moveRight();
        ghostOfKyiv.moveDown();
        ghostOfKyiv.doStealth();
        ghostOfKyiv.doNuclearAttack();
        ghostOfKyiv.doTurbo();
        ghostOfKyiv.PlaneLanding();
    }
}
