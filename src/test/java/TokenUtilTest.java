import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.obsidian.tcsp.util.TokenUtil;
import org.obsidian.tcsp.dto.Token;

/**
 * @Author Rin
 * @Date 2017/11/28
 */
public class TokenUtilTest {
    @Test
    public void decryptTest(){
        Token token = TokenUtil.decryptToken("bcVODLNkM1AMi0e7NtBgEC2K6dgzY2sYlG15gy6RKS3MSaal1Yn1q6lpkMj1oV7Z");
        System.out.println(JSON.toJSONString(token));
    }
}
