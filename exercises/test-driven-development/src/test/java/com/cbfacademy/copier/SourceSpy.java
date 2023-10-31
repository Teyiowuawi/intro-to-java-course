package com.cbfacademy.copier;

public class SourceSpy implements Source{
    private Integer numberOfCalls = 0;

    @Override
    public char getChar() {
        this.numberOfCalls = this.numberOfCalls + 1;
        return 0;
    }
    Boolean wasCalled(){
        return this.numberOfCalls > 0;
    }
  }
