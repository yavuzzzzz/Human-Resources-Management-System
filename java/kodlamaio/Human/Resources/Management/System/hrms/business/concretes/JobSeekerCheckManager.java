package kodlamaio.Human.Resources.Management.System.hrms.business.concretes;

import org.springframework.stereotype.Service;

import kodlamaio.Human.Resources.Management.System.hrms.business.abstracts.JobSeekerCheckService;
import kodlamaio.Human.Resources.Management.System.hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerCheckManager implements JobSeekerCheckService {

	@Override
	public boolean isVerified(JobSeeker jobSeeker) {
		return jobSeeker.getId() != 0 && jobSeeker.getFirstName() != null && jobSeeker.getLastName() != null
				&& jobSeeker.getNationalityId() != 0;
	}

}
