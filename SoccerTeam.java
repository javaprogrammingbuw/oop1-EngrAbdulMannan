
public class SoccerTeam {
private String name;
private SoccerTrainer trainer;
private int tablePosition;
private int goals;
private int goalsAgg;
private SoccerPlayer [] players=new SoccerPlayer [11];

public SoccerTeam (String name,SoccerTrainer trainer,int tablePosition) {
	this.name=name;
	this.trainer=trainer;
	this.tablePosition=tablePosition;
}
public String getName() {
	return this.name;
}
public boolean addPlayer(SoccerPlayer player) {
	for(int i=0;i<players.length;i++) {
		if(players[i]==null) {
			// add player
			players[i]=player;
			//set Team of player
			player.setTeam(this);
			//set number of player
			player.setNumber(i+1);
			return  true;
		}
	}
	return false;
}
public void goal(int playerNumber) {
	//increase the goalcount of the team
	this.goals=this.goals+1;
	//increase the goalcount of the player
	players[playerNumber-1].increaseGoalCount();
}
public void goalAgainst() {
	this.goalsAgg=this.goalsAgg+1;
}
public String ratioString() {
	return goals+":"+goalsAgg;
}
public String toString() {
	String result = name+trainer.getName()+ratioString() + "\n";
	
	for(int i=0;i<players.length;i++) {
		result+=players[i].toString();
		result +="\n";
	}
	
	return result;
}

}
