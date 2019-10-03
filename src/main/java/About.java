import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import static spark.Spark.*;
import static spark.Spark.get;
import static spark.Spark.post;


public class About {

    public static void main(String[] args) {
        staticFileLocation("/public");

        get("/about", (req, res) -> {
            Map<String, Object> model = new HashMap<>();


            return new ModelAndView(model, "about.hbs");
        }, new HandlebarsTemplateEngine());


    }

}