package kodlamaio.Human.Resources.Management.System.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Human.Resources.Management.System.hrms.business.abstracts.StaffService;
import kodlamaio.Human.Resources.Management.System.hrms.core.utilities.results.DataResult;
import kodlamaio.Human.Resources.Management.System.hrms.core.utilities.results.Result;
import kodlamaio.Human.Resources.Management.System.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Human.Resources.Management.System.hrms.dataAccess.abstracts.StaffDao;
import kodlamaio.Human.Resources.Management.System.hrms.entities.concretes.Staff;

@Service
public class StaffManager implements StaffService {

	private StaffDao staffDao;

	@Autowired
	public StaffManager(StaffDao staffDao) {
		super();
		this.staffDao = staffDao;
	}

	@Override
	public DataResult<List<Staff>> getAll() {
		return new SuccessDataResult<List<Staff>>(this.staffDao.findAll(), "Staffs listed");
	}

	@Override
	public Result add(Staff staff) {
		this.staffDao.save(staff);
		return new SuccessDataResult<Staff>("Staff added");
	}

}
