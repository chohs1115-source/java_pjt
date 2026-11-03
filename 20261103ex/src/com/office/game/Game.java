package com.office.game;

public class Game {
	
	private Bear bear;
	private Robot robot;
	private Airplane airplane;
	private Dog dog;
	private ICharactor[] iCharactors;
	

	public Game(Bear bear, Robot robot, Airplane airplane, Dog dog) {
		/*
		this.bear = bear;
		this.robot = robot;
		this.airplane = airplane;
		this.dog = dog;
		*/
		
		iCharactors = new ICharactor[] {
				this.bear,
				this.robot,
				this.airplane,
				this.dog};
	}



	public void move(int x, int y) {
		/*
		bear.walk(x, y);
		robot.run(x, y);
		dog.run(x, y);
		airplane.fly(x, y);
		*/
		
		/*
		bear.run(x, y);
		robot.run(x, y);
		dog.run(x, y);
		airplane.fly(x, y);
		*/
		
		for (int i=0; i < iCharactors.length; i++) {
			iCharactors[i].move(x, y);
		}
	}
}
