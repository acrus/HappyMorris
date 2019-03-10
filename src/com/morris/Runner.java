package com.morris;

public class Runner {

	public static void main(String args) {
		RunningMan man = new RunningMan("yoyo");
		GamePlay game = new GamePlay();
		game.setGameName("Jumping");
		System.out.println(man.getName()+" is playing "+game.getGameName());
	}
	
}
