import java.util.*;

public class MemberCheck {
    public String[] whosDishonest(String[] club1, 
                                    String[] club2, 
                                    String[] club3) {
        HashSet<String> c1 = new HashSet<String>();
        HashSet<String> c2 = new HashSet<String>();
        HashSet<String> c3 = new HashSet<String>();
        HashSet<String> intersection = new HashSet<String>();

        for(String member: club1) {
            c1.add(member);
        }
        for(String member: club2) {
            c2.add(member);
        }
        for(String member: club3) {
            c3.add(member);
        }

        for(String member: c1) {
            if(c2.contains(member) || c3.contains(member)) {
                intersection.add(member);
            }
        }
        for(String member: c2) {
            if(c1.contains(member) || c3.contains(member)) {
                intersection.add(member);
            }
        }

        String[] ret = new String[intersection.size()]; 
        ret = intersection.toArray(ret); 
        Arrays.sort(ret);
        return ret;
    }
}