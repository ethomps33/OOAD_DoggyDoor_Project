
public class BarkRecorder {
    
    private DoggyDoor door;
    

    public BarkRecorder(DoggyDoor door) {
        this.door = door;

    }

    public void record(String bark) {
        if (door.storeBarkOn()) {
            System.out.println("The Bark Recorder is not activated.");
        } else {
            door.storeBark(bark);
            
        }
    }


}