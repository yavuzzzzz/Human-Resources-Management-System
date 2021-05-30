package kodlamaio.Human.Resources.Management.System.hrms.business.concretes;

import org.springframework.stereotype.Service;

import kodlamaio.Human.Resources.Management.System.hrms.business.abstracts.EmployerCheckService;
import kodlamaio.Human.Resources.Management.System.hrms.entities.concretes.Employer;

@Service
public class EmployerCheckManager implements EmployerCheckService {

	@Override
	public boolean isEmailAcceptable(Employer employer) {
		return employer.getCompanyEmail() != null && employer.getCompanyName() != null
				&& employer.getWebAddress() != null;
	}

}
