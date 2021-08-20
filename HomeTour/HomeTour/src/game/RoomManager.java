package game;

import fixtures.Room;

public class RoomManager {

	public Room startingRoom;
	public Room[] rooms;

	public RoomManager(int roomCount) {
		rooms = new Room[roomCount];
	}
	

	public void init() {
	  
	    Room Hallway = new Room(
			"Living Room",
			"Common living space",
			"You're currently in your living Room"
			+ "\n To the East, you'll find the Bed Room. "
			+ "\n To the West, you'll find your Kitchen"
			+ "\n To the North, you'll find your Backyard."
			+ "\n Then to the South, you'll find the FrontYard");
			this.rooms[0] = Hallway;
	        this.startingRoom = Hallway;
	        
	    Room Kitchen = new Room(
	    	"Your Kitchen",
	    	"This is your Kitchen",
	    	"This is the Kitchen, an excellent place to prove your cook prowess");
	    	this.rooms[1] = Kitchen;
	    Room bedroom = new Room(
	    	"Your Bed Room",
	    	"This is a very siiicc bedroom",
	    	"This is an awesome bedroom that is used as your get away from a long day. "
	    	+ "To go back to Living Room you can Go West and to the South you find your Patio");
	    	this.rooms[2] = bedroom;
	    Room patio = new Room(
	    	"Your Patio",
	    	"a quaint patio overlooking your yard",
	    	"A quaint patio overlooking your yard, trees in front of the patio provide privacy a bit of privacy");
	    	this.rooms[3] = patio;
	    Room backyard = new Room(
	    	 "This is your back yard.",
	    	 "Here you can see your pool and grill",
	    	 "This is the place you host gatherings and celebrations!");
	    	 this.rooms[4] = backyard;
	    Room frontyard = new Room(
	    		"This is your FrontYard",
				"Here you can see all that lie in front of your house!",
				"From here you can see the patio, your lawn, your driveway, and the culdesac that your house sits on");
	    		this.rooms[5] = frontyard;

	    	 
	  
	    	 
	}


	public Room getStartingRoom() {
		return this.startingRoom;
	}

public void setStartingRoom(Room startingRoom) {
	this.startingRoom = startingRoom;
}
	public Room[] getRooms() {
		return this.rooms;
	}
	
	public void setRooms(Room[] rooms) {
		this.rooms = rooms;
	}
	
}