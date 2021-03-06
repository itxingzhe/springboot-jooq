/*
 * This file is generated by jOOQ.
 */
package cn.personal.jooq.model.jooq.tables;


import cn.personal.jooq.model.jooq.Indexes;
import cn.personal.jooq.model.jooq.Keys;
import cn.personal.jooq.model.jooq.Mydata;
import cn.personal.jooq.model.jooq.tables.records.PortalResourceRecord;
import java.time.LocalDateTime;
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
public class PortalResource extends TableImpl<PortalResourceRecord> {

  private static final long serialVersionUID = 1288181375;

  /**
   * The reference instance of <code>mydata.portal_resource</code>
   */
  public static final PortalResource PORTAL_RESOURCE = new PortalResource();

  /**
   * The class holding records for this type
   */
  @Override
  public Class<PortalResourceRecord> getRecordType() {
    return PortalResourceRecord.class;
  }

  /**
   * The column <code>mydata.portal_resource.id</code>.
   */
  public final TableField<PortalResourceRecord, Long> ID = createField("id",
      org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

  /**
   * The column <code>mydata.portal_resource.shelf_user_id</code>.
   */
  public final TableField<PortalResourceRecord, Long> SHELF_USER_ID = createField("shelf_user_id",
      org.jooq.impl.SQLDataType.BIGINT, this, "");

  /**
   * The column <code>mydata.portal_resource.shelf_user_name</code>. 上架人名称
   */
  public final TableField<PortalResourceRecord, String> SHELF_USER_NAME = createField(
      "shelf_user_name", org.jooq.impl.SQLDataType.VARCHAR(33).nullable(false)
          .defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this,
      "上架人名称");

  /**
   * The column <code>mydata.portal_resource.portal_name</code>.
   */
  public final TableField<PortalResourceRecord, String> PORTAL_NAME = createField("portal_name",
      org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

  /**
   * The column <code>mydata.portal_resource.create_time</code>.
   */
  public final TableField<PortalResourceRecord, LocalDateTime> CREATE_TIME = createField(
      "create_time", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

  /**
   * Create a <code>mydata.portal_resource</code> table reference
   */
  public PortalResource() {
    this(DSL.name("portal_resource"), null);
  }

  /**
   * Create an aliased <code>mydata.portal_resource</code> table reference
   */
  public PortalResource(String alias) {
    this(DSL.name(alias), PORTAL_RESOURCE);
  }

  /**
   * Create an aliased <code>mydata.portal_resource</code> table reference
   */
  public PortalResource(Name alias) {
    this(alias, PORTAL_RESOURCE);
  }

  private PortalResource(Name alias, Table<PortalResourceRecord> aliased) {
    this(alias, aliased, null);
  }

  private PortalResource(Name alias, Table<PortalResourceRecord> aliased, Field<?>[] parameters) {
    super(alias, null, aliased, parameters, DSL.comment(""));
  }

  public <O extends Record> PortalResource(Table<O> child,
      ForeignKey<O, PortalResourceRecord> key) {
    super(child, key, PORTAL_RESOURCE);
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
    return Arrays.<Index>asList(Indexes.PORTAL_RESOURCE_PRIMARY);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Identity<PortalResourceRecord, Long> getIdentity() {
    return Keys.IDENTITY_PORTAL_RESOURCE;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public UniqueKey<PortalResourceRecord> getPrimaryKey() {
    return Keys.KEY_PORTAL_RESOURCE_PRIMARY;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public List<UniqueKey<PortalResourceRecord>> getKeys() {
    return Arrays.<UniqueKey<PortalResourceRecord>>asList(Keys.KEY_PORTAL_RESOURCE_PRIMARY);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public PortalResource as(String alias) {
    return new PortalResource(DSL.name(alias), this);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public PortalResource as(Name alias) {
    return new PortalResource(alias, this);
  }

  /**
   * Rename this table
   */
  @Override
  public PortalResource rename(String name) {
    return new PortalResource(DSL.name(name), null);
  }

  /**
   * Rename this table
   */
  @Override
  public PortalResource rename(Name name) {
    return new PortalResource(name, null);
  }
}
