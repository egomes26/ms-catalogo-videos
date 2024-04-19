package com.egomes.admin.catalogo.infrastructure;

import com.egomes.admin.catalogo.application.UseCase;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello moda");

        System.out.println(new UseCase().execute());
    }
}