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

package com.google.api.services.youtube.model;

/**
 * The contentOwnerDetails object encapsulates channel data that is relevant for YouTube Partners
 * linked with the channel.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ChannelContentOwnerDetails extends com.google.api.client.json.GenericJson {

  /**
   * The ID of the content owner linked to the channel.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contentOwner;

  /**
   * The date and time of when the channel was linked to the content owner. The value is specified
   * in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime timeLinked;

  /**
   * The ID of the content owner linked to the channel.
   * @return value or {@code null} for none
   */
  public java.lang.String getContentOwner() {
    return contentOwner;
  }

  /**
   * The ID of the content owner linked to the channel.
   * @param contentOwner contentOwner or {@code null} for none
   */
  public ChannelContentOwnerDetails setContentOwner(java.lang.String contentOwner) {
    this.contentOwner = contentOwner;
    return this;
  }

  /**
   * The date and time of when the channel was linked to the content owner. The value is specified
   * in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getTimeLinked() {
    return timeLinked;
  }

  /**
   * The date and time of when the channel was linked to the content owner. The value is specified
   * in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
   * @param timeLinked timeLinked or {@code null} for none
   */
  public ChannelContentOwnerDetails setTimeLinked(com.google.api.client.util.DateTime timeLinked) {
    this.timeLinked = timeLinked;
    return this;
  }

  @Override
  public ChannelContentOwnerDetails set(String fieldName, Object value) {
    return (ChannelContentOwnerDetails) super.set(fieldName, value);
  }

  @Override
  public ChannelContentOwnerDetails clone() {
    return (ChannelContentOwnerDetails) super.clone();
  }

}