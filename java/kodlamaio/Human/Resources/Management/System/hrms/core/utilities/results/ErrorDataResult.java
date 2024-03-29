package kodlamaio.Human.Resources.Management.System.hrms.core.utilities.results;

public class ErrorDataResult<T> extends DataResult<T> {
	public ErrorDataResult(T data, String message) {
		super(data, true, message);
	}

	public ErrorDataResult(String message) {
		super(null, false, message);
	}

	public ErrorDataResult(T data) {
		super(data, false);
	}

	public ErrorDataResult() {
		super(null, false);
	}
}
