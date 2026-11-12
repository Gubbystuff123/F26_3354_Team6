// Team 06
// WaitListManagementTest Code

// JUnit imports
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WaitlistManagementTest {

    // creating the waitlist list for testing
    private WaitlistManagement list;

    @Before
    public void setUp() {
        list = new WaitlistManagement();
    }

    // tests listedin orer

    @Test // TC-1
    public void firstApplicantAdded_isPositionOne() {
        list.addToWaitlist(1);
        assertEquals(1, list.getPosition(1));
    }

    @Test // TC-2
    public void applicants_getPositionsInOrderAdded() {
        list.addToWaitlist(1);
        list.addToWaitlist(2);
        list.addToWaitlist(3);
        assertEquals(1, list.getPosition(1));
        assertEquals(2, list.getPosition(2));
        assertEquals(3, list.getPosition(3));
    }

    @Test // TC-3
    public void applicantNotOnList_hasNoPosition() {
        list.addToWaitlist(1);
        assertEquals(WaitlistManagement.NONE, list.getPosition(10));
    }

    @Test // TC-4
    public void emptyWaitlist_hasNoPosition() {
        assertEquals(WaitlistManagement.NONE, list.getPosition(1));
    }
}