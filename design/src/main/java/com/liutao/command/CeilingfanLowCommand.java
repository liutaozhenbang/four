package com.liutao.command;

public class CeilingfanLowCommand implements Command{

    Ceilingfan ceilingfan;
    int prevSpeed;

    public CeilingfanLowCommand(Ceilingfan ceilingfan){
        this.ceilingfan = ceilingfan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingfan.getSpeed();
        ceilingfan.low();
        System.out.println("风扇低速转动");
    }

    @Override
    public void undo() {
        if (prevSpeed == Ceilingfan.HIGH){
            ceilingfan.high();
            System.out.println("风扇高速转动");
        }else if (prevSpeed == Ceilingfan.MEDIUM){
            ceilingfan.medium();
            System.out.println("风扇中速转动");
        }else if (prevSpeed == Ceilingfan.LOW){
            ceilingfan.low();
            System.out.println("风扇低速转动");
        }else if (prevSpeed == Ceilingfan.OFF){
            ceilingfan.off();
            System.out.println("风扇停止转动");
        }
    }
}
