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
public class DemoInfo implements Serializable {

  private static final long serialVersionUID = 422861694;

  private Long id;
  private String password;
  private String username;

  public DemoInfo() {
  }

  public DemoInfo(DemoInfo value) {
    this.id = value.id;
    this.password = value.password;
    this.username = value.username;
  }

  public DemoInfo(
      Long id,
      String password,
      String username
  ) {
    this.id = id;
    this.password = password;
    this.username = username;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("DemoInfo (");

    sb.append(id);
    sb.append(", ").append(password);
    sb.append(", ").append(username);

    sb.append(")");
    return sb.toString();
  }
}
