package finquiry.client.kr.data.CZNB

/**
 * Exchange rate inquiry - CZNB(KOOKMIN BANK)
 */
data class ExchangeRateInquiry (
    val method:     String = "POST",
    val webUrl:     String = "https://okbfex.kbstar.com/quics?page=C015690",
    val actionUrl:  String = "https://okbfex.kbstar.com/quics?chgCompId=b028286&baseCompId=b028286&page=C015690&cc=b028286:b028286",
    var header: HashMap<String, String> = hashMapOf(
            "Accept"            to "text/html, */*; q=0.01",
            "Accept-Encoding"   to "gzip, deflate, br",
            "Accept-Language"   to "ko-KR,ko;q=0.8,en-US;q=0.5,en;q=0.3",
            "Connection"        to "keep-alive",
            "Content-Length"    to "198",
            "Content-Type"      to "application/x-www-form-urlencoded; charset=UTF-8",
            "Host"              to "okbfex.kbstar.com",
            "Origin"            to "https://okbfex.kbstar.com",
            "Referer"           to "https://okbfex.kbstar.com/quics?page=C015690",
            "X-Requested-With"  to "XMLHttpRequest"
    ),
    val bodyKeys: Array<String> = arrayOf(
            "조회년월일",
            "등록회차",
            "monyCd",
            "selDate",
            "strFocusBtn",
            "year1",
            "mon1",
            "day1"
    )
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ExchangeRateInquiry

        if (method != other.method) return false
        if (webUrl != other.webUrl) return false
        if (actionUrl != other.actionUrl) return false
        if (header != other.header) return false
        if (!bodyKeys.contentEquals(other.bodyKeys)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = method.hashCode()
        result = 31 * result + webUrl.hashCode()
        result = 31 * result + actionUrl.hashCode()
        result = 31 * result + header.hashCode()
        result = 31 * result + bodyKeys.contentHashCode()
        return result
    }
}