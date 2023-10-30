package com.example.demokingdoms;

import Modeles.KingDom;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KingdomTest {
    public static void main(String[] args) {

        KingDom kingdom = new KingDom.KingDomBuilder().addKing("Youness")
                .addCountry("France", "20", "100", "50", "200", "100", "100") // (name, nbrOfSoldiersInCity1,
                // nbrOfCitizenInCity1, .....)
                .addCountry("Spain", "30", "200", "40", "300")
                .addSoldiersOnEdges("200")
                .build();
        System.out.println(kingdom.report());



            KingDom kingdom1 = new KingDom.KingDomBuilder().addKing("Idriss")
                    .addCountry("France", "20", "100", "50", "200", "100", "100")
                    .addCountry("Spain", "30", "200", "40", "300")
                    .addSoldiersOnEdges("500")
                    .build();

            KingDom kingdom2 = new KingDom.KingDomBuilder().addKing("MOHA")
                    .addCountry("USA", "30", "200", "40", "300")
                    .addSoldiersOnEdges("200")
                    .build();

            System.out.println( kingdom1.currentPower());

    }
    }
