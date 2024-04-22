package com.example.projectgoal;

import java.util.ArrayList;

public class ClubDataSource {
    public static ArrayList<Club> clubs = generateDummyClubs();

    private static ArrayList<Club> generateDummyClubs() {
        ArrayList<Club> clubs = new ArrayList<>();
        clubs.add(new Club("Manchester City",
                "England",
                R.drawable.city_logo,
                2087
        ));
        clubs.add(new Club("Real Madrid",
                "Spain",
                R.drawable.madrid_logo,
                2019
        ));
        clubs.add(new Club("Inter Milan",
                "England",
                R.drawable.inter_logo,
                2010
        ));
        clubs.add(new Club("Bayern Leverkusen",
                "Germany",
                R.drawable.leverkusen_logo,
                1966
        ));
        clubs.add(new Club("Barcelona",
                "Spain",
                R.drawable.barcelona_logo,
                1936
        ));
        clubs.add(new Club("Arsenal",
                "England",
                R.drawable.arsenal_logo,
                1927
        ));
        clubs.add(new Club("Liverpool",
                "England",
                R.drawable.liverpool_logo,
                1911
        ));
        clubs.add(new Club("Borussia Dortmund",
                "Germany",
                R.drawable.dortmund_logo,
                1887
        ));
        clubs.add(new Club("Paris Saint Germain",
                "France",
                R.drawable.psg_logo,
                1883
        ));
        clubs.add(new Club("Bayern Munchen",
                "Germany",
                R.drawable.fcbayern_logo,
                1882
        ));
        clubs.add(new Club("Atletico Madrid",
                "Spain",
                R.drawable.atleticodemadrid_logo,
                1865
        ));
        clubs.add(new Club("RB Leipzig",
                "Germany",
                R.drawable.leipzig_logo,
                1853
        ));
        clubs.add(new Club("AC Milan",
                "Italy",
                R.drawable.milan_logo,
                1848
        ));
        clubs.add(new Club("Sporting CP",
                "Portugal",
                R.drawable.sporting_logo,
                1834
        ));
        clubs.add(new Club("Atalanta",
                "Italy",
                R.drawable.atalanta_logo,
                1831
        ));

        return clubs;
    }

}
