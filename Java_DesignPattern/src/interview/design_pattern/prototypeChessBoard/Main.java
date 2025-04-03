package interview.design_pattern.prototypeChessBoard;

public class Main {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		BoardNoClone boardNoClone = new BoardNoClone();

		long endTime = System.currentTimeMillis();

		System.out.println("Time taken to create a board no clone: " + (endTime - startTime) + " millis");

		boardNoClone.print();

		long startTime1 = System.currentTimeMillis();

		BoardWithClone boardWithClone = new BoardWithClone();

		long endTime1 = System.currentTimeMillis();

		System.out.println("Time taken to create a board no clone: " + (endTime1 - startTime1) + " millis");

		boardWithClone.print();

	}

}
