import java.util.Timer;
import java.util.TimerTask;

public class Remote {
    private DoggyDoor door;

    Remote (DoggyDoor door) {
        this.door = door;
    }

    public void pressButton() {
        System.out.println("Pressing the remote control button...");
        if (door.isOpen()) {
            door.close();
        } else {
            door.open();

        }

    }

    public void enterCode() {
        System.out.println("The code is being entered.");
        if (door.codeEntered()) {
            door.activated();
        } else {
            door.deactivated();
        }
    }

    public void scratchActivated() {
        System.out.println("The Dog is Scratching the Door.");
        if (door.scratchOn()) {
            System.out.println("The Scratch activation is not on");
        } else {
            door.open();

            final Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                public void run() {
                    System.out.println("The door is closing.");
                    door.close();
                    timer.cancel();
                }
            }, 5000);
        }
    }
}
