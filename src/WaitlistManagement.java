// Team 06
// WaitListManagement Unit Code

import java.util.ArrayList;
import java.util.List;

public class WaitlistManagement {
    public static final int NONE = -1;
    private final List<Integer> applicantIds = new ArrayList<>();

    // method to add an applicant to the waitlist via applicant ID
    public void addToWaitlist(int applicantId) {
        applicantIds.add(applicantId);
    }

    // method to get the position of an applicant using its applicant ID
    public int getPosition(int applicantId) {
        int index = applicantIds.indexOf(applicantId);
        return index == -1 ? NONE : index + 1; // either return -1 if it doesn't exist or position
    }
}
