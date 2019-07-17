package com.narayan.EffectiveJava.JosuaBloch;

enum AbbreviationOfDays{
    SUNDAY("SUN"), MONDAY("MON"), TUESDAY("TUES"), WEDNESDAY("WED"),
    THURSDAY("THURS"), FRIDAY("FRI"), SATURDAY("SAT");
    private String abbreviation;
    public String getAbbreviation() {
        return this.abbreviation;
    }
    AbbreviationOfDays(String abbreviation) {
        this.abbreviation = abbreviation;
    }
}

