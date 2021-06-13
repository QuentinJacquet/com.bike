package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Ride
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-13T16:50:59.975086900+02:00[Europe/Paris]")
public class Ride   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("userId")
  private Long userId;

  @JsonProperty("startStationId")
  private Long startStationId;

  @JsonProperty("startDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startDate;

  @JsonProperty("endStationId")
  private Long endStationId;

  @JsonProperty("endDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endDate;

  @JsonProperty("complete")
  private Boolean complete = false;

  public Ride id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(readOnly = true, value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Ride userId(Long userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public Ride startStationId(Long startStationId) {
    this.startStationId = startStationId;
    return this;
  }

  /**
   * Get startStationId
   * @return startStationId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Long getStartStationId() {
    return startStationId;
  }

  public void setStartStationId(Long startStationId) {
    this.startStationId = startStationId;
  }

  public Ride startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public Ride endStationId(Long endStationId) {
    this.endStationId = endStationId;
    return this;
  }

  /**
   * Get endStationId
   * @return endStationId
  */
  @ApiModelProperty(value = "")


  public Long getEndStationId() {
    return endStationId;
  }

  public void setEndStationId(Long endStationId) {
    this.endStationId = endStationId;
  }

  public Ride endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public Ride complete(Boolean complete) {
    this.complete = complete;
    return this;
  }

  /**
   * Get complete
   * @return complete
  */
  @ApiModelProperty(value = "")


  public Boolean getComplete() {
    return complete;
  }

  public void setComplete(Boolean complete) {
    this.complete = complete;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ride ride = (Ride) o;
    return Objects.equals(this.id, ride.id) &&
        Objects.equals(this.userId, ride.userId) &&
        Objects.equals(this.startStationId, ride.startStationId) &&
        Objects.equals(this.startDate, ride.startDate) &&
        Objects.equals(this.endStationId, ride.endStationId) &&
        Objects.equals(this.endDate, ride.endDate) &&
        Objects.equals(this.complete, ride.complete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, startStationId, startDate, endStationId, endDate, complete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ride {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    startStationId: ").append(toIndentedString(startStationId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endStationId: ").append(toIndentedString(endStationId)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
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

