package com.apportunity.golferapp;

public class Api {

//    Root URL connected to the web server.

    private static final String ROOT_URL = " http://d7b556e47ef0.ngrok.io/HeroApi/v1/Api.php?apicall=";

    public static final String URL_CREATE_HERO = ROOT_URL + "createhero";
    public static final String URL_READ_HEROES = ROOT_URL + "getheroes";
    public static final String URL_UPDATE_HERO = ROOT_URL + "updatehero";
    public static final String URL_DELETE_HERO = ROOT_URL + "deletehero&id=";

}
