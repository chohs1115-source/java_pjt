package com.office.game;

public class Dog implements ICharactor {
	
	private void run(int x, int y) {
		System.out.printf("%d, %d로 네발로 이동한다.\n", x, y);
	}
	
	@Override
	public void move(int x, int y) {
		run(x, y);
	}
	
}
