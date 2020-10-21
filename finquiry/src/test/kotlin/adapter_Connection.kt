import org.junit.Test;
import org.junit.Assert.*;
import finquiry.Adapter;
import finquiry.AdapterType;

class adapter_Connection {
    /**
     * 네트워크 어댑터 연결 테스트.
     * 테스트용 URL(info.cern.ch)에 실제 연결하여 상태코드 200 반환여부를 체크한다.
     */
    @Test
    public fun test () {
        val adapter:Adapter = Adapter(AdapterType.HttpURLConnectionFromJDK)
        adapter.setUrl("http://info.cern.ch")
        assert(adapter.getAction())  // 200인 경우에만 ture, 아니면 false
        assert(adapter.getStatusCode()==200)
    }
}