package kodlamaio.Human.Resources.Management.System.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Human.Resources.Management.System.hrms.business.abstracts.JobPositionService;
import kodlamaio.Human.Resources.Management.System.hrms.core.utilities.results.DataResult;
import kodlamaio.Human.Resources.Management.System.hrms.core.utilities.results.Result;
import kodlamaio.Human.Resources.Management.System.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Human.Resources.Management.System.hrms.dataAccess.abstracts.JobPositionDao;
import kodlamaio.Human.Resources.Management.System.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {

	private JobPositionDao jobPositionDao;

	@Autowired
	public JobPositionManager(JobPositionDao jobpositiondao) {
		super();
		this.jobPositionDao = jobpositiondao;
	}

	@Override
	public DataResult<List<JobPosition>> getAll() {
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(), "Positions listed");

	}

	@Override
	public Result add(JobPosition jobPosition) {
		this.jobPositionDao.save(jobPosition);
		return new SuccessDataResult<JobPosition>("Job positions added");
	}

}
