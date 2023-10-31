package com.cbfacademy.copier;

public class DestinationSpy implements Destination{
    private boolean destinationMethodWasCalled;

    @Override
    public char setChar(char character) {
        this.destinationMethodWasCalled = true;
        return char;

    }
    
}
