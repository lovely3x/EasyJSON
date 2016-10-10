import com.lovely3x.jsonpareser.bean.Index;
import com.lovely3x.jsonpareser.bean.Response;
import com.lovely3x.jsonpareser.bean.Water;
import com.lovely3x.jsonpareser.request.UserRequest;
import com.lovely3x.jsonpareser.request.WaterRequest;

import java.io.IOException;
import java.util.List;

/**
 * Created by lovely3x on 15-7-18.
 * 使用列子
 */
public class SimpleSample {

    public static final String TAG = "SimpleSample";

    public static void main(String[] args) throws IOException {
        //注解解析使用
        Response user = new UserRequest().getUser();
        System.out.println(user.obj);
    }
}
