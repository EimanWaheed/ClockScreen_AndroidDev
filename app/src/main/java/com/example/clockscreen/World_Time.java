package com.example.clockscreen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class World_Time {
    //public static String[] countryName;
    public String[] cn;
    List<String> countryName;
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

    public int getLength(){
        return countryName.size();
    }
    public List<String> getCountryList(){
        return countryName;
    }
    public String getCountryName(int i) {
        return cn[i];
    }

    public String getCountryTime() {
        return countryTime;
    }
}
