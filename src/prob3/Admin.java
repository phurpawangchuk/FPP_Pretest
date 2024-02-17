package prob3;
import java.util.*;
public class Admin {
	public static List<LibraryMember>/*<implement>*/ combineLists(List<Faculty> faculty, List<Student> students) {
		//implement
		List<LibraryMember> memberList = new ArrayList<LibraryMember>();
		memberList.addAll(faculty);
		memberList.addAll(students);
		return memberList;
	}
	
	public static int countNumOverdueBooks(List<LibraryMember>/*<implement>*/ allMembers) {
		//implement
		int count=0;
		
		for(int i=0; i<allMembers.size(); i++) 
		{
			count += (allMembers.get(i).getRecord().getOverdueBooks().size());
		}
		
		return count;
	}
}
