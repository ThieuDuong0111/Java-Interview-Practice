package interview.design_pattern.prototypeChessBoard;

import java.util.concurrent.TimeUnit;

public class CellNoClone {
	private String color;
	private String coordinate;

	public CellNoClone(String color) {
		this.color = color;
		try {
			// More time to create an cell
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
}
