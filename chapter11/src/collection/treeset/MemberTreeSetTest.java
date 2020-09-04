package collection.treeset;

public class MemberTreeSetTest {
	
	public static void main (String[] args) {
		
		MemberTreeSet manager = new MemberTreeSet();
		
		Member memberLee = new Member(100, "Lee");
		Member memberKIm = new Member(200, "Kim");
		Member memberPark = new Member(300, "Park");
		
		
		manager.addMember(memberLee);
		manager.addMember(memberKIm);
		manager.addMember(memberPark);
		
		
		manager.showAllMember();
		
		
	}

}
