package testing.example.com.dataObjects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee
{
    @Id
    String id;
    String name;

    Employee() { }

    public Employee(String id, String name)
    {
        this.id = id;
        this.name =name;
    }

    public String getId() {return id;}
    public String getName() {return name;}
}
