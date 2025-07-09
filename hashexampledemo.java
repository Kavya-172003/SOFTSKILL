import java.util.*;

class HashExample {
    Scanner sc = new Scanner(System.in);
    HashMap<Integer, String> h = new HashMap<>();

    void addPerson() {
        System.out.println("Enter number of persons:");
        int nu = sc.nextInt();
        for (int i = 0; i < nu; i++) {
            System.out.println("Enter mobile number for person " + (i + 1) + ":");
            int number = sc.nextInt();
            sc.nextLine(); // consume leftover newline
            System.out.println("Enter the name:");
            String name = sc.nextLine();
            h.put(number, name);
            System.out.println("Aadhar created successfully.");
        }
    }

    void display() {
        System.out.println("ALL DETAILS:");
        for (Map.Entry<Integer, String> entry : h.entrySet()) {
            System.out.println("Mobile: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }

    void updateAadhar() {
        System.out.println("Enter mobile number to update:");
        int number = sc.nextInt();
        sc.nextLine(); // consume newline
        if (h.containsKey(number)) {
            System.out.println("Name found in DB: " + h.get(number));
            System.out.println("Enter new name for " + number + ":");
            String newname = sc.nextLine();
            h.put(number, newname);
            System.out.println("Name updated successfully to: " + newname);
        } else {
            System.out.println("Aadhar not yet created for this number.");
        }
    }
}

public class hashexampledemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashExample u = new HashExample();

        while (true) {
            System.out.println("\n1. Add\n2. Display\n3. Update\n4. Exit");
            int key = sc.nextInt();
            switch (key) {
                case 1:
                    u.addPerson();
                    break;
                case 2:
                    u.display();
                    break;
                case 3:
                    u.updateAadhar();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.err.println("Invalid choice. Try again.");
            }
        }
    }
}
