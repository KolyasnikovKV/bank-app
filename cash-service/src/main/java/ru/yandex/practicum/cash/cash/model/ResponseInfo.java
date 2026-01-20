package ru.yandex.practicum.cash.cash.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.lang.Nullable;

import java.util.Objects;

/**
 * Базовая информация о результатах вызова
 */

@Schema(name = "ResponseInfo", description = "Базовая информация о результатах вызова")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-17T11:33:15.766305700+05:00[Asia/Yekaterinburg]", comments = "Generator version: 7.12.0")
public class ResponseInfo {

  private Boolean status;

  private @Nullable ResponseInfoError error;

  public ResponseInfo() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResponseInfo(Boolean status) {
    this.status = status;
  }

  public ResponseInfo status(Boolean status) {
    this.status = status;
    return this;
  }

  /**
   * успешный или нет вызов
   * @return status
   */
  @NotNull 
  @Schema(name = "status", description = "успешный или нет вызов", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public Boolean getStatus() {
    return status;
  }

  public void setStatus(Boolean status) {
    this.status = status;
  }

  public ResponseInfo error(ResponseInfoError error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
   */
  @Valid 
  @Schema(name = "error", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("error")
  public ResponseInfoError getError() {
    return error;
  }

  public void setError(ResponseInfoError error) {
    this.error = error;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseInfo responseInfo = (ResponseInfo) o;
    return Objects.equals(this.status, responseInfo.status) &&
        Objects.equals(this.error, responseInfo.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseInfo {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

