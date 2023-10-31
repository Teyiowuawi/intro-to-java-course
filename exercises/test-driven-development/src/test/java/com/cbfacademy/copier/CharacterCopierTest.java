package com.cbfacademy.copier;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CharacterCopierTest {
   
@DisplayName("This character copier should")
public class CharacterCopierTests{

    @Test
    @DisplayName("copies a character from the source to the destination")
    void copyFromSourceToDestination(){
        final SourceSpy source = new SourceSpy();
        final DestinationSpy destination = new DestinationSpy();
        final CharacterCopier copier = new CharacterCopier(source, destination); 

        copier.copy();

        assertTrue(source.wasCalled());
        assertTrue(destination.wasCalled());
    
    }
}
}
