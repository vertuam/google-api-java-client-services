/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.bigtableadmin.v2.model;

/**
 * Request message for BigtableInstanceAdmin.PartialUpdateInstance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Bigtable Admin API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PartialUpdateInstanceRequest extends com.google.api.client.json.GenericJson {

  /**
   * The Instance which will (partially) replace the current value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Instance instance;

  /**
   * The subset of Instance fields which should be replaced. Must be explicitly set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateMask;

  /**
   * The Instance which will (partially) replace the current value.
   * @return value or {@code null} for none
   */
  public Instance getInstance() {
    return instance;
  }

  /**
   * The Instance which will (partially) replace the current value.
   * @param instance instance or {@code null} for none
   */
  public PartialUpdateInstanceRequest setInstance(Instance instance) {
    this.instance = instance;
    return this;
  }

  /**
   * The subset of Instance fields which should be replaced. Must be explicitly set.
   * @return value or {@code null} for none
   */
  public String getUpdateMask() {
    return updateMask;
  }

  /**
   * The subset of Instance fields which should be replaced. Must be explicitly set.
   * @param updateMask updateMask or {@code null} for none
   */
  public PartialUpdateInstanceRequest setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  @Override
  public PartialUpdateInstanceRequest set(String fieldName, Object value) {
    return (PartialUpdateInstanceRequest) super.set(fieldName, value);
  }

  @Override
  public PartialUpdateInstanceRequest clone() {
    return (PartialUpdateInstanceRequest) super.clone();
  }

}