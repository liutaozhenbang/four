package com.liutao.state;

public class NoQuarterState implements State {

    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    /**
     * 投入25分钱 进入有25分钱 HasQuartState
     */
    @Override
    public void insertQuarter() {
        System.out.println("你已经投入了25分钱");
        gumballMachine.setLocation("hasQuarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    /**
     * 要求机器退钱 25分钱  没有钱可以退
     */
    @Override
    public void ejectQuarter() {
        System.out.println("没有钱可以退给你");
    }

    /**
     * 转动曲柄   没有糖果可以掉下来
     */
    @Override
    public void tumCrank() {
        System.out.println("请先投入25分钱");
    }

    /**
     * 发放一颗糖果
     */
    @Override
    public void dispense() {
    }
}
