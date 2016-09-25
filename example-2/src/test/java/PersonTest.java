/*
 * Copyright (c) 2016. Nate Price's Blog
 */

import org.junit.Test;

import java.time.LocalDate;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by Admin on 9/6/2016.
 */

public class PersonTest {


    @Test
    public void shouldReturnPersonAgeByBirthDate(){
        //Given
        //we setup our mocks
        Date birthDate = mock(Date.class);
        LocalDate dateOfBirth = LocalDate.of(2005, 11, 10);

        //When
        Integer personAge = Person.calculateAge(dateOfBirth);
        //Then
        assertEquals(123,personAge.longValue() );

    }
}