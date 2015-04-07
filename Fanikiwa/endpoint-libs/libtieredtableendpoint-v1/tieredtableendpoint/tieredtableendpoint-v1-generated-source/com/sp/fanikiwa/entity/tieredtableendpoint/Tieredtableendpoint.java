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
 * on 2015-04-07 at 05:23:11 UTC 
 * Modify at your own risk.
 */

package com.sp.fanikiwa.entity.tieredtableendpoint;

/**
 * Service definition for Tieredtableendpoint (v1).
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
 * This service uses {@link TieredtableendpointRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Tieredtableendpoint extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.18.0-rc of the tieredtableendpoint library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
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
  public static final String DEFAULT_SERVICE_PATH = "tieredtableendpoint/v1/";

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
  public Tieredtableendpoint(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Tieredtableendpoint(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the TieredtableEndpoint collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Tieredtableendpoint tieredtableendpoint = new Tieredtableendpoint(...);}
   *   {@code Tieredtableendpoint.TieredtableEndpoint.List request = tieredtableendpoint.tieredtableEndpoint().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public TieredtableEndpoint tieredtableEndpoint() {
    return new TieredtableEndpoint();
  }

  /**
   * The "tieredtableEndpoint" collection of methods.
   */
  public class TieredtableEndpoint {

    /**
     * Create a request for the method "tieredtableEndpoint.getTieredTableId".
     *
     * This request holds the parameters needed by the tieredtableendpoint server.  After setting any
     * optional parameters, call the {@link GetTieredTableId#execute()} method to invoke the remote
     * operation.
     *
     * @param tableid
     * @return the request
     */
    public GetTieredTableId getTieredTableId(java.lang.Long tableid) throws java.io.IOException {
      GetTieredTableId result = new GetTieredTableId(tableid);
      initialize(result);
      return result;
    }

    public class GetTieredTableId extends TieredtableendpointRequest<com.sp.fanikiwa.entity.tieredtableendpoint.model.TieredtableCollection> {

      private static final String REST_PATH = "tieredtablecollection/{tableid}";

      /**
       * Create a request for the method "tieredtableEndpoint.getTieredTableId".
       *
       * This request holds the parameters needed by the the tieredtableendpoint server.  After setting
       * any optional parameters, call the {@link GetTieredTableId#execute()} method to invoke the
       * remote operation. <p> {@link GetTieredTableId#initialize(com.google.api.client.googleapis.servi
       * ces.AbstractGoogleClientRequest)} must be called to initialize this instance immediately after
       * invoking the constructor. </p>
       *
       * @param tableid
       * @since 1.13
       */
      protected GetTieredTableId(java.lang.Long tableid) {
        super(Tieredtableendpoint.this, "GET", REST_PATH, null, com.sp.fanikiwa.entity.tieredtableendpoint.model.TieredtableCollection.class);
        this.tableid = com.google.api.client.util.Preconditions.checkNotNull(tableid, "Required parameter tableid must be specified.");
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
      public GetTieredTableId setAlt(java.lang.String alt) {
        return (GetTieredTableId) super.setAlt(alt);
      }

      @Override
      public GetTieredTableId setFields(java.lang.String fields) {
        return (GetTieredTableId) super.setFields(fields);
      }

      @Override
      public GetTieredTableId setKey(java.lang.String key) {
        return (GetTieredTableId) super.setKey(key);
      }

      @Override
      public GetTieredTableId setOauthToken(java.lang.String oauthToken) {
        return (GetTieredTableId) super.setOauthToken(oauthToken);
      }

      @Override
      public GetTieredTableId setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (GetTieredTableId) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public GetTieredTableId setQuotaUser(java.lang.String quotaUser) {
        return (GetTieredTableId) super.setQuotaUser(quotaUser);
      }

      @Override
      public GetTieredTableId setUserIp(java.lang.String userIp) {
        return (GetTieredTableId) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private java.lang.Long tableid;

      /**

       */
      public java.lang.Long getTableid() {
        return tableid;
      }

      public GetTieredTableId setTableid(java.lang.Long tableid) {
        this.tableid = tableid;
        return this;
      }

      @Override
      public GetTieredTableId set(String parameterName, Object value) {
        return (GetTieredTableId) super.set(parameterName, value);
      }
    }

  }

  /**
   * Create a request for the method "insertTieredtable".
   *
   * This request holds the parameters needed by the tieredtableendpoint server.  After setting any
   * optional parameters, call the {@link InsertTieredtable#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.sp.fanikiwa.entity.tieredtableendpoint.model.Tieredtable}
   * @return the request
   */
  public InsertTieredtable insertTieredtable(com.sp.fanikiwa.entity.tieredtableendpoint.model.Tieredtable content) throws java.io.IOException {
    InsertTieredtable result = new InsertTieredtable(content);
    initialize(result);
    return result;
  }

  public class InsertTieredtable extends TieredtableendpointRequest<com.sp.fanikiwa.entity.tieredtableendpoint.model.Tieredtable> {

    private static final String REST_PATH = "tieredtable";

    /**
     * Create a request for the method "insertTieredtable".
     *
     * This request holds the parameters needed by the the tieredtableendpoint server.  After setting
     * any optional parameters, call the {@link InsertTieredtable#execute()} method to invoke the
     * remote operation. <p> {@link InsertTieredtable#initialize(com.google.api.client.googleapis.serv
     * ices.AbstractGoogleClientRequest)} must be called to initialize this instance immediately after
     * invoking the constructor. </p>
     *
     * @param content the {@link com.sp.fanikiwa.entity.tieredtableendpoint.model.Tieredtable}
     * @since 1.13
     */
    protected InsertTieredtable(com.sp.fanikiwa.entity.tieredtableendpoint.model.Tieredtable content) {
      super(Tieredtableendpoint.this, "POST", REST_PATH, content, com.sp.fanikiwa.entity.tieredtableendpoint.model.Tieredtable.class);
    }

    @Override
    public InsertTieredtable setAlt(java.lang.String alt) {
      return (InsertTieredtable) super.setAlt(alt);
    }

    @Override
    public InsertTieredtable setFields(java.lang.String fields) {
      return (InsertTieredtable) super.setFields(fields);
    }

    @Override
    public InsertTieredtable setKey(java.lang.String key) {
      return (InsertTieredtable) super.setKey(key);
    }

    @Override
    public InsertTieredtable setOauthToken(java.lang.String oauthToken) {
      return (InsertTieredtable) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertTieredtable setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertTieredtable) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertTieredtable setQuotaUser(java.lang.String quotaUser) {
      return (InsertTieredtable) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertTieredtable setUserIp(java.lang.String userIp) {
      return (InsertTieredtable) super.setUserIp(userIp);
    }

    @Override
    public InsertTieredtable set(String parameterName, Object value) {
      return (InsertTieredtable) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listTieredtable".
   *
   * This request holds the parameters needed by the tieredtableendpoint server.  After setting any
   * optional parameters, call the {@link ListTieredtable#execute()} method to invoke the remote
   * operation.
   *
   * @return the request
   */
  public ListTieredtable listTieredtable() throws java.io.IOException {
    ListTieredtable result = new ListTieredtable();
    initialize(result);
    return result;
  }

  public class ListTieredtable extends TieredtableendpointRequest<com.sp.fanikiwa.entity.tieredtableendpoint.model.CollectionResponseTieredtable> {

    private static final String REST_PATH = "tieredtable";

    /**
     * Create a request for the method "listTieredtable".
     *
     * This request holds the parameters needed by the the tieredtableendpoint server.  After setting
     * any optional parameters, call the {@link ListTieredtable#execute()} method to invoke the remote
     * operation. <p> {@link ListTieredtable#initialize(com.google.api.client.googleapis.services.Abst
     * ractGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @since 1.13
     */
    protected ListTieredtable() {
      super(Tieredtableendpoint.this, "GET", REST_PATH, null, com.sp.fanikiwa.entity.tieredtableendpoint.model.CollectionResponseTieredtable.class);
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
    public ListTieredtable setAlt(java.lang.String alt) {
      return (ListTieredtable) super.setAlt(alt);
    }

    @Override
    public ListTieredtable setFields(java.lang.String fields) {
      return (ListTieredtable) super.setFields(fields);
    }

    @Override
    public ListTieredtable setKey(java.lang.String key) {
      return (ListTieredtable) super.setKey(key);
    }

    @Override
    public ListTieredtable setOauthToken(java.lang.String oauthToken) {
      return (ListTieredtable) super.setOauthToken(oauthToken);
    }

    @Override
    public ListTieredtable setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListTieredtable) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListTieredtable setQuotaUser(java.lang.String quotaUser) {
      return (ListTieredtable) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListTieredtable setUserIp(java.lang.String userIp) {
      return (ListTieredtable) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Integer count;

    /**

     */
    public java.lang.Integer getCount() {
      return count;
    }

    public ListTieredtable setCount(java.lang.Integer count) {
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

    public ListTieredtable setCursor(java.lang.String cursor) {
      this.cursor = cursor;
      return this;
    }

    @Override
    public ListTieredtable set(String parameterName, Object value) {
      return (ListTieredtable) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "removeTieredtable".
   *
   * This request holds the parameters needed by the tieredtableendpoint server.  After setting any
   * optional parameters, call the {@link RemoveTieredtable#execute()} method to invoke the remote
   * operation.
   *
   * @param id
   * @return the request
   */
  public RemoveTieredtable removeTieredtable(java.lang.Long id) throws java.io.IOException {
    RemoveTieredtable result = new RemoveTieredtable(id);
    initialize(result);
    return result;
  }

  public class RemoveTieredtable extends TieredtableendpointRequest<Void> {

    private static final String REST_PATH = "tieredtable/{id}";

    /**
     * Create a request for the method "removeTieredtable".
     *
     * This request holds the parameters needed by the the tieredtableendpoint server.  After setting
     * any optional parameters, call the {@link RemoveTieredtable#execute()} method to invoke the
     * remote operation. <p> {@link RemoveTieredtable#initialize(com.google.api.client.googleapis.serv
     * ices.AbstractGoogleClientRequest)} must be called to initialize this instance immediately after
     * invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected RemoveTieredtable(java.lang.Long id) {
      super(Tieredtableendpoint.this, "DELETE", REST_PATH, null, Void.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public RemoveTieredtable setAlt(java.lang.String alt) {
      return (RemoveTieredtable) super.setAlt(alt);
    }

    @Override
    public RemoveTieredtable setFields(java.lang.String fields) {
      return (RemoveTieredtable) super.setFields(fields);
    }

    @Override
    public RemoveTieredtable setKey(java.lang.String key) {
      return (RemoveTieredtable) super.setKey(key);
    }

    @Override
    public RemoveTieredtable setOauthToken(java.lang.String oauthToken) {
      return (RemoveTieredtable) super.setOauthToken(oauthToken);
    }

    @Override
    public RemoveTieredtable setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RemoveTieredtable) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RemoveTieredtable setQuotaUser(java.lang.String quotaUser) {
      return (RemoveTieredtable) super.setQuotaUser(quotaUser);
    }

    @Override
    public RemoveTieredtable setUserIp(java.lang.String userIp) {
      return (RemoveTieredtable) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public RemoveTieredtable setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public RemoveTieredtable set(String parameterName, Object value) {
      return (RemoveTieredtable) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updateTieredtable".
   *
   * This request holds the parameters needed by the tieredtableendpoint server.  After setting any
   * optional parameters, call the {@link UpdateTieredtable#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.sp.fanikiwa.entity.tieredtableendpoint.model.Tieredtable}
   * @return the request
   */
  public UpdateTieredtable updateTieredtable(com.sp.fanikiwa.entity.tieredtableendpoint.model.Tieredtable content) throws java.io.IOException {
    UpdateTieredtable result = new UpdateTieredtable(content);
    initialize(result);
    return result;
  }

  public class UpdateTieredtable extends TieredtableendpointRequest<com.sp.fanikiwa.entity.tieredtableendpoint.model.Tieredtable> {

    private static final String REST_PATH = "tieredtable";

    /**
     * Create a request for the method "updateTieredtable".
     *
     * This request holds the parameters needed by the the tieredtableendpoint server.  After setting
     * any optional parameters, call the {@link UpdateTieredtable#execute()} method to invoke the
     * remote operation. <p> {@link UpdateTieredtable#initialize(com.google.api.client.googleapis.serv
     * ices.AbstractGoogleClientRequest)} must be called to initialize this instance immediately after
     * invoking the constructor. </p>
     *
     * @param content the {@link com.sp.fanikiwa.entity.tieredtableendpoint.model.Tieredtable}
     * @since 1.13
     */
    protected UpdateTieredtable(com.sp.fanikiwa.entity.tieredtableendpoint.model.Tieredtable content) {
      super(Tieredtableendpoint.this, "PUT", REST_PATH, content, com.sp.fanikiwa.entity.tieredtableendpoint.model.Tieredtable.class);
    }

    @Override
    public UpdateTieredtable setAlt(java.lang.String alt) {
      return (UpdateTieredtable) super.setAlt(alt);
    }

    @Override
    public UpdateTieredtable setFields(java.lang.String fields) {
      return (UpdateTieredtable) super.setFields(fields);
    }

    @Override
    public UpdateTieredtable setKey(java.lang.String key) {
      return (UpdateTieredtable) super.setKey(key);
    }

    @Override
    public UpdateTieredtable setOauthToken(java.lang.String oauthToken) {
      return (UpdateTieredtable) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdateTieredtable setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdateTieredtable) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdateTieredtable setQuotaUser(java.lang.String quotaUser) {
      return (UpdateTieredtable) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdateTieredtable setUserIp(java.lang.String userIp) {
      return (UpdateTieredtable) super.setUserIp(userIp);
    }

    @Override
    public UpdateTieredtable set(String parameterName, Object value) {
      return (UpdateTieredtable) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Tieredtableendpoint}.
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

    /** Builds a new instance of {@link Tieredtableendpoint}. */
    @Override
    public Tieredtableendpoint build() {
      return new Tieredtableendpoint(this);
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
     * Set the {@link TieredtableendpointRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setTieredtableendpointRequestInitializer(
        TieredtableendpointRequestInitializer tieredtableendpointRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(tieredtableendpointRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}