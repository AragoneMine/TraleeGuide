package Activity;

import Activity.Activity;

import java.util.ArrayList;

public class Contains {

    private static ArrayList<Activity> containers = new ArrayList();

    public static void addActivity(String name, String desc, String Img, String location, String openingHours){

        Activity activity = new Activity(name, desc, Img, location, openingHours);
        containers.add(activity);


    }

    public static void findActivity(String nameResult){

        String print="";

        for(int i=0;i<containers.size();i++){
            Activity activity = containers.get(i);
            String currentName = activity.getName();
            if(currentName.equals(nameResult)){
                print = print + "Name: "+activity.getName()+"\n" + "Description: "+activity.getDescription()+"\n" + "Picture: "+activity.getActivityPicture()+"\n" + "Location: "+activity.getLocation()+"\n" + "Opening Hours: "+activity.getOpeningHours()+"\n"+"\n";
            }
        }
        if(print == "")
            System.out.println("No document matches the specified search terms");
        System.out.println("This is the answer to your research:\n " + print);
    }

    public static void showAllActivity(){

        String print="";

        for(int i=0;i<containers.size();i++){
            Activity activity = containers.get(i);
            print = print + "Name: "+activity.getName()+"\n" + "Description: "+activity.getDescription()+"\n" + "Picture: "+activity.getActivityPicture()+"\n" + "Location: "+activity.getLocation()+"\n" + "Opening Hours: "+activity.getOpeningHours()+"\n"+"\n";
        }

        System.out.println("This is All the activities:\n"+print);

    }
}
