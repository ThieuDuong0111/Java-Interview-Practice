package interview.design_pattern.creational.prototypeChessBoard;

import java.util.concurrent.TimeUnit;

public class CellWithClone implements Cloneable {

	private String color;
	private String coordinate;

	public CellWithClone(String color) {
		// Do more time to create an cell
		this.color = color;
		try {
			TimeUnit.MILLISECONDS.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void setCoordinate(String coordinate) {
		this.coordinate = coordinate;
	}

	@Override
	public String toString() {
		return "Cell [color=" + color + ", coordinate=" + coordinate + "]";
	}

	@Override
	protected CellWithClone clone() {
		try {
			return (CellWithClone) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}
