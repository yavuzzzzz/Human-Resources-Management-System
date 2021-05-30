package kodlamaio.Human.Resources.Management.System.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Human.Resources.Management.System.hrms.business.abstracts.EmployerService;
import kodlamaio.Human.Resources.Management.System.hrms.core.utilities.results.DataResult;
import kodlamaio.Human.Resources.Management.System.hrms.core.utilities.results.Result;
import kodlamaio.Human.Resources.Management.System.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Human.Resources.Management.System.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.Human.Resources.Management.System.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {

	private EmployerDao employerDao;

	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public DataResult<List<Employer>> getAll() {

		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(), "Employers listed");
	}

	@Override
	public Result add(Employer employer) {
		this.employerDao.save(employer);
		return new SuccessDataResult<Employer>("Employers added");
	}

}
