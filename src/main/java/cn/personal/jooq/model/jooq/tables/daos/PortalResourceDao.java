/*
 * This file is generated by jOOQ.
 */
package cn.personal.jooq.model.jooq.tables.daos;


import cn.personal.jooq.model.jooq.tables.PortalResource;
import cn.personal.jooq.model.jooq.tables.records.PortalResourceRecord;
import java.time.LocalDateTime;
import java.util.List;
import javax.annotation.Generated;
import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


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
public class PortalResourceDao extends
    DAOImpl<PortalResourceRecord, cn.personal.jooq.model.jooq.tables.pojos.PortalResource, Long> {

  /**
   * Create a new PortalResourceDao without any configuration
   */
  public PortalResourceDao() {
    super(PortalResource.PORTAL_RESOURCE,
        cn.personal.jooq.model.jooq.tables.pojos.PortalResource.class);
  }

  /**
   * Create a new PortalResourceDao with an attached configuration
   */
  public PortalResourceDao(Configuration configuration) {
    super(PortalResource.PORTAL_RESOURCE,
        cn.personal.jooq.model.jooq.tables.pojos.PortalResource.class, configuration);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected Long getId(cn.personal.jooq.model.jooq.tables.pojos.PortalResource object) {
    return object.getId();
  }

  /**
   * Fetch records that have <code>id IN (values)</code>
   */
  public List<cn.personal.jooq.model.jooq.tables.pojos.PortalResource> fetchById(Long... values) {
    return fetch(PortalResource.PORTAL_RESOURCE.ID, values);
  }

  /**
   * Fetch a unique record that has <code>id = value</code>
   */
  public cn.personal.jooq.model.jooq.tables.pojos.PortalResource fetchOneById(Long value) {
    return fetchOne(PortalResource.PORTAL_RESOURCE.ID, value);
  }

  /**
   * Fetch records that have <code>shelf_user_id IN (values)</code>
   */
  public List<cn.personal.jooq.model.jooq.tables.pojos.PortalResource> fetchByShelfUserId(
      Long... values) {
    return fetch(PortalResource.PORTAL_RESOURCE.SHELF_USER_ID, values);
  }

  /**
   * Fetch records that have <code>shelf_user_name IN (values)</code>
   */
  public List<cn.personal.jooq.model.jooq.tables.pojos.PortalResource> fetchByShelfUserName(
      String... values) {
    return fetch(PortalResource.PORTAL_RESOURCE.SHELF_USER_NAME, values);
  }

  /**
   * Fetch records that have <code>portal_name IN (values)</code>
   */
  public List<cn.personal.jooq.model.jooq.tables.pojos.PortalResource> fetchByPortalName(
      String... values) {
    return fetch(PortalResource.PORTAL_RESOURCE.PORTAL_NAME, values);
  }

  /**
   * Fetch records that have <code>create_time IN (values)</code>
   */
  public List<cn.personal.jooq.model.jooq.tables.pojos.PortalResource> fetchByCreateTime(
      LocalDateTime... values) {
    return fetch(PortalResource.PORTAL_RESOURCE.CREATE_TIME, values);
  }
}
