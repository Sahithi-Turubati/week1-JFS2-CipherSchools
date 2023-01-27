package Week1;

public class Program {
    public static void main(String[] args) {
        System.out.println("HI! I am Lucy! Receptionist at Max Care");
        System.out.println("Who you looking for ?");
        System.out.println("Press 1.Physician\n2.Surgeon\n3.Dentist");

        int choice = new java.util.Scanner(System.in).nextInt();
        Main13 doc = null;
        switch (choice) {
            case 1 -> doc = new Physician();
            case 2 -> doc = new Surgeon();
            case 3 -> doc = new Dentist();
            default -> System.out.println("A Oh! Invalid Choice ");
        }
        if (choice < 0 || choice > 3) {
            System.exit(0);
        } else {
            doc.treatPatient();
        }
    }

}
