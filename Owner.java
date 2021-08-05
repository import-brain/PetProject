import java.io.*;

public class Owner
{

    // encapsulation

    private String name;

    private int numberOfPets;

    private String petType;

    public Owner(String name, int numberOfPets, String petType)
    {

        this.name = name;

        this.numberOfPets = numberOfPets;

        this.petType = petType;
    }

    // testing

    public void main(String[] args)
    {

        try
        {

            File ownerFile = new File("ownersList.txt");

            if (ownerFile.createNewFile())
            {

                System.out.println("File created: " + ownerFile.getName());

            }   else
            {

                System.out.println("File already exists.");

            }

        } catch (IOException e)
        {

            System.out.println("An error occured.");

            e.printStackTrace();

        }

        try
        {

            FileWriter myWriter = new FileWriter("ownersList.txt");

            myWriter.write(name + ", " + numberOfPets + " pets");

            myWriter.close();

            System.out.println("Owner was successfully added.");

        } catch (IOException e)
        {

            System.out.println("An error occured.");

            e.printStackTrace();
        }
    }

    // override toString

    public String toString()
    {

        return String.format(name + " has " + numberOfPets + " pet(s): a " + petType);

    }


    }