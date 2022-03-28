package pkg17association;
import java.util. * ;


class Room {
  public String roomName;
  public int roomNo;
  Room(String name, int number) {
    this.roomName = name;
    this.roomNo = number;
  }
}

class House {
	
  private final List < Room > rooms;
  House(List < Room > rooms) {
	  
    this.rooms = rooms;
  }
  
  public List < Room > getTotalRoomsInHouse() {
	  
    return rooms;
  }
}

public class JP03CompositionDemo {
	
  public static void main(String[] args) {
	  
    Room room1 = new Room("Dining Room", 2);
    Room room2 = new Room("Bed Room", 5);
    Room room3 = new Room("Living Room", 3);
    
    List < Room > books = new ArrayList < Room > ();
    books.add(room1);
    books.add(room2);
    books.add(room3);
    
    House house = new House(books);
    
    
    List < Room > rooms = house.getTotalRoomsInHouse();
    for (Room room: rooms) {
    	
      System.out.println("The Room Number of " + room.roomName + " is: " + room.roomNo);
    }
  }
}
