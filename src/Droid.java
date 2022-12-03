import java.util.Objects;

public class Droid {
    private String name;
    private int version;
    static int nextVersion = 0;
    private int batteryLevel;

    public Droid(String name) {
        this.name = (name != null && !name.isBlank()) ? name : "Codey";
        this.version = nextVersion++;
        this.batteryLevel = 100;
    }

    public String getName() {
        return name;
    }

    public int getVersion() {
        return version;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setName(String name) {
        this.name = (name != null && !name.isBlank()) ? name : "Codey";
    }

    public String performTask(String task) {
        batteryLevel -= 20;
        if(batteryLevel == 0) {
            return "Error, out of battery";
        } else if (batteryLevel <= 20) {
            return this.name + " is performing " + task + ": " + "battery is running low";
        }

        return this.name + " is performing " + task;
    }

    public void chargeBattery(int battery) {
        batteryLevel += battery;
        batteryLevel = Math.min(batteryLevel, 100);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("[Droid: ");
        sb.append(version);
        sb.append(" (").append(name);
        sb.append("), Battery : ").append(batteryLevel);
        sb.append(']');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Droid droid = (Droid) o;

        if (version != droid.version) return false;
        if (batteryLevel != droid.batteryLevel) return false;
        return Objects.equals(name, droid.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + version;
        result = 31 * result + batteryLevel;
        return result;
    }
}
