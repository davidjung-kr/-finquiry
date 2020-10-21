package finquiry

/**
 * Adapter type like HttpURLConnection, HttpClient, etc...
 * Default: HttpURLConnection
 *
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/net/HttpURLConnection.html">HttpURLConnection</a>
 */
enum class AdapterType {
    HttpURLConnectionFromJDK
    // , HttpClient -- Not ready
    , NONE
}