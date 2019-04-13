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
public class Role implements Serializable {

  private static final long serialVersionUID = 763251450;

  private Integer rid;
  private String rname;

  public Role() {
  }

  public Role(Role value) {
    this.rid = value.rid;
    this.rname = value.rname;
  }

  public Role(
      Integer rid,
      String rname
  ) {
    this.rid = rid;
    this.rname = rname;
  }

  public Integer getRid() {
    return this.rid;
  }

  public void setRid(Integer rid) {
    this.rid = rid;
  }

  public String getRname() {
    return this.rname;
  }

  public void setRname(String rname) {
    this.rname = rname;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Role (");

    sb.append(rid);
    sb.append(", ").append(rname);

    sb.append(")");
    return sb.toString();
  }
}