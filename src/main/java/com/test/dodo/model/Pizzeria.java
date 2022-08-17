package com.test.dodo.model;

import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
    public class Pizzeria {
    private Integer id;
    private String name;
    private String uuid;
    private String alias;
    private String startDate;
    private Integer timeZoneShift;
    private String webcamUrl;
    private Coordinate coordinate;
    private Address address;
    private Stationary stationary;
    private Delivery delivery;

    @Getter
    @ToString
    static class Coordinate {
        private Integer lat;
        private Integer long_;
    }

    @Getter
    @ToString
    static class Address {
        private String text;
        private Locality locality;
        private Street street;
        private House house;
    }

    @Getter
    @ToString
    static class Locality {
        private Integer id;
        private String name;
    }

    @Getter
    @ToString
    static class Street {
        private Integer id;
        private String name;
        private Integer type;
        private String typeName;
        private String typeAbbr;
    }

    @Getter
    @ToString
    static class House {
        private String number;
    }

    @Getter
    @ToString
    static class Stationary {
        List<WorkTime> workTime;
    }

    @Getter
    @ToString
    static class Delivery {
        List<WorkTime> workTime;
    }
    static class WorkTime{
        private Integer start;
        private Integer end;
    }
}



