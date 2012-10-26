package com.place.keepsafe;

import com.badlogic.androidgames.framework.Screen;
import com.badlogic.androidgames.framework.impl.AndroidGame;

/**
 * Keep Safe: Defy or Die!
 * 
 * @author Alex Place
 * @version 0.1
 * 
 */

/*
 * TODO Make pixel art towers. (4 Remaining 0 completed) 
 * TODO Make pixel art turret. (4 Remaining 0 completed) 
 * TODO Make pixel art barricades. (4 Remaining 0 completed) 
 * TODO Make pixel art enemies.(4 Remaining 0 Completed)
 * 
 * TODO Give main turret logic. 
 * TODO Give towers logic. 
 * TODO Give enemies logic.
 * TODO Give barricades logic.
 * 
 * (Completed) Add LoadingScreen functions.
 * (Completed) Add MainMenuScreen functions.
 * 
 * TODO Add HelpScreen functions. 
 * TODO Add HighScoreScreen functions. 
 * TODO Add UpgradeScreen functions.
 * 
 * TODO Add FaceBook SDK integration. 
 *  
 * TODO (Postponed) Add ScoreLoop integration. 
 * TODO (Postponed) ScoreLoop LeaderBoard / High Scores. 
 * TODO (Postponed) Add ScoreLoop In-Game Items.
 * 
 * TODO Add Character and logic.
 * TODO Add weapons, guns, magic wand, etc. (4 remaining 0 completed)
 * 
 */

public class Main extends AndroidGame {

	public Screen getStartScreen() {
		return new LoadingScreen(this);
	}
}
