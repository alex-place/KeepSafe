package com.place.keepsafe.entities.model;

import com.badlogic.androidgames.framework.Pixmap;
import com.badlogic.androidgames.framework.math.Vector2;

public interface EntityModel {

	public float getX();

	public float getY();

	public float getWidth();

	public float getHeight();

	public Vector2 getPosition();
	
	public void setPosition(Vector2 position);

	public Pixmap getPixmap();

	public void setPixmap(Pixmap pixmap);

}
