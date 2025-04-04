package interview.design_pattern.creational.prototypeChessBoard;

import java.util.HashMap;
import java.util.Map;

public class CellFactory {
	private static final Map<Color, CellWithClone> Cell_CACHE = new HashMap<>();

	private CellFactory() {

	}

	public static CellWithClone getCell(Color color) {
		if (!Cell_CACHE.containsKey(color)) {
			CellWithClone cellWithClone = new CellWithClone(color.name());
			Cell_CACHE.put(color, cellWithClone);
		}
		return Cell_CACHE.get(color);
	}
}
