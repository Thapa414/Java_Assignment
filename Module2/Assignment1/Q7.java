class Team{
    String name;
    int matchesPlayed, wins, draws;
    Team(String name, int matchesPlayed, int wins, int draws) {
        this.name = name; 
        this.matchesPlayed = matchesPlayed; 
        this.wins = wins; 
        this.draws = draws;
    }
    public int calculatePoints() { 
        return 0; 
    }
    public String toString() { 
        return ("\nTeam: " + name + "Points: " + calculatePoints()); 
    }
}

class CricketTeam extends Team{
    CricketTeam(String name, int matchesPlayed, int wins, int draws){
        super(name, matchesPlayed, wins, draws);
    }
    public int calculatePoints() { 
        return ((wins*2)+(draws*1)); 
    }
    public String toString() { 
        return ("\nTeam: " + name + "(Cricket) Points:" + calculatePoints()); 
    }
}
class FootballTeam extends Team{
    FootballTeam(String name, int matchesPlayed, int wins, int draws){
        super(name, matchesPlayed, wins, draws);
    }
    public int calculatePoints() { 
        return ((wins*3)+(draws*1)); 
    }
    public String toString() { 
        return ("\nTeam: " + name + "(Football) Points:" + calculatePoints()); 
    }
}

public class Q7{
    public static void main(String[] args){
        Team t1 = new CricketTeam("India", 10, 6, 2);
        Team t2 = new FootballTeam("Barcelona", 8, 6, 1);
        System.out.println(t1);
        System.out.println(t2);
    }
}