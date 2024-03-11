package ru.netology.oop;
public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (currentStation <=9) {
            if (currentStation >=0) {
                this.currentStation = newCurrentStation;
            }
        }
    }
    public void next() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }
    public void prev() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
    public int increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public int decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}

