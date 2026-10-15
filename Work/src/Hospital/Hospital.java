package Hospital;

class Patient {
    String name;
    double consultFee;

    public Patient(String name, double consultFee) {
        this.name = name;
        this.consultFee = consultFee;
    }

    public void display() {
        System.out.println("Patient Display");
        System.out.println("Name: " + name);
        System.out.println("Consult Fee: $" + consultFee);
    }
}

class Outpatient extends Patient {
    double labCharge;

    public Outpatient(String name, double consultFee, double labCharge) {
        super(name, consultFee);
        this.labCharge = labCharge;
    }

    public double calculateBill() {
        return labCharge + consultFee;
    }

    @Override
    public void display() {
        System.out.println("Outpatient Display");
        System.out.println("Name: " + name);
        System.out.println("Consult Fee: $" + consultFee);
        System.out.println("Lab Charge: $" + labCharge);
        System.out.println("Total Bill: $" + calculateBill());
    }
}

class Inpatient extends Patient {
    double roomCharge;
    int numberOfDays;

    public Inpatient(String name, double consultFee, int numberOfDays, double roomCharge) {
        super(name, consultFee);
        this.numberOfDays = numberOfDays;
        this.roomCharge = roomCharge;
    }

    public double calculateBill() {
        return numberOfDays * roomCharge+ consultFee;
    }

    @Override
    public void display() {
        System.out.println("Inpatient Display");
        System.out.println("Name: " + name);
        System.out.println("Consult Fee: $" + consultFee);
        System.out.println("Room Charge per day: $" + roomCharge);
        System.out.println("Number of Days: " + numberOfDays);
        System.out.println("Total Bill: $" + calculateBill());
    }
}

public class Hospital {
    public static void main() {
        Outpatient patient1 = new Outpatient("Mustaf", 10, 7);
        patient1.display();

        System.out.println();

        Inpatient patient2 = new Inpatient("Ali", 20, 50, 3);
        patient2.display();
    }
}