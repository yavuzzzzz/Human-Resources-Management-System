package kodlamaio.Human.Resources.Management.System.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties.Job;
import org.springframework.stereotype.Service;

import kodlamaio.Human.Resources.Management.System.hrms.business.abstracts.JobSeekerService;
import kodlamaio.Human.Resources.Management.System.hrms.core.utilities.results.DataResult;
import kodlamaio.Human.Resources.Management.System.hrms.core.utilities.results.Result;
import kodlamaio.Human.Resources.Management.System.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Human.Resources.Management.System.hrms.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.Human.Resources.Management.System.hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService {

	private JobSeekerDao jobSeekerDao;

	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
		super();
		this.jobSeekerDao = jobSeekerDao;
	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(),"Job seekers listed");
	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		this.jobSeekerDao.save(jobSeeker);
		return new SuccessDataResult<Job>("Job seekers added ");
	}

}
