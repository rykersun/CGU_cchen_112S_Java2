
public class B1144142 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CourseGrades courseGrades = new CourseGrades();
		GradedActivity gradedActivity = new GradedActivity();
		
		gradedActivity.setScore(90);
		courseGrades.setLab(gradedActivity);
		
		PassFailExam passFailExam = new PassFailExam(10, 2, 70);
		courseGrades.setPassFailExam(passFailExam);
		
		FinalExam finalExam = new FinalExam(50, 6);
		courseGrades.setFinalExam(finalExam);
		
		System.out.println(courseGrades);

	}

}
