
public class SoccerPlayer {
private String name;
private int number;
private SoccerTeam team;
private boolean yCard;
private boolean rCard;
private int goals;

public SoccerPlayer(String name) {
	this.name=name;
			
}
public void redCard() {
	rCard=true;
}
public void yellowCard() {
	if(yCard==true) {
		redCard();
		
	}
	else {
		yCard=true;
	}
}
public int getNumber() {
	return this.number;
}
public void setNumber(int number) {
	this.number=number;
}
public String getName() {
	return this.name;
}
public SoccerTeam getTeam() {
	return this.team;
}
public void increaseGoalCount() {
	this.goals=this.goals+1;
}
public void setTeam(SoccerTeam newTeam) {
	this.team=newTeam;
}
public String toString() {
	return name+number+team.getName()+goals;
}
}
