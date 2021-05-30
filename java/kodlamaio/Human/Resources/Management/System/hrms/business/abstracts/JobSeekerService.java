package kodlamaio.Human.Resources.Management.System.hrms.business.abstracts;

import java.util.List;

import kodlamaio.Human.Resources.Management.System.hrms.core.utilities.results.DataResult;
import kodlamaio.Human.Resources.Management.System.hrms.core.utilities.results.Result;
import kodlamaio.Human.Resources.Management.System.hrms.entities.concretes.JobSeeker;

public interface JobSeekerService {
	DataResult<List<JobSeeker>> getAll();

	Result add(JobSeeker jobSeeker);
}
