/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/
package timeTableModel;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Room.
 * 
 * @author aguler
 */
public class Room {
	/**
	 * Description of the property id_room.
	 */
	private Integer id_room;

	/**
	 * Description of the property max_student_number.
	 */
	private Integer max_student_number;

	// Start of user code (user defined attributes for Room)

	// End of user code

	/**
	 * The constructor.
	 */
	public Room() {
		// Start of user code constructor for Room)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Room)

	// End of user code
	/**
	 * Returns id_room.
	 * @return id_room 
	 */
	public Integer getId_room() {
		return this.id_room;
	}

	/**
	 * Sets a value to attribute id_room. 
	 * @param newId_room 
	 */
	public void setId_room(Integer newId_room) {
		this.id_room = newId_room;
	}

	/**
	 * Returns max_student_number.
	 * @return max_student_number 
	 */
	public Integer getMax_student_number() {
		return this.max_student_number;
	}

	/**
	 * Sets a value to attribute max_student_number. 
	 * @param newMax_student_number 
	 */
	public void setMax_student_number(Integer newMax_student_number) {
		this.max_student_number = newMax_student_number;
	}

}
