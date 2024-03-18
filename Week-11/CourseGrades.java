
public class CourseGrades {
	
	private GradedActivity[] grades = new GradedActivity[3];
	
	public void setLab(GradedActivity gradedActivity) {
		this.grades[0] = gradedActivity;
	}
	
	public void setPassFailExam(PassFailExam passFailExam) {
		this.grades[1] = passFailExam;
	}
	
	public void setFinalExam(FinalExam finalExam) {
		this.grades[2] = finalExam;
	}
	
	@Override
	public String toString() {
		return "GradedActivity's score: " + this.grades[0].getScore() + "\n" + 
			   "GradedActivity's grade: " + this.grades[0].getGrade() + "\n" + 
			   "\n" + 
		       "PassFailExam's score: " + this.grades[1].getScore() + "\n" + 
			   "PassFailExam's grade: " + this.grades[1].getGrade() + "\n" + 
			   "\n" + 
		       "FinalExam's score: " + this.grades[2].getScore() + "\n" + 
			   "FinalExam's grade: " + this.grades[2].getGrade() + "\n";
	}

}

