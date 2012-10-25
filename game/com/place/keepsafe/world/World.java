package com.place.keepsafe.world;

import java.util.ArrayList;
import java.util.List;

import com.badlogic.androidgames.framework.Game;
import com.badlogic.androidgames.framework.Screen;
import com.place.keepsafe.entities.model.Entity;

public class World extends Screen implements WorldModel{
	
	/** internal list for entities **/
	private List<Entity> entities = new ArrayList<Entity>();

	public World(Game game) {
		super(game);
		
	}

	@Override
	public void update(float deltaTime) {
		
		
	}

	@Override
	public void present(float deltaTime) {
		
		
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

	public void add(Entity entity) {
		entities.add(entity);
		
	}

	public void remove(Entity entity) {
		entities.remove(entity);
		
	}

	

}
