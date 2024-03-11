package ru.netology.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testSetCurrentStationRegularFlow() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);
        int actual = radio.getCurrentStation();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSetCurrentStationOverMaximum() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);
        radio.setCurrentStation(15);
        int actual = radio.getCurrentStation();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSetCurrentStationUnderMinimum() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);
        radio.setCurrentStation(-15);
        int actual = radio.getCurrentStation();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testNext1() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testNext2() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testPrev1() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testPrev2() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testIncreaseVolume1() {
        Radio radio = new Radio();

        for (int i = 0; i < 3; i++){
            radio.increaseVolume();
        }
        int actual = radio.getCurrentVolume();
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testIncreaseVolume2() {
        Radio radio = new Radio();

        for (int i = 0; i < 300; i++){
            radio.increaseVolume();
        }
        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testDecreaseVolume1() {
        Radio radio = new Radio();

        for (int i = 0; i < 3; i++){
            radio.decreaseVolume();
        }
        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testDecreaseVolume2() {
        Radio radio = new Radio();

        for (int i = 0; i < 50; i++){
            radio.increaseVolume();
        }
        for (int i = 0; i < 10; i++){
            radio.decreaseVolume();
        }
        int actual = radio.getCurrentVolume();
        int expected = 40;

        Assertions.assertEquals(expected, actual);
    }
}
