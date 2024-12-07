import io.javalin.Javalin;
public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        var app = Javalin.create()
                .get("/",service::getApi)
                .post("/",service::postApi)
                .start(8080);
    }
}
