package kodlamaio.Human.Resources.Management.System.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Human.Resources.Management.System.hrms.entities.concretes.Staff;

public interface StaffDao extends JpaRepository<Staff, Integer>{

}
