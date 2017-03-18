package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * NewRelease
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-02-02T15:11:16.405Z")

public class NewRelease   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("starts_at")
  private DateTime startsAt = null;

  @JsonProperty("deadline")
  private DateTime deadline = null;

  public NewRelease name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Display name of release.
   * @return name
  **/
  @ApiModelProperty(value = "Display name of release.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NewRelease description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public NewRelease startsAt(DateTime startsAt) {
    this.startsAt = startsAt;
    return this;
  }

   /**
   * Get startsAt
   * @return startsAt
  **/
  @ApiModelProperty(required = true, value = "")
  public DateTime getStartsAt() {
    return startsAt;
  }

  public void setStartsAt(DateTime startsAt) {
    this.startsAt = startsAt;
  }

  public NewRelease deadline(DateTime deadline) {
    this.deadline = deadline;
    return this;
  }

   /**
   * Get deadline
   * @return deadline
  **/
  @ApiModelProperty(required = true, value = "")
  public DateTime getDeadline() {
    return deadline;
  }

  public void setDeadline(DateTime deadline) {
    this.deadline = deadline;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewRelease newRelease = (NewRelease) o;
    return Objects.equals(this.name, newRelease.name) &&
        Objects.equals(this.description, newRelease.description) &&
        Objects.equals(this.startsAt, newRelease.startsAt) &&
        Objects.equals(this.deadline, newRelease.deadline);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, startsAt, deadline);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewRelease {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    startsAt: ").append(toIndentedString(startsAt)).append("\n");
    sb.append("    deadline: ").append(toIndentedString(deadline)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

