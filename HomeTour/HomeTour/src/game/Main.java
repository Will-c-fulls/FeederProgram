//
package game;

import java.util.Scanner;

public class Main extends RoomManager {

	public Main(int roomCount) {
		super(roomCount);
	}

	private static RoomManager manager = new RoomManager(6);
	static int gameRunning = 1;
	
	public static void main(String[] args) {

		manager.init();
		Player player = new Player();
		player.setCurrentRoom(manager.startingRoom);
		
		while (gameRunning == 1) {

			Main.printRoom(player);
			String[] input = Main.collectInput();
			Main.parse(input, player);
		}
		if (gameRunning == 0) {
			System.out.println("Run the program if you want to play again!");
		}
	}


	private static void printRoom(Player player) {
	player.getCurrentRoom();

	System.out.println(player.currentRoom.getName() + "\n");
	System.out.println(player.currentRoom.getLongDescription() + "\n");
	
	
	}
	
	

	private static String[] collectInput() {

			Scanner scanner = new Scanner(System.in);
	        System.out.println("\nTo start the game please type Go and Direction. \nFor Example:\"Go East\"");
	        System.out.println("\nTo End the game please type Quite");

	        String input = scanner.nextLine();
	        String[] strArr = input.split(" "); 

	        if (gameRunning == 0) {
				scanner.close();
			}
	        return strArr;
	}
	
		
	public static void parse(String[] input, Player player ) {
		if (input[0].equals("Quit")) {
			gameRunning = 0;
			}
		switch (input[0]) {
		case "Go" :
			Main.movement(input, player);
			break;
		case "Move" :
			Main.movement(input, player);
			break;
		case "Forward" :
			Main.movement(input, player);
			break;
		case "Backward" :
			Main.movement(input, player);
			break;
		default:
			System.out.println("\nGame Over!\nSee ya!\n");
			break;
		}
	}
	
	public static void movement(String[] input, Player player ) {
		if(player.currentRoom.equals(manager.rooms[0])) {
			switch (input[1]) {
			case "East":
				System.out.println("Now You're walking to the Bedroom\n");
				player.setCurrentRoom(manager.rooms[2]);
				break;
			case "West":
				System.out.println("Now You're walking to the Kitchen\n");
				player.setCurrentRoom(manager.rooms[1]);
				break;
			case "South":
				System.out.println("This leads to the front Yard");
				player.setCurrentRoom(manager.rooms[5]);
				break;
			case "North":
				System.out.println("Great! Now, you're walkig toward backyard.\n");
				player.setCurrentRoom(manager.rooms[4]);
				break;
			default:
				System.out.println("\nLooks like you misspelled something!\nPlease follow the given directions!\n");
				break;
				
			}
			
		} else if (player.currentRoom.equals(manager.rooms[1])) {
		
			switch (input[1]) {
			case "South":
				System.out.println("There is no way out this way please turn around\n");
				break;
			case "West":
				System.out.println("There is no way out this way please turn around.\n");
				break;
			case "East":
				System.out.println("You walk back into the Living Room\n");
				player.setCurrentRoom(manager.rooms[0]);
				break;
			case "North":
				System.out.println("There is no way out this way please turn around\n");
				break;
			default:
				System.out.println("\nLooks like you misspelled something!\nPlease follow the given directions!\n");
				break;
			}
		} else if(player.currentRoom.equals(manager.rooms[2])) {
		
			switch (input[1]) {
			case "South":
				System.out.println("You walk out to the patio\n");
				player.setCurrentRoom(manager.rooms[3]);
				break;
			case "North":
				System.out.println("There is no way out this way please turn around\n");
				break;
			case "East":
				System.out.println("There is no way out this way please turn around\n");
				break;
			case "West":
				System.out.println("You turn around and walk back into the Living Room.\n");
				player.setCurrentRoom(manager.rooms[0]);
				break;
			default:
				System.out.println("\nLooks like you misspelled something!\nPlease follow the given directions!\n");
				break;
			}
		} else if(player.currentRoom.equals(manager.rooms[3])) {
		
			switch (input[1]) {
			case "East":
				System.out.println("There is no way out this way please turn around.\n");
				break;
			case "West":
				System.out.println("There is no way out this way please turn around.\n");
				break;
			case "South":
				System.out.println("There is no way out this way please turn around\n");
				break;
			case "North":
				System.out.println("You've gone back into your Bed Room\n");
				player.setCurrentRoom(manager.rooms[2]);
				break;
			default:
				System.out.println("\nLooks like you misspelled!\nPlease follow the given direction!\n");
				break;
			}
		} else if(player.currentRoom.equals(manager.rooms[4])) {
		
			switch (input[1]) {
			case "South":
				System.out.println("Great! Now, you're back in the house.\n");
				player.setCurrentRoom(manager.rooms[0]);
				break;
			case "East":
				System.out.println("There is no way out this way please turn around\n");
				break;
			case "West":
				System.out.println("There is no way out this way please turn around\n");
				break;
			case "North":
				System.out.println("It's raining outside. Please go back toward the South.\n");
				break;
			default:
				System.out.println("\nLooks like you misspelled!\nPlease follow the given direction!\n");
				break;
			}
			
		}else if(player.currentRoom.equals(manager.rooms[5])) {

			switch (input[1]) {
				case "South":
					System.out.println (" To the South you see the culdesack your house sits on!");
					break;
				case "East":
					System.out.println("You can see the patio in front of your room!");
					break;
				case "West":
					System.out.println ("You can see your driveway to the west!");
					break;
				case "North":
					System.out.println ("You go back into you house! Specifically the Living Room ");
					player.setCurrentRoom(manager.rooms[0]);
				default:
					System.out.println("\n Looks like you mispelled something! \nPlease follow the given directions!\n");
					break;
			}
		}
		
		
		}
	

}