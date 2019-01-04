package com.liutao.state;

public class SoldOutState implements State {

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    /**
     * 投入25分钱 有25分钱  进入HasQuarterState
     */
    @Override
    public void insertQuarter() {
        System.out.println("糖果已经卖完了，下次再来吧");
        System.out.println("钱被退出");
    }

    /**
     * 要求机器退钱 25分钱
     */
    @Override
    public void ejectQuarter() {
        System.out.println("没有钱可以退");
    }

    /**
     * 转动曲柄   没有糖果可以掉下来
     */
    @Override
    public void tumCrank() {
        System.out.println("糖果已经全部售完");
    }

    /**
     * 发放一颗糖果。
     * 告诉顾客  没有糖果可以发放
     */
    @Override
    public void dispense() {
    }
}
