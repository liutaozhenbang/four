package com.liutao.one;

import com.liutao.adapter.TurkeyAdapter;
import com.liutao.adapter.duck.Duck;
import com.liutao.adapter.duck.MallardDack;
import com.liutao.adapter.turkey.WildTurkey;
import com.liutao.command.*;
import com.liutao.decoration.coffee.Espresso;
import com.liutao.decoration.condiment.MilkBlisters;
import com.liutao.decoration.condiment.Mocha;
import com.liutao.factory.pizza.Pizza;
import com.liutao.factory.store.ChicagoPizzaStore;
import com.liutao.factory.store.NYPizzaStore;
import com.liutao.factory.store.PizzaStore;
import com.liutao.iterator.Menus;
import com.liutao.iterator.Waitress;
import com.liutao.observe.observer.CurrentConditionsDisplay;
import com.liutao.observe.subject.WeatherData;
import com.liutao.refactoring.Customer;
import com.liutao.refactoring.Movie;
import com.liutao.refactoring.Rental;
import com.liutao.state.GumballMachine;
import com.liutao.state.GumballMonitor;
import com.liutao.strategy.subduck.OneDuck;
import com.liutao.strategy.subduck.TwoDuck;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OneApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void strategy() {
		System.out.println("101");
		OneDuck oneDuck = new OneDuck();
		TwoDuck twoDuck = new TwoDuck();
		oneDuck.quack();
		twoDuck.quack();
		oneDuck.perFormFly();
		twoDuck.perFormFly();
	}


	@Test
	public void observe() {
		System.out.println("102");
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(90, 80, 30.8f);
		weatherData.setMeasurements(90, 80, 30.8f);
	}


	@Test
	public void decoration() {
		System.out.println("103");
		Espresso espresso = new Espresso();  //20
		MilkBlisters milkBlisters = new MilkBlisters(espresso);  //5 + 20
		System.out.println(milkBlisters.cost());
		Mocha mocha = new Mocha(milkBlisters);  //8
		System.out.println(mocha.cost());
		System.out.println(mocha.getDescription());
	}

	@Test
	public void IO() {
		System.out.println("104");
		int c;
		try {
			FileInputStream fileInputStream = new FileInputStream("D://aa.txt");
			InputStream in = fileInputStream;

			while ((c = in.read()) >= 0) {
				System.out.println((char) c);
			}
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void readLine() throws Exception {
		System.out.println("105");
		String fileName = "D:/aa.txt";
		File file = new File(fileName);
		BufferedReader reader = null;
		reader = new BufferedReader(new FileReader(file));
		String tempString = null;
		while ((tempString = reader.readLine()) != null) {
			System.out.println(tempString);
		}
		reader.close();
	}

	@Test
	public void factory() {
		System.out.println("106");
		PizzaStore nyPizzaStore = new NYPizzaStore();
		Pizza nyPizza = nyPizzaStore.orderPizza("cheesePizza");
		System.out.println(nyPizza.getName());
		System.out.println("===============================");
		PizzaStore chicagePizzaStore = new ChicagoPizzaStore();
		Pizza chicagePizza = chicagePizzaStore.orderPizza("clamsPizza");
		System.out.println(chicagePizza.getName());
	}

	@Test
	public void command() {
		System.out.println("107");
		SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		simpleRemoteControl.setCommand(lightOn);
		simpleRemoteControl.buttonWasPressed();
		System.out.println("ten minute passed");
		LightOffCommand lightOff = new LightOffCommand(light);
		simpleRemoteControl.setCommand(lightOff);
		simpleRemoteControl.buttonWasPressed();
	}


	@Test
	public void command2() {
		System.out.println("108");
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
		Light livingRoomLight = new Light("Living Room");
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		remoteControl.setCommand(0,livingRoomLightOn,livingRoomLightOff);
		remoteControl.onButtonWasPushed(0);
		System.out.println("开");
		remoteControl.offButtonWasPushed(0);
		System.out.println("关");
		remoteControl.onButtonWasPushed(0);
		System.out.println("开");
		remoteControl.undoButtonWasPushed(0);
		System.out.println("关");
	}

	@Test
	public void command3() {
		System.out.println("109");
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
		Ceilingfan ceilingfan = new Ceilingfan("Living Room");
		CeilingfanHighCommand highCommand = new CeilingfanHighCommand(ceilingfan);
		CeilingfanLowCommand lowCommand = new CeilingfanLowCommand(ceilingfan);
		CeilingfanOffCommand offCommand = new CeilingfanOffCommand(ceilingfan);

		remoteControl.setCommand(0,highCommand,offCommand);
		remoteControl.setCommand(1,lowCommand,offCommand);
		remoteControl.onButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.undoButtonWasPushed(1);
		remoteControl.offButtonWasPushed(0);

	}

	@Test
	public void adapter() {
		System.out.println("110");
        /*Turkey turkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);
        turkeyAdapter.fly();
        turkeyAdapter.quack();*/

		MallardDack dack = new MallardDack();
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);

		System.out.println("=======turkey=======");
		turkey.fly();
		turkey.gobble();

		System.out.println("=======duck=======");
		dack.fly();
		dack.quack();

		System.out.println("=======turkeyAdapter=======");
		turkeyAdapter.fly();
		turkeyAdapter.quack();
	}

	@Test
	public void iterator1() {
        /*PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();
        ArrayList<Menu> list = new ArrayList<>();
        list.add(pancakeHouseMenu);
        list.add(dinerMenu);
        list.add(cafeMenu);
        Waitress waitress = new Waitress(list);

        waitress.printMenu();*/
	}

	@Test
	public void iterator2() {
		System.out.println("111");

		Waitress waitress = new Waitress(Menus.getMenuComponent());

		System.out.println("给我拿一下菜单");

		waitress.printMenu();

		System.out.println("给我素食菜单");

		waitress.printVegetarianMenu();
	}

	@Test
	public void state() {
		System.out.println("112");

		GumballMachine gumballMachine = new GumballMachine("noQuarter",5);
		GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);

		//当前糖果机的状态
		gumballMonitor.report();
		//你已经投入了25分钱
		gumballMachine.insertQuarter();
		//钱被退出
		gumballMachine.ejectQuarter();
		//你已经投入了25分钱
		gumballMachine.insertQuarter();
		//钱被退出
		gumballMachine.ejectQuarter();

		//当前糖果机的状态
		gumballMonitor.report();
		//你已经投入了25分钱
		gumballMachine.insertQuarter();

		//当前糖果机的状态
		gumballMonitor.report();
		//糖果正在掉下来
		//一个糖果掉了下来...
		gumballMachine.tumCrank();
		//没有钱可以退给你
		gumballMachine.ejectQuarter();
		//没有钱可以退给你
		gumballMachine.ejectQuarter();
		//你已经投入了25分钱
		gumballMachine.insertQuarter();
		//已经投入25分钱了  不可以在投入
		gumballMachine.insertQuarter();
		//钱被退出
		gumballMachine.ejectQuarter();
		//你已经投入了25分钱
		gumballMachine.insertQuarter();
		//糖果正在掉下来
		//一个糖果掉了下来...
		gumballMachine.tumCrank();
		gumballMachine.insertQuarter();
		gumballMachine.tumCrank();
		gumballMachine.insertQuarter();
		gumballMachine.tumCrank();
		gumballMachine.insertQuarter();
		gumballMachine.tumCrank();

		//当前糖果机的状态
		gumballMonitor.report();
		//你已经投入了25分钱 但是已经没有糖果了
		gumballMachine.insertQuarter();
		gumballMachine.tumCrank();
	}

	@Test
	public void refactoring() {
		Movie duck = new Movie("唐老鸭", Movie.CHILDRENS);
		Movie tom_and_jerry = new Movie("猫和老鼠", Movie.CHILDRENS);
		Movie captain = new Movie("老船长", Movie.REGULAR);
		Movie all = new Movie("张默娘的心机", Movie.NEW_RELEASE);
		Movie fox = new Movie("老狐狸格言", Movie.REGULAR);
		Movie game = new Movie("和海盗博弈", Movie.REGULAR);
		Movie carp = new Movie("小鲤鱼跃龙门", Movie.CHILDRENS);

		Rental duckRental = new Rental(duck, 3);
		Rental foxRental = new Rental(fox, 3);
		Rental gameRental = new Rental(game, 3);
		Rental tom_and_jerryRental = new Rental(tom_and_jerry, 3);
		Vector liutao = new Vector();
		liutao.add(duckRental);
		liutao.add(foxRental);
		liutao.add(gameRental);
		liutao.add(tom_and_jerryRental);
		Customer customer = new Customer("liutao", liutao);
		String statement = customer.statement();
		System.out.println(statement);

		Rental duckRent = new Rental(duck, 3);
		Rental allRent = new Rental(all, 4);
		Rental gameRent = new Rental(game, 2);
		Rental tom_and_jerryRent = new Rental(tom_and_jerry, 8);
		Rental carpRent = new Rental(carp, 6);
		Vector sangchong = new Vector();
		sangchong.add(duckRent);
		sangchong.add(allRent);
		sangchong.add(gameRent);
		sangchong.add(tom_and_jerryRent);
		sangchong.add(carpRent);
		Customer sangchongCustomer = new Customer("sangchong", sangchong);
		String sangchongStatement = sangchongCustomer.statement();
		System.out.println(sangchongStatement);
	}

}

