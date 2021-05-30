package kodlamaio.Human.Resources.Management.System.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "job_seekers")
@Entity
public class JobSeeker extends User {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "national_id")
	private int nationalityId;

	@Column(name = "birth_year")
	private int birthYear;

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getNationalityId() {
		return nationalityId;
	}

	public int getBirthYear() {
		return birthYear;
	}

}
