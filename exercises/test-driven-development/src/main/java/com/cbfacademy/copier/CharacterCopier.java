package com.cbfacademy.copier;

public class CharacterCopier {

    // not instance of either interface just read sand writes 
    // should have access to an instance 

    private Source source;
    private Destination destination;

    public CharacterCopier(Source source, Destination destination){
        this.source = source;
        this.destination = destination;
    }

    public void copy(){
        throw new RuntimeException("method not implemented");
    }

    
}
