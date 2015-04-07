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
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2015-03-26 20:30:19 UTC)
 * on 2015-04-07 at 05:23:40 UTC 
 * Modify at your own risk.
 */

package com.sp.fanikiwa.entity.quoteEndpoint.model;

/**
 * Model definition for Quote.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the quoteEndpoint. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Quote extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String what;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String who;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public Quote setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getWhat() {
    return what;
  }

  /**
   * @param what what or {@code null} for none
   */
  public Quote setWhat(java.lang.String what) {
    this.what = what;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getWho() {
    return who;
  }

  /**
   * @param who who or {@code null} for none
   */
  public Quote setWho(java.lang.String who) {
    this.who = who;
    return this;
  }

  @Override
  public Quote set(String fieldName, Object value) {
    return (Quote) super.set(fieldName, value);
  }

  @Override
  public Quote clone() {
    return (Quote) super.clone();
  }

}
