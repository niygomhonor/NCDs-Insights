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

        get("/", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "home.hbs");
        }, new HandlebarsTemplateEngine());


        get("/heartsol", (req, res) -> {
            Map<String, Object> model = new HashMap<>();


            return new ModelAndView(model, "solutions.hbs");
        }, new HandlebarsTemplateEngine());

        get("/diabetesol", (req, res) -> {
            Map<String, Object> model = new HashMap<>();


            return new ModelAndView(model, "solution2.hbs");
        }, new HandlebarsTemplateEngine());

        get("/kidneysol", (req, res) -> {
            Map<String, Object> model = new HashMap<>();


            return new ModelAndView(model, "solutions3.hbs");
        }, new HandlebarsTemplateEngine());

        get("/mentalsol", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "solutions4.hbs");
        }, new HandlebarsTemplateEngine());

          get("/services/cardio", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "cardiovascular_diseases.hbs");
        }, new HandlebarsTemplateEngine());

        get("/services/kidney", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "chronic_kidney_disease.hbs");
        }, new HandlebarsTemplateEngine());

        get("/services/mental", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "mental_condition.hbs");
        }, new HandlebarsTemplateEngine());

        get("/services/diabetes", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "diabetes.hbs");
        }, new HandlebarsTemplateEngine());
        //get: the service page
        get("/detail1", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "hypertension.hbs");
        }, new HandlebarsTemplateEngine());

        get("/detail2", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "aortic.hbs");
        }, new HandlebarsTemplateEngine());

        get("/diabetes_type_one", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "diabeterody.hbs");
        }, new HandlebarsTemplateEngine());

        get("/diabetes_type_two", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "diabetes-nic.hbs");
        }, new HandlebarsTemplateEngine());

        get("/detail5", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "glumerulophritis.hbs");
        }, new HandlebarsTemplateEngine());

        get("/detail6", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "hypotension.hbs");
        }, new HandlebarsTemplateEngine());

        get("/detail7", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "kidney.hbs");
        }, new HandlebarsTemplateEngine());

        get("/detail8", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "personalitydisorders.hbs");
        }, new HandlebarsTemplateEngine());

        get("/detail9", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "polycystic.hbs");
        }, new HandlebarsTemplateEngine());

        get("/detail10", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "steroidInduced.hbs");
        }, new HandlebarsTemplateEngine());

        get("/detail11", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "strock.hbs");
        }, new HandlebarsTemplateEngine());

        get("/detail12", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "substanceabuse.hbs");
        }, new HandlebarsTemplateEngine());

        get("/detail13", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "trauma.hbs");
        }, new HandlebarsTemplateEngine());

        get("/detail14", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "urinarytracy.hbs");
        }, new HandlebarsTemplateEngine());


    }
}