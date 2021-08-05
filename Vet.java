import java.io.*;

public class Vet {

    // encapsulation of class vars

    private String name;

    private String specialty;

    public Vet(String vetName, String vetSpecialty) {

        this.name = vetName;

        this.specialty = vetSpecialty;
    }

    public void main(String[] args) {

        try {

            File vetFile = new File("vetsList.txt");

            if (vetFile.createNewFile()) {

                System.out.println("File created: " + vetFile.getName());

            } else {

                System.out.println("File already exists.");
            }

        } catch (IOException e) {

            System.out.println("An error occured.");

            e.printStackTrace();
        }

        try {

            FileWriter myWriter = new FileWriter("vetsList.txt");

            myWriter.write(name + ", " + specialty);

            myWriter.close();

            System.out.println("Vet was successfully added.");

        } catch (IOException e) {

            System.out.println("An error occurred.");

            e.printStackTrace();
        }
    }

    // overriding toString method

    public String toString() {

        return String.format("Doctor " + name + "'s specialty is " + specialty);

    }
}

