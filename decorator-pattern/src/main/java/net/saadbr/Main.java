package net.hanane;

import Decorators.Caramel;
import Decorators.Chocolate;
import Decorators.Hazelnut;
import composants.Boisson;
import composants.Espresso;
import composants.Sumatra;

/**
 * @author hananee
 **///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Boisson boisson;
        boisson = new Sumatra();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.price());
        boisson = new Espresso();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.price());
        boisson = new Chocolate(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.price());
        boisson = new Caramel(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.price());
        boisson = new Chocolate(new Hazelnut(new Chocolate(new Caramel(new Espresso()))));
        System.out.println(boisson.getDescription());
        System.out.println(boisson.price());
    }
}