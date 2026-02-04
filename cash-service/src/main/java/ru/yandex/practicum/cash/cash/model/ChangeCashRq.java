package ru.yandex.practicum.cash.cash.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Запрос на внесение / снятие наличных средств со счета
 */

@Schema(name = "ChangeCashRq", description = "Запрос на внесение / снятие наличных средств со счета")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-17T11:33:15.766305700+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.12.0")
public class ChangeCashRq {

  private String action;

  private String userName;

  private String currency;

  private BigDecimal value;

  public ChangeCashRq() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ChangeCashRq(String action, String userName, String currency, BigDecimal value) {
    this.action = action;
    this.userName = userName;
    this.currency = currency;
    this.value = value;
  }

  public ChangeCashRq action(String action) {
    this.action = action;
    return this;
  }

  /**
   * желаемое действие - внести или снять
   * @return action
   */
  @NotNull 
  @Schema(name = "action", description = "желаемое действие - внести или снять", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("action")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public ChangeCashRq userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * логин пользователя
   * @return userName
   */
  @NotNull 
  @Schema(name = "userName", description = "логин пользователя", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("userName")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public ChangeCashRq currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * валюта счета
   * @return currency
   */
  @NotNull 
  @Schema(name = "currency", description = "валюта счета", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public ChangeCashRq value(BigDecimal value) {
    this.value = value;
    return this;
  }

  /**
   * количество средств
   * @return value
   */
  @NotNull @Valid 
  @Schema(name = "value", description = "количество средств", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeCashRq changeCashRq = (ChangeCashRq) o;
    return Objects.equals(this.action, changeCashRq.action) &&
        Objects.equals(this.userName, changeCashRq.userName) &&
        Objects.equals(this.currency, changeCashRq.currency) &&
        Objects.equals(this.value, changeCashRq.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, userName, currency, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeCashRq {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

