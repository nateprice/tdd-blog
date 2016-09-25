/*
 * Copyright (c) 2016. Nate Price's Blog
 */

import org.junit.Test;
import java.time.LocalDate;
import static org.junit.Assert.assertEquals;

/**
 * Created by Nate Price on 9/6/2016.
 */

public class PersonTest {


    @Test
    public void shouldReturnPersonAgeByBirthDate(){
        //Given
        LocalDate dateOfBirth = LocalDate.of(2005, 11, 10);

        //When
        Integer personAge = Person.calculateAge(dateOfBirth);

        //Then
        assertEquals(123,personAge.longValue() );

    }
}