public class Employee {
    private static int counter = 1;

    private int ID;
    private String fullName;
    private int departement;
    private int salery;

    public Employee(String fullName, int departement, int salery) {
        this.fullName = fullName;
        this.departement = departement;
        this.salery = salery;
        this.ID = counter++;
    }

    public int getID() {
        return ID;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartement() {
        return departement;
    }

    public int getSalery() {
        return salery;
    }

    public void setDepartement(int departement) {
        this.departement = departement;
    }

    public void setSalery(int salery) {
        this.salery = salery;
    }

    @Override
    public String toString() {
        return
                "ID=" + ID +
                " ФИО" + fullName + "." +
                " Номер отдела: " + departement +
                ", зарплата сорудника: " + salery + ".";
    }
}
