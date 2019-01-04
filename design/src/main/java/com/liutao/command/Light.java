package com.liutao.command;


public class Light {

    private String light;

    public Light() {
    }

    public Light(String light) {
        this.light = light;
    }

    public void on(){
        System.out.println("the "+ light +" is on");
    }
    public void off(){
        System.out.println("the "+ light +" is off");
    }
}
