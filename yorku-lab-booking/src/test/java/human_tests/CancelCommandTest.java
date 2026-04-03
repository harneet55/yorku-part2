package human_tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.yorku.booking.BookingFacade;
import com.yorku.command.CancelCommand;
import com.yorku.command.ReserveCommand;
import com.yorku.equipment.Equipment;
import com.yorku.users.Faculty;
import com.yorku.users.Guest;
import com.yorku.users.Researcher;
import com.yorku.users.Student;
import com.yorku.users.User;

public class CancelCommandTest {

    @Test
    void cancelCommandWorksForStudent() {
        FakeBookingFacade booking = new FakeBookingFacade();
        User user = new Student("student1@yorku.ca", "pass", "S-11");
        Equipment equipment = new Equipment("EQ-401", "Microscope", "Lab A");

        CancelCommand command = new CancelCommand(booking, user, equipment);
        command.execute();

        assertTrue(booking.cancelCalled);
        assertSame(user, booking.savedUser);
        assertSame(equipment, booking.savedEquipment);
    }

    @Test
    void cancelCommandWorksForFaculty() {
        FakeBookingFacade booking = new FakeBookingFacade();
        User user = new Faculty("faculty1@yorku.ca", "pass", "F-11");
        Equipment equipment = new Equipment("EQ-402", "Spectrometer", "Lab B");

        new CancelCommand(booking, user, equipment).execute();

        assertSame(user, booking.savedUser);
        assertSame(equipment, booking.savedEquipment);
    }

    @Test
    void cancelCommandWorksForResearcher() {
        FakeBookingFacade booking = new FakeBookingFacade();
        User user = new Researcher("researcher1@yorku.ca", "pass", "R-11");
        Equipment equipment = new Equipment("EQ-403", "Centrifuge", "Lab C");

        new CancelCommand(booking, user, equipment).execute();

        assertSame(user, booking.savedUser);
    }

    @Test
    void cancelCommandWorksForGuest() {
        FakeBookingFacade booking = new FakeBookingFacade();
        User user = new Guest("guest1@email.com", "pass", "G-11");
        Equipment equipment = new Equipment("EQ-404", "Laser Cutter", "Lab D");

        new CancelCommand(booking, user, equipment).execute();

        assertSame(user, booking.savedUser);
    }

    @Test
    void cancelCommandPassesAvailableEquipment() {
        FakeBookingFacade booking = new FakeBookingFacade();
        User user = new Student("student2@yorku.ca", "pass", "S-12");
        Equipment equipment = new Equipment("EQ-405", "3D Printer", "Lab E");

        new CancelCommand(booking, user, equipment).execute();

        assertSame(equipment, booking.savedEquipment);
        assertTrue(booking.savedEquipment.isAvailable());
    }

    @Test
    void cancelCommandPassesUnavailableEquipment() {
        FakeBookingFacade booking = new FakeBookingFacade();
        User user = new Student("student3@yorku.ca", "pass", "S-13");
        Equipment equipment = new Equipment("EQ-406", "Pipette Set", "Lab F");
        equipment.setAvailable(false);

        new CancelCommand(booking, user, equipment).execute();

        assertSame(equipment, booking.savedEquipment);
        assertTrue(!booking.savedEquipment.isAvailable());
    }

    @Test
    void cancelCommandCanPassNullUser() {
        FakeBookingFacade booking = new FakeBookingFacade();
        Equipment equipment = new Equipment("EQ-407", "Incubator", "Lab G");

        new CancelCommand(booking, null, equipment).execute();

        assertNull(booking.savedUser);
        assertSame(equipment, booking.savedEquipment);
    }

    @Test
    void cancelCommandCanPassNullEquipment() {
        FakeBookingFacade booking = new FakeBookingFacade();
        User user = new Student("student4@yorku.ca", "pass", "S-14");

        new CancelCommand(booking, user, null).execute();

        assertSame(user, booking.savedUser);
        assertNull(booking.savedEquipment);
    }

    @Test
    void cancelCommandCanRunTwice() {
        FakeBookingFacade booking = new FakeBookingFacade();
        User user = new Student("student5@yorku.ca", "pass", "S-15");
        Equipment equipment = new Equipment("EQ-408", "Autoclave", "Lab H");
        CancelCommand command = new CancelCommand(booking, user, equipment);

        command.execute();
        command.execute();

        assertEquals(2, booking.callCount);
    }

    @Test
    void cancelCommandThrowsIfBookingFacadeIsNull() {
        User user = new Student("student6@yorku.ca", "pass", "S-16");
        Equipment equipment = new Equipment("EQ-409", "Flow Cytometer", "Lab I");
        CancelCommand command = new CancelCommand(null, user, equipment);

        assertThrows(NullPointerException.class, command::execute);
    }

    @Test
    void reserveThenCancelMakesEquipmentAvailableAgain() {
        BookingFacade booking = new BookingFacade();
        User user = new Student("student7@yorku.ca", "pass", "S-17");
        Equipment equipment = new Equipment("EQ-410", "Signal Monitor", "Lab J");

        new ReserveCommand(booking, user, equipment, 2).execute();
        assertTrue(!equipment.isAvailable());

        new CancelCommand(booking, user, equipment).execute();

        assertTrue(equipment.isAvailable());
    }

    @Test
    void cancelWithoutReservationDoesNotChangeEquipment() {
        BookingFacade booking = new BookingFacade();
        User user = new Student("student8@yorku.ca", "pass", "S-18");
        Equipment equipment = new Equipment("EQ-411", "Voltage Meter", "Lab K");

        new CancelCommand(booking, user, equipment).execute();

        assertTrue(equipment.isAvailable());
    }

    private static class FakeBookingFacade extends BookingFacade {
        boolean cancelCalled;
        int callCount;
        User savedUser;
        Equipment savedEquipment;

        @Override
        public void cancelReservation(User user, Equipment equipment) {
            cancelCalled = true;
            callCount++;
            savedUser = user;
            savedEquipment = equipment;
        }
    }
}
