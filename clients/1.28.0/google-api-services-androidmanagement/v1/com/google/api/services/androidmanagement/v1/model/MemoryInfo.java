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

package com.google.api.services.androidmanagement.v1.model;

/**
 * Information about device memory and storage.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Android Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MemoryInfo extends com.google.api.client.json.GenericJson {

  /**
   * Total internal storage on device in bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long totalInternalStorage;

  /**
   * Total RAM on device in bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long totalRam;

  /**
   * Total internal storage on device in bytes.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTotalInternalStorage() {
    return totalInternalStorage;
  }

  /**
   * Total internal storage on device in bytes.
   * @param totalInternalStorage totalInternalStorage or {@code null} for none
   */
  public MemoryInfo setTotalInternalStorage(java.lang.Long totalInternalStorage) {
    this.totalInternalStorage = totalInternalStorage;
    return this;
  }

  /**
   * Total RAM on device in bytes.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTotalRam() {
    return totalRam;
  }

  /**
   * Total RAM on device in bytes.
   * @param totalRam totalRam or {@code null} for none
   */
  public MemoryInfo setTotalRam(java.lang.Long totalRam) {
    this.totalRam = totalRam;
    return this;
  }

  @Override
  public MemoryInfo set(String fieldName, Object value) {
    return (MemoryInfo) super.set(fieldName, value);
  }

  @Override
  public MemoryInfo clone() {
    return (MemoryInfo) super.clone();
  }

}