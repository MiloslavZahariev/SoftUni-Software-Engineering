package JavaProgramingFundamentals.ObjectsAndClasses.MoreExercises.P04TeamworkProjects;

import java.util.ArrayList;
import java.util.List;

public class Teams {
    private String teamName;
    private String creator;
    private List<String> userList = new ArrayList<>();


    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Teams(String teamName, String creator) {
        this.teamName = teamName;
        this.creator = creator;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public List<String> getUserList() {
        return userList;
    }

    public void setUserList(List<String> userList) {
        this.userList = userList;
    }

    public int getCountOfMembers(List<String> userList){
        return userList.size();
    }
}
