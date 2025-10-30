package com.electronicadomestica;

import io.javalin.Javalin;

public class Main {
    public static void main(String[] args) {
        Javalin app = Javalin.create(config -> {
            config.plugins.enableCors(cors -> {
                cors.add(it -> it.anyHost());
            });
        }).start(7000);

        app.get("/", ctx -> ctx.result("PRUEBA DE API ELECTRONICA LISTO"));

        System.out.println("Servidor iniciado en http://localhost:7000");
    }
}
