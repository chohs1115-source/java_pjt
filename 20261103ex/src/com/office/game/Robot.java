package com.office.game;

public class Robot implements ICharactor {

	public void run(int x, int y) {
		System.out.printf("%d, %d로 두발로 이동한다.\n", x, y);
	}
	
	@Override
	public void move(int x, int y) {
		run(x, y);
	}
}
