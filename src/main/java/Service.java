import io.javalin.http.Context;
import org.jetbrains.annotations.NotNull;

public class Service {
    public void getApi(@NotNull Context context) {
        context.result("First Api");
    }


    public void postApi(@NotNull Context context) {
        try{
            User user = context.bodyAsClass(User.class);
            context.result("Name is " +user.getName() + " Age is "+user.getAge());
        }catch (Exception e){
            context.status(400);
            context.result("Invalid requestBody");
        }
    }
}
