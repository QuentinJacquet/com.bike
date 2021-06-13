package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Station
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-13T16:50:59.975086900+02:00[Europe/Paris]")
public class Station   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("stationName")
  private String stationName;

  @JsonProperty("latitude")
  private Float latitude;

  @JsonProperty("longitude")
  private Float longitude;

  @JsonProperty("capacity")
  private Integer capacity;

  @JsonProperty("bikes")
  @Valid
  private List<String> bikes = null;

  public Station id(Long id) {
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

  public Station stationName(String stationName) {
    this.stationName = stationName;
    return this;
  }

  /**
   * Get stationName
   * @return stationName
  */
  @ApiModelProperty(value = "")


  public String getStationName() {
    return stationName;
  }

  public void setStationName(String stationName) {
    this.stationName = stationName;
  }

  public Station latitude(Float latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude
   * @return latitude
  */
  @ApiModelProperty(value = "")


  public Float getLatitude() {
    return latitude;
  }

  public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }

  public Station longitude(Float longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude
   * @return longitude
  */
  @ApiModelProperty(value = "")


  public Float getLongitude() {
    return longitude;
  }

  public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }

  public Station capacity(Integer capacity) {
    this.capacity = capacity;
    return this;
  }

  /**
   * capacity of station to accept bikes
   * @return capacity
  */
  @ApiModelProperty(value = "capacity of station to accept bikes")


  public Integer getCapacity() {
    return capacity;
  }

  public void setCapacity(Integer capacity) {
    this.capacity = capacity;
  }

  public Station bikes(List<String> bikes) {
    this.bikes = bikes;
    return this;
  }

  public Station addBikesItem(String bikesItem) {
    if (this.bikes == null) {
      this.bikes = new ArrayList<>();
    }
    this.bikes.add(bikesItem);
    return this;
  }

  /**
   * Get bikes
   * @return bikes
  */
  @ApiModelProperty(value = "")


  public List<String> getBikes() {
    return bikes;
  }

  public void setBikes(List<String> bikes) {
    this.bikes = bikes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Station station = (Station) o;
    return Objects.equals(this.id, station.id) &&
        Objects.equals(this.stationName, station.stationName) &&
        Objects.equals(this.latitude, station.latitude) &&
        Objects.equals(this.longitude, station.longitude) &&
        Objects.equals(this.capacity, station.capacity) &&
        Objects.equals(this.bikes, station.bikes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, stationName, latitude, longitude, capacity, bikes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Station {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    stationName: ").append(toIndentedString(stationName)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    bikes: ").append(toIndentedString(bikes)).append("\n");
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

