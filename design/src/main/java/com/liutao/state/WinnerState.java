package com.liutao.state;

public class WinnerState implements State{

    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("不需要投入钱");
        System.out.println("钱被退出");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("不可以兑换现金");
    }

    @Override
    public void tumCrank() {
        System.out.println("不需要转动曲柄");
    }

    @Override
    public void dispense() {
        System.out.println("你是胜利者， 你可以得到双倍的糖果");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0){
            gumballMachine.setState(gumballMachine.getSoldOutState());
            gumballMachine.setLocation("sold");
        }else {
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
                gumballMachine.setLocation("noQuarter");

            } else {
                System.out.println("糖果已经全部卖完了");
                gumballMachine.setState(gumballMachine.getSoldOutState());
                gumballMachine.setLocation("soldOut");
            }
        }
    }
}
