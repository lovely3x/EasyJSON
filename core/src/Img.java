import java.util.List;

/**
 * Created by lovely3x on 16/10/10.
 */
public class Img {
    private List<InnerImg> key;

    @Override
    public String toString() {
        return "Img{" +
                "key='" + key + '\'' +
                '}';
    }

    public static class InnerImg{
        private String key;

        @Override
        public String toString() {
            return "InnerImg{" +
                    "key='" + key + '\'' +
                    '}';
        }
    }
}
