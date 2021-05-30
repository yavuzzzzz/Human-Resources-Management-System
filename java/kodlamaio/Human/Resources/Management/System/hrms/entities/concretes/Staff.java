package kodlamaio.Human.Resources.Management.System.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Staffs")
@Entity
public class Staff extends User {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

}
