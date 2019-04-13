/*
 * This file is generated by jOOQ.
 */
package cn.personal.jooq.model.jooq.tables;


import cn.personal.jooq.model.jooq.Indexes;
import cn.personal.jooq.model.jooq.Keys;
import cn.personal.jooq.model.jooq.Mydata;
import cn.personal.jooq.model.jooq.tables.records.LgUserAmountRecord;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Generated;
import org.jooq.Field;
import org.jooq.ForeignKey;
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
 * 用户资产表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class LgUserAmount extends TableImpl<LgUserAmountRecord> {

  private static final long serialVersionUID = 931332552;

  /**
   * The reference instance of <code>mydata.lg_user_amount</code>
   */
  public static final LgUserAmount LG_USER_AMOUNT = new LgUserAmount();

  /**
   * The class holding records for this type
   */
  @Override
  public Class<LgUserAmountRecord> getRecordType() {
    return LgUserAmountRecord.class;
  }

  /**
   * The column <code>mydata.lg_user_amount.id</code>. 主键
   */
  public final TableField<LgUserAmountRecord, Long> ID = createField("id",
      org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "主键");

  /**
   * The column <code>mydata.lg_user_amount.company_user_id</code>. 用户ID
   */
  public final TableField<LgUserAmountRecord, Long> COMPANY_USER_ID = createField("company_user_id",
      org.jooq.impl.SQLDataType.BIGINT, this, "用户ID");

  /**
   * The column <code>mydata.lg_user_amount.amount</code>. 资产
   */
  public final TableField<LgUserAmountRecord, BigDecimal> AMOUNT = createField("amount",
      org.jooq.impl.SQLDataType.DECIMAL(20, 4), this, "资产");

  /**
   * The column <code>mydata.lg_user_amount.amount_type</code>. 资产类型
   */
  public final TableField<LgUserAmountRecord, String> AMOUNT_TYPE = createField("amount_type",
      org.jooq.impl.SQLDataType.VARCHAR(3), this, "资产类型");

  /**
   * The column <code>mydata.lg_user_amount.create_time</code>. 新增日期
   */
  public final TableField<LgUserAmountRecord, LocalDateTime> CREATE_TIME = createField(
      "create_time", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "新增日期");

  /**
   * The column <code>mydata.lg_user_amount.create_id</code>. 新增人ID
   */
  public final TableField<LgUserAmountRecord, Long> CREATE_ID = createField("create_id",
      org.jooq.impl.SQLDataType.BIGINT, this, "新增人ID");

  /**
   * The column <code>mydata.lg_user_amount.update_time</code>. 修改日期
   */
  public final TableField<LgUserAmountRecord, LocalDateTime> UPDATE_TIME = createField(
      "update_time", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "修改日期");

  /**
   * The column <code>mydata.lg_user_amount.update_id</code>. 修改人ID
   */
  public final TableField<LgUserAmountRecord, Long> UPDATE_ID = createField("update_id",
      org.jooq.impl.SQLDataType.BIGINT, this, "修改人ID");

  /**
   * The column <code>mydata.lg_user_amount.delete_flag</code>. 删除标记
   */
  public final TableField<LgUserAmountRecord, String> DELETE_FLAG = createField("delete_flag",
      org.jooq.impl.SQLDataType.VARCHAR(3)
          .defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this,
      "删除标记");

  /**
   * Create a <code>mydata.lg_user_amount</code> table reference
   */
  public LgUserAmount() {
    this(DSL.name("lg_user_amount"), null);
  }

  /**
   * Create an aliased <code>mydata.lg_user_amount</code> table reference
   */
  public LgUserAmount(String alias) {
    this(DSL.name(alias), LG_USER_AMOUNT);
  }

  /**
   * Create an aliased <code>mydata.lg_user_amount</code> table reference
   */
  public LgUserAmount(Name alias) {
    this(alias, LG_USER_AMOUNT);
  }

  private LgUserAmount(Name alias, Table<LgUserAmountRecord> aliased) {
    this(alias, aliased, null);
  }

  private LgUserAmount(Name alias, Table<LgUserAmountRecord> aliased, Field<?>[] parameters) {
    super(alias, null, aliased, parameters, DSL.comment("用户资产表"));
  }

  public <O extends Record> LgUserAmount(Table<O> child, ForeignKey<O, LgUserAmountRecord> key) {
    super(child, key, LG_USER_AMOUNT);
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
    return Arrays.<Index>asList(Indexes.LG_USER_AMOUNT_PRIMARY);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public UniqueKey<LgUserAmountRecord> getPrimaryKey() {
    return Keys.KEY_LG_USER_AMOUNT_PRIMARY;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public List<UniqueKey<LgUserAmountRecord>> getKeys() {
    return Arrays.<UniqueKey<LgUserAmountRecord>>asList(Keys.KEY_LG_USER_AMOUNT_PRIMARY);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public LgUserAmount as(String alias) {
    return new LgUserAmount(DSL.name(alias), this);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public LgUserAmount as(Name alias) {
    return new LgUserAmount(alias, this);
  }

  /**
   * Rename this table
   */
  @Override
  public LgUserAmount rename(String name) {
    return new LgUserAmount(DSL.name(name), null);
  }

  /**
   * Rename this table
   */
  @Override
  public LgUserAmount rename(Name name) {
    return new LgUserAmount(name, null);
  }
}