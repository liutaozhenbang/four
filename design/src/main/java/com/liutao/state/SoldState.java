package com.liutao.state;

public class SoldState implements State {

    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    /**
     * 投入25分钱 进入有25分钱
     */
    @Override
    public void insertQuarter() {
        System.out.println("糖果正在掉下来 请稍后");
    }

    /**
     * 要求机器退钱
     */
    @Override
    public void ejectQuarter() {
        System.out.println("正在掉下糖果 不可以可以退钱");
    }

    /**
     * 转动曲柄
     */
    @Override
    public void tumCrank() {
        System.out.println("糖果正在掉下来  请耐心等候");
    }

    /**
     * 发放一颗糖果。检查剩下的糖果数  >0 进入NoQuarterState  否则进入SoldOutState没有糖果可以掉下来
     */
    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
            gumballMachine.setLocation("noQuart");
        } else {
            System.out.println("糖果已经全部卖完了");
            gumballMachine.setState(gumballMachine.getSoldOutState());
            gumballMachine.setLocation("soldOut");
        }
    }
}
