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
 * on 2015-04-07 at 05:24:11 UTC 
 * Modify at your own risk.
 */

package com.sp.fanikiwa.entity.loanendpoint.model;

/**
 * Model definition for Loan.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the loanendpoint. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Loan extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double amount;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime createdDate;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double interest;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime maturityDate;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long memberId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long offerId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean partialPay;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer term;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getAmount() {
    return amount;
  }

  /**
   * @param amount amount or {@code null} for none
   */
  public Loan setAmount(java.lang.Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getCreatedDate() {
    return createdDate;
  }

  /**
   * @param createdDate createdDate or {@code null} for none
   */
  public Loan setCreatedDate(com.google.api.client.util.DateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public Loan setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getInterest() {
    return interest;
  }

  /**
   * @param interest interest or {@code null} for none
   */
  public Loan setInterest(java.lang.Double interest) {
    this.interest = interest;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getMaturityDate() {
    return maturityDate;
  }

  /**
   * @param maturityDate maturityDate or {@code null} for none
   */
  public Loan setMaturityDate(com.google.api.client.util.DateTime maturityDate) {
    this.maturityDate = maturityDate;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getMemberId() {
    return memberId;
  }

  /**
   * @param memberId memberId or {@code null} for none
   */
  public Loan setMemberId(java.lang.Long memberId) {
    this.memberId = memberId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getOfferId() {
    return offerId;
  }

  /**
   * @param offerId offerId or {@code null} for none
   */
  public Loan setOfferId(java.lang.Long offerId) {
    this.offerId = offerId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPartialPay() {
    return partialPay;
  }

  /**
   * @param partialPay partialPay or {@code null} for none
   */
  public Loan setPartialPay(java.lang.Boolean partialPay) {
    this.partialPay = partialPay;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTerm() {
    return term;
  }

  /**
   * @param term term or {@code null} for none
   */
  public Loan setTerm(java.lang.Integer term) {
    this.term = term;
    return this;
  }

  @Override
  public Loan set(String fieldName, Object value) {
    return (Loan) super.set(fieldName, value);
  }

  @Override
  public Loan clone() {
    return (Loan) super.clone();
  }

}
