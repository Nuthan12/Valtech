package valtech.ws;

import java.io.Serializable;

public class Point implements Serializable {
	
	
	private int x;
	private int y;
	
	
	//Parameter Less Constructor And Setters and Getters
	public Point() {
		super();
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	
}
