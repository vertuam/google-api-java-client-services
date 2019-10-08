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

package com.google.api.services.cloudkms.v1.model;

/**
 * Request message for KeyManagementService.Decrypt.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Key Management Service (KMS) API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DecryptRequest extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Optional data that must match the data originally supplied in
   * EncryptRequest.additional_authenticated_data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String additionalAuthenticatedData;

  /**
   * Required. The encrypted data originally returned in EncryptResponse.ciphertext.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ciphertext;

  /**
   * Optional. Optional data that must match the data originally supplied in
   * EncryptRequest.additional_authenticated_data.
   * @see #decodeAdditionalAuthenticatedData()
   * @return value or {@code null} for none
   */
  public java.lang.String getAdditionalAuthenticatedData() {
    return additionalAuthenticatedData;
  }

  /**
   * Optional. Optional data that must match the data originally supplied in
   * EncryptRequest.additional_authenticated_data.
   * @see #getAdditionalAuthenticatedData()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeAdditionalAuthenticatedData() {
    return com.google.api.client.util.Base64.decodeBase64(additionalAuthenticatedData);
  }

  /**
   * Optional. Optional data that must match the data originally supplied in
   * EncryptRequest.additional_authenticated_data.
   * @see #encodeAdditionalAuthenticatedData()
   * @param additionalAuthenticatedData additionalAuthenticatedData or {@code null} for none
   */
  public DecryptRequest setAdditionalAuthenticatedData(java.lang.String additionalAuthenticatedData) {
    this.additionalAuthenticatedData = additionalAuthenticatedData;
    return this;
  }

  /**
   * Optional. Optional data that must match the data originally supplied in
   * EncryptRequest.additional_authenticated_data.
   * @see #setAdditionalAuthenticatedData()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public DecryptRequest encodeAdditionalAuthenticatedData(byte[] additionalAuthenticatedData) {
    this.additionalAuthenticatedData = com.google.api.client.util.Base64.encodeBase64URLSafeString(additionalAuthenticatedData);
    return this;
  }

  /**
   * Required. The encrypted data originally returned in EncryptResponse.ciphertext.
   * @see #decodeCiphertext()
   * @return value or {@code null} for none
   */
  public java.lang.String getCiphertext() {
    return ciphertext;
  }

  /**
   * Required. The encrypted data originally returned in EncryptResponse.ciphertext.
   * @see #getCiphertext()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeCiphertext() {
    return com.google.api.client.util.Base64.decodeBase64(ciphertext);
  }

  /**
   * Required. The encrypted data originally returned in EncryptResponse.ciphertext.
   * @see #encodeCiphertext()
   * @param ciphertext ciphertext or {@code null} for none
   */
  public DecryptRequest setCiphertext(java.lang.String ciphertext) {
    this.ciphertext = ciphertext;
    return this;
  }

  /**
   * Required. The encrypted data originally returned in EncryptResponse.ciphertext.
   * @see #setCiphertext()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public DecryptRequest encodeCiphertext(byte[] ciphertext) {
    this.ciphertext = com.google.api.client.util.Base64.encodeBase64URLSafeString(ciphertext);
    return this;
  }

  @Override
  public DecryptRequest set(String fieldName, Object value) {
    return (DecryptRequest) super.set(fieldName, value);
  }

  @Override
  public DecryptRequest clone() {
    return (DecryptRequest) super.clone();
  }

}
