package org.launchcode.techjobs_oo;

import javax.swing.text.Position;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    //first constructor initializes id and updates nextid.
    public Job(){
        id = nextId;
        nextId++;
    }

    //Second Constructor initializes passed in objects to the class.
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer=employer;
        this.location=location;
        this.positionType=positionType;
        this.coreCompetency=coreCompetency;

    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField jobfield = (JobField) o;
        return getId() == jobfield.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    public String toString(Job job){
        String result = String.format("\nID: %s ", job.getId());

        //Add Name to string
        if("".equals(job.getName())){
            result += String.format("\nName:  Data not available.");
        }else{
            result +=String.format("\nName:  %s",job.getName());
        }

        //Add Employer to string
        if("".equals(job.getEmployer().getValue())){
            result += String.format("\nEmployer:  Data not available.");
        }else{
            result +=String.format("\nEmployer:  %s",job.getEmployer());
        }

        //Add Location to string
        if("".equals(job.getLocation().getValue())){
            result += String.format("\nName:  Data not available.");
        }else{
            result +=String.format("\nName:  %s",job.getLocation());
        }

        //Add PositionType
        if("".equals(job.getPositionType().getValue())){
            result += String.format("\nName:  Data not available.");
        }else{
            result +=String.format("\nName:  %s",job.getPositionType());
        }

        //Add CoreCompetency
        if("".equals(job.getCoreCompetency().getValue())){
            result += String.format("\nName:  Data not available.");
        }else{
            result +=String.format("\nName:  %s\n",job.getCoreCompetency());
        }

        //Returns formatted string
        return result;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    //Getters and Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
