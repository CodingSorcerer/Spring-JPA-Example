package testing.example.com.repositories;

import net.lonewolfcode.opensource.springutilities.annotations.CrudRepo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import testing.example.com.dataObjects.Employee;

@Repository
@CrudRepo(entityClass = Employee.class, basePathName = "test")
public interface EmployeeRepository extends CrudRepository<Employee,String>
{
}
