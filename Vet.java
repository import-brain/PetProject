public class Vet {
    
    private String specialty;
    
    private String name;
    
    private int yearsOfExperience;

    // vet constructor

    public Vet(String name, String specialty, int yearsOfExperience)
    {
        
        this.name = name;
        
        this.specialty = specialty;
        
        this.yearsOfExperience = yearsOfExperience;

    }

    public String toString()
    {
        return String.format("Vet " + name + " with " + yearsOfExperience + " years of experience is a " + specialty + " doctor.");
    }

    public int getYearsOfExperience()
    {
        return yearsOfExperience;
    }

    public String getName()
    {
        return name;
    }

    public String getSpecialty()
    {
        return specialty;
    }
    // tests vet class
    public static void main(String[] args)
    {
        
        Vet jill = new Vet("Jill", "GI", 12);
        
        System.out.println(jill.toString());
        
        System.out.println(jill.getYearsOfExperience());
        
        System.out.println(jill.getSpecialty());

    }
}
