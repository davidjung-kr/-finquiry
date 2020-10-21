import org.junit.Test;
import org.junit.Assert.*;
import finquiry.Adapter;
import finquiry.AdapterType;

public class adapter_Initialize{

    /**
     * 네트워크 어댑터의 초기화 테스트
     */
    @Test
    public fun test() {
        val adapter = Adapter(AdapterType.HttpURLConnectionFromJDK);
        assertNotNull(adapter);
    }
}