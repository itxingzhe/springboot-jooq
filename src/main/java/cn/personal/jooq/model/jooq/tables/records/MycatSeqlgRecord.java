/*
 * This file is generated by jOOQ.
 */
package cn.personal.jooq.model.jooq.tables.records;


import cn.personal.jooq.model.jooq.tables.MycatSeqlg;
import javax.annotation.Generated;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class MycatSeqlgRecord extends UpdatableRecordImpl<MycatSeqlgRecord> implements
    Record3<String, Integer, Integer> {

  private static final long serialVersionUID = 1872272422;

  /**
   * Setter for <code>mydata.mycat_seqlg.name</code>.
   */
  public void setName(String value) {
    set(0, value);
  }

  /**
   * Getter for <code>mydata.mycat_seqlg.name</code>.
   */
  public String getName() {
    return (String) get(0);
  }

  /**
   * Setter for <code>mydata.mycat_seqlg.current_value</code>.
   */
  public void setCurrentValue(Integer value) {
    set(1, value);
  }

  /**
   * Getter for <code>mydata.mycat_seqlg.current_value</code>.
   */
  public Integer getCurrentValue() {
    return (Integer) get(1);
  }

  /**
   * Setter for <code>mydata.mycat_seqlg.increment</code>.
   */
  public void setIncrement(Integer value) {
    set(2, value);
  }

  /**
   * Getter for <code>mydata.mycat_seqlg.increment</code>.
   */
  public Integer getIncrement() {
    return (Integer) get(2);
  }

  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------

  /**
   * {@inheritDoc}
   */
  @Override
  public Record1<String> key() {
    return (Record1) super.key();
  }

  // -------------------------------------------------------------------------
  // Record3 type implementation
  // -------------------------------------------------------------------------

  /**
   * {@inheritDoc}
   */
  @Override
  public Row3<String, Integer, Integer> fieldsRow() {
    return (Row3) super.fieldsRow();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Row3<String, Integer, Integer> valuesRow() {
    return (Row3) super.valuesRow();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Field<String> field1() {
    return MycatSeqlg.MYCAT_SEQLG.NAME;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Field<Integer> field2() {
    return MycatSeqlg.MYCAT_SEQLG.CURRENT_VALUE;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Field<Integer> field3() {
    return MycatSeqlg.MYCAT_SEQLG.INCREMENT;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String component1() {
    return getName();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Integer component2() {
    return getCurrentValue();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Integer component3() {
    return getIncrement();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String value1() {
    return getName();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Integer value2() {
    return getCurrentValue();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Integer value3() {
    return getIncrement();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public MycatSeqlgRecord value1(String value) {
    setName(value);
    return this;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public MycatSeqlgRecord value2(Integer value) {
    setCurrentValue(value);
    return this;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public MycatSeqlgRecord value3(Integer value) {
    setIncrement(value);
    return this;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public MycatSeqlgRecord values(String value1, Integer value2, Integer value3) {
    value1(value1);
    value2(value2);
    value3(value3);
    return this;
  }

  // -------------------------------------------------------------------------
  // Constructors
  // -------------------------------------------------------------------------

  /**
   * Create a detached MycatSeqlgRecord
   */
  public MycatSeqlgRecord() {
    super(MycatSeqlg.MYCAT_SEQLG);
  }

  /**
   * Create a detached, initialised MycatSeqlgRecord
   */
  public MycatSeqlgRecord(String name, Integer currentValue, Integer increment) {
    super(MycatSeqlg.MYCAT_SEQLG);

    set(0, name);
    set(1, currentValue);
    set(2, increment);
  }
}
