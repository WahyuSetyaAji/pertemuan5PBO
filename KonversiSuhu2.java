package tugasp3;

public class KonversiSuhu2 extends KonversiSuhu{
	public double fahrenheitToReamur(double fahrenheit) {
        double celcius = (fahrenheit - 32) * 5/9;
        return celcius * 4/5;
    }
}
