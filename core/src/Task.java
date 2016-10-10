import com.lovely3x.jsonparser.model.JSONObject;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Base64;

/**
 * Created by lovely3x on 16/9/28.
 */
public class Task {

    public static void main(String[] args) {
        String str = "{\"imgs\":[{\"key\":[{\"key\":\"value1\"},{\"key\":\"value1\"},{\"key\":\"value1\"}]},{\"key\":[{\"key\":\"value1\"},{\"key\":\"value1\"},{\"key\":\"value1\"}]},{\"key\":[{\"key\":\"value1\"},{\"key\":\"value1\"},{\"key\":\"value1\"}]},{\"key\":[{\"key\":\"value1\"},{\"key\":\"value1\"},{\"key\":\"value1\"}]}]}";

        JSONObject jo = new JSONObject(str);

        Test result = jo.createObject(Test.class);

        System.out.println(result);

    }
}
