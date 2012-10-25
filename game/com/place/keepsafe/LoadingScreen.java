package com.place.keepsafe;

import com.badlogic.androidgames.framework.Game;
import com.badlogic.androidgames.framework.Graphics;
import com.badlogic.androidgames.framework.Graphics.PixmapFormat;
import com.badlogic.androidgames.framework.Screen;

public class LoadingScreen extends Screen {

	public LoadingScreen(Game game) {
		super(game);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(float deltaTime) {
		Graphics g = game.getGraphics();

		try {
			// Only background images are to use RGB565 format others should use
			// 4444
			Assets.background = g.newPixmap("background.png",
					PixmapFormat.RGB565);
			Assets.bgGreen = g.newPixmap("greenbg.png", PixmapFormat.RGB565);
			Assets.bgMainMenu = g.newPixmap("menubg.png", PixmapFormat.RGB565);
			Assets.grid = g.newPixmap("grid.png", PixmapFormat.RGB565);

			Assets.btnMusic = g.newPixmap("buttonmusic.png",
					PixmapFormat.ARGB4444);
			Assets.btnMusicOff = g.newPixmap("buttonmusicoff.png",
					PixmapFormat.ARGB4444);
			// Assets.pause = g.newPixmap("pause.png", PixmapFormat.ARGB4444);
			Assets.mainMenu = g
					.newPixmap("mainmenu.png", PixmapFormat.ARGB4444);

			Assets.bob = g.newPixmap("bob.png", PixmapFormat.ARGB4444);

			Assets.click = game.getAudio().newSound("click.ogg");

			Assets.finality = game.getAudio().newMusic("finality.wav");
			Assets.piano = game.getAudio().newMusic("piano.wav");
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Failed loading files");
		}

		game.setScreen(new MainMenuScreen(game));
	}

	@Override
	public void present(float deltaTime) {
		Graphics g = game.getGraphics();

		if (Settings.debugEnabled) {
			g.drawPixmap(Assets.grid, 0, 0);
		}

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
	}

}
