import java.util.List;

public class BarkSensor {

    private DoggyDoor door;
    private BarkRecorder recorder;
    private List<String> knownBarks;
    

    BarkSensor(DoggyDoor door, List<String> knownBarks) {
        this.door = door;
        this.recorder = recorder;
        this.knownBarks = BarkRecorder.knownBarks;

    }

    public void recognize(String bark) {
        System.out.println("Bark Detected...");
        if (door.isOpen()) {
            door.close();
        } else if (knownBarks.contains(bark)) {
            door.open();
        } else {
            System.out.println("The Bark is not Recognized by the system.");
            // door.close();
        }
    }

}

