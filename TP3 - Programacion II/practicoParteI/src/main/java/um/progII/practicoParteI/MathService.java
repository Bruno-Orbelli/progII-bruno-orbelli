package um.progII.practicoParteI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MathService {

    @Autowired
    private Config mathConfig;

    public double pow(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double pow(double base) {
        return Math.pow(base, mathConfig.getDefExp());
    }

    public double root(double base, double index) {
        return Math.pow(base, 1 / index);
    }

    public double root(double base) {
        return Math.pow(base, 1 / mathConfig.getDefIndex());
    }
}
