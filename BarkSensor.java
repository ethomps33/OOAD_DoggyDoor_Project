import java.util.List;

public class BarkSensor {

    private DoggyDoor door;
    

    BarkSensor(DoggyDoor door, List<String> knownBarks) {
        this.door = door;

    }

    public void recognize(String bark) {
        System.out.println("Bark Detected...");
        if (door.isOpen()) {
            door.close();
        } else {
            door.equals(bark);
        }
    }

}

