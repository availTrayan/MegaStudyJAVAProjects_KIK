package test;

public class JypEntertainment {
	
	public void actorAudition(Act applicant) { // EntertainerApplicant 객체 업캐스팅으로 전달
		
		applicant.act();
	}
	
	public void idolAudition(Sing applicant) {
		applicant.sing();
	}

}
