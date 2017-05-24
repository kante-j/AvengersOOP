package avengers;

public class Dice {
	public int rollDice(){
		int diceNum = (int) Math.random()*100;
		return diceNum;
	}
}
