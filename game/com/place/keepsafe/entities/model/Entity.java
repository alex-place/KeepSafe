package com.place.keepsafe.entities.model;

import com.badlogic.androidgames.framework.Graphics;
import com.badlogic.androidgames.framework.Pixmap;
import com.badlogic.androidgames.framework.math.Vector2;

public class Entity implements EntityModel {

	public Vector2 position;
	Pixmap image;

	public Entity(Vector2 position) {
		this.position = position;

	}

	public Entity(Vector2 position, Pixmap image) {
		this.position = position;
		this.image = image;

	}

	public float getX() {
		return position.x;
	}

	public float getY() {
		return position.y;
	}

	public float getWidth() {
		if (image == null) {
			return 0;
		} else {
			return image.getWidth();
		}
	}

	public float getHeight() {
		if (image == null) {
			return 0;
		} else {
			return image.getHeight();
		}
	}

	public Vector2 getPosition() {
		return position;
	}

	public void setPosition(Vector2 position) {
		this.position = position;
	}

	public void move(Vector2 vector) {
		if (vector.x == 0 && vector.y == 0)
			return;

		position.moveEntity(vector);
	}

	public Pixmap getPixmap() {
		if (image == null) {
			return null;
		} else {
			return image;
		}
	}

	public void setPixmap(Pixmap pixmap) {
		if (pixmap == null)
			return;

		this.image = pixmap;
	}

	public void present(Graphics g) {
		if (image == null)
			return;

		g.drawPixmap(image, position.x, position.y);
	}

	public void present(Graphics g, int width, int height) {
		if (image == null)
			return;

		g.drawPixmap(image, width, height);
	}

}
