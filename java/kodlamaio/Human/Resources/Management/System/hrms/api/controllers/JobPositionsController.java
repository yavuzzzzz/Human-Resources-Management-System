package kodlamaio.Human.Resources.Management.System.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Human.Resources.Management.System.hrms.business.abstracts.JobPositionService;
import kodlamaio.Human.Resources.Management.System.hrms.core.utilities.results.DataResult;
import kodlamaio.Human.Resources.Management.System.hrms.core.utilities.results.Result;
import kodlamaio.Human.Resources.Management.System.hrms.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/job_positions")
public class JobPositionsController {

	private JobPositionService jobPositionService;

	@Autowired
	public JobPositionsController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}

	@GetMapping("/getall")
	public DataResult<List<JobPosition>> getAll() {
		return this.jobPositionService.getAll();

	}

	@PostMapping("/add")
	public Result add(@RequestBody JobPosition jobPosition) {
		return this.jobPositionService.add(jobPosition);
	}
}
