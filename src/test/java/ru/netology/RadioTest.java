package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void testRadioStationValid(){
        Radio radio = new Radio();
        radio.setCurrentRadioStation(2);

        int expected = 2;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);

    }
    @Test
    public void testStationAfterTen(){
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);

    }
    @Test
    public void testStationUnderZero(){
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);

    }
    @Test
    public void testStation0() {
        Radio radio = new Radio();
        radio.setUpRadioStation(0);

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }
    @Test
    public void testStation9() {
        Radio radio = new Radio();
        radio.setUpRadioStation(9);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }
    @Test
    public void test3(){
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);

    }
    @Test
    public void testUpVolumeAfterTen(){
        Radio radio = new Radio();
        radio.setCurrentVolume(11);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);

    }
    @Test
    public void testDownStation(){
        Radio radio = new Radio();
        radio.setDownRadioStation(0);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);

    }
    @Test
    public void testUpStation() {
        Radio radio = new Radio();
        radio.setUpRadioStation(9);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }
    @Test
    public void testDownVolume() {
        Radio radio = new Radio();
        radio.setDownVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void testUpVolume() {
        Radio radio = new Radio();
        radio.setUpVolume(10);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
}