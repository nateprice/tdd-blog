import org.junit.Test;
import org.mockito.Mockito;


import java.time.LocalDate;
import java.util.Date;
import java.util.Iterator;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

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