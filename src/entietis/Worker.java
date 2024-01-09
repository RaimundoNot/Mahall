package entietis;

public class Worker {

	private String function;
	private Double salary;
	private Integer id;
	

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Worker function: " + function + ", salary: " + salary + ", id: " + id;
	}
	
	
}
