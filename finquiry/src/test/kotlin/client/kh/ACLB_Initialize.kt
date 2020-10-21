package client.kh

import finquiry.AdapterType
import finquiry.client.kh.ACLB
import org.junit.Test

class ACLB_Initialize {
    /**
     * 국민은행(CZNB) 어뎁터 초기화
     */
    @Test
    public fun test () {
        val adapter: ACLB = ACLB(AdapterType.HttpURLConnectionFromJDK)
    }
}