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
 * on 2015-04-07 at 05:26:30 UTC 
 * Modify at your own risk.
 */

package com.sp.fanikiwa.entity.accountendpoint.model;

/**
 * Model definition for Exception.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the accountendpoint. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Exception extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Throwable cause;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String localizedMessage;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String message;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<StackTraceElement> stackTrace;

  static {
    // hack to force ProGuard to consider StackTraceElement used, since otherwise it would be stripped out
    // see http://code.google.com/p/google-api-java-client/issues/detail?id=528
    com.google.api.client.util.Data.nullOf(StackTraceElement.class);
  }

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Throwable> suppressed;

  /**
   * @return value or {@code null} for none
   */
  public Throwable getCause() {
    return cause;
  }

  /**
   * @param cause cause or {@code null} for none
   */
  public Exception setCause(Throwable cause) {
    this.cause = cause;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getLocalizedMessage() {
    return localizedMessage;
  }

  /**
   * @param localizedMessage localizedMessage or {@code null} for none
   */
  public Exception setLocalizedMessage(java.lang.String localizedMessage) {
    this.localizedMessage = localizedMessage;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getMessage() {
    return message;
  }

  /**
   * @param message message or {@code null} for none
   */
  public Exception setMessage(java.lang.String message) {
    this.message = message;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<StackTraceElement> getStackTrace() {
    return stackTrace;
  }

  /**
   * @param stackTrace stackTrace or {@code null} for none
   */
  public Exception setStackTrace(java.util.List<StackTraceElement> stackTrace) {
    this.stackTrace = stackTrace;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<Throwable> getSuppressed() {
    return suppressed;
  }

  /**
   * @param suppressed suppressed or {@code null} for none
   */
  public Exception setSuppressed(java.util.List<Throwable> suppressed) {
    this.suppressed = suppressed;
    return this;
  }

  @Override
  public Exception set(String fieldName, Object value) {
    return (Exception) super.set(fieldName, value);
  }

  @Override
  public Exception clone() {
    return (Exception) super.clone();
  }

}
