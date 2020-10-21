package finquiry
import java.net.URL
import java.net.HttpURLConnection
import java.io.InputStreamReader
import java.io.BufferedReader

/**
 * Network adapter like HTTP client.
 *
 * @param adapterType Network adapter type(method) like `HttpURLConnection`.
 */
open class Adapter(adapterType: AdapterType){
    /**
     * Adapter type for connection.
     *
     * @see finquiry.AdapterType
     */
    private val adapterType: AdapterType

    /**
     * Constructor
     *
     * @see finquiry.AdapterType
     */
    init {
        this.adapterType = adapterType
    }

    /**
     * Network response code.
     * (Read-only)
     *
     * @see <a href='https://en.wikipedia.org/wiki/List_of_HTTP_status_codes'>
     *     List of HTTP status codes from WIKIPEDIA</a>
     */
    private var code: Int = 0
    /** Getter - Network response code. */
    public fun getStatusCode(): Int {
        return this.code
    }

    /** Network url for conenction. */
    private var url: String = ""
    /** Getter - Network url for conenction. */
    public fun getUrl() : String
        { return this.url }
    /** Setter - Network url for conenction. */
    public fun setUrl(value: String)
        { this.url = value }

    /**
     * Response content
     * (Read-only)
     */
    private var content: String = ""
    /**
     * Getter - Response content
     */
    public fun getContent(): String {
        return this.content
    }

    /**
     * Doting `HTTP GET` action.
     * Sync transaction. NOT ASYNC.
     *
     * @return Return `true` when status code is `200` or return `false` when else.
     */
    public fun getAction(): Boolean {
        val urlObj:URL = URL(this.url)
        val con:HttpURLConnection = urlObj.openConnection() as HttpURLConnection;

        // HTTP 상태코드 세팅
        this.code = con.responseCode

        // 스트림 읽어오기
        var sr: InputStreamReader   = InputStreamReader(con.inputStream)
        var br: BufferedReader      = BufferedReader(sr);
        var sb: StringBuffer        = StringBuffer()
        br.forEachLine {
            sb.append(it)
        }

        // 내용 세팅
        this.content = sb.toString()

        // 응답결과에 따른 T/F 세팅
        val result: Boolean = (this.code == 200)
        return result
    }
}