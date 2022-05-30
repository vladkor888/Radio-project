package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void getCurrentStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(5);
        int expected = 5;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void getCurrentStation1() {
        Radio rad = new Radio();

        rad.setCurrentStation(10);
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void getCurrentStation2() {
        Radio rad = new Radio();

        rad.setCurrentStation(-10);
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void getCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(3);
        int expected = 3;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }


    @Test
    void getCurrentVolume1() {
        Radio rad = new Radio();

        rad.setCurrentVolume(12);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void getCurrentVolume2() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-3);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void nextStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(15);

        rad.nextStation();
        int expected = 1;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void nextStation1() {
        Radio rad = new Radio();
        rad.setCurrentStation(10);

        rad.nextStation();
        int expected = 1;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }


    @Test
    void prevStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);

        rad.prevStation();
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void prevStation1() {
        Radio rad = new Radio();
        rad.setCurrentStation(-10);

        rad.prevStation();
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }


    @Test
    void nextVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);

        rad.nextVolume();
        int expected = 10;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }



    @Test
    void prevVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(8);

        rad.prevVolume();
        int expected = 7;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void prevVolume1() {
        Radio rad = new Radio();
        rad.setCurrentVolume(15);

        rad.prevVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void getCurrentStation3() {
        Radio rad = new Radio();

        rad.setCurrentStation(9);
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void nextVolume1() {
        Radio rad = new Radio();
        rad.setCurrentVolume(15);

        rad.nextVolume();
        int expected = 1;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void nextStation2() {
        Radio rad = new Radio();
        rad.setCurrentStation(5);

        rad.nextStation();
        int expected = 6;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void prevStation2() {
        Radio rad = new Radio();
        rad.setCurrentStation(5);

        rad.prevStation();
        int expected = 4;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }
}