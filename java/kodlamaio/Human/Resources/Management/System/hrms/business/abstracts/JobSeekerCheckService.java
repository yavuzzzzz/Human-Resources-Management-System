package kodlamaio.Human.Resources.Management.System.hrms.business.abstracts;

import kodlamaio.Human.Resources.Management.System.hrms.entities.concretes.JobSeeker;

public interface JobSeekerCheckService {

	public boolean isVerified(JobSeeker jobSeeker);
}
