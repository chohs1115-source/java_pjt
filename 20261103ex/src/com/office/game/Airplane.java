package com.office.game;

public class Airplane implements ICharactor {
	
	public void fly(int x, int y) {
		System.out.printf("%d, %d로 날아서 이동한다.\n", x, y);
	}
	
	@Override
	public void move(int x, int y) {
		fly(x, y);
	}
}
