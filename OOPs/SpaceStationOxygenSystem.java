public class OxygenSystem {
    // instance variables
    private int tankID;
    private int currentOxygenLevel;
    private int maxCapacity;
    private String status;

    private static int totalOxygenInStation;
    private static int totalTanks;
    private static int nextTankID;

    // static initialization
    static {
        totalOxygenInStation = 0;
        totalTanks = 0;
        nextTankID = 1;
    }

    // instance initialization
    {
        tankID = nextTankID++;
        totalTanks++;
        currentOxygenLevel = 0;
    }

    public OxygenSystem(int maxCapacity, String status) {
        this.maxCapacity = maxCapacity;
        this.status = status.toUpperCase();
    }

    public int getTankID() {
        return tankID;
    }

    public int getCurrentOxygenLevel() {
        return currentOxygenLevel;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public String getTankStatus() {
        return status;
    }

    public void addOxygen(int liters) {
        if (!status.equals("ACTIVE")) {
            System.out.println("Cannot add oxygen: Tank " + tankID + " is inactive");
            return;
        }
        if (currentOxygenLevel + liters > maxCapacity) {
            liters = maxCapacity - currentOxygenLevel; // add only up to max
        }
        currentOxygenLevel += liters;
        totalOxygenInStation += liters;

        System.out.println("Tank " + tankID + " current oxygen: " + currentOxygenLevel + " liters");
    }

    public void consumeOxygen(int liters) {
        if (!status.equals("ACTIVE")) {
            System.out.println("Cannot consume oxygen: Tank " + tankID + " is inactive");
            return;
        }
        if (currentOxygenLevel < liters) {
            liters = currentOxygenLevel; // consume only available oxygen
        }
        currentOxygenLevel -= liters;
        totalOxygenInStation -= liters;

        System.out.println("Tank " + tankID + " consumed " + liters + " liters. Current level: " + currentOxygenLevel + " liters");
    }

    public void activateTank() {
        if (status.equals("INACTIVE")) {
            status = "ACTIVE";
            totalOxygenInStation += currentOxygenLevel;
            System.out.println("Tank " + tankID + " activated.");
        }
    }

    public void deactivateTank() {
        if (status.equals("ACTIVE")) {
            status = "INACTIVE";
            totalOxygenInStation -= currentOxygenLevel;
            System.out.println("Tank " + tankID + " deactivated. Oxygen removed from station total.");
        }
    }

    public static int getTotalOxygenInStation() {
        return totalOxygenInStation;
    }

    public static int getTotalTanks() {
        return totalTanks;
    }

    public static void main(String[] args) {

        OxygenSystem tank1 = new OxygenSystem(500, "ACTIVE");
        OxygenSystem tank2 = new OxygenSystem(300, "ACTIVE");
        OxygenSystem tank3 = new OxygenSystem(200, "INACTIVE");

        tank1.addOxygen(400);
        tank2.addOxygen(200);
        tank3.addOxygen(100);

        tank1.consumeOxygen(50);
        tank2.deactivateTank();

        tank3.activateTank();
        tank3.addOxygen(150);

        System.out.println("Tank 1 status: " + tank1.getTankStatus() + ", oxygen: " + tank1.getCurrentOxygenLevel() + " liters");
        System.out.println("Tank 2 status: " + tank2.getTankStatus() + ", oxygen: " + tank2.getCurrentOxygenLevel() + " liters");
        System.out.println("Tank 3 status: " + tank3.getTankStatus() + ", oxygen: " + tank3.getCurrentOxygenLevel() + " liters");
        System.out.println("Total oxygen in station: " + OxygenSystem.getTotalOxygenInStation() + " liters");
        System.out.println("Total tanks created: " + OxygenSystem.getTotalTanks());
    }
}
