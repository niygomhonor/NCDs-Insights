import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import static spark.Spark.*;
import static spark.Spark.get;
import static spark.Spark.post;


public class home {

    public static void main(String[] args) {
        staticFileLocation("/public");

        get("/home", (req, res) -> {
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


    }

}