
package ohtu;

public class Player implements Comparable<Player> {
    private String name;
    
    private String nationality;
    
    private String team;
    
    private int goals;
    
    private int assists;
        
    private int penalties;

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public int getGoals() {
        return goals;
    }

    public int getAssists() {
        return assists;
    }

    public int getPenalties() {
        return penalties;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public void setPenalties(int penalties) {
        this.penalties = penalties;
    }
    
    @Override
    public String toString() {
        int points = this.goals + this.assists;
        StringBuilder sb = new StringBuilder();
        sb.append("                                                                   ");
        sb.insert(0, name);
        sb.insert(22, team);
        sb.insert(28, goals);
        sb.insert(30, "+");
        sb.insert(32, assists);
        sb.insert(35, " = ");
        sb.insert(39, points);
        return sb.toString();
    }
    
    @Override
    public int compareTo(Player p) { 
        return (p.goals + p.assists) - (this.goals + this.assists); 
    } 
}
