package com.place.keepsafe;

import java.util.List;

import com.badlogic.androidgames.framework.Game;
import com.badlogic.androidgames.framework.Graphics;
import com.badlogic.androidgames.framework.Screen;
import com.badlogic.androidgames.framework.Input.TouchEvent;

public class MainMenuScreen extends Screen {

	public MainMenuScreen(Game game) {
		super(game);
	}

	@Override
	public void update(float deltaTime) {

		if (Settings.soundEnabled) {
			// if(Assets.piano.getVolume() != 1)
			Assets.piano.setVolume(1);

		} else {
			Assets.piano.setVolume(0);
		}

		Graphics g = game.getGraphics();
		List<TouchEvent> touchEvents = game.getInput().getTouchEvents();
		game.getInput().getKeyEvents();

		int len = touchEvents.size();
		for (int i = 0; i < len; i++) {
			TouchEvent event = touchEvents.get(i);
			if (event.type == TouchEvent.TOUCH_UP) {
				if (inBounds(event, 16, g.getHeight() - 64, 48, 48)) {
					Settings.soundEnabled = !Settings.soundEnabled;
					if (Settings.soundEnabled)
						Assets.click.play(1);
				}
			}

			if (inBounds(event, 64, 100, 192, 42)) {
				game.setScreen(new GameScreen(game));
				if (Settings.soundEnabled)
					Assets.click.play(1);
				return;
			}
			if (inBounds(event, 64, 120 + 42, 192, 42)) {
				game.setScreen(new HighscoreScreen(game));
				if (Settings.soundEnabled)
					Assets.click.play(1);
				return;
			}
			if (inBounds(event, 64, 120 + 84, 192, 42)) {
				game.setScreen(new HelpScreen(game));
				if (Settings.soundEnabled)
					Assets.click.play(1);
				return;
			}
		}

	}

	@Override
	public void present(float deltaTime) {
		Graphics g = game.getGraphics();

		g.drawPixmap(Assets.bgMainMenu, 0, 0);
		
		if (Settings.debugEnabled) {
			g.drawPixmap(Assets.grid, 0, 0);
		}

		g.drawPixmap(Assets.mainMenu,
				(g.getWidth() / 2) - (Assets.mainMenu.getWidth() / 2),
				(g.getHeight() / 2) - (Assets.mainMenu.getHeight() / 2));

		if (Settings.soundEnabled) {
			g.drawPixmap(Assets.btnMusic, 0,
					g.getHeight() - Assets.btnMusic.getHeight());
		} else {
			g.drawPixmap(Assets.btnMusicOff, 0, g.getHeight()
					- Assets.btnMusicOff.getHeight());
		}
	}

	@Override
	public void pause() {
		Assets.piano.pause();

	}

	@Override
	public void resume() {
		Assets.piano.setLooping(true);
		Assets.piano.play();

	}

	@Override
	public void dispose() {
		Assets.piano.dispose();
		Assets.btnMusic.dispose();
		Assets.btnMusicOff.dispose();
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
