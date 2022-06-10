public class TeamLead {
    private int numTeamLead;
    public TeamLead(int numTeamLead) {
        this.numTeamLead = numTeamLead;
        employ();
    }
    protected void employ() {
        getInfo();
    }
    private void getInfo(){
        System.out.println(numTeamLead + " teamlead");
    }

}