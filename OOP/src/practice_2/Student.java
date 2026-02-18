package practice_2;

public class Student
{
    private String name;
    private String id;
    private int year;

    public Student(String name, String id)
    {
        this.name = name;
        this.id = id;
        year = 1;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public void nextYear()
    {
        year++;
    }

    public String toString()
    {
        return "practice_2.Student {" +
                "  \nName: " + name +
                "  \nID: " + id +
                "  \nYear: " + year +
                "\n}\n";
    }
}