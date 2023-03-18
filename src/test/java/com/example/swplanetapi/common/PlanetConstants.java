package com.example.swplanetapi.common;

import com.example.swplanetapi.model.Planet;

public class PlanetConstants {

    public static final Planet PLANET = new Planet("name", "climate", "terrain");

    public static final Planet INVALID_PLANET = new Planet("", "", "");

    public static final Planet EMPTY_PLANET = new Planet();

}
