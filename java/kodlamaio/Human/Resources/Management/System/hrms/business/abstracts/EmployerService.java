package kodlamaio.Human.Resources.Management.System.hrms.business.abstracts;

import java.util.List;

import kodlamaio.Human.Resources.Management.System.hrms.core.utilities.results.DataResult;
import kodlamaio.Human.Resources.Management.System.hrms.core.utilities.results.Result;
import kodlamaio.Human.Resources.Management.System.hrms.entities.concretes.Employer;

public interface EmployerService {
	DataResult<List<Employer>> getAll();

	Result add(Employer employer);
}
