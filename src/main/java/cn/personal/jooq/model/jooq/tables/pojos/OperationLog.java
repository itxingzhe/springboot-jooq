/*
 * This file is generated by jOOQ.
 */
package cn.personal.jooq.model.jooq.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;
import javax.annotation.Generated;


/**
 * 操作日志表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class OperationLog implements Serializable {

  private static final long serialVersionUID = 1265540537;

  private Long id;
  private Long loginId;
  private String loginName;
  private String ipAddress;
  private String methodName;
  private String methodRemark;
  private LocalDateTime optDate;
  private String operatingContent;

  public OperationLog() {
  }

  public OperationLog(OperationLog value) {
    this.id = value.id;
    this.loginId = value.loginId;
    this.loginName = value.loginName;
    this.ipAddress = value.ipAddress;
    this.methodName = value.methodName;
    this.methodRemark = value.methodRemark;
    this.optDate = value.optDate;
    this.operatingContent = value.operatingContent;
  }

  public OperationLog(
      Long id,
      Long loginId,
      String loginName,
      String ipAddress,
      String methodName,
      String methodRemark,
      LocalDateTime optDate,
      String operatingContent
  ) {
    this.id = id;
    this.loginId = loginId;
    this.loginName = loginName;
    this.ipAddress = ipAddress;
    this.methodName = methodName;
    this.methodRemark = methodRemark;
    this.optDate = optDate;
    this.operatingContent = operatingContent;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getLoginId() {
    return this.loginId;
  }

  public void setLoginId(Long loginId) {
    this.loginId = loginId;
  }

  public String getLoginName() {
    return this.loginName;
  }

  public void setLoginName(String loginName) {
    this.loginName = loginName;
  }

  public String getIpAddress() {
    return this.ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public String getMethodName() {
    return this.methodName;
  }

  public void setMethodName(String methodName) {
    this.methodName = methodName;
  }

  public String getMethodRemark() {
    return this.methodRemark;
  }

  public void setMethodRemark(String methodRemark) {
    this.methodRemark = methodRemark;
  }

  public LocalDateTime getOptDate() {
    return this.optDate;
  }

  public void setOptDate(LocalDateTime optDate) {
    this.optDate = optDate;
  }

  public String getOperatingContent() {
    return this.operatingContent;
  }

  public void setOperatingContent(String operatingContent) {
    this.operatingContent = operatingContent;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("OperationLog (");

    sb.append(id);
    sb.append(", ").append(loginId);
    sb.append(", ").append(loginName);
    sb.append(", ").append(ipAddress);
    sb.append(", ").append(methodName);
    sb.append(", ").append(methodRemark);
    sb.append(", ").append(optDate);
    sb.append(", ").append(operatingContent);

    sb.append(")");
    return sb.toString();
  }
}