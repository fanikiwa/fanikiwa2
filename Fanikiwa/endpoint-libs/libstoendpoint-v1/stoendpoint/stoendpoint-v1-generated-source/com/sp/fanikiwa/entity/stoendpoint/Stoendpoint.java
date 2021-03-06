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
 * on 2015-04-07 at 05:24:25 UTC 
 * Modify at your own risk.
 */

package com.sp.fanikiwa.entity.stoendpoint;

/**
 * Service definition for Stoendpoint (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link StoendpointRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Stoendpoint extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.18.0-rc of the stoendpoint library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://1-dot-fanikiwaweb.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "stoendpoint/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Stoendpoint(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Stoendpoint(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getSTOByID".
   *
   * This request holds the parameters needed by the stoendpoint server.  After setting any optional
   * parameters, call the {@link GetSTOByID#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public GetSTOByID getSTOByID(java.lang.Long id) throws java.io.IOException {
    GetSTOByID result = new GetSTOByID(id);
    initialize(result);
    return result;
  }

  public class GetSTOByID extends StoendpointRequest<com.sp.fanikiwa.entity.stoendpoint.model.STO> {

    private static final String REST_PATH = "sto/{id}";

    /**
     * Create a request for the method "getSTOByID".
     *
     * This request holds the parameters needed by the the stoendpoint server.  After setting any
     * optional parameters, call the {@link GetSTOByID#execute()} method to invoke the remote
     * operation. <p> {@link
     * GetSTOByID#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetSTOByID(java.lang.Long id) {
      super(Stoendpoint.this, "GET", REST_PATH, null, com.sp.fanikiwa.entity.stoendpoint.model.STO.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetSTOByID setAlt(java.lang.String alt) {
      return (GetSTOByID) super.setAlt(alt);
    }

    @Override
    public GetSTOByID setFields(java.lang.String fields) {
      return (GetSTOByID) super.setFields(fields);
    }

    @Override
    public GetSTOByID setKey(java.lang.String key) {
      return (GetSTOByID) super.setKey(key);
    }

    @Override
    public GetSTOByID setOauthToken(java.lang.String oauthToken) {
      return (GetSTOByID) super.setOauthToken(oauthToken);
    }

    @Override
    public GetSTOByID setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetSTOByID) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetSTOByID setQuotaUser(java.lang.String quotaUser) {
      return (GetSTOByID) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetSTOByID setUserIp(java.lang.String userIp) {
      return (GetSTOByID) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public GetSTOByID setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public GetSTOByID set(String parameterName, Object value) {
      return (GetSTOByID) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertSTO".
   *
   * This request holds the parameters needed by the stoendpoint server.  After setting any optional
   * parameters, call the {@link InsertSTO#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.sp.fanikiwa.entity.stoendpoint.model.STO}
   * @return the request
   */
  public InsertSTO insertSTO(com.sp.fanikiwa.entity.stoendpoint.model.STO content) throws java.io.IOException {
    InsertSTO result = new InsertSTO(content);
    initialize(result);
    return result;
  }

  public class InsertSTO extends StoendpointRequest<com.sp.fanikiwa.entity.stoendpoint.model.STO> {

    private static final String REST_PATH = "sto";

    /**
     * Create a request for the method "insertSTO".
     *
     * This request holds the parameters needed by the the stoendpoint server.  After setting any
     * optional parameters, call the {@link InsertSTO#execute()} method to invoke the remote
     * operation. <p> {@link
     * InsertSTO#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.sp.fanikiwa.entity.stoendpoint.model.STO}
     * @since 1.13
     */
    protected InsertSTO(com.sp.fanikiwa.entity.stoendpoint.model.STO content) {
      super(Stoendpoint.this, "POST", REST_PATH, content, com.sp.fanikiwa.entity.stoendpoint.model.STO.class);
    }

    @Override
    public InsertSTO setAlt(java.lang.String alt) {
      return (InsertSTO) super.setAlt(alt);
    }

    @Override
    public InsertSTO setFields(java.lang.String fields) {
      return (InsertSTO) super.setFields(fields);
    }

    @Override
    public InsertSTO setKey(java.lang.String key) {
      return (InsertSTO) super.setKey(key);
    }

    @Override
    public InsertSTO setOauthToken(java.lang.String oauthToken) {
      return (InsertSTO) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertSTO setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertSTO) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertSTO setQuotaUser(java.lang.String quotaUser) {
      return (InsertSTO) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertSTO setUserIp(java.lang.String userIp) {
      return (InsertSTO) super.setUserIp(userIp);
    }

    @Override
    public InsertSTO set(String parameterName, Object value) {
      return (InsertSTO) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listSTO".
   *
   * This request holds the parameters needed by the stoendpoint server.  After setting any optional
   * parameters, call the {@link ListSTO#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public ListSTO listSTO() throws java.io.IOException {
    ListSTO result = new ListSTO();
    initialize(result);
    return result;
  }

  public class ListSTO extends StoendpointRequest<com.sp.fanikiwa.entity.stoendpoint.model.CollectionResponseSTO> {

    private static final String REST_PATH = "sto";

    /**
     * Create a request for the method "listSTO".
     *
     * This request holds the parameters needed by the the stoendpoint server.  After setting any
     * optional parameters, call the {@link ListSTO#execute()} method to invoke the remote operation.
     * <p> {@link
     * ListSTO#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
     * be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected ListSTO() {
      super(Stoendpoint.this, "GET", REST_PATH, null, com.sp.fanikiwa.entity.stoendpoint.model.CollectionResponseSTO.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public ListSTO setAlt(java.lang.String alt) {
      return (ListSTO) super.setAlt(alt);
    }

    @Override
    public ListSTO setFields(java.lang.String fields) {
      return (ListSTO) super.setFields(fields);
    }

    @Override
    public ListSTO setKey(java.lang.String key) {
      return (ListSTO) super.setKey(key);
    }

    @Override
    public ListSTO setOauthToken(java.lang.String oauthToken) {
      return (ListSTO) super.setOauthToken(oauthToken);
    }

    @Override
    public ListSTO setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListSTO) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListSTO setQuotaUser(java.lang.String quotaUser) {
      return (ListSTO) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListSTO setUserIp(java.lang.String userIp) {
      return (ListSTO) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Integer count;

    /**

     */
    public java.lang.Integer getCount() {
      return count;
    }

    public ListSTO setCount(java.lang.Integer count) {
      this.count = count;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public ListSTO setCursor(java.lang.String cursor) {
      this.cursor = cursor;
      return this;
    }

    @Override
    public ListSTO set(String parameterName, Object value) {
      return (ListSTO) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "removeSTO".
   *
   * This request holds the parameters needed by the stoendpoint server.  After setting any optional
   * parameters, call the {@link RemoveSTO#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public RemoveSTO removeSTO(java.lang.Long id) throws java.io.IOException {
    RemoveSTO result = new RemoveSTO(id);
    initialize(result);
    return result;
  }

  public class RemoveSTO extends StoendpointRequest<Void> {

    private static final String REST_PATH = "sto/{id}";

    /**
     * Create a request for the method "removeSTO".
     *
     * This request holds the parameters needed by the the stoendpoint server.  After setting any
     * optional parameters, call the {@link RemoveSTO#execute()} method to invoke the remote
     * operation. <p> {@link
     * RemoveSTO#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected RemoveSTO(java.lang.Long id) {
      super(Stoendpoint.this, "DELETE", REST_PATH, null, Void.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public RemoveSTO setAlt(java.lang.String alt) {
      return (RemoveSTO) super.setAlt(alt);
    }

    @Override
    public RemoveSTO setFields(java.lang.String fields) {
      return (RemoveSTO) super.setFields(fields);
    }

    @Override
    public RemoveSTO setKey(java.lang.String key) {
      return (RemoveSTO) super.setKey(key);
    }

    @Override
    public RemoveSTO setOauthToken(java.lang.String oauthToken) {
      return (RemoveSTO) super.setOauthToken(oauthToken);
    }

    @Override
    public RemoveSTO setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RemoveSTO) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RemoveSTO setQuotaUser(java.lang.String quotaUser) {
      return (RemoveSTO) super.setQuotaUser(quotaUser);
    }

    @Override
    public RemoveSTO setUserIp(java.lang.String userIp) {
      return (RemoveSTO) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public RemoveSTO setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public RemoveSTO set(String parameterName, Object value) {
      return (RemoveSTO) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "selectSTOByDateFrom".
   *
   * This request holds the parameters needed by the stoendpoint server.  After setting any optional
   * parameters, call the {@link SelectSTOByDateFrom#execute()} method to invoke the remote operation.
   *
   * @param date
   * @return the request
   */
  public SelectSTOByDateFrom selectSTOByDateFrom(com.google.api.client.util.DateTime date) throws java.io.IOException {
    SelectSTOByDateFrom result = new SelectSTOByDateFrom(date);
    initialize(result);
    return result;
  }

  public class SelectSTOByDateFrom extends StoendpointRequest<com.sp.fanikiwa.entity.stoendpoint.model.CollectionResponseSTO> {

    private static final String REST_PATH = "SelectSTOByDateFrom/{date}";

    /**
     * Create a request for the method "selectSTOByDateFrom".
     *
     * This request holds the parameters needed by the the stoendpoint server.  After setting any
     * optional parameters, call the {@link SelectSTOByDateFrom#execute()} method to invoke the remote
     * operation. <p> {@link SelectSTOByDateFrom#initialize(com.google.api.client.googleapis.services.
     * AbstractGoogleClientRequest)} must be called to initialize this instance immediately after
     * invoking the constructor. </p>
     *
     * @param date
     * @since 1.13
     */
    protected SelectSTOByDateFrom(com.google.api.client.util.DateTime date) {
      super(Stoendpoint.this, "POST", REST_PATH, null, com.sp.fanikiwa.entity.stoendpoint.model.CollectionResponseSTO.class);
      this.date = com.google.api.client.util.Preconditions.checkNotNull(date, "Required parameter date must be specified.");
    }

    @Override
    public SelectSTOByDateFrom setAlt(java.lang.String alt) {
      return (SelectSTOByDateFrom) super.setAlt(alt);
    }

    @Override
    public SelectSTOByDateFrom setFields(java.lang.String fields) {
      return (SelectSTOByDateFrom) super.setFields(fields);
    }

    @Override
    public SelectSTOByDateFrom setKey(java.lang.String key) {
      return (SelectSTOByDateFrom) super.setKey(key);
    }

    @Override
    public SelectSTOByDateFrom setOauthToken(java.lang.String oauthToken) {
      return (SelectSTOByDateFrom) super.setOauthToken(oauthToken);
    }

    @Override
    public SelectSTOByDateFrom setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (SelectSTOByDateFrom) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public SelectSTOByDateFrom setQuotaUser(java.lang.String quotaUser) {
      return (SelectSTOByDateFrom) super.setQuotaUser(quotaUser);
    }

    @Override
    public SelectSTOByDateFrom setUserIp(java.lang.String userIp) {
      return (SelectSTOByDateFrom) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private com.google.api.client.util.DateTime date;

    /**

     */
    public com.google.api.client.util.DateTime getDate() {
      return date;
    }

    public SelectSTOByDateFrom setDate(com.google.api.client.util.DateTime date) {
      this.date = date;
      return this;
    }

    @Override
    public SelectSTOByDateFrom set(String parameterName, Object value) {
      return (SelectSTOByDateFrom) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updateSTO".
   *
   * This request holds the parameters needed by the stoendpoint server.  After setting any optional
   * parameters, call the {@link UpdateSTO#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.sp.fanikiwa.entity.stoendpoint.model.STO}
   * @return the request
   */
  public UpdateSTO updateSTO(com.sp.fanikiwa.entity.stoendpoint.model.STO content) throws java.io.IOException {
    UpdateSTO result = new UpdateSTO(content);
    initialize(result);
    return result;
  }

  public class UpdateSTO extends StoendpointRequest<com.sp.fanikiwa.entity.stoendpoint.model.STO> {

    private static final String REST_PATH = "sto";

    /**
     * Create a request for the method "updateSTO".
     *
     * This request holds the parameters needed by the the stoendpoint server.  After setting any
     * optional parameters, call the {@link UpdateSTO#execute()} method to invoke the remote
     * operation. <p> {@link
     * UpdateSTO#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.sp.fanikiwa.entity.stoendpoint.model.STO}
     * @since 1.13
     */
    protected UpdateSTO(com.sp.fanikiwa.entity.stoendpoint.model.STO content) {
      super(Stoendpoint.this, "PUT", REST_PATH, content, com.sp.fanikiwa.entity.stoendpoint.model.STO.class);
    }

    @Override
    public UpdateSTO setAlt(java.lang.String alt) {
      return (UpdateSTO) super.setAlt(alt);
    }

    @Override
    public UpdateSTO setFields(java.lang.String fields) {
      return (UpdateSTO) super.setFields(fields);
    }

    @Override
    public UpdateSTO setKey(java.lang.String key) {
      return (UpdateSTO) super.setKey(key);
    }

    @Override
    public UpdateSTO setOauthToken(java.lang.String oauthToken) {
      return (UpdateSTO) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdateSTO setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdateSTO) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdateSTO setQuotaUser(java.lang.String quotaUser) {
      return (UpdateSTO) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdateSTO setUserIp(java.lang.String userIp) {
      return (UpdateSTO) super.setUserIp(userIp);
    }

    @Override
    public UpdateSTO set(String parameterName, Object value) {
      return (UpdateSTO) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Stoendpoint}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Stoendpoint}. */
    @Override
    public Stoendpoint build() {
      return new Stoendpoint(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link StoendpointRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setStoendpointRequestInitializer(
        StoendpointRequestInitializer stoendpointRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(stoendpointRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
