package com.liutao.state;

import java.util.Random;

public class HasQuarterState implements State {

    Random randomWinner = new Random(System.currentTimeMillis());
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    /**
     * 投入25分钱 已经有25分钱
     */
    @Override
    public void insertQuarter() {
        System.out.println("已经投入25分钱了  不可以在投入");
    }

    /**
     * 要求机器退钱 25分钱  可以退钱
     */
    @Override
    public void ejectQuarter() {
        System.out.println("钱被退出");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
        gumballMachine.setLocation("noQuarter");
    }


    /**
     * 转动曲柄   糖果可以掉下来一颗  进入SoldState
     */
    @Override
    public void tumCrank() {
        int winner = randomWinner.nextInt(10);
        if (winner == 0 && gumballMachine.getCount() > 1){
            gumballMachine.setState(gumballMachine.getWinnerState());
            gumballMachine.setLocation("winner");
        }else {
            gumballMachine.setState(gumballMachine.getSoldState());
            gumballMachine.setLocation("sold");
        }
    }


    /**
     * 发放一颗糖果
     */
    @Override
    public void dispense() {
    }
}
