public class Factory {

    private Droid[] droids;
    int capacity = 10;
    String company;
    int count;

    public Factory(String company) {
        this.company = (company != null && !company.isBlank()) ? company : "KMUTT";
        droids = new Droid[capacity];
    }

    public Droid[] getDroids() {
        return droids;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getCompany() {
        return company;
    }

    public int getCount() {
        return count;
    }

    public void setCompany(String company) {
        this.company = (company != null && !company.isBlank()) ? company : "KMUTT";
    }

    public boolean createDroid(String name) {
        if(count == droids.length && company != null && !company.isBlank()) return false;
        droids[count++] = new Droid(name);
        return true;
    }

    public int[] getAllVersion() {
        int[] allVersion = new int[count];
        for (int i = 0; i < count; i++) {
            allVersion[i] = droids[i].getVersion();
        }
        return allVersion;
    }

    public Droid getDroidByVersion(int version) {
        for (int i = 0; i < capacity; i++) {
            if(droids[i].getVersion() == version) return droids[i];
        }
        return null;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Factory{");
        sb.append("capacity=").append(capacity);
        sb.append(", company='").append(company).append('\'');
        sb.append(", count=").append(count);
        sb.append('}');
        return sb.toString();
    }
}
