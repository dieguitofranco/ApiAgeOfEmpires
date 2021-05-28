package com.df.api.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Civilizations {
    @SerializedName("civilizations")
    List<Civilization> civilizationList;

    public List<Civilization> getCivilizationList() {
        return civilizationList;
    }

    public void setCivilizationList(List<Civilization> civilizationList) {
        this.civilizationList = civilizationList;
    }
}
