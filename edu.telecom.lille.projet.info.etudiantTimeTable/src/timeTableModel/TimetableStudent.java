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
public class TimetableStudent extends Timetable {
	/**
	 * Description of the property id_timetable.
	 */
	private int id_timetable;

	/**
	 * Description of the property list_booking.
	 */
	public HashSet<Booking> bookings;
	
	// Start of user code (user defined attributes for TimetableTeacher)
	
	// End of user code

	/**
	 * The constructor.
	 */
	public TimetableStudent(int last_timetable_id) {
		this.id_timetable=last_timetable_id;
		this.bookings = new HashSet<Booking>();
	}

	// Start of user code (user defined methods for TimetableTeacher)

		// End of user code
		/**
		 * Returns id_timetable.
		 * @return id_timetable 
		 */
		public int getId_timetable() {
			return this.id_timetable;
		}

		/**
		 * Sets a value to attribute id_timetable. 
		 * @param newId_timetable 
		 */
		public void setId_timetable(int newId_timetable) {
			this.id_timetable = newId_timetable;
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
		
		
		/**
		 * Add a new booking object to the timetable 
		 * @param Booking book
		 */
		public void addBooking(Booking book){
			this.bookings.add(book);
		}
		
		
		/**
		 * Remove a new booking object to the timetable 
		 * @param Booking book
		 */
		public void removeBooking(Booking book){
			this.bookings.remove(book);
		}

	}
