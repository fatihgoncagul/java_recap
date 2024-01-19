package generics;

import java.util.ArrayList;
import java.util.List;


record BaseballPlayer(String name, String position) implements Player {
}

record FootballPlayer(String name, String position) implements Player {
}

record VolleyballPlayer(String name, String position) implements Player {
}
record Affiliation(String name, String type, String countryCode){
    @Override
    public String toString() {
        return "Affiliation{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", countryCode='" + countryCode + '\'' +
                '}';
    }
}

public class Main{
    public static void main(String[] args) {

        var philly = new Affiliation("PHİLLY","CİTY","PA");

        BaseballTeam phillies = new BaseballTeam("philedlphia phillies");
        BaseballTeam astros = new BaseballTeam("houston astros");
        scoreResult(phillies, 3, astros, 5);
        var haarper = new BaseballPlayer("B harper", "right fielder");
        var marsh = new BaseballPlayer("b marsh", "right fielder");
        phillies.addTeamMember(haarper);
        phillies.addTeamMember(marsh);
        phillies.listTeamMembers();

        Team<BaseballPlayer, Affiliation> phillies1 = new Team<>("phillies1");
        Team<BaseballPlayer, Affiliation> astros1 = new Team<>("astros1");
        scoreResult(phillies1, 3, astros1, 5);
        phillies1.addTeamMember(haarper);
        phillies1.addTeamMember(marsh);
        phillies1.listTeamMembers();


        SportsTeam afc1 = new SportsTeam("adelada crows");
        Team<FootballPlayer, String> afc = new Team<>("adelada crows","city of adelaide, sout australia, in AI");
        var tex = new FootballPlayer("tex walker", "centre half forward");
        afc.addTeamMember(tex);

        var guthrie = new FootballPlayer("d guthrie", "centre fielder");
        afc.addTeamMember(guthrie);
        afc.listTeamMembers();

        Team<VolleyballPlayer, Affiliation> adeliadee = new Team<>("fb");
        adeliadee.addTeamMember(new VolleyballPlayer("n roberts", "setter"));
        adeliadee.listTeamMembers();

        var canberra = new Team<VolleyballPlayer, Affiliation>("gs",philly);
        canberra.addTeamMember(new VolleyballPlayer("b black", "setter"));
        canberra.listTeamMembers();
        scoreResult(canberra, 0, adeliadee, 5);

        //Team<Integer> melbourne = new Team<>("MELBOURNE");


    }

    public static void scoreResult(BaseballTeam team1, int t1_score, BaseballTeam team2, int t2_score) {

        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);


    }

    public static void scoreResult(Team team1, int t1_score, Team team2, int t2_score) {

        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);


    }

}

class BaseballTeam {

    private String teamName;

    private List<BaseballPlayer> teamMembers = new ArrayList<>();

    private int totalWins = 0;

    private int totalLosses = 0;

    private int totalTies = 0;

    public BaseballTeam(String teamName) {
        this.teamName = teamName;
    }

    public void addTeamMember(BaseballPlayer player) {

        if (!teamMembers.contains(player)) {
            teamMembers.add(player);
        }
    }

    public void listTeamMembers() {
        System.out.println(teamName + " Roster:");
        System.out.println(teamMembers);

    }

    public int ranking() {

        return (totalLosses * 2) + (totalTies) + 1;

    }

    public String setScore(int ourScore, int theirScore) {
        String message = "lost to";
        if (ourScore > theirScore) {
            totalWins++;
            message = "beat";
        } else if (ourScore == theirScore) {
            totalTies++;
            message = "tied";

        } else {
            totalLosses++;
        }
        return message;
    }

    @Override
    public String toString() {
        return teamName + " (Ranked " + ranking() + ")";
    }
}

class SportsTeam {

    private String teamName;

    private List<FootballPlayer> teamMembers = new ArrayList<>();

    private int totalWins = 0;

    private int totalLosses = 0;

    private int totalTies = 0;

    public SportsTeam(String teamName) {
        this.teamName = teamName;
    }

    public void addTeamMember(FootballPlayer player) {

        if (!teamMembers.contains(player)) {
            teamMembers.add(player);
        }
    }

    public void listTeamMembers() {
        System.out.println(teamName + " Roster:");
        System.out.println(teamMembers);

    }

    public int ranking() {

        return (totalLosses * 2) + (totalTies) + 1;

    }

    public String setScore(int ourScore, int theirScore) {
        String message = "lost to";
        if (ourScore > theirScore) {
            totalWins++;
            message = "beat";
        } else if (ourScore == theirScore) {
            totalTies++;
            message = "tied";

        } else {
            totalLosses++;
        }
        return message;
    }

    @Override
    public String toString() {
        return teamName + " (Ranked " + ranking() + ")";
    }
}

interface Player {
    String name();


}

class Team<T extends Player, S> {

    private String teamName;

    private List<T> teamMembers = new ArrayList<>();

    private int totalWins = 0;

    private int totalLosses = 0;

    private int totalTies = 0;

    private S affiliation;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public Team(String teamName, S affiliation) {
        this.teamName = teamName;
        this.affiliation = affiliation;
    }

    public void addTeamMember(T t) {

        if (!teamMembers.contains(t)) {
            teamMembers.add(t);
        }
    }

    public void listTeamMembers() {
        System.out.print(teamName + " Roster:");
        System.out.println((affiliation == null ? "" : "AFFILIATION: " + affiliation));
        for (T t : teamMembers
        ) {
            System.out.println(t.name());

        }

    }

    public int ranking() {

        return (totalLosses * 2) + (totalTies) + 1;

    }

    public String setScore(int ourScore, int theirScore) {
        String message = "lost to";
        if (ourScore > theirScore) {
            totalWins++;
            message = "beat";
        } else if (ourScore == theirScore) {
            totalTies++;
            message = "tied";

        } else {
            totalLosses++;
        }
        return message;
    }

    @Override
    public String toString() {
        return teamName + " (Ranked " + ranking() + ")";
    }
}