package Enhanced_for;

public class Box {
	private int room;
	private String req;

	public Box(int roomNum, String request) {
		room = roomNum;
		req = request;
	}

	int getBoxNum() {
		return room;
	}

	public String toString() {
		return req;
	}

}
