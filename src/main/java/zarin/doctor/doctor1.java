package zarin.doctor;

public class doctor1 {
    private String name;
    private int ID;

    public doctor1(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "doctor1{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                '}';
    }
}
