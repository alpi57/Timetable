/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package timeTableModel;

import java.util.HashSet;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of TurntableStudent.
 * 
 * @author aguler
 */
public class TimetableStudent extends turntable {
	/**
	 * Description of the property id_turntable.
	 */
	private Integer id_turntable;

	/**
	 * Description of the property list_booking.
	 */
	public HashSet<Booking> bookings = new HashSet<Booking>();
	
	// Start of user code (user defined attributes for TurntableStudent)
	
	// End of user code

	/**
	 * The constructor.
	 */
	public TimetableStudent() {
		// Start of user code constructor for TurntableStudent)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for TurntableStudent)

	// End of user code
	/**
	 * Returns id_turntable.
	 * @return id_turntable 
	 */
	public int getId_turntable() {
		return this.id_turntable;
	}

	/**
	 * Sets a value to attribute id_turntable. 
	 * @param newId_turntable 
	 */
	public void setId_turntable(Integer newId_turntable) {
		this.id_turntable = newId_turntable;
	}

	/**
	 * Returns list_booking.
	 * @return list_booking 
	 */
	public HashSet<Booking> getbooking() {
		return this.bookings;
	}

	/**
	 * Sets a value to attribute list_booking. 
	 * @param newList_booking 
	 */
	public void setList_booking(HashSet<Booking> newList_booking) {
		this.bookings = newList_booking;
	}

}
