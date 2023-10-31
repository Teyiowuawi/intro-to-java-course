package com.cbfacademy.copier;

public class DestinationSpy implements Destination{
    private Integer numberOfCalls;

    @Override
    public void setChar(char character) {
        this.numberOfCalls = this.numberOfCalls +1;
    }

    Boolean wasCalled(){
        return this.numberOfCalls > 0;
    }
        

    }

