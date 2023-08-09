package practice_HashMap_question;
//this is mutable class
public class FackStudentMutable  extends Student{

	private String fakeStudentName;
	
	
	public FackStudentMutable(String name) {
		super(name);
		this.setFakeStudentName(name);
	}

	@Override
	public String getName() {
		return fakeStudentName;
	}


	public void setFakeStudentName(String fakeStudentName) {
		this.fakeStudentName = fakeStudentName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((fakeStudentName == null) ? 0 : fakeStudentName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		FackStudentMutable other = (FackStudentMutable) obj;
		if (fakeStudentName == null) {
			if (other.fakeStudentName != null)
				return false;
		} else if (!fakeStudentName.equals(other.fakeStudentName))
			return false;
		return true;
	}
	
	
	
	

}
