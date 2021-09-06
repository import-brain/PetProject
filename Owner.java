import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Owner
{
    
    private long id;
    
    private String name;
    
    private int numVisits;

    // owner constructor
    public Owner(long id, String name, int numVisits)
    {
        
        this.id = id;
        
        this.name = name;
        
        this.numVisits = numVisits;

    }

    @Override
    public String toString()
    {
        
        return String.format("Owner " + name + " with id " + id + " has " + numVisits + " vet visits logged.");

    }

    public String getName()
    {
        return name;
    }

    public long getId()
    {
        return id;
    }

    public int getNumVisits()
    {
        return numVisits;
    }
    // tests Owner class
    public static void main(String[] args)
    {
        
        System.out.println("Welcome to the clinic!");

        try
        {
            TimeUnit.SECONDS.sleep(2);
        }
        catch (InterruptedException e)
        {
            System.out.println("Timer thread was interrupted, exiting");
            System.exit(0); 
        }
        
        Scanner myScanner = new Scanner(System.in);

        System.out.print("What is your name? ");

        String name = myScanner.nextLine();

        Owner owner = new Owner(17, name, 3);

        System.out.println(owner.toString());

        myScanner.close();
        
    }
}
