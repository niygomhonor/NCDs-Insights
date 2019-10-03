import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;

public class Service_Nicole {
    public static void main(String[] args){

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
            return new ModelAndView(model, "diabetes.hbs");
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