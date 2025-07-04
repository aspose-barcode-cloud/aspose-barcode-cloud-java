package com.aspose.barcode.cloud;

import com.aspose.barcode.cloud.model.ApiErrorResponse;

import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.http.HttpMethod;
import okhttp3.logging.HttpLoggingInterceptor;
import okhttp3.logging.HttpLoggingInterceptor.Level;

import okio.BufferedSink;
import okio.Okio;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** ApiClient. */
public class ApiClient {
    public final String apiVersion = "v4.0";
    public final String clientVersion = "25.6.0";

    private String baseUrl = "https://api.aspose.cloud";
    private String tokenUrl = "https://id.aspose.cloud/connect/token";
    private String clientId;
    private String clientSecret;
    private boolean debugging = false;
    private final Map<String, String> defaultHeaderMap = new HashMap<>();
    private String tempFolderPath = null;
    private OkHttpClient httpClient;
    private final JSON json;
    private HttpLoggingInterceptor loggingInterceptor;
    private String accessToken;

    /** Constructor for ApiClient with clientId and clientSecret */
    public ApiClient(String clientId, String clientSecret) {
        this(clientId, clientSecret, null, null);
    }

    /** Constructor for ApiClient with accessToken */
    public ApiClient(String accessToken) {
        this();
        this.setAccessToken(accessToken);
    }

    /** Constructor for ApiClient with clientId, clientSecret, baseUrl and tokenUrl */
    public ApiClient(String clientId, String clientSecret, String baseUrl, String tokenUrl) {
        this();
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        if (baseUrl != null) {
            this.baseUrl = baseUrl;
        }
        if (tokenUrl != null) {
            this.tokenUrl = tokenUrl;
        }
    }

    /** Constructor for ApiClient with readTimeout */
    protected ApiClient(long readTimeoutMillis) {
        httpClient =
                new OkHttpClient.Builder()
                        .readTimeout(readTimeoutMillis, TimeUnit.MILLISECONDS)
                        .build();

        json = new JSON();

        // Set default User-Agent.
        setUserAgent("OpenApi-Generator/25.6.0/java");

        addDefaultHeader("x-aspose-client", "java sdk");
        addDefaultHeader("x-aspose-client-version", clientVersion);
        setReadTimeout(60_000);
    }

    protected ApiClient() {
        this(60_000);
    }

    /**
     * Get base path.
     *
     * @return Base path
     */
    public String getBasePath() {
        return baseUrl + "/" + apiVersion;
    }

    /**
     * Get HTTP client.
     *
     * @return An instance of OkHttpClient
     */
    public OkHttpClient getHttpClient() {
        return httpClient;
    }

    /**
     * Helper method to set access token for the first OAuth2 authentication.
     *
     * @param accessToken Access token
     */
    protected void setAccessToken(String accessToken) {
        if (accessToken == null) {
            throw new RuntimeException("accessToken can not be null");
        }
        this.accessToken = accessToken;
    }

    /**
     * Set the User-Agent header's value (by adding to the default header map).
     *
     * @param userAgent HTTP request's user agent
     */
    public void setUserAgent(String userAgent) {
        addDefaultHeader("User-Agent", userAgent);
    }

    /**
     * Add a default header.
     *
     * @param key The header's key
     * @param value The header's value
     */
    public void addDefaultHeader(String key, String value) {
        defaultHeaderMap.put(key, value);
    }

    /**
     * Check that whether debugging is enabled for this API client.
     *
     * @return True if debugging is enabled, false otherwise.
     */
    public boolean isDebugging() {
        return debugging;
    }

    /**
     * Enable/disable debugging for this API client.
     *
     * @param debugging To enable (true) or disable (false) debugging
     */
    public void setDebugging(boolean debugging) {
        if (debugging != this.debugging) {
            if (debugging) {
                loggingInterceptor = new HttpLoggingInterceptor();
                loggingInterceptor.setLevel(Level.BODY);
                httpClient.interceptors().add(loggingInterceptor);
            } else {
                httpClient.interceptors().remove(loggingInterceptor);
                loggingInterceptor = null;
            }
        }
        this.debugging = debugging;
    }

    /**
     * The path of temporary folder used to store downloaded files from endpoints with file
     * response. The default value is <code>null</code>, i.e. using the system's default temporary
     * folder.
     *
     * @see <a
     *     href="https://docs.oracle.com/javase/7/docs/api/java/io/File.html#createTempFile">createTempFile</a>
     * @return Temporary folder path
     */
    public String getTempFolderPath() {
        return tempFolderPath;
    }

    /**
     * Set the temporary folder path (for downloading files)
     *
     * @param tempFolderPath Temporary folder path
     */
    public void setTempFolderPath(String tempFolderPath) {
        this.tempFolderPath = tempFolderPath;
    }

    /**
     * Get connection timeout (in milliseconds).
     *
     * @return Timeout in milliseconds
     */
    public int getConnectTimeout() {
        return httpClient.connectTimeoutMillis();
    }

    /**
     * Get read timeout (in milliseconds).
     *
     * @return Timeout in milliseconds
     */
    public int getReadTimeout() {
        return httpClient.readTimeoutMillis();
    }

    /**
     * Sets the read timeout (in milliseconds). A value of 0 means no timeout, otherwise values must
     * be between 1 and {@link Integer#MAX_VALUE}.
     *
     * @param readTimeout read timeout in milliseconds
     */
    public void setReadTimeout(int readTimeout) {
        httpClient =
                new OkHttpClient.Builder().readTimeout(readTimeout, TimeUnit.MILLISECONDS).build();
    }

    /**
     * Get write timeout (in milliseconds).
     *
     * @return Timeout in milliseconds
     */
    public int getWriteTimeout() {
        return httpClient.writeTimeoutMillis();
    }

    /**
     * Format the given parameter object into string.
     *
     * @param param Parameter
     * @return String representation of the parameter
     */
    public String parameterToString(Object param) {
        if (param == null) {
            return "";
        } else if (param instanceof Date
                || param instanceof OffsetDateTime
                || param instanceof LocalDate) {
            // Serialize to json string and remove the " enclosing characters
            String jsonStr = json.serialize(param);
            return jsonStr.substring(1, jsonStr.length() - 1);
        } else if (param instanceof Collection) {
            StringBuilder b = new StringBuilder();
            for (Object o : (Collection<Object>) param) {
                if (b.length() > 0) {
                    b.append(",");
                }
                b.append(o);
            }
            return b.toString();
        } else {
            return String.valueOf(param);
        }
    }

    /**
     * Formats the specified query parameter to a list containing a single {@code Pair} object.
     *
     * <p>Note that {@code value} must not be a collection.
     *
     * @param name The name of the parameter.
     * @param value The value of the parameter.
     * @return A list containing a single {@code Pair} object.
     */
    public List<Pair> parameterToPair(String name, Object value) {
        List<Pair> params = new ArrayList<Pair>();

        // preconditions
        if (name == null || name.isEmpty() || value == null || value instanceof Collection) {
            return params;
        }

        params.add(new Pair(name, parameterToString(value)));
        return params;
    }

    /**
     * Formats the specified collection query parameters to a list of {@code Pair} objects.
     *
     * <p>Note that the values of each of the returned Pair objects are percent-encoded.
     *
     * @param collectionFormat The collection format of the parameter.
     * @param name The name of the parameter.
     * @param value The value of the parameter.
     * @return A list of {@code Pair} objects.
     */
    public List<Pair> parameterToPairs(String collectionFormat, String name, Collection value) {
        List<Pair> params = new ArrayList<Pair>();

        // preconditions
        if (name == null || name.isEmpty() || value == null || value.isEmpty()) {
            return params;
        }

        // create the params based on the collection format
        if ("multi".equals(collectionFormat)) {
            for (Object item : value) {
                params.add(new Pair(name, escapeString(parameterToString(item))));
            }
            return params;
        }

        // collectionFormat is assumed to be "csv" by default
        String delimiter = ",";

        // escape all delimiters except commas, which are URI reserved
        // characters
        if ("ssv".equals(collectionFormat)) {
            delimiter = escapeString(" ");
        } else if ("tsv".equals(collectionFormat)) {
            delimiter = escapeString("\t");
        } else if ("pipes".equals(collectionFormat)) {
            delimiter = escapeString("|");
        }

        StringBuilder sb = new StringBuilder();
        for (Object item : value) {
            sb.append(delimiter);
            sb.append(escapeString(parameterToString(item)));
        }

        params.add(new Pair(name, sb.substring(delimiter.length())));

        return params;
    }

    /**
     * Sanitize filename by removing path. e.g. ../../sun.gif becomes sun.gif
     *
     * @param filename The filename to be sanitized
     * @return The sanitized filename
     */
    public String sanitizeFilename(String filename) {
        return filename.replaceAll(".*[/\\\\]", "");
    }

    /**
     * Check if the given MIME is a JSON MIME. JSON MIME examples: application/json
     * application/json; charset=UTF8 APPLICATION/JSON application/vnd.company+json "* / *" is also
     * default to JSON
     *
     * @param mime MIME (Multipurpose Internet Mail Extensions)
     * @return True if the given MIME is JSON, false otherwise.
     */
    public boolean isJsonMime(String mime) {
        String jsonMime = "(?i)^(application/json|[^;/ \t]+/[^;/ \t]+[+]json)[ \t]*(;.*)?$";
        return mime != null && (mime.matches(jsonMime) || mime.equals("*/*"));
    }

    /**
     * Select the Accept header's value from the given accepts array: if JSON exists in the given
     * array, use it; otherwise use all of them (joining into a string)
     *
     * @param accepts The accepts array to select from
     * @return The Accept header to use. If the given array is empty, null will be returned (not to
     *     set the Accept header explicitly).
     */
    public String selectHeaderAccept(String[] accepts) {
        if (accepts.length == 0) {
            return null;
        }
        for (String accept : accepts) {
            if (isJsonMime(accept)) {
                return accept;
            }
        }
        return String.join(",", accepts);
    }

    /**
     * Select the Content-Type header's value from the given array: if JSON exists in the given
     * array, use it; otherwise use the first one of the array.
     *
     * @param contentTypes The Content-Type array to select from
     * @return The Content-Type header to use. If the given array is empty, or matches "any", JSON
     *     will be used.
     */
    public String selectHeaderContentType(String[] contentTypes) {
        if (contentTypes.length == 0 || contentTypes[0].equals("*/*")) {
            return "application/json";
        }
        for (String contentType : contentTypes) {
            if (isJsonMime(contentType)) {
                return contentType;
            }
        }
        return contentTypes[0];
    }

    /**
     * Escape the given string to be used as URL query value.
     *
     * @param str String to be escaped
     * @return Escaped string
     */
    public String escapeString(String str) {
        try {
            return URLEncoder.encode(str, "utf8").replaceAll("\\+", "%20");
        } catch (UnsupportedEncodingException e) {
            return str;
        }
    }

    /**
     * Deserialize response body to Java object, according to the return type and the Content-Type
     * response header.
     *
     * @param response HTTP response
     * @param returnType The type of the Java object
     * @return The deserialized Java object
     * @throws ApiException If fail to deserialize response body, i.e. cannot read response body or
     *     the Content-Type of the response is not supported.
     */
    @SuppressWarnings("unchecked")
    public <T> T deserialize(Response response, Type returnType) throws ApiException {
        if (response == null || returnType == null) {
            return null;
        }

        if ("byte[]".equals(returnType.toString())) {
            // Handle binary response (byte array).
            try {
                return (T) response.body().bytes();
            } catch (IOException e) {
                throw new ApiException(e);
            }
        } else if (returnType.equals(File.class)) {
            // Handle file downloading.
            return (T) downloadFileFromResponse(response);
        }

        String respBody;
        try {
            if (response.body() != null) {
                respBody = response.body().string();
            } else {
                respBody = null;
            }
        } catch (IOException e) {
            throw new ApiException(e);
        }

        if (respBody == null || respBody.isEmpty()) {
            return null;
        }

        String contentType = response.headers().get("Content-Type");
        if (contentType == null) {
            // ensuring a default content type
            contentType = "application/json";
        }
        if (isJsonMime(contentType)) {
            return json.deserialize(respBody, returnType);
        } else if (returnType.equals(String.class)) {
            // Expecting string, return the raw response body.
            return (T) respBody;
        } else {
            throw new ApiException(
                    "Content type \"" + contentType + "\" is not supported for type: " + returnType,
                    response.code(),
                    response.headers().toMultimap(),
                    respBody);
        }
    }

    /**
     * Serialize the given Java object into request body according to the object's class and the
     * request Content-Type.
     *
     * @param obj The Java object
     * @param contentType The request Content-Type
     * @return The serialized request body
     * @throws ApiException If fail to serialize the given object
     */
    public RequestBody serialize(Object obj, String contentType) throws ApiException {
        if (obj instanceof byte[]) {
            // Binary (byte array) body parameter support.
            return RequestBody.create((byte[]) obj, MediaType.parse(contentType));
        } else if (obj instanceof File) {
            // File body parameter support.
            return RequestBody.create((File) obj, MediaType.parse(contentType));
        } else if (isJsonMime(contentType)) {
            String content;
            if (obj != null) {
                content = json.serialize(obj);
            } else {
                content = null;
            }
            return RequestBody.create(content, MediaType.parse(contentType));
        } else {
            throw new ApiException("Content type \"" + contentType + "\" is not supported");
        }
    }

    /**
     * Download file from the given response.
     *
     * @param response An instance of the Response object
     * @return Downloaded file
     * @throws ApiException If fail to read file content from response and write to disk
     */
    public File downloadFileFromResponse(Response response) throws ApiException {
        try {
            File file = prepareDownloadFile(response);
            BufferedSink sink = Okio.buffer(Okio.sink(file));
            sink.writeAll(response.body().source());
            sink.close();
            return file;
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    /**
     * Prepare file for download.
     *
     * @param response An instance of the Response object
     * @return Prepared file for the download
     * @throws IOException If fail to prepare file for download
     */
    public File prepareDownloadFile(Response response) throws IOException {
        String filename = null;
        String contentDisposition = response.header("Content-Disposition");
        if (contentDisposition != null && !contentDisposition.isEmpty()) {
            // Get filename from the Content-Disposition header.
            Pattern pattern = Pattern.compile("filename=['\"]?([^'\"\\s]+)['\"]?");
            Matcher matcher = pattern.matcher(contentDisposition);
            if (matcher.find()) {
                filename = sanitizeFilename(matcher.group(1));
            }
        }

        String prefix = null;
        String suffix = null;
        if (filename == null) {
            prefix = "download-";
            suffix = "";
        } else {
            int pos = filename.lastIndexOf(".");
            if (pos == -1) {
                prefix = filename + "-";
            } else {
                prefix = filename.substring(0, pos) + "-";
                suffix = filename.substring(pos);
            }
            // File.createTempFile requires the prefix to be at least three characters long
            if (prefix.length() < 3) {
                prefix = "download-";
            }
        }

        if (tempFolderPath == null) {
            return File.createTempFile(prefix, suffix);
        } else {
            return File.createTempFile(prefix, suffix, new File(tempFolderPath));
        }
    }

    /**
     * Override {@link #execute(Call, Type)}.
     *
     * @param call An instance of the Call object
     * @return ApiResponse&lt;T&gt;
     * @throws ApiException If fail to execute the call
     */
    public <T> ApiResponse<T> execute(Call call) throws ApiException {
        return execute(call, null);
    }

    /**
     * Execute HTTP call and deserialize the HTTP response body into the given return type.
     *
     * @param returnType The return type used to deserialize HTTP response body
     * @param call Call
     * @return ApiResponse object containing response status, headers and data, which is a Java
     *     object deserialized from response body and would be null when returnType is null.
     * @throws ApiException If fail to execute the call
     */
    public <T> ApiResponse<T> execute(Call call, Type returnType) throws ApiException {
        try {
            Response response = call.execute();
            T data = handleResponse(response, returnType);
            return new ApiResponse<T>(response.code(), response.headers().toMultimap(), data);
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    /**
     * Override {@link #executeAsync(Call, Type, ApiCallback)}
     *
     * @param call An instance of the Call object
     * @param callback ApiCallback&lt;T&gt;
     */
    public <T> void executeAsync(Call call, ApiCallback<T> callback) {
        executeAsync(call, null, callback);
    }

    /**
     * Execute HTTP call asynchronously.
     *
     * @see #execute(Call, Type)
     * @param call The callback to be executed when the API call finishes
     * @param returnType Return type
     * @param callback ApiCallback
     */
    public <T> void executeAsync(Call call, final Type returnType, final ApiCallback<T> callback) {
        call.enqueue(
                new okhttp3.Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        callback.onFailure(new ApiException(e), 0, null);
                    }

                    @Override
                    public void onResponse(Call call, Response response) {
                        T result;
                        try {
                            result = handleResponse(response, returnType);
                        } catch (ApiException e) {
                            callback.onFailure(e, response.code(), response.headers().toMultimap());
                            return;
                        }
                        callback.onSuccess(
                                result, response.code(), response.headers().toMultimap());
                    }
                });
    }

    /**
     * Handle the given response, return the deserialized object when the response is successful.
     *
     * @param response Response
     * @param returnType Return type
     * @return Type
     * @throws ApiException If the response has an unsuccessful status code or fail to deserialize
     *     the response body
     */
    public <T> T handleResponse(Response response, Type returnType) throws ApiException {
        if (response.isSuccessful()) {
            if (returnType == null || response.code() == 204) {
                // returning null if the returnType is not defined,
                // or the status code is 204 (No Content)
                if (response.body() != null) {
                    try {
                        response.body().close();
                    } catch (Exception e) {
                        throw new ApiException(
                                response.message(),
                                e,
                                response.code(),
                                response.headers().toMultimap());
                    }
                }
                return null;
            }
            return deserialize(response, returnType);
        }
        if (response.body() == null) {
            throw new ApiException(response.message(), response.code());
        }
        ApiErrorResponse errorResponse;
        try {
            errorResponse = deserialize(response, ApiErrorResponse.class);
        } catch (Exception e) {
            throw new ApiException(
                    response.message(), e, response.code(), response.headers().toMultimap());
        }

        throw new ApiException(response.message(), response.code(), errorResponse);
    }

    /**
     * Build HTTP call with the given options.
     *
     * @param path The sub-path of the HTTP URL
     * @param method The request method, one of "GET", "HEAD", "OPTIONS", "POST", "PUT", "PATCH" and
     *     "DELETE"
     * @param queryParams The query parameters
     * @param collectionQueryParams The collection query parameters
     * @param body The request body object
     * @param headerParams The header parameters
     * @param formParams The form parameters
     * @param progressRequestListener Progress request listener
     * @return The HTTP call
     * @throws ApiException If fail to serialize the request body object
     */
    public Call buildCall(
            String path,
            String method,
            List<Pair> queryParams,
            List<Pair> collectionQueryParams,
            Object body,
            Map<String, String> headerParams,
            Map<String, Object> formParams,
            ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Request request =
                buildRequest(
                        path,
                        method,
                        queryParams,
                        collectionQueryParams,
                        body,
                        headerParams,
                        formParams,
                        progressRequestListener);

        return httpClient.newCall(request);
    }

    /**
     * Build an HTTP request with the given options.
     *
     * @param path The sub-path of the HTTP URL
     * @param method The request method, one of "GET", "HEAD", "OPTIONS", "POST", "PUT", "PATCH" and
     *     "DELETE"
     * @param queryParams The query parameters
     * @param collectionQueryParams The collection query parameters
     * @param body The request body object
     * @param headerParams The header parameters
     * @param formParams The form parameters
     * @param progressRequestListener Progress request listener
     * @return The HTTP request
     * @throws ApiException If fail to serialize the request body object
     */
    public Request buildRequest(
            String path,
            String method,
            List<Pair> queryParams,
            List<Pair> collectionQueryParams,
            Object body,
            Map<String, String> headerParams,
            Map<String, Object> formParams,
            ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        addOAuthAuthentication(headerParams);

        final String url = buildUrl(path, queryParams, collectionQueryParams);
        final Request.Builder reqBuilder = new Request.Builder().url(url);
        processHeaderParams(headerParams, reqBuilder);

        String contentType = headerParams.get("Content-Type");
        // ensuring a default content type
        if (contentType == null) {
            contentType = "application/json";
        }

        RequestBody reqBody;
        if (!HttpMethod.permitsRequestBody(method)) {
            reqBody = null;
        } else if ("multipart/form-data".equals(contentType)) {
            reqBody = buildRequestBodyMultipart(formParams);
        } else if (body == null) {
            if ("DELETE".equals(method)) {
                // allow calling DELETE without sending a request body
                reqBody = null;
            } else {
                // use an empty request body (for POST, PUT and PATCH)
                reqBody = RequestBody.create("", MediaType.parse(contentType));
            }
        } else {
            reqBody = serialize(body, contentType);
        }

        Request request = null;

        if (progressRequestListener != null && reqBody != null) {
            ProgressRequestBody progressRequestBody =
                    new ProgressRequestBody(reqBody, progressRequestListener);
            request = reqBuilder.method(method, progressRequestBody).build();
        } else {
            request = reqBuilder.method(method, reqBody).build();
        }

        return request;
    }

    /**
     * Build full URL by concatenating base path, the given sub path and query parameters.
     *
     * @param path The sub path
     * @param queryParams The query parameters
     * @param collectionQueryParams The collection query parameters
     * @return The full URL
     */
    public String buildUrl(String path, List<Pair> queryParams, List<Pair> collectionQueryParams) {
        final StringBuilder url = new StringBuilder();
        url.append(getBasePath()).append(path);

        if (queryParams != null && !queryParams.isEmpty()) {
            // support (constant) query string in `path`, e.g. "/posts?draft=1"
            String prefix = path.contains("?") ? "&" : "?";
            for (Pair param : queryParams) {
                if (param.getValue() != null) {
                    if (prefix != null) {
                        url.append(prefix);
                        prefix = null;
                    } else {
                        url.append("&");
                    }
                    String value = parameterToString(param.getValue());
                    url.append(escapeString(param.getKey()))
                            .append("=")
                            .append(escapeString(value));
                }
            }
        }

        if (collectionQueryParams != null && !collectionQueryParams.isEmpty()) {
            String prefix = url.toString().contains("?") ? "&" : "?";
            for (Pair param : collectionQueryParams) {
                if (param.getValue() != null) {
                    if (prefix != null) {
                        url.append(prefix);
                        prefix = null;
                    } else {
                        url.append("&");
                    }
                    String value = parameterToString(param.getValue());
                    // collection query parameter value already escaped as part of parameterToPairs
                    url.append(escapeString(param.getKey())).append("=").append(value);
                }
            }
        }

        return url.toString();
    }

    /**
     * Set header parameters to the request builder, including default headers.
     *
     * @param headerParams Header parameters in the form of Map
     * @param reqBuilder Request.Builder
     */
    public void processHeaderParams(Map<String, String> headerParams, Request.Builder reqBuilder) {
        for (Entry<String, String> param : headerParams.entrySet()) {
            reqBuilder.header(param.getKey(), parameterToString(param.getValue()));
        }
        for (Entry<String, String> header : defaultHeaderMap.entrySet()) {
            if (!headerParams.containsKey(header.getKey())) {
                reqBuilder.header(header.getKey(), parameterToString(header.getValue()));
            }
        }
    }

    /**
     * Build a multipart (file uploading) request body with the given form parameters, which could
     * contain text fields and file fields.
     *
     * @param formParams Form parameters in the form of Map
     * @return RequestBody
     */
    public RequestBody buildRequestBodyMultipart(Map<String, Object> formParams) {
        MultipartBody.Builder mpBuilder = new MultipartBody.Builder().setType(MultipartBody.FORM);
        for (Entry<String, Object> param : formParams.entrySet()) {
            Object paramValue = param.getValue();
            if (paramValue instanceof File) {
                File file = (File) paramValue;
                Headers partHeaders =
                        Headers.of(
                                "Content-Disposition",
                                "form-data; name=\""
                                        + param.getKey()
                                        + "\"; filename=\""
                                        + file.getName()
                                        + "\"");
                MediaType mediaType = MediaType.parse(guessContentTypeFromFile(file));
                mpBuilder.addPart(partHeaders, RequestBody.create(file, mediaType));
            } else if (paramValue instanceof Collection) {
                Collection<Object> collection = (Collection<Object>) paramValue;
                for (Object item : collection) {
                    Headers partHeaders =
                            Headers.of(
                                    "Content-Disposition",
                                    "form-data; name=\"" + param.getKey() + "\"");
                    mpBuilder.addPart(
                            partHeaders, RequestBody.create(parameterToString(item), null));
                }
            } else {
                Headers partHeaders =
                        Headers.of(
                                "Content-Disposition",
                                "form-data; name=\"" + param.getKey() + "\"");
                mpBuilder.addPart(
                        partHeaders, RequestBody.create(null, parameterToString(paramValue)));
            }
        }
        return mpBuilder.build();
    }

    /**
     * Guess Content-Type header from the given file (defaults to "application/octet-stream").
     *
     * @param file The given file
     * @return The guessed Content-Type
     */
    public String guessContentTypeFromFile(File file) {
        String contentType = URLConnection.guessContentTypeFromName(file.getName());
        if (contentType == null) {
            return "application/octet-stream";
        } else {
            return contentType;
        }
    }

    /**
     * Request OAuth token.
     *
     * @throws ApiException If authorization is failed
     */
    public void requestToken() throws ApiException {
        try {
            RequestBody requestBody =
                    new FormBody.Builder()
                            .addEncoded("grant_type", "client_credentials")
                            .addEncoded("client_id", clientId)
                            .addEncoded("client_secret", clientSecret)
                            .build();

            Request request =
                    new Request.Builder()
                            .url(tokenUrl)
                            .post(requestBody)
                            .addHeader("Content-Type", " application/x-www-form-urlencoded")
                            .build();

            Response response = httpClient.newCall(request).execute();
            String responseBody = response.body().string();
            if (response.isSuccessful()) {
                GetAccessTokenResult result =
                        json.deserialize(responseBody, GetAccessTokenResult.class);
                setAccessToken(result.access_token);
            } else {
                throw new ApiException(responseBody);
            }
        } catch (Exception ex) {
            throw new ApiException(ex);
        }
    }

    /**
     * Add OAuth2 header
     *
     * @param headerParams Map of request headers
     */
    private void addOAuthAuthentication(Map<String, String> headerParams) throws ApiException {
        if (accessToken == null) {
            requestToken();
        }
        headerParams.put("Authorization", "Bearer " + accessToken);
    }

    /** GetAccessTokenResult class for deserialization. */
    @SuppressWarnings({"unused", "InnerClassMayBeStatic"})
    private class GetAccessTokenResult {
        public String access_token;
    }
}
