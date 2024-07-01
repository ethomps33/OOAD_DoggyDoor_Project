import java.util.ArrayList;
import java.util.List;

public class BarkRecorder {
    
    private DoggyDoor door;
    public static List knownBarks = new ArrayList<String>();

    public BarkRecorder(DoggyDoor door) {
        this.door = door;

    }

    public List<String> geList() {
        return knownBarks;
    }

    public void record(String bark) {
        if (door.storeBarkOn()) {
            System.out.println("The Bark Recorder is not activated.");
        } else {
            door.storeBark();
            knownBarks.add(bark);
        }
    }


}