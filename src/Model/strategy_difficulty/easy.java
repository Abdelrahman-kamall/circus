package Model.strategy_difficulty;

import Model.Logger.GameLogger;

public class easy implements Strategy {

	@Override
	public int speed() {
		// TODO Auto-generated method stub
		GameLogger.getInstance().log.debug("game speed set to 30");
		return 30;
	}

	@Override
	public int time() {
		// TODO Auto-generated method stub
		GameLogger.getInstance().log.debug("time set to 3000");
		return 3000;
	}

	@Override
	public int score() {
		// TODO Auto-generated method stub
		GameLogger.getInstance().log.debug("score set to 3");
		return 3;
	}

	@Override
	public int noOfShapes() {
		// TODO Auto-generated method stub
        GameLogger.getInstance().log.debug("no. of shapes is 35");
		return 35;
	}

	@Override
	public int maxHeightOfPlate() {
		// TODO Auto-generated method stub
        GameLogger.getInstance().log.debug("maximum height of plates is 50");
		return 50;
	}
	
	@Override
	public int getMaxTime() {
		// TODO Auto-generated method stub
        GameLogger.getInstance().log.debug("maximum time is 3 secs");
		return 3*60000;
	}

}
