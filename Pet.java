import java.io.*;

public class Pet
{

    private String name;

    private long id;

    private String pet;

    public Pet(String name, long id, String pet)
    {

        this.name = name;

        this.id = id;

        this.pet = pet;
    }

    public String toString()
    {

        return String.format(name + " is a " + pet + " whose ID is " + id);

    }
    public void main(String[] args)
    {

        try
        {

            File file = new File("pets.txt");

            if (file.createNewFile())
            {

                System.out.println("File created: " + file.getName());

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

            FileWriter myWriter = new FileWriter("pets.txt");

            myWriter.write(name + ", " + id);

            myWriter.close();

            System.out.println("Pet was successfully added");

        } catch (IOException e)
        {

            System.out.println("An error occured.");

            e.printStackTrace();
        }

        }
    }