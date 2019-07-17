package com.narayan.EffectiveJava.JosuaBloch;

public class enumFields
{
    public static ArrayList <String> enumFields() {
        AbbreviationOfDays[] abbreviationOfDays=
                AbbreviationOfDays.values();
        ArrayList <String> dayList=new ArrayList <String>();
        for (AbbreviationOfDays days : abbreviationOfDays) {

            dayList.add( days.getAbbreviation() );
        }

        return dayList;
    }




}
