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
 * on 2015-04-07 at 05:22:43 UTC 
 * Modify at your own risk.
 */

package com.sp.fanikiwa.entity.offerendpoint.model;

/**
 * Model definition for Member.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the offerendpoint. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Member extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Account currentAccount;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Customer customer;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime dateActivated;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime dateJoined;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime dateOfBirth;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String email;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gender;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String informBy;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Account investmentAccount;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Account loanAccount;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxRecordsToDisplay;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long memberId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nationalID;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String otherNames;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String photo;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pwd;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer refferedBy;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String surname;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String telephone;

  /**
   * @return value or {@code null} for none
   */
  public Account getCurrentAccount() {
    return currentAccount;
  }

  /**
   * @param currentAccount currentAccount or {@code null} for none
   */
  public Member setCurrentAccount(Account currentAccount) {
    this.currentAccount = currentAccount;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public Customer getCustomer() {
    return customer;
  }

  /**
   * @param customer customer or {@code null} for none
   */
  public Member setCustomer(Customer customer) {
    this.customer = customer;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getDateActivated() {
    return dateActivated;
  }

  /**
   * @param dateActivated dateActivated or {@code null} for none
   */
  public Member setDateActivated(com.google.api.client.util.DateTime dateActivated) {
    this.dateActivated = dateActivated;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getDateJoined() {
    return dateJoined;
  }

  /**
   * @param dateJoined dateJoined or {@code null} for none
   */
  public Member setDateJoined(com.google.api.client.util.DateTime dateJoined) {
    this.dateJoined = dateJoined;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getDateOfBirth() {
    return dateOfBirth;
  }

  /**
   * @param dateOfBirth dateOfBirth or {@code null} for none
   */
  public Member setDateOfBirth(com.google.api.client.util.DateTime dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getEmail() {
    return email;
  }

  /**
   * @param email email or {@code null} for none
   */
  public Member setEmail(java.lang.String email) {
    this.email = email;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getGender() {
    return gender;
  }

  /**
   * @param gender gender or {@code null} for none
   */
  public Member setGender(java.lang.String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getInformBy() {
    return informBy;
  }

  /**
   * @param informBy informBy or {@code null} for none
   */
  public Member setInformBy(java.lang.String informBy) {
    this.informBy = informBy;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public Account getInvestmentAccount() {
    return investmentAccount;
  }

  /**
   * @param investmentAccount investmentAccount or {@code null} for none
   */
  public Member setInvestmentAccount(Account investmentAccount) {
    this.investmentAccount = investmentAccount;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public Account getLoanAccount() {
    return loanAccount;
  }

  /**
   * @param loanAccount loanAccount or {@code null} for none
   */
  public Member setLoanAccount(Account loanAccount) {
    this.loanAccount = loanAccount;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxRecordsToDisplay() {
    return maxRecordsToDisplay;
  }

  /**
   * @param maxRecordsToDisplay maxRecordsToDisplay or {@code null} for none
   */
  public Member setMaxRecordsToDisplay(java.lang.Integer maxRecordsToDisplay) {
    this.maxRecordsToDisplay = maxRecordsToDisplay;
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
  public Member setMemberId(java.lang.Long memberId) {
    this.memberId = memberId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getNationalID() {
    return nationalID;
  }

  /**
   * @param nationalID nationalID or {@code null} for none
   */
  public Member setNationalID(java.lang.String nationalID) {
    this.nationalID = nationalID;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getOtherNames() {
    return otherNames;
  }

  /**
   * @param otherNames otherNames or {@code null} for none
   */
  public Member setOtherNames(java.lang.String otherNames) {
    this.otherNames = otherNames;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPhoto() {
    return photo;
  }

  /**
   * @param photo photo or {@code null} for none
   */
  public Member setPhoto(java.lang.String photo) {
    this.photo = photo;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPwd() {
    return pwd;
  }

  /**
   * @param pwd pwd or {@code null} for none
   */
  public Member setPwd(java.lang.String pwd) {
    this.pwd = pwd;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRefferedBy() {
    return refferedBy;
  }

  /**
   * @param refferedBy refferedBy or {@code null} for none
   */
  public Member setRefferedBy(java.lang.Integer refferedBy) {
    this.refferedBy = refferedBy;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * @param status status or {@code null} for none
   */
  public Member setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSurname() {
    return surname;
  }

  /**
   * @param surname surname or {@code null} for none
   */
  public Member setSurname(java.lang.String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTelephone() {
    return telephone;
  }

  /**
   * @param telephone telephone or {@code null} for none
   */
  public Member setTelephone(java.lang.String telephone) {
    this.telephone = telephone;
    return this;
  }

  @Override
  public Member set(String fieldName, Object value) {
    return (Member) super.set(fieldName, value);
  }

  @Override
  public Member clone() {
    return (Member) super.clone();
  }

}
