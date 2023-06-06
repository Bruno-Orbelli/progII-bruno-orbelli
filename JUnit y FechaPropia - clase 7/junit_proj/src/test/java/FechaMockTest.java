import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class FechaMockTest {
    FechaPropia fecha1;
    FechaPropia fecha2;
    FechaPropia fecha3;
    FechaPropia fecha4;
    FechaPropia fecha5;
    FechaPropia fecha6;

    @Before
    public void inicializar() {
        this.fecha1 = new FechaPropia("2019-01-01");
        this.fecha2 = new FechaPropia("2019-02-27");
        this.fecha3 = new FechaPropia("2019-02-28");
        this.fecha4 = new FechaPropia("2019-03-01");
        this.fecha5 = new FechaPropia("2020-02-29");
    }

    @Test
    public void mockTest1fecha1() {
        FechaPropiaMockService mockService = mock(FechaPropiaMockService.class);
        when(mockService.sumarDias(this.fecha1,180)).thenReturn("2019-06-30");
        assertEquals("2019-06-30", mockService.sumarDias(this.fecha1,180));
        verify(mockService).sumarDias(this.fecha1,180);
    }

    @Test
    public void mockTest1fecha2() {
        FechaPropiaMockService mockService = mock(FechaPropiaMockService.class);
        when(mockService.sumarDias(this.fecha2,1)).thenReturn("2019-02-28");
        assertEquals("2019-02-28", mockService.sumarDias(this.fecha2,1));
        verify(mockService).sumarDias(this.fecha2,1);
    }

    @Test
    public void mockTest1fecha3() {
        FechaPropiaMockService mockService = mock(FechaPropiaMockService.class);
        when(mockService.sumarDias(this.fecha3,1)).thenReturn("2019-03-01");
        assertEquals("2019-03-01", mockService.sumarDias(this.fecha3,1));
        verify(mockService).sumarDias(this.fecha3,1);
    }

    @Test
    public void mockTest1fecha4() {
        FechaPropiaMockService mockService = mock(FechaPropiaMockService.class);
        when(mockService.sumarDias(this.fecha4,1)).thenReturn("2019-03-02");
        assertEquals("2019-03-02", mockService.sumarDias(this.fecha4,1));
        verify(mockService).sumarDias(this.fecha4,1);
    }

    @Test
    public void mockTest2fecha4() {
        FechaPropiaMockService mockService = mock(FechaPropiaMockService.class);
        when(mockService.sumarDias(this.fecha4,15)).thenReturn("2019-03-16");
        assertEquals("2019-03-16", mockService.sumarDias(this.fecha4,15));
        verify(mockService).sumarDias(this.fecha4,15);
    }

    @Test
    public void mockTest1fecha5() {
        FechaPropiaMockService mockService = mock(FechaPropiaMockService.class);
        when(mockService.restarDias(this.fecha5,1)).thenReturn("2020-02-28");
        assertEquals("2020-02-28", mockService.restarDias(this.fecha5,1));
        verify(mockService).restarDias(this.fecha5,1);
    }

    @Test
    public void mockTest3fecha4() {
        FechaPropiaMockService mockService = mock(FechaPropiaMockService.class);
        when(mockService.restarDias(this.fecha4,1)).thenReturn("2020-02-29");
        assertEquals("2020-02-29", mockService.restarDias(this.fecha4,1));
        verify(mockService).restarDias(this.fecha4,1);
    }

    @Test
    public void mockTest4fecha4() {
        FechaPropiaMockService mockService = mock(FechaPropiaMockService.class);
        when(mockService.restarDias(this.fecha4,15)).thenReturn("2020-02-15");
        assertEquals("2020-02-15", mockService.restarDias(this.fecha4,15));
        verify(mockService).restarDias(this.fecha4,15);
    }

    @Test
    public void mockTest5fecha4() {
        FechaPropiaMockService mockService = mock(FechaPropiaMockService.class);
        when(mockService.restarDias(this.fecha4,40)).thenReturn("2020-01-21");
        assertEquals("2020-01-21", mockService.restarDias(this.fecha4,40));
        verify(mockService).restarDias(this.fecha4,40);
    }
}
