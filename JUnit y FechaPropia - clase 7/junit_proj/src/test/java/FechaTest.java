import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert.*;

public class FechaTest {
    FechaPropia fecha1;
    FechaPropia fecha2;
    FechaPropia fecha3;
    FechaPropia fecha4;
    FechaPropia fecha5;
    FechaPropia fecha6;
    FechaPropia fecha7;
    FechaPropia fecha8;
    FechaPropia fecha9;
    FechaPropia fecha10;

    @Before
    public void inicializar() {
        this.fecha1 = new FechaPropia("2019-01-01");
        this.fecha2 = new FechaPropia("2019-02-27");
        this.fecha3 = new FechaPropia("2019-02-28");
        this.fecha4 = new FechaPropia("2019-03-01");
        this.fecha5 = new FechaPropia("2020-01-01");
        this.fecha6 = new FechaPropia("2020-02-27");
        this.fecha7 = new FechaPropia("2020-02-28");
        this.fecha8 = new FechaPropia("2020-02-29");
        this.fecha9 = new FechaPropia("2020-03-01");
        this.fecha10 = new FechaPropia("2020-12-15");
    }

    @Test
    public void test1SumarFecha1() {
        this.fecha1.sumarDias(1);
        Assert.assertEquals("2019-01-02", fecha1.toString());
    }

    @Test
    public void test2SumarFecha1() {
        this.fecha1.sumarDias(15);
        Assert.assertEquals("2019-01-16", fecha1.toString());
    }

    @Test
    public void test3SumarFecha1() {
        this.fecha1.sumarDias(40);
        Assert.assertEquals("2019-02-10", fecha1.toString());
    }

    @Test
    public void test4SumarFecha1() {
        this.fecha1.sumarDias(80);
        Assert.assertEquals("2019-03-22", fecha1.toString());
    }

    @Test
    public void test5SumarFecha1() {
        this.fecha1.sumarDias(180);
        Assert.assertEquals("2019-06-30", fecha1.toString());
    }

    @Test
    public void test1SumarFecha2() {
        this.fecha2.sumarDias(1);
        Assert.assertEquals("2019-02-28", fecha2.toString());
    }

    @Test
    public void test1SumarFecha3() {
        this.fecha3.sumarDias(1);
        Assert.assertEquals("2019-03-01", fecha3.toString());
    }

    @Test
    public void test1SumarFecha4() {
        this.fecha4.sumarDias(1);
        Assert.assertEquals("2019-03-02", fecha4.toString());
    }

    @Test
    public void test2SumarFecha4() {
        this.fecha4.sumarDias(15);
        Assert.assertEquals("2019-03-16", fecha4.toString());
    }

    @Test
    public void test3SumarFecha4() {
        this.fecha4.sumarDias(40);
        Assert.assertEquals("2019-04-10", fecha4.toString());
    }

    @Test
    public void test4SumarFecha4() {
        this.fecha4.sumarDias(80);
        Assert.assertEquals("2019-05-20", fecha4.toString());
    }

    @Test
    public void test5SumarFecha4() {
        this.fecha4.sumarDias(180);
        Assert.assertEquals("2019-08-28", fecha4.toString());
    }

    @Test
    public void test1SumarFecha5() {
        this.fecha5.sumarDias(1);
        Assert.assertEquals("2020-01-02", fecha5.toString());
    }

    @Test
    public void test2SumarFecha5() {
        this.fecha5.sumarDias(15);
        Assert.assertEquals("2020-01-16", fecha5.toString());
    }

    @Test
    public void test3SumarFecha5() {
        this.fecha5.sumarDias(40);
        Assert.assertEquals("2020-02-10", fecha5.toString());
    }

    @Test
    public void test4SumarFecha5() {
        this.fecha5.sumarDias(80);
        Assert.assertEquals("2020-03-21", fecha5.toString());
    }

    @Test
    public void test5SumarFecha5() {
        this.fecha5.sumarDias(180);
        Assert.assertEquals("2020-06-29", fecha5.toString());
    }

    @Test
    public void test1SumarFecha6() {
        this.fecha6.sumarDias(1);
        Assert.assertEquals("2020-02-28", fecha6.toString());
    }

    @Test
    public void test1SumarFecha7() {
        this.fecha7.sumarDias(1);
        Assert.assertEquals("2020-02-29", fecha7.toString());
    }

    @Test
    public void test1SumarFecha8() {
        this.fecha8.sumarDias(1);
        Assert.assertEquals("2020-03-01", fecha8.toString());
    }

    @Test
    public void test1SumarFecha9() {
        this.fecha9.sumarDias(1);
        Assert.assertEquals("2020-03-02", fecha9.toString());
    }

    @Test
    public void test2SumarFecha9() {
        this.fecha9.sumarDias(15);
        Assert.assertEquals("2020-03-16", fecha9.toString());
    }

    @Test
    public void test3SumarFecha9() {
        this.fecha9.sumarDias(40);
        Assert.assertEquals("2020-04-10", fecha9.toString());
    }

    @Test
    public void test4SumarFecha9() {
        this.fecha9.sumarDias(80);
        Assert.assertEquals("2020-05-20", fecha9.toString());
    }

    @Test
    public void test5SumarFecha9() {
        this.fecha9.sumarDias(180);
        Assert.assertEquals("2020-08-28", fecha9.toString());
    }

    @Test
    public void test1SumarFecha10() {
        this.fecha10.sumarDias(1);
        Assert.assertEquals("2020-12-16", fecha10.toString());
    }

    @Test
    public void test2SumarFecha10() {
        this.fecha10.sumarDias(15);
        Assert.assertEquals("2020-12-30", fecha10.toString());
    }

    @Test
    public void test3SumarFecha10() {
        this.fecha10.sumarDias(40);
        Assert.assertEquals("2021-01-24", fecha10.toString());
    }

    @Test
    public void test4SumarFecha10() {
        this.fecha10.sumarDias(80);
        Assert.assertEquals("2021-03-05", fecha10.toString());
    }

    @Test
    public void test5SumarFecha10() {
        this.fecha10.sumarDias(180);
        Assert.assertEquals("2021-06-13", fecha10.toString());
    }

    @Test
    public void test1RestarFecha1() {
        this.fecha1.restarDias(1);
        Assert.assertEquals("2018-12-31", fecha1.toString());
    }

    @Test
    public void test2RestarFecha1() {
        this.fecha1.restarDias(15);
        Assert.assertEquals("2018-12-17", fecha1.toString());
    }

    @Test
    public void test3RestarFecha1() {
        this.fecha1.restarDias(40);
        Assert.assertEquals("2018-11-22", fecha1.toString());
    }

    @Test
    public void test4RestarFecha1() {
        this.fecha1.restarDias(80);
        Assert.assertEquals("2018-10-13", fecha1.toString());
    }

    @Test
    public void test5RestarFecha1() {
        this.fecha1.restarDias(180);
        Assert.assertEquals("2018-07-05", fecha1.toString());
    }

    @Test
    public void test1SRestarFecha2() {
        this.fecha2.restarDias(1);
        Assert.assertEquals("2019-02-26", fecha2.toString());
    }

    @Test
    public void test1RestarFecha3() {
        this.fecha3.restarDias(1);
        Assert.assertEquals("2019-02-27", fecha2.toString());
    }

    @Test
    public void test1RestarFecha8() {
        this.fecha8.restarDias(1);
        Assert.assertEquals("2020-02-28", fecha8.toString());
    }

    @Test
    public void test1RestarFecha9() {
        this.fecha9.restarDias(1);
        Assert.assertEquals("2020-02-29", fecha9.toString());
    }

    @Test
    public void test2RestarFecha9() {
        this.fecha9.restarDias(15);
        Assert.assertEquals("2020-02-15", fecha9.toString());
    }

    @Test
    public void test3RestarFecha9() {
        this.fecha9.restarDias(40);
        Assert.assertEquals("2020-01-21", fecha9.toString());
    }

    @Test
    public void test4RestarFecha9() {
        this.fecha9.restarDias(80);
        Assert.assertEquals("2019-12-12", fecha9.toString());
    }

    @Test
    public void test5RestarFecha9() {
        this.fecha9.restarDias(180);
        Assert.assertEquals("2019-09-03", fecha9.toString());
    }

    @Test
    public void test1RestarFecha10() {
        this.fecha10.restarDias(1);
        Assert.assertEquals("2020-12-14", fecha10.toString());
    }

    @Test
    public void test2RestarFecha10() {
        this.fecha10.restarDias(15);
        Assert.assertEquals("2020-11-30", fecha10.toString());
    }

    @Test
    public void test3RestarFecha10() {
        this.fecha10.restarDias(40);
        Assert.assertEquals("2020-11-05", fecha10.toString());
    }

    @Test
    public void test4RestarFecha10() {
        this.fecha10.restarDias(80);
        Assert.assertEquals("2020-09-26", fecha10.toString());
    }

    @Test
    public void test5RestarFecha10() {
        this.fecha10.restarDias(180);
        Assert.assertEquals("2020-06-18", fecha10.toString());
    }
}
