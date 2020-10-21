package finquiry.client.kh.data.ACLB

/**
 * Exchange rate inquiry - ACLB(ACLEDA BANK PLC.)
 */
data class ExchangeRateInquiry (
        val method:     String = "POST",
        val webUrl:     String = "https://www.acledabank.com.kh/assets/unity/exchangerate",
        val actionUrl:  String = "https://www.acledabank.com.kh/assets/unity/exchangerate",
        var header: HashMap<String, String> = hashMapOf(
                "Accept"            to "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
                "Accept-Encoding"   to "gzip, deflate, br",
                "Accept-Language"   to "ko-KR,ko;q=0.8,en-US;q=0.5,en;q=0.3",
                "Connection"        to "keep-alive",
                "Content-Length"    to "16",
                "Content-Type"      to "application/x-www-form-urlencoded",
                "Host"              to "www.acledabank.com.kh",
                "Origin"            to "https://www.acledabank.com.kh",
                "Referer"           to "https://www.acledabank.com.kh/assets/unity/exchangerate",
                "User-Agent"        to "",
                "Upgrade-Insecure-Requests"  to "1"
        )
)