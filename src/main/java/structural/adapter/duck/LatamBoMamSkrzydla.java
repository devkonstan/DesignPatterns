package structural.adapter.duck;

public class LatamBoMamSkrzydla  implements LatanieInterfejs{ //obiekt bedacy de facto metoda
    @Override
    public void lec() { //prawdziwa kaczka
        System.out.println("latam sobie");
    }
}
