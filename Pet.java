// creates a new pet class
public class Pet
{
    
    private String type;
    
    private String name;
    
    private int age;

    private long id;

    // pet constructor
    public Pet(String type, String name, int age, long id)
    {
        
        this.name = name;
        
        this.age = age;
        
        this.type = type;

        this.id = id;

    }
    
// note to self, String.format uses + for concatenation, not a comma
    @Override
    public String toString()
    {
        return String.format("Animal of type " + type + " with name " + name + " and id " + id + " is " + age + " years old.");
    }

    public String getName()
    {
        return name;
    }

    public long getId()
    {
        return id;
    }

    public String getType()
    {
        return type;
    }

    public int getAge()
    {
        return age;
    }

    // tests the pet class
    public static void main(String[] args)
    {
      
        Pet liz = new Pet("cat", "Liz", 3, 15);

        Pet duke = new Pet("dog", "Duke", 7, 18);

        System.out.println(liz.toString());

        System.out.println(duke.toString());
        
        System.out.println(liz.getAge());

        System.out.println(duke.getAge());
        
    }
}
