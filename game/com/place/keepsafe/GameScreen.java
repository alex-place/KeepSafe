package com.place.keepsafe;

import com.badlogic.androidgames.framework.Game;
import com.badlogic.androidgames.framework.Graphics;
import com.badlogic.androidgames.framework.Input.TouchEvent;
import com.badlogic.androidgames.framework.math.Vector2;
import com.place.keepsafe.entities.impl.Bob;
import com.place.keepsafe.world.World;

public class GameScreen extends World {
	enum GameState {
		Ready, Running, Paused, GameOver
	}

	Bob bob = new Bob(new Vector2(25, game.getGraphics().getHeight() / 2),
			Assets.bob);
	Vector2 bobMove = new Vector2(1, 1);

	/**
	 * Screen width is given in meters. 1 meter = 32 pixels
	 * */
	public static final int SCREEN_WIDTH = 15;

	/**
	 * Screen height is given in meters. 1 meter = 32 pixels
	 * */
	public static final int SCREEN_HEIGHT = 10;

	public GameScreen(Game game) {
		super(game);
	}

	@Override
	public void update(float deltaTime) {
		// bob.move(bobMove);
	}

	@Override
	public void present(float deltaTime) {
		Graphics g = game.getGraphics();
		g.drawPixmap(Assets.background, 0, 0);

		if (Settings.debugEnabled) {
			g.drawPixmap(Assets.grid, 0, 0);
		}

		bob.present(g);

	}

	@Override
	public void pause() {

	}

	@Override
	public void resume() {

	}

	@Override
	public void dispose() {

	}

	private boolean inBounds(TouchEvent event, int x, int y, int width,
			int height) {
		if (event.x > x && event.x < x + width - 1 && event.y > y
				&& event.y < y + height - 1)
			return true;
		else
			return false;
	}

}
