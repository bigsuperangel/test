import com.google.gson.Gson;

/**
 * Created by linyu on 2016/5/31.
 */
public class JsoupDemo {
    public static void main(String[] args){
        Gson gson = new Gson();
        System.out.print(gson.toJson(new App("test","test")));
    }

    static class App{
        private String name;
        private String pwd;

        public App(String name, String pwd) {
            this.name = name;
            this.pwd = pwd;
        }

        public String getPwd() {
            return pwd;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPwd(String pwd) {
            this.pwd = pwd;
        }
    }
}
