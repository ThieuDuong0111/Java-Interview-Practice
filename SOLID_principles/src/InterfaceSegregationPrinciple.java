/*According to the interface segregation principle, you should build small, 
focused interfaces that do not force the client to implement behavior they do not need.

A straightforward example would be to have an interface that 
calculates both the area and volume of a shape.
*/

//interface IShapeAreaCalculator {
//
//	double calculateArea();
//
//	double calculateVolume();
//}
//
//class Rectangle implements IShapeAreaCalculator {
//
//	@Override
//	public double calculateArea() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public double calculateVolume() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//}
/*
 * The issue with this is that if a Rectangle shape implements this, then it is
 * forced to implement the calculateVolume() method, which it does not need.
 */

/*
 * On the other hand, a Cube can implement both. To overcome this, we can
 * segregate the interface and have two separate interfaces: one for calculating
 * the area and another for calculating the volume. This will allow individual
 * shapes to decide what to implement.
 */

interface IAreaaCalculator {
	double calculateArea();
}

interface IVolumeCalculator {
	double calculateVolume();
}

class Rectangle implements IAreaaCalculator {
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 0;
	}
}

class Cube implements IAreaaCalculator, IVolumeCalculator {

	@Override
	public double calculateVolume() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 0;
	}
}