/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package timeTableModel;

import java.util.HashSet;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of turntable (abstract).
 * 
 * @author aguler
 */
public abstract class Timetable {
	/**
	 * Description of the property id_turntable.
	 */
	private Integer id_turntable;
	
	/**
	 * Description of the property bookings.
	 */
	public HashSet<Booking> bookings = new HashSet<Booking>();
	
	// Start of user code (user defined attributes for turntable (abstract))
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public Timetable() {
		// Start of user code constructor for turntable (abstract))
		super();
		// End of user code
	}
	
	// Start of user code (user defined methods for turntable (abstract))
	
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
	public void setId_turntable(int newId_turntable) {
	    this.id_turntable = newId_turntable;
	}

	/**
	 * Returns bookings.
	 * @return bookings 
	 */
	public HashSet<Booking> getBookings() {
		return this.bookings;
	}

	public void setList_booking(HashSet<Booking> newList_booking) {
		this.bookings = newList_booking;
	}

}
