package tugasp3;

public class DemoKonversiSuhu {
    public static void main(String[] args) {
        // TODO code application logic here
        
        KonversiSuhu2 konversi = new KonversiSuhu2();
        
        double celsius = 25;
        double fahrenheit = konversi.celciusToFahrenheit(celsius);
        double reamur = konversi.celciusToReamur(celsius);
        double reamurFromFahrenheit = konversi.fahrenheitToReamur(fahrenheit);
        
        System.out.println(celsius + "C to Fahrenheit: " + fahrenheit + "F");
        System.out.println(celsius + "C to Reamur: " + reamur + "R");
        System.out.println(fahrenheit + "F to Reamur: " + reamurFromFahrenheit + "R");
    }
    
}
