//import spark.ModelAndView;
//import spark.template.handlebars.HandlebarsTemplateEngine;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//
//import static spark.Spark.*;
//import static spark.Spark.get;
//import static spark.Spark.post;
//
//
//public class About {
//
//    public static void main(String[] args) {
//        staticFileLocation("/public");
//
//
//
//        get("/about", (req, res) -> {
//            Map<String, Object> model = new HashMap<>();
//
//
//            return new ModelAndView(model, "about.hbs");
//        }, new HandlebarsTemplateEngine());
//
//
//    }
//
//}

import com.Comments;
import comment.SqlComment;
import org.sql2o.Sql2o;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;
import static spark.Spark.*;
import static spark.Spark.staticFileLocation;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");
        SqlComment commentDao;
        String connectionString = "jdbc:postgresql://localhost:5432/ncds_insights";
        Sql2o sql2o=new Sql2o(connectionString,"wecode","12345");
        commentDao=new SqlComment(sql2o);

        get("/comments/new", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("allComments", commentDao.getAll());
            return new ModelAndView(model, "comments-form.hbs");
        }, new HandlebarsTemplateEngine());


        post("/comments", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();

            String name=request.queryParams("name");
            String email=request.queryParams("email");
            String subject=request.queryParams("subject");
            String message=request.queryParams("message");
            Comments newComment= new Comments(name,email,subject,message);

            commentDao.add(newComment);

            model.put("name",name);
            model.put("email",email);
            model.put("subject",subject);
            model.put("message",message);
            model.put("allComments", commentDao.getAll());
            return new ModelAndView(model, "comment-feedback.hbs");
        }, new HandlebarsTemplateEngine());

        get("/comments", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("allComments", commentDao.getAll());
            return new ModelAndView(model, "comments.hbs");
        }, new HandlebarsTemplateEngine());

        get("/about", (req, res) -> {
            Map<String, Object> model = new HashMap<>();


            return new ModelAndView(model, "about.hbs");
        }, new HandlebarsTemplateEngine());
//

    }
}