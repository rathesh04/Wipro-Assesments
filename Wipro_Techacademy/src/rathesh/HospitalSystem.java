package rathesh;
import java.util.*;
class Patient {

    private int id;
    private int age;
    private String name;
    private String disease;

    Patient(int id, int age, String name, String disease) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.disease = disease;
    }
    public int getId() {
    	return id; 
    }
    public int getAge() {
    	return age;
    }
    public String getName() {
    	return name; 
    }
    public String getDisease() {
    	return disease; 
    }

    public void setAge(int age) {
    	this.age = age; 
    }
    public void setName(String name) {
    	this.name = name;
    }
    public void setDisease(String disease) {
    	this.disease = disease;
    }

    public String toString() {
        return id + " " + name + " " + age + " " + disease;
    }
}
public class HospitalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Patient> patients = new HashMap<>();
        int choice;
        System.out.println("1. Add patient");
        System.out.println("2. Update patient details");
            System.out.println("3. Retrieve patient details");
            System.out.println("4. Remove patient");
            System.out.println("5. Check existence of a patient");
            System.out.println("6. Count total patients");
            System.out.println("7. Clear system");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter id: ");
                    int id = sc.nextInt();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    System.out.print("Enter name: ");
                    String name = sc.next();
                    System.out.print("Enter disease: ");
                    String disease = sc.next();

                    patients.put(id, new Patient(id, age, name, disease));
                    System.out.println("Patient added");
                    break;
                case 2:
                    System.out.print("Enter id to update: ");
                    id = sc.nextInt();
                    if (patients.containsKey(id)) {
                        Patient p = patients.get(id);
                        System.out.print("Enter new name: ");
                        p.setName(sc.next());
                        System.out.print("Enter new age: ");
                        p.setAge(sc.nextInt());
                        System.out.print("Enter new disease: ");
                        p.setDisease(sc.next());
                        System.out.println("Patient updated");
                    } else {
                        System.out.println("Patient not found");
                    }
                    break;
                case 3:
                    System.out.print("Enter id to retrieve: ");
                    id = sc.nextInt();
                    if (patients.containsKey(id)) {
                        System.out.println(patients.get(id));
                    } else {
                        System.out.println("Patient not found");
                    }
                    break;
                case 4:
                    System.out.print("Enter id to remove: ");
                    id = sc.nextInt();
                    if (patients.containsKey(id)) {
                        patients.remove(id);
                        System.out.println("Patient removed");
                    } else {
                        System.out.println("Patient not found");
                    }
                    break;
                case 5:
                    System.out.print("Enter id to check: ");
                    id = sc.nextInt();
                    System.out.println(patients.containsKey(id));
                    break;
                case 6:
                    System.out.println("Total patients: " + patients.size());
                    break;
                case 7:
                    patients.clear();
                    break;                
                default:
                    System.out.println("Invalid choice");
            }sc.close();
    }
}
