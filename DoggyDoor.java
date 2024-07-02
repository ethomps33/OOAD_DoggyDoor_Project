import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class DoggyDoor {
    private boolean open;
    private boolean activated;
    private boolean scratch;
    private boolean openOnce;
    private boolean storeBark;
    public List knownBarks = new ArrayList<String>();

    public DoggyDoor() {
        this.open = false;
        this.activated = false;
        this.scratch = false;
        this.openOnce = false;
        this.storeBark = false;
        this.knownBarks = knownBarks;
    }

    public void open() {
        // if (activated == true) {
        //     System.out.println("The Doggy Door Lock is Activated. Enter the Code to Unlock.");
        //     open = false;
        // } else if (openOnce == true) {
        //     int count = 0;
        //     if (count >= 1) {
        //         System.out.println("The Door must be manually opened.");
        //         open = false;
                
        //     } else {
        //         System.out.println("The Doggy Door is Open!");
        //         open = true;
        //     }

        // } else {}
        System.out.println("The Doggy Door is Open!");
        open = true;

        final Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                public void run() {
                    close();
                    timer.cancel();
                }
            }, ((5000)));
        
    }
    public void close() {
        System.out.println("The Doggy Door is Closed.");
        open = false;
    }
    // public void activated() {
    //     System.out.println("The Doggy Door & Window Lock has been Activated.");
    //     activated = true;
    //     open = false;
    // }
    // public void deactivated() {
    //     System.out.println("The Doggy Door & Window Lock has been Deactivated.");
    //     activated = false;
    // }
    // public void scratch() {
    //     System.out.println("The Doggy Door has been Scratch Activated.");
    //     scratch = true;
    // }
    public void storeBark(String bark){
        System.out.println("The Bark Recorder has been activated. Have your dog bark into the Doggy Door Sensor.");
        storeBark = true;
        knownBarks.add(bark);

        final Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                public void run() {
                    System.out.println("The Bark Recorder has finished recording the new bark and it can now be used with the System.");
                    storeBark = false;
                    timer.cancel();
                }
            }, 5000);
    }
    public boolean isOpen() {
        return open;
    }
    // public boolean codeEntered() {
    //     return activated;
    // }
    // public boolean scratchOn() {
    //     return scratch;
    // }
    // public boolean openOnce() {
    //     return openOnce;
    // }
    public boolean storeBarkOn() {
        return storeBark;
    }
    public List<String> getList() {
        return knownBarks;
    }

}

