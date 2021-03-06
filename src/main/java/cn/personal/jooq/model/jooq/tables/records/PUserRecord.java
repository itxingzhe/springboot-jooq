/*
 * This file is generated by jOOQ.
 */
package cn.personal.jooq.model.jooq.tables.records;


import cn.personal.jooq.model.jooq.tables.PUser;
import javax.annotation.Generated;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class PUserRecord extends UpdatableRecordImpl<PUserRecord> implements
    Record8<Integer, String, String, String, Integer, String, String, Integer> {

  private static final long serialVersionUID = 1691243402;

  /**
   * Setter for <code>mydata.p_user.uid</code>.
   */
  public void setUid(Integer value) {
    set(0, value);
  }

  /**
   * Getter for <code>mydata.p_user.uid</code>.
   */
  public Integer getUid() {
    return (Integer) get(0);
  }

  /**
   * Setter for <code>mydata.p_user.username</code>.
   */
  public void setUsername(String value) {
    set(1, value);
  }

  /**
   * Getter for <code>mydata.p_user.username</code>.
   */
  public String getUsername() {
    return (String) get(1);
  }

  /**
   * Setter for <code>mydata.p_user.password</code>.
   */
  public void setPassword(String value) {
    set(2, value);
  }

  /**
   * Getter for <code>mydata.p_user.password</code>.
   */
  public String getPassword() {
    return (String) get(2);
  }

  /**
   * Setter for <code>mydata.p_user.uname</code>.
   */
  public void setUname(String value) {
    set(3, value);
  }

  /**
   * Getter for <code>mydata.p_user.uname</code>.
   */
  public String getUname() {
    return (String) get(3);
  }

  /**
   * Setter for <code>mydata.p_user.age</code>.
   */
  public void setAge(Integer value) {
    set(4, value);
  }

  /**
   * Getter for <code>mydata.p_user.age</code>.
   */
  public Integer getAge() {
    return (Integer) get(4);
  }

  /**
   * Setter for <code>mydata.p_user.sex</code>.
   */
  public void setSex(String value) {
    set(5, value);
  }

  /**
   * Getter for <code>mydata.p_user.sex</code>.
   */
  public String getSex() {
    return (String) get(5);
  }

  /**
   * Setter for <code>mydata.p_user.address</code>.
   */
  public void setAddress(String value) {
    set(6, value);
  }

  /**
   * Getter for <code>mydata.p_user.address</code>.
   */
  public String getAddress() {
    return (String) get(6);
  }

  /**
   * Setter for <code>mydata.p_user.version</code>. 用户状态版本
   */
  public void setVersion(Integer value) {
    set(7, value);
  }

  /**
   * Getter for <code>mydata.p_user.version</code>. 用户状态版本
   */
  public Integer getVersion() {
    return (Integer) get(7);
  }

  // -------------------------------------------------------------------------
  // Primary key information
  // -------------------------------------------------------------------------

  /**
   * {@inheritDoc}
   */
  @Override
  public Record1<Integer> key() {
    return (Record1) super.key();
  }

  // -------------------------------------------------------------------------
  // Record8 type implementation
  // -------------------------------------------------------------------------

  /**
   * {@inheritDoc}
   */
  @Override
  public Row8<Integer, String, String, String, Integer, String, String, Integer> fieldsRow() {
    return (Row8) super.fieldsRow();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Row8<Integer, String, String, String, Integer, String, String, Integer> valuesRow() {
    return (Row8) super.valuesRow();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Field<Integer> field1() {
    return PUser.P_USER.UID;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Field<String> field2() {
    return PUser.P_USER.USERNAME;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Field<String> field3() {
    return PUser.P_USER.PASSWORD;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Field<String> field4() {
    return PUser.P_USER.UNAME;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Field<Integer> field5() {
    return PUser.P_USER.AGE;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Field<String> field6() {
    return PUser.P_USER.SEX;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Field<String> field7() {
    return PUser.P_USER.ADDRESS;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Field<Integer> field8() {
    return PUser.P_USER.VERSION;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Integer component1() {
    return getUid();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String component2() {
    return getUsername();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String component3() {
    return getPassword();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String component4() {
    return getUname();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Integer component5() {
    return getAge();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String component6() {
    return getSex();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String component7() {
    return getAddress();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Integer component8() {
    return getVersion();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Integer value1() {
    return getUid();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String value2() {
    return getUsername();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String value3() {
    return getPassword();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String value4() {
    return getUname();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Integer value5() {
    return getAge();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String value6() {
    return getSex();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String value7() {
    return getAddress();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Integer value8() {
    return getVersion();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public PUserRecord value1(Integer value) {
    setUid(value);
    return this;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public PUserRecord value2(String value) {
    setUsername(value);
    return this;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public PUserRecord value3(String value) {
    setPassword(value);
    return this;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public PUserRecord value4(String value) {
    setUname(value);
    return this;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public PUserRecord value5(Integer value) {
    setAge(value);
    return this;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public PUserRecord value6(String value) {
    setSex(value);
    return this;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public PUserRecord value7(String value) {
    setAddress(value);
    return this;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public PUserRecord value8(Integer value) {
    setVersion(value);
    return this;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public PUserRecord values(Integer value1, String value2, String value3, String value4,
      Integer value5, String value6, String value7, Integer value8) {
    value1(value1);
    value2(value2);
    value3(value3);
    value4(value4);
    value5(value5);
    value6(value6);
    value7(value7);
    value8(value8);
    return this;
  }

  // -------------------------------------------------------------------------
  // Constructors
  // -------------------------------------------------------------------------

  /**
   * Create a detached PUserRecord
   */
  public PUserRecord() {
    super(PUser.P_USER);
  }

  /**
   * Create a detached, initialised PUserRecord
   */
  public PUserRecord(Integer uid, String username, String password, String uname, Integer age,
      String sex, String address, Integer version) {
    super(PUser.P_USER);

    set(0, uid);
    set(1, username);
    set(2, password);
    set(3, uname);
    set(4, age);
    set(5, sex);
    set(6, address);
    set(7, version);
  }
}
