/*
 * This file is generated by jOOQ.
 */
package cn.personal.jooq.model.jooq.tables;


import cn.personal.jooq.model.jooq.Indexes;
import cn.personal.jooq.model.jooq.Keys;
import cn.personal.jooq.model.jooq.Mydata;
import cn.personal.jooq.model.jooq.tables.records.RoleRecord;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Generated;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class Role extends TableImpl<RoleRecord> {

  private static final long serialVersionUID = -17249527;

  /**
   * The reference instance of <code>mydata.role</code>
   */
  public static final Role ROLE = new Role();

  /**
   * The class holding records for this type
   */
  @Override
  public Class<RoleRecord> getRecordType() {
    return RoleRecord.class;
  }

  /**
   * The column <code>mydata.role.rid</code>.
   */
  public final TableField<RoleRecord, Integer> RID = createField("rid",
      org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

  /**
   * The column <code>mydata.role.rname</code>.
   */
  public final TableField<RoleRecord, String> RNAME = createField("rname",
      org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

  /**
   * Create a <code>mydata.role</code> table reference
   */
  public Role() {
    this(DSL.name("role"), null);
  }

  /**
   * Create an aliased <code>mydata.role</code> table reference
   */
  public Role(String alias) {
    this(DSL.name(alias), ROLE);
  }

  /**
   * Create an aliased <code>mydata.role</code> table reference
   */
  public Role(Name alias) {
    this(alias, ROLE);
  }

  private Role(Name alias, Table<RoleRecord> aliased) {
    this(alias, aliased, null);
  }

  private Role(Name alias, Table<RoleRecord> aliased, Field<?>[] parameters) {
    super(alias, null, aliased, parameters, DSL.comment(""));
  }

  public <O extends Record> Role(Table<O> child, ForeignKey<O, RoleRecord> key) {
    super(child, key, ROLE);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Schema getSchema() {
    return Mydata.MYDATA;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public List<Index> getIndexes() {
    return Arrays.<Index>asList(Indexes.ROLE_PRIMARY);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Identity<RoleRecord, Integer> getIdentity() {
    return Keys.IDENTITY_ROLE;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public UniqueKey<RoleRecord> getPrimaryKey() {
    return Keys.KEY_ROLE_PRIMARY;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public List<UniqueKey<RoleRecord>> getKeys() {
    return Arrays.<UniqueKey<RoleRecord>>asList(Keys.KEY_ROLE_PRIMARY);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Role as(String alias) {
    return new Role(DSL.name(alias), this);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Role as(Name alias) {
    return new Role(alias, this);
  }

  /**
   * Rename this table
   */
  @Override
  public Role rename(String name) {
    return new Role(DSL.name(name), null);
  }

  /**
   * Rename this table
   */
  @Override
  public Role rename(Name name) {
    return new Role(name, null);
  }
}