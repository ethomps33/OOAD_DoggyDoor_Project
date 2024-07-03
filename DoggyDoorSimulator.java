public class DoggyDoorSimulator {
    public static void main() {
        //Bark Recorder Test

        DoggyDoor door = new DoggyDoor();
        BarkRecorder recorder = new BarkRecorder(door);
        recorder.record("Woof, Woof!");
        recorder.record("Bow Wow!");
        recorder.record("Ruff");
        // System.out.println("Rari has barked.");

        // try {
        //     Thread.currentThread().sleep(5000);
        // } catch (InterruptedException e) {}

        // The Doggy Door in it's Original Barking state
        // DoggyDoor door = new DoggyDoor();
        // Remote remote = new Remote(door);
        // BarkRecorder recorder = new BarkRecorder(door);
        BarkSensor sensor = new BarkSensor(door,door.knownBarks);
        System.out.println("Rari is Barking!");
        sensor.recognize("Woof, Woof!");
        if (!door.isOpen()){
            System.out.println("The Doggy Door did not open.");
            }
            else {
                System.out.println("Rari has gone out.");
            try {
                    Thread.currentThread().sleep(10000);
                } catch (InterruptedException e) {}
            sensor.recognize("Yipp, yipppp!!!");
            System.out.println("Looks like Rari is ready to come back in.");
            System.out.println("But the door is closed...");
            System.out.println("Rari is Barking!");
            sensor.recognize("Ruff");
            if (!door.isOpen()){
                System.out.println("The Doggy Door did not open.");
                }
                else {
                    System.out.println("Rari is back inside, safe and sound!");}
                }
        // //The 'Open by Scratch' has been Activated
        // DoggyDoor door = new DoggyDoor();
        // Remote remote = new Remote(door);
        // System.out.println("Rari needs to go out!");
        // remote.scratchActivated();
        // System.out.println("Rari has gone out.");
        // try {
        //     Thread.currentThread().sleep(10000);
        // } catch (InterruptedException e) {}
        // System.out.println("Looks like the Rari is ready to come back in.");
        // remote.scratchActivated();
        // System.out.println("Rari is back inside, safe and sound!");

        // The Open only Doggy Door Feature
        // DoggyDoor door = new DoggyDoor();
        // Remote remote = new Remote(door);
        // System.out.println("Rari needs to go out!");
        // remote.scratchActivated();
        // System.out.println("Rari has gone out.");
        // try {
        //     Thread.currentThread().sleep(10000);
        // } catch (InterruptedException e) {}
        // System.out.println("Looks like the Rari is ready to come back in.");
        // remote.scratchActivated();
        // System.out.println("Rari is back inside, safe and sound!");

        
    
    }
    
}
