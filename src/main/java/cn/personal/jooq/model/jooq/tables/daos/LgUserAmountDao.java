/*
 * This file is generated by jOOQ.
 */
package cn.personal.jooq.model.jooq.tables.daos;


import cn.personal.jooq.model.jooq.tables.LgUserAmount;
import cn.personal.jooq.model.jooq.tables.records.LgUserAmountRecord;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import javax.annotation.Generated;
import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


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
public class LgUserAmountDao extends
    DAOImpl<LgUserAmountRecord, cn.personal.jooq.model.jooq.tables.pojos.LgUserAmount, Long> {

  /**
   * Create a new LgUserAmountDao without any configuration
   */
  public LgUserAmountDao() {
    super(LgUserAmount.LG_USER_AMOUNT, cn.personal.jooq.model.jooq.tables.pojos.LgUserAmount.class);
  }

  /**
   * Create a new LgUserAmountDao with an attached configuration
   */
  public LgUserAmountDao(Configuration configuration) {
    super(LgUserAmount.LG_USER_AMOUNT, cn.personal.jooq.model.jooq.tables.pojos.LgUserAmount.class,
        configuration);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected Long getId(cn.personal.jooq.model.jooq.tables.pojos.LgUserAmount object) {
    return object.getId();
  }

  /**
   * Fetch records that have <code>id IN (values)</code>
   */
  public List<cn.personal.jooq.model.jooq.tables.pojos.LgUserAmount> fetchById(Long... values) {
    return fetch(LgUserAmount.LG_USER_AMOUNT.ID, values);
  }

  /**
   * Fetch a unique record that has <code>id = value</code>
   */
  public cn.personal.jooq.model.jooq.tables.pojos.LgUserAmount fetchOneById(Long value) {
    return fetchOne(LgUserAmount.LG_USER_AMOUNT.ID, value);
  }

  /**
   * Fetch records that have <code>company_user_id IN (values)</code>
   */
  public List<cn.personal.jooq.model.jooq.tables.pojos.LgUserAmount> fetchByCompanyUserId(
      Long... values) {
    return fetch(LgUserAmount.LG_USER_AMOUNT.COMPANY_USER_ID, values);
  }

  /**
   * Fetch records that have <code>amount IN (values)</code>
   */
  public List<cn.personal.jooq.model.jooq.tables.pojos.LgUserAmount> fetchByAmount(
      BigDecimal... values) {
    return fetch(LgUserAmount.LG_USER_AMOUNT.AMOUNT, values);
  }

  /**
   * Fetch records that have <code>amount_type IN (values)</code>
   */
  public List<cn.personal.jooq.model.jooq.tables.pojos.LgUserAmount> fetchByAmountType(
      String... values) {
    return fetch(LgUserAmount.LG_USER_AMOUNT.AMOUNT_TYPE, values);
  }

  /**
   * Fetch records that have <code>create_time IN (values)</code>
   */
  public List<cn.personal.jooq.model.jooq.tables.pojos.LgUserAmount> fetchByCreateTime(
      LocalDateTime... values) {
    return fetch(LgUserAmount.LG_USER_AMOUNT.CREATE_TIME, values);
  }

  /**
   * Fetch records that have <code>create_id IN (values)</code>
   */
  public List<cn.personal.jooq.model.jooq.tables.pojos.LgUserAmount> fetchByCreateId(
      Long... values) {
    return fetch(LgUserAmount.LG_USER_AMOUNT.CREATE_ID, values);
  }

  /**
   * Fetch records that have <code>update_time IN (values)</code>
   */
  public List<cn.personal.jooq.model.jooq.tables.pojos.LgUserAmount> fetchByUpdateTime(
      LocalDateTime... values) {
    return fetch(LgUserAmount.LG_USER_AMOUNT.UPDATE_TIME, values);
  }

  /**
   * Fetch records that have <code>update_id IN (values)</code>
   */
  public List<cn.personal.jooq.model.jooq.tables.pojos.LgUserAmount> fetchByUpdateId(
      Long... values) {
    return fetch(LgUserAmount.LG_USER_AMOUNT.UPDATE_ID, values);
  }

  /**
   * Fetch records that have <code>delete_flag IN (values)</code>
   */
  public List<cn.personal.jooq.model.jooq.tables.pojos.LgUserAmount> fetchByDeleteFlag(
      String... values) {
    return fetch(LgUserAmount.LG_USER_AMOUNT.DELETE_FLAG, values);
  }
}
