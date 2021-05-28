package com.df.api.models;

import com.google.gson.annotations.SerializedName;

public class Civilization {

    @SerializedName("id")
    private String idCivilization;

    @SerializedName("name")
    private  String nameCivilization;

    public String getIdCivilization() {
        return idCivilization;
    }

    public String getNameCivilization() {
        return nameCivilization;
    }

    public void setIdCivilization(String idCivilization) {
        this.idCivilization = idCivilization;
    }

    public void setNameCivilization(String nameCivilization) {
        this.nameCivilization = nameCivilization;
    }
}
