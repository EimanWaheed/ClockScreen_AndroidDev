package com.example.clockscreen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class World_Time {
    public String[] cn;
    ArrayList<String> cnamelist=new ArrayList<>(); //for first screen
    List<String> countryName; //for second screen
    private String countryTime;

    public World_Time(){
        cn=new String[]{"Afghanistan",
                "Albania",
                "Algeria",
                "American Samoa",
                "Andorra",
                "Angola",
                "Anguilla",
                "Antarctica",
                "Antigua and Barbuda",
                "Argentina",
                "Armenia",
                "Aruba",
                "Australia",
                "Austria",
                "Azerbaijan",
                "Bahamas",
                "Bahrain",
                "Bangladesh",
                "Barbados",
                "Belarus",
                "Belgium",
                "Belize",
                "Benin",
                "Bermuda",
                "Bhutan",
                "Bolivia",
                "Bosnia and Herzegovina",
                "Botswana",
                "Brazil",
                "British Indian Ocean Territory",
                "British Virgin",
                "Brunei",
                "Bulgaria",
                "Burkina Faso",
                "Burundi",
                "Cambodia",
                "Cameroon ",
                "Canada",
                "Cape Verde",
                "Cayman Islands",
                "Central African Republic",
                "Chad",
                "Chile",
                "China",
                "Christmas Island",
                "Cocos Islands",
                "Colombia",
                "Comoros",
                "Cook Islands",
                "Costa Rica",
                "Croatia",
                "Cuba ",
                "Curacao",
                "Cyprus "};
        countryName = new ArrayList<>(Arrays.asList(cn));
        countryTime="12:30AM";
    }
    public World_Time( String countryTime) {
        this.countryTime = countryTime;
    }

    public void setCountryList(ArrayList<String>cl){
        cnamelist=cl;
    }
    public void setCountryTime(String ct){
        countryTime=ct;
    }
    public int getLength(){
        return countryName.size();
    }

    //for the updated data list for first screen
    public int getLengthList(){
        return cnamelist.size();
    }

    public List<String> getCountryList(){
        return countryName;
    }

    public String getCountryName(int i) {
        return cn[i];
    }

    //for the updated data list for first screen
    public String getCountryNameList(int i) { return cnamelist.get(i); }

    public String getCountryTime() {
        return countryTime;
    }
}
