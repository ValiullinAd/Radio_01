package ru.netology;

public class Radio {

    private int currentRadioStation;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {

        if (currentRadioStation < 0) {
            setCurrentRadioStation(9);
            return;
        }
        if (currentRadioStation > 9) {
            setCurrentRadioStation(0);
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public  void setUpRadioStation(int currentRadioStation) {
        //if (currentRadioStation >= 0 || currentRadioStation < 9) {
            this.currentRadioStation = currentRadioStation + 1;
        //}
        if (currentRadioStation >= 9) {
            this.currentRadioStation = 0;
        }
    }
    public  void setDownRadioStation(int currentRadioStation) {
        if (currentRadioStation >= 0 || currentRadioStation < 9) {
            this.currentRadioStation = currentRadioStation - 1;
        }
        if (currentRadioStation <= 0) {
            this.currentRadioStation = 9;
        }
    }


    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 10) {
            setCurrentVolume(10);
            return;
        }
        if (currentVolume < 0) {
            setCurrentVolume(0);
            return;
        }
        this.currentVolume = currentVolume;
    }
    public  void setDownVolume(int currentVolume) {
        if (currentVolume > 10 || currentVolume >= 0) {

            this.currentVolume = currentVolume - 1;

        }
        if (currentVolume <= 0) {
            this.currentVolume = 0;
        }
    }
    public  void setUpVolume(int currentVolume) {
        if (currentVolume >= 0 || currentVolume >=9) {
            this.currentVolume = currentVolume + 1;
       }
        if (currentVolume >= 9) {
            this.currentVolume = 10;
        }
    }
}
