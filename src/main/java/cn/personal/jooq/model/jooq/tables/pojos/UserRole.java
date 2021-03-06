/*
 * This file is generated by jOOQ.
 */
package cn.personal.jooq.model.jooq.tables.pojos;


import java.io.Serializable;
import javax.annotation.Generated;


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
public class UserRole implements Serializable {

  private static final long serialVersionUID = 1289407515;

  private Integer uid;
  private Integer rid;

  public UserRole() {
  }

  public UserRole(UserRole value) {
    this.uid = value.uid;
    this.rid = value.rid;
  }

  public UserRole(
      Integer uid,
      Integer rid
  ) {
    this.uid = uid;
    this.rid = rid;
  }

  public Integer getUid() {
    return this.uid;
  }

  public void setUid(Integer uid) {
    this.uid = uid;
  }

  public Integer getRid() {
    return this.rid;
  }

  public void setRid(Integer rid) {
    this.rid = rid;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("UserRole (");

    sb.append(uid);
    sb.append(", ").append(rid);

    sb.append(")");
    return sb.toString();
  }
}
