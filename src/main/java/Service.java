
import org.sql2o.Sql2o;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;
import static spark.Spark.*;
import static spark.Spark.staticFileLocation;

public class Service {
    public static void main(String[] args) {
        staticFileLocation("/public");



        get("/services/cardio", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
//            model.put("allComments", commentDao.getAll());
            return new ModelAndView(model, "cardiovascular_diseases.hbs");
        }, new HandlebarsTemplateEngine());

        get("/services/kidney", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
//            model.put("allComments", commentDao.getAll());
            return new ModelAndView(model, "chronic_kidney_disease.hbs");
        }, new HandlebarsTemplateEngine());

        get("/services/diabete", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
//            model.put("allComments", commentDao.getAll());
            return new ModelAndView(model, "diabetes.hbs");
        }, new HandlebarsTemplateEngine());

        get("/services/mental", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
//            model.put("allComments", commentDao.getAll());
            return new ModelAndView(model, "mental_condition.hbs");
        }, new HandlebarsTemplateEngine());
    }
}