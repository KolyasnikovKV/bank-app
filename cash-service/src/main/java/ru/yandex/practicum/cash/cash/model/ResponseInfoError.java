package ru.yandex.practicum.cash.cash.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

/**
 * информация об ошибке
 */

@Schema(name = "ResponseInfo_error", description = "информация об ошибке")
@JsonTypeName("ResponseInfo_error")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-17T11:33:15.766305700+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.12.0")
public class ResponseInfoError {

  private String errorMessage;

  public ResponseInfoError() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResponseInfoError(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public ResponseInfoError errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * текст ошибки
   * @return errorMessage
   */
  @NotNull 
  @Schema(name = "errorMessage", description = "текст ошибки", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseInfoError responseInfoError = (ResponseInfoError) o;
    return Objects.equals(this.errorMessage, responseInfoError.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseInfoError {\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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

