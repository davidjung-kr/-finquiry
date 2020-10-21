package client.kr

import finquiry.AdapterType
import org.junit.Test;
import finquiry.client.kr.CZNB;
class CZNB_Initialize {
    /**
     * 국민은행(CZNB) 어뎁터 초기화
     */
    @Test
    public fun test () {
        val adapter: CZNB = CZNB(AdapterType.HttpURLConnectionFromJDK)
    }
}