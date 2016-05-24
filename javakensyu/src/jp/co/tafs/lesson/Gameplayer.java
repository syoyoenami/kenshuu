package jp.co.tafs.lesson;

public class Gameplayer {
	public static void main(String[] args) {
		Game game = new Game();
		System.out.println("さあ！ゲームを始めましょう！");

		game.gamePlay();
		game.powerOn();
		System.out.println("感想 : 楽しかったです。");

	}
}
