package com.project;

import com.project.coffeeSystem.CoffeeBarista;
import com.project.coffeeSystem.UsualCashier;
import com.project.shop.SuperBarista;

public class Staff {
    public static void main(String[] args) {
        Team team = new Team();

        Barista firstBarista = new CoffeeBarista();
        Cashier firstCashier = new UsualCashier();
        Cashier secondCashier = new UsualCashier();

        Cashier thirdCashier = new UsualCashier();

        team.addBarista(firstBarista);
        team.addCashier(firstCashier);
        team.addCashier(secondCashier);
        team.removeCashier(firstCashier);
        team.addCashier(thirdCashier);

        team.createStaff();

    }
}
