package Login;

public class Aluno {
	protected String name;
	protected String id;
	protected String dueDate;
	
	Aluno (String name, String id, String dueDate){
		this.name = name;
		this.id = id;
		this.dueDate = dueDate;
	};
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	};
	
	

}
