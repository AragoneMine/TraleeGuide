package Activity;


public class Activity {
    private String name;
    private String description;
    private String activityPicture;
    private String location;
    private String openingHours;


    public Activity(String name, String description, String activityPicture, String location, String openingHours) {
        this.name = name;
        this.description = description;
        this.activityPicture = activityPicture;
        this.location = location;
        this.openingHours = openingHours;
    }

    public String getName() {
        return name;
    }

    public String getDescription(){
        return description;
    }

    public String getActivityPicture() {
        return activityPicture;
    }

    public String getLocation(){
        return location;
    }

    public String getOpeningHours(){
        return openingHours;
    }
}




