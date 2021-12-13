package entity;

import component.Entity;
import component.Sprite;
import javafx.scene.canvas.GraphicsContext;
import logic.SceneManager;

public class flag extends Entity {

	private Sprite portal;
	
	public flag() {
		super(1280*2-200, SceneManager.getGround(), 90, 150);
		// TODO Auto-generated constructor stub
		portal = new Sprite("sprite/checkpoint/portal_end.gif");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public Sprite getImage() {
		// TODO Auto-generated method stub
		return portal;
	}
	
	@Override
	public void draw(GraphicsContext gc,boolean f) {
		super.draw(gc, f);
	}

}
