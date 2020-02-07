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

package com.google.api.services.cloudtrace.v1;

/**
 * Service definition for CloudTrace (v1).
 *
 * <p>
 * Sends application trace data to Stackdriver Trace for viewing. Trace data is collected for all App Engine applications by default. Trace data from other applications can be provided using this API. This library is used to interact with the Trace API directly. If you are looking to instrument your application for Stackdriver Trace, we recommend using OpenCensus.

 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://cloud.google.com/trace" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link CloudTraceRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class CloudTrace extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.30.3 of the Stackdriver Trace API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://cloudtrace.googleapis.com/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "";

  /**
   * The default encoded batch path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.23
   */
  public static final String DEFAULT_BATCH_PATH = "batch";

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
  public CloudTrace(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  CloudTrace(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the Projects collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code CloudTrace cloudtrace = new CloudTrace(...);}
   *   {@code CloudTrace.Projects.List request = cloudtrace.projects().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Projects projects() {
    return new Projects();
  }

  /**
   * The "projects" collection of methods.
   */
  public class Projects {

    /**
     * Sends new traces to Stackdriver Trace or updates existing traces. If the ID of a trace that you
     * send matches that of an existing trace, any fields in the existing trace and its spans are
     * overwritten by the provided values, and any new fields provided are merged with the existing
     * trace data. If the ID does not match, a new trace is created. In this case, writing traces is not
     * consider an active developer method since traces are machine generated.
     *
     * Create a request for the method "projects.patchTraces".
     *
     * This request holds the parameters needed by the cloudtrace server.  After setting any optional
     * parameters, call the {@link PatchTraces#execute()} method to invoke the remote operation.
     *
     * @param projectId Required. ID of the Cloud project where the trace data is stored.
     * @param content the {@link com.google.api.services.cloudtrace.v1.model.Traces}
     * @return the request
     */
    public PatchTraces patchTraces(java.lang.String projectId, com.google.api.services.cloudtrace.v1.model.Traces content) throws java.io.IOException {
      PatchTraces result = new PatchTraces(projectId, content);
      initialize(result);
      return result;
    }

    public class PatchTraces extends CloudTraceRequest<com.google.api.services.cloudtrace.v1.model.Empty> {

      private static final String REST_PATH = "v1/projects/{projectId}/traces";

      /**
       * Sends new traces to Stackdriver Trace or updates existing traces. If the ID of a trace that you
       * send matches that of an existing trace, any fields in the existing trace and its spans are
       * overwritten by the provided values, and any new fields provided are merged with the existing
       * trace data. If the ID does not match, a new trace is created. In this case, writing traces is
       * not consider an active developer method since traces are machine generated.
       *
       * Create a request for the method "projects.patchTraces".
       *
       * This request holds the parameters needed by the the cloudtrace server.  After setting any
       * optional parameters, call the {@link PatchTraces#execute()} method to invoke the remote
       * operation. <p> {@link
       * PatchTraces#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param projectId Required. ID of the Cloud project where the trace data is stored.
       * @param content the {@link com.google.api.services.cloudtrace.v1.model.Traces}
       * @since 1.13
       */
      protected PatchTraces(java.lang.String projectId, com.google.api.services.cloudtrace.v1.model.Traces content) {
        super(CloudTrace.this, "PATCH", REST_PATH, content, com.google.api.services.cloudtrace.v1.model.Empty.class);
        this.projectId = com.google.api.client.util.Preconditions.checkNotNull(projectId, "Required parameter projectId must be specified.");
      }

      @Override
      public PatchTraces set$Xgafv(java.lang.String $Xgafv) {
        return (PatchTraces) super.set$Xgafv($Xgafv);
      }

      @Override
      public PatchTraces setAccessToken(java.lang.String accessToken) {
        return (PatchTraces) super.setAccessToken(accessToken);
      }

      @Override
      public PatchTraces setAlt(java.lang.String alt) {
        return (PatchTraces) super.setAlt(alt);
      }

      @Override
      public PatchTraces setCallback(java.lang.String callback) {
        return (PatchTraces) super.setCallback(callback);
      }

      @Override
      public PatchTraces setFields(java.lang.String fields) {
        return (PatchTraces) super.setFields(fields);
      }

      @Override
      public PatchTraces setKey(java.lang.String key) {
        return (PatchTraces) super.setKey(key);
      }

      @Override
      public PatchTraces setOauthToken(java.lang.String oauthToken) {
        return (PatchTraces) super.setOauthToken(oauthToken);
      }

      @Override
      public PatchTraces setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (PatchTraces) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public PatchTraces setQuotaUser(java.lang.String quotaUser) {
        return (PatchTraces) super.setQuotaUser(quotaUser);
      }

      @Override
      public PatchTraces setUploadType(java.lang.String uploadType) {
        return (PatchTraces) super.setUploadType(uploadType);
      }

      @Override
      public PatchTraces setUploadProtocol(java.lang.String uploadProtocol) {
        return (PatchTraces) super.setUploadProtocol(uploadProtocol);
      }

      /** Required. ID of the Cloud project where the trace data is stored. */
      @com.google.api.client.util.Key
      private java.lang.String projectId;

      /** Required. ID of the Cloud project where the trace data is stored.
       */
      public java.lang.String getProjectId() {
        return projectId;
      }

      /** Required. ID of the Cloud project where the trace data is stored. */
      public PatchTraces setProjectId(java.lang.String projectId) {
        this.projectId = projectId;
        return this;
      }

      @Override
      public PatchTraces set(String parameterName, Object value) {
        return (PatchTraces) super.set(parameterName, value);
      }
    }

    /**
     * An accessor for creating requests from the Traces collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code CloudTrace cloudtrace = new CloudTrace(...);}
     *   {@code CloudTrace.Traces.List request = cloudtrace.traces().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public Traces traces() {
      return new Traces();
    }

    /**
     * The "traces" collection of methods.
     */
    public class Traces {

      /**
       * Gets a single trace by its ID. In this case, getting for traces is considered an active developer
       * method, even though it is technically a read-only method.
       *
       * Create a request for the method "traces.get".
       *
       * This request holds the parameters needed by the cloudtrace server.  After setting any optional
       * parameters, call the {@link Get#execute()} method to invoke the remote operation.
       *
       * @param projectId Required. ID of the Cloud project where the trace data is stored.
       * @param traceId Required. ID of the trace to return.
       * @return the request
       */
      public Get get(java.lang.String projectId, java.lang.String traceId) throws java.io.IOException {
        Get result = new Get(projectId, traceId);
        initialize(result);
        return result;
      }

      public class Get extends CloudTraceRequest<com.google.api.services.cloudtrace.v1.model.Trace> {

        private static final String REST_PATH = "v1/projects/{projectId}/traces/{traceId}";

        /**
         * Gets a single trace by its ID. In this case, getting for traces is considered an active
         * developer method, even though it is technically a read-only method.
         *
         * Create a request for the method "traces.get".
         *
         * This request holds the parameters needed by the the cloudtrace server.  After setting any
         * optional parameters, call the {@link Get#execute()} method to invoke the remote operation. <p>
         * {@link Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
         * must be called to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param projectId Required. ID of the Cloud project where the trace data is stored.
         * @param traceId Required. ID of the trace to return.
         * @since 1.13
         */
        protected Get(java.lang.String projectId, java.lang.String traceId) {
          super(CloudTrace.this, "GET", REST_PATH, null, com.google.api.services.cloudtrace.v1.model.Trace.class);
          this.projectId = com.google.api.client.util.Preconditions.checkNotNull(projectId, "Required parameter projectId must be specified.");
          this.traceId = com.google.api.client.util.Preconditions.checkNotNull(traceId, "Required parameter traceId must be specified.");
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
        public Get set$Xgafv(java.lang.String $Xgafv) {
          return (Get) super.set$Xgafv($Xgafv);
        }

        @Override
        public Get setAccessToken(java.lang.String accessToken) {
          return (Get) super.setAccessToken(accessToken);
        }

        @Override
        public Get setAlt(java.lang.String alt) {
          return (Get) super.setAlt(alt);
        }

        @Override
        public Get setCallback(java.lang.String callback) {
          return (Get) super.setCallback(callback);
        }

        @Override
        public Get setFields(java.lang.String fields) {
          return (Get) super.setFields(fields);
        }

        @Override
        public Get setKey(java.lang.String key) {
          return (Get) super.setKey(key);
        }

        @Override
        public Get setOauthToken(java.lang.String oauthToken) {
          return (Get) super.setOauthToken(oauthToken);
        }

        @Override
        public Get setPrettyPrint(java.lang.Boolean prettyPrint) {
          return (Get) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public Get setQuotaUser(java.lang.String quotaUser) {
          return (Get) super.setQuotaUser(quotaUser);
        }

        @Override
        public Get setUploadType(java.lang.String uploadType) {
          return (Get) super.setUploadType(uploadType);
        }

        @Override
        public Get setUploadProtocol(java.lang.String uploadProtocol) {
          return (Get) super.setUploadProtocol(uploadProtocol);
        }

        /** Required. ID of the Cloud project where the trace data is stored. */
        @com.google.api.client.util.Key
        private java.lang.String projectId;

        /** Required. ID of the Cloud project where the trace data is stored.
         */
        public java.lang.String getProjectId() {
          return projectId;
        }

        /** Required. ID of the Cloud project where the trace data is stored. */
        public Get setProjectId(java.lang.String projectId) {
          this.projectId = projectId;
          return this;
        }

        /** Required. ID of the trace to return. */
        @com.google.api.client.util.Key
        private java.lang.String traceId;

        /** Required. ID of the trace to return.
         */
        public java.lang.String getTraceId() {
          return traceId;
        }

        /** Required. ID of the trace to return. */
        public Get setTraceId(java.lang.String traceId) {
          this.traceId = traceId;
          return this;
        }

        @Override
        public Get set(String parameterName, Object value) {
          return (Get) super.set(parameterName, value);
        }
      }
      /**
       * Returns of a list of traces that match the specified filter conditions. In this case, listing for
       * traces is considered an active developer method, even though it is technically a read-only
       * method.
       *
       * Create a request for the method "traces.list".
       *
       * This request holds the parameters needed by the cloudtrace server.  After setting any optional
       * parameters, call the {@link List#execute()} method to invoke the remote operation.
       *
       * @param projectId Required. ID of the Cloud project where the trace data is stored.
       * @return the request
       */
      public List list(java.lang.String projectId) throws java.io.IOException {
        List result = new List(projectId);
        initialize(result);
        return result;
      }

      public class List extends CloudTraceRequest<com.google.api.services.cloudtrace.v1.model.ListTracesResponse> {

        private static final String REST_PATH = "v1/projects/{projectId}/traces";

        /**
         * Returns of a list of traces that match the specified filter conditions. In this case, listing
         * for traces is considered an active developer method, even though it is technically a read-only
         * method.
         *
         * Create a request for the method "traces.list".
         *
         * This request holds the parameters needed by the the cloudtrace server.  After setting any
         * optional parameters, call the {@link List#execute()} method to invoke the remote operation. <p>
         * {@link List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
         * must be called to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param projectId Required. ID of the Cloud project where the trace data is stored.
         * @since 1.13
         */
        protected List(java.lang.String projectId) {
          super(CloudTrace.this, "GET", REST_PATH, null, com.google.api.services.cloudtrace.v1.model.ListTracesResponse.class);
          this.projectId = com.google.api.client.util.Preconditions.checkNotNull(projectId, "Required parameter projectId must be specified.");
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
        public List set$Xgafv(java.lang.String $Xgafv) {
          return (List) super.set$Xgafv($Xgafv);
        }

        @Override
        public List setAccessToken(java.lang.String accessToken) {
          return (List) super.setAccessToken(accessToken);
        }

        @Override
        public List setAlt(java.lang.String alt) {
          return (List) super.setAlt(alt);
        }

        @Override
        public List setCallback(java.lang.String callback) {
          return (List) super.setCallback(callback);
        }

        @Override
        public List setFields(java.lang.String fields) {
          return (List) super.setFields(fields);
        }

        @Override
        public List setKey(java.lang.String key) {
          return (List) super.setKey(key);
        }

        @Override
        public List setOauthToken(java.lang.String oauthToken) {
          return (List) super.setOauthToken(oauthToken);
        }

        @Override
        public List setPrettyPrint(java.lang.Boolean prettyPrint) {
          return (List) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public List setQuotaUser(java.lang.String quotaUser) {
          return (List) super.setQuotaUser(quotaUser);
        }

        @Override
        public List setUploadType(java.lang.String uploadType) {
          return (List) super.setUploadType(uploadType);
        }

        @Override
        public List setUploadProtocol(java.lang.String uploadProtocol) {
          return (List) super.setUploadProtocol(uploadProtocol);
        }

        /** Required. ID of the Cloud project where the trace data is stored. */
        @com.google.api.client.util.Key
        private java.lang.String projectId;

        /** Required. ID of the Cloud project where the trace data is stored.
         */
        public java.lang.String getProjectId() {
          return projectId;
        }

        /** Required. ID of the Cloud project where the trace data is stored. */
        public List setProjectId(java.lang.String projectId) {
          this.projectId = projectId;
          return this;
        }

        /**
         * End of the time interval (inclusive) during which the trace data was collected from the
         * application.
         */
        @com.google.api.client.util.Key
        private String endTime;

        /** End of the time interval (inclusive) during which the trace data was collected from the
       application.
         */
        public String getEndTime() {
          return endTime;
        }

        /**
         * End of the time interval (inclusive) during which the trace data was collected from the
         * application.
         */
        public List setEndTime(String endTime) {
          this.endTime = endTime;
          return this;
        }

        /**
         * Optional. A filter against labels for the request.
         *
         * By default, searches use prefix matching. To specify exact match, prepend a plus symbol
         * (`+`) to the search term. Multiple terms are ANDed. Syntax:
         *
         * *   `root:NAME_PREFIX` or `NAME_PREFIX`: Return traces where any root span starts with
         * `NAME_PREFIX`. *   `+root:NAME` or `+NAME`: Return traces where any root span's name is
         * exactly `NAME`. *   `span:NAME_PREFIX`: Return traces where any span starts with
         * `NAME_PREFIX`. *   `+span:NAME`: Return traces where any span's name is exactly `NAME`. *
         * `latency:DURATION`: Return traces whose overall latency is greater or equal to than
         * `DURATION`. Accepted units are nanoseconds (`ns`), milliseconds (`ms`), and seconds
         * (`s`). Default is `ms`. For example, `latency:24ms` returns traces whose overall latency
         * is greater than or equal to 24 milliseconds. *   `label:LABEL_KEY`: Return all traces
         * containing the specified label key (exact match, case-sensitive) regardless of the
         * key:value pair's value (including empty values). *   `LABEL_KEY:VALUE_PREFIX`: Return all
         * traces containing the specified label key (exact match, case-sensitive) whose value
         * starts with `VALUE_PREFIX`. Both a key and a value must be specified. *
         * `+LABEL_KEY:VALUE`: Return all traces containing a key:value pair exactly matching the
         * specified text. Both a key and a value must be specified. *   `method:VALUE`: Equivalent
         * to `/http/method:VALUE`. *   `url:VALUE`: Equivalent to `/http/url:VALUE`.
         */
        @com.google.api.client.util.Key
        private java.lang.String filter;

        /** Optional. A filter against labels for the request.

       By default, searches use prefix matching. To specify exact match, prepend a plus symbol (`+`) to
       the search term. Multiple terms are ANDed. Syntax:

       *   `root:NAME_PREFIX` or `NAME_PREFIX`: Return traces where any root span starts with
       `NAME_PREFIX`. *   `+root:NAME` or `+NAME`: Return traces where any root span's name is exactly
       `NAME`. *   `span:NAME_PREFIX`: Return traces where any span starts with `NAME_PREFIX`. *
       `+span:NAME`: Return traces where any span's name is exactly `NAME`. *   `latency:DURATION`: Return
       traces whose overall latency is greater or equal to than `DURATION`. Accepted units are nanoseconds
       (`ns`), milliseconds (`ms`), and seconds (`s`). Default is `ms`. For example, `latency:24ms`
       returns traces whose overall latency is greater than or equal to 24 milliseconds. *
       `label:LABEL_KEY`: Return all traces containing the specified label key (exact match, case-
       sensitive) regardless of the key:value pair's value (including empty values). *
       `LABEL_KEY:VALUE_PREFIX`: Return all traces containing the specified label key (exact match, case-
       sensitive) whose value starts with `VALUE_PREFIX`. Both a key and a value must be specified. *
       `+LABEL_KEY:VALUE`: Return all traces containing a key:value pair exactly matching the specified
       text. Both a key and a value must be specified. *   `method:VALUE`: Equivalent to
       `/http/method:VALUE`. *   `url:VALUE`: Equivalent to `/http/url:VALUE`.
         */
        public java.lang.String getFilter() {
          return filter;
        }

        /**
         * Optional. A filter against labels for the request.
         *
         * By default, searches use prefix matching. To specify exact match, prepend a plus symbol
         * (`+`) to the search term. Multiple terms are ANDed. Syntax:
         *
         * *   `root:NAME_PREFIX` or `NAME_PREFIX`: Return traces where any root span starts with
         * `NAME_PREFIX`. *   `+root:NAME` or `+NAME`: Return traces where any root span's name is
         * exactly `NAME`. *   `span:NAME_PREFIX`: Return traces where any span starts with
         * `NAME_PREFIX`. *   `+span:NAME`: Return traces where any span's name is exactly `NAME`. *
         * `latency:DURATION`: Return traces whose overall latency is greater or equal to than
         * `DURATION`. Accepted units are nanoseconds (`ns`), milliseconds (`ms`), and seconds
         * (`s`). Default is `ms`. For example, `latency:24ms` returns traces whose overall latency
         * is greater than or equal to 24 milliseconds. *   `label:LABEL_KEY`: Return all traces
         * containing the specified label key (exact match, case-sensitive) regardless of the
         * key:value pair's value (including empty values). *   `LABEL_KEY:VALUE_PREFIX`: Return all
         * traces containing the specified label key (exact match, case-sensitive) whose value
         * starts with `VALUE_PREFIX`. Both a key and a value must be specified. *
         * `+LABEL_KEY:VALUE`: Return all traces containing a key:value pair exactly matching the
         * specified text. Both a key and a value must be specified. *   `method:VALUE`: Equivalent
         * to `/http/method:VALUE`. *   `url:VALUE`: Equivalent to `/http/url:VALUE`.
         */
        public List setFilter(java.lang.String filter) {
          this.filter = filter;
          return this;
        }

        /**
         * Optional. Field used to sort the returned traces. Can be one of the following:
         *
         * *   `trace_id` *   `name` (`name` field of root span in the trace) *   `duration`
         * (difference between `end_time` and `start_time` fields of the root span) *   `start`
         * (`start_time` field of the root span)
         *
         * Descending order can be specified by appending `desc` to the sort field (for example,
         * `name desc`).
         *
         * Only one sort field is permitted.
         */
        @com.google.api.client.util.Key
        private java.lang.String orderBy;

        /** Optional. Field used to sort the returned traces. Can be one of the following:

       *   `trace_id` *   `name` (`name` field of root span in the trace) *   `duration` (difference
       between `end_time` and `start_time` fields of the root span) *   `start` (`start_time` field of the
       root span)

       Descending order can be specified by appending `desc` to the sort field (for example, `name desc`).

       Only one sort field is permitted.
         */
        public java.lang.String getOrderBy() {
          return orderBy;
        }

        /**
         * Optional. Field used to sort the returned traces. Can be one of the following:
         *
         * *   `trace_id` *   `name` (`name` field of root span in the trace) *   `duration`
         * (difference between `end_time` and `start_time` fields of the root span) *   `start`
         * (`start_time` field of the root span)
         *
         * Descending order can be specified by appending `desc` to the sort field (for example,
         * `name desc`).
         *
         * Only one sort field is permitted.
         */
        public List setOrderBy(java.lang.String orderBy) {
          this.orderBy = orderBy;
          return this;
        }

        /**
         * Optional. Maximum number of traces to return. If not specified or <= 0, the
         * implementation selects a reasonable value.  The implementation may return fewer traces
         * than the requested page size.
         */
        @com.google.api.client.util.Key
        private java.lang.Integer pageSize;

        /** Optional. Maximum number of traces to return. If not specified or <= 0, the implementation selects
       a reasonable value.  The implementation may return fewer traces than the requested page size.
         */
        public java.lang.Integer getPageSize() {
          return pageSize;
        }

        /**
         * Optional. Maximum number of traces to return. If not specified or <= 0, the
         * implementation selects a reasonable value.  The implementation may return fewer traces
         * than the requested page size.
         */
        public List setPageSize(java.lang.Integer pageSize) {
          this.pageSize = pageSize;
          return this;
        }

        /**
         * Token identifying the page of results to return. If provided, use the value of the
         * `next_page_token` field from a previous request.
         */
        @com.google.api.client.util.Key
        private java.lang.String pageToken;

        /** Token identifying the page of results to return. If provided, use the value of the
       `next_page_token` field from a previous request.
         */
        public java.lang.String getPageToken() {
          return pageToken;
        }

        /**
         * Token identifying the page of results to return. If provided, use the value of the
         * `next_page_token` field from a previous request.
         */
        public List setPageToken(java.lang.String pageToken) {
          this.pageToken = pageToken;
          return this;
        }

        /**
         * Start of the time interval (inclusive) during which the trace data was collected from the
         * application.
         */
        @com.google.api.client.util.Key
        private String startTime;

        /** Start of the time interval (inclusive) during which the trace data was collected from the
       application.
         */
        public String getStartTime() {
          return startTime;
        }

        /**
         * Start of the time interval (inclusive) during which the trace data was collected from the
         * application.
         */
        public List setStartTime(String startTime) {
          this.startTime = startTime;
          return this;
        }

        /**
         * Optional. Type of data returned for traces in the list. Default is `MINIMAL`.
         */
        @com.google.api.client.util.Key
        private java.lang.String view;

        /** Optional. Type of data returned for traces in the list. Default is `MINIMAL`.
         */
        public java.lang.String getView() {
          return view;
        }

        /**
         * Optional. Type of data returned for traces in the list. Default is `MINIMAL`.
         */
        public List setView(java.lang.String view) {
          this.view = view;
          return this;
        }

        @Override
        public List set(String parameterName, Object value) {
          return (List) super.set(parameterName, value);
        }
      }

    }
  }

  /**
   * Builder for {@link CloudTrace}.
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
      setBatchPath(DEFAULT_BATCH_PATH);
    }

    /** Builds a new instance of {@link CloudTrace}. */
    @Override
    public CloudTrace build() {
      return new CloudTrace(this);
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
    public Builder setBatchPath(String batchPath) {
      return (Builder) super.setBatchPath(batchPath);
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
     * Set the {@link CloudTraceRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setCloudTraceRequestInitializer(
        CloudTraceRequestInitializer cloudtraceRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(cloudtraceRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
