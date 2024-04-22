package com.example.projectgoal;

import java.util.ArrayList;

public class AccountDataSource {
    public static ArrayList<Account> accounts = generateDummyPlayers();

    private static ArrayList<Account> generateDummyPlayers() {
        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(new Account("Arsenal",
                "arsenal",
                "\uD83E\uDD41 Introducing last night’s POTM...\n" +
                        "\n" +
                        "An all-action performance from our midfield marvel \uD83D\uDE4C",
                R.drawable.arsenal_logo,
                R.drawable.arsenal_post,
                null
                ));
        accounts.add(new Account("Atalanta",
                "@atalantabc",
                "A caccia dei tre punti a Monza \uD83C\uDFF9\n" +
                        "\n" +
                        "Chasing all three points in Monza \uD83E\uDEF5",
                R.drawable.atalanta_logo,
                R.drawable.atalantabc_post,
                null
        ));
        accounts.add(new Account("Atletico Madrid",
                "@atleticodemadrid",
                "Can you score a goal in five passes? Yes, we can \uD83D\uDE09",
                R.drawable.atleticodemadrid_logo,
                R.drawable.atleticodemadrid_post,
                null
        ));
        accounts.add(new Account("Barcelona",
                "@fcbarcelona",
                "This is brotherhood \uD83E\uDD79❤\uFE0F",
                R.drawable.barcelona_logo,
                R.drawable.barcelona_post,
                null
        ));
        accounts.add(new Account("Manchester City",
                "@mancity",
                "A hard-fought win at Wembley \uD83D\uDCAA",
                R.drawable.city_logo,
                R.drawable.city_post,
                null
        ));
        accounts.add(new Account("Borussia Dortmund",
                "@bvb09",
                "☀\uFE0F\uD83D\uDE82 Das ist unser \uD835\uDDE6\uD835\uDDFC\uD835\uDDFA\uD835\uDDFA\uD835\uDDF2\uD835\uDDFF\uD835\uDDF3\uD835\uDDEE\uD835\uDDF5\uD835\uDDFF\uD835\uDDFD\uD835\uDDF9\uD835\uDDEE\uD835\uDDFB! Trainingsauftakt am 3. Juli. Anschließend Testspiele, Asien-Tour, Trainingslager in Bad Ragaz und Saisoneröffnung samt der Begegnung gegen @avfcofficial! \uD83D\uDDD3\uFE0F",
                R.drawable.dortmund_logo,
                    R.drawable.dortmun_post,
                null
        ));
        accounts.add(new Account("Bayern Munchen",
                "@fcbayern",
                "Getting in #Bundesliga mood with this stunner \uD83D\uDE2E\u200D\uD83D\uDCA8\uD83D\uDE80",
                R.drawable.fcbayern_logo,
                R.drawable.fcbayern_post,
                null
        ));
        accounts.add(new Account("Inter Milan",
                "@intermilan",
                "For nights like these \uD83D\uDDA4\uD83D\uDC99",
                R.drawable.inter_logo,
                R.drawable.inter_post,
                null
        ));
        accounts.add(new Account("RB Leipzig",
                "@rbleipzig",
                "These lads start the show today ",
                R.drawable.leipzig_logo,
                R.drawable.leipzig_post,
                null
        ));
        accounts.add(new Account("Bayern Leverkusen",
                "@bayern04fussball",
                "With a lot of energy into the night! ❤\uFE0F\u200D\uD83D\uDD25",
                R.drawable.leverkusen_logo,
                R.drawable.leverkusen_post,
                null
        ));
        accounts.add(new Account("Liverpool",
                "@liverpoolfc",
                "Almost time for action \uD83D\uDCF8",
                R.drawable.liverpool_logo,
                R.drawable.liverpool_post,
                null
        ));
        accounts.add(new Account("Real Madrid",
                "@realmadridfc",
                "⚡ RODRYG⚽L ⚡",
                R.drawable.madrid_logo,
                R.drawable.madrid_post,
                null
        ));
        accounts.add(new Account("Ac Milan",
                "@acmilan",
                "\uD83D\uDCCD The Captain’s guide to Milano ahead of the derby",
                R.drawable.milan_logo,
                R.drawable.milan_post,
                null
        ));
        accounts.add(new Account("Paris Saint Germain",
                "@psg",
                "All our 4\uFE0F⃣ goals from first leg \uD83C\uDD9A Lyon (1-4)!\n" +
                        "\uD83C\uDFDF\uFE0F See you tonight!t",
                R.drawable.psg_logo,
                R.drawable.psg_post,
                null
        ));
        accounts.add(new Account("Sporting Cp",
                "@sportingcp",
                "No dia em que homenageamos a conquista da Taça das Taças, com o célebre Cantinho do Morais, Sandro Nascimento dá a vitória aos #JuvenisSCP no clássico com o FC Porto... de canto directo \uD83D\uDC4F",
                R.drawable.sporting_logo,
                R.drawable.sporting_post,
                null
        ));
        return accounts;
    }

}
