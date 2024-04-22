package com.example.projectgoal;

import java.util.ArrayList;

public class PlayerDataSource {

    public static ArrayList<Player> players = generateDummyPlayers();

    private static ArrayList<Player> generateDummyPlayers() {
        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player(R.drawable.erlinghaaland,
                "Erling Haalaand",
                "Manchester City",
                98));
        players.add(new Player(R.drawable.bellingham,
                "Jude Bellingham",
                "Real Madrid",
                97));
        players.add(new Player(R.drawable.bukayosaka,
                "Bukayo Saka",
                "Arsenal",
                95));
        players.add(new Player(R.drawable.colepalmer,
                "Cole Palmer",
                "Chelsea",
                90));
        players.add(new Player(R.drawable.darwinnunez,
                "Darwin Nunez",
                "Liverpool",
                85));
        players.add(new Player(R.drawable.foden,
                "Phil Foden",
                "Manchester City",
                82));
        players.add(new Player(R.drawable.garnacho,
                "Alejandro Garnacho",
                "Manchester United",
                82));
        players.add(new Player(R.drawable.gavi,
                "Pablo Gavi",
                "Barcelona",
                81));
        players.add(new Player(R.drawable.mbappe,
                "Kylian Mbappe",
                "Paris Saint Germain",
                80));
        players.add(new Player(R.drawable.musiala_post,
                "Jamal Musiala",
                "Bayern Munchen",
                80));
        players.add(new Player(R.drawable.odegaard,
                "Martin Odegaard",
                "Arsenal",
                77));
        players.add(new Player(R.drawable.pedri,
                "Pedri Gonzales",
                "Barcelona",
                75));
        players.add(new Player(R.drawable.rafaelleao,
                "Rafael Leao",
                "AC Milan",
                70));
        players.add(new Player(R.drawable.sancho,
                "Jadon Sancho",
                "Manchester City",
                62));
        players.add(new Player(R.drawable.vinicius,
                "Vinicius Junior",
                "Real Madrid",
                60));

        return players;
    }


}
