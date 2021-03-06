/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.13.5
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.models.V1NodeSelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VolumeNodeAffinity defines constraints that limit what nodes this volume can be accessed from.
 */
@ApiModel(description = "VolumeNodeAffinity defines constraints that limit what nodes this volume can be accessed from.")

public class V1VolumeNodeAffinity {
  @SerializedName("required")
  private V1NodeSelector required = null;

  public V1VolumeNodeAffinity required(V1NodeSelector required) {
    this.required = required;
    return this;
  }

   /**
   * Required specifies hard node constraints that must be met.
   * @return required
  **/
  @ApiModelProperty(value = "Required specifies hard node constraints that must be met.")
  public V1NodeSelector getRequired() {
    return required;
  }

  public void setRequired(V1NodeSelector required) {
    this.required = required;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1VolumeNodeAffinity v1VolumeNodeAffinity = (V1VolumeNodeAffinity) o;
    return Objects.equals(this.required, v1VolumeNodeAffinity.required);
  }

  @Override
  public int hashCode() {
    return Objects.hash(required);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VolumeNodeAffinity {\n");
    
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
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

