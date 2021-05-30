package kodlamaio.Human.Resources.Management.System.hrms.business.abstracts;

import java.util.List;

import kodlamaio.Human.Resources.Management.System.hrms.core.utilities.results.DataResult;
import kodlamaio.Human.Resources.Management.System.hrms.entities.concretes.User;

public interface UserService {
	DataResult<List<User>> getAll();

}
