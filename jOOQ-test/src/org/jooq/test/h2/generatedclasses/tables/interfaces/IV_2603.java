/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IV_2603 extends java.io.Serializable {

	/**
	 * Setter for <code>PUBLIC.V_2603.COL1</code>. 
	 */
	public void setCol1(java.lang.Integer value);

	/**
	 * Getter for <code>PUBLIC.V_2603.COL1</code>. 
	 */
	public java.lang.Integer getCol1();

	/**
	 * Setter for <code>PUBLIC.V_2603.COL4</code>. 
	 */
	public void setCol4(java.lang.Integer value);

	/**
	 * Getter for <code>PUBLIC.V_2603.COL4</code>. 
	 */
	public java.lang.Integer getCol4();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IV_2603
	 */
	public void from(org.jooq.test.h2.generatedclasses.tables.interfaces.IV_2603 from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IV_2603
	 */
	public <E extends org.jooq.test.h2.generatedclasses.tables.interfaces.IV_2603> E into(E into);
}
