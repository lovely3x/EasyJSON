##EasyJSON
这个库的目的在于方便json的序列化和反序列化。
#### 特性

* 轻松解析

<pre><code>String jsonStr = "{\"name\":\"重庆大学\",\"classes\":[{\"id\":1,\"name\":\"一班\",\"students\":[{\"name\":\"张三\",\"age\":24,\"sex\":1,\"married\":true}]}]}";

JSONObject jo = new JSONObject(jsonStr);
School school = jo.createObject(School.class);
</code></pre>

* 轻松序列化

<pre><code>School school = new School(
                "南山幼儿园",
                Collections.singletonList(
                        new Class(1, "张三", Collections.singletonList(
new Student("张三", 24, 1, true)))));

JSONObject jo = new JSONObject(school);
</code></pre>

* 注解字段匹配

    * 这里的注解是 JSON 表示单个注解
    * 如果这里是一个对象类型的话就需要 注解 JSONObject
    * 如果这里是一个列表类型的话就需要 注解 JSONArray
<pre><code>@JSON("sex")
    private int gender;
</code></pre>

###### [点击下载jar包](https://raw.githubusercontent.com/lovely3x/EasyJSON/master/jars/easy_json_core.jar)

不写了，感觉写起好累，有空再慢慢补上来吧。