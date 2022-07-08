package data;

public class Place {
    private String label;
    private double la;
    private double lo;
    private String type;

    public Place(String label, double la, double lo, String type) {
        this.label = label;
        this.la = la;
        this.lo = lo;
        this.type = type;
    }

    public String getLabel() {
        return label;
    }

    public double getLa() {
        return la;
    }

    public double getLo() {
        return lo;
    }

    public String getType() {
        return type;
    }

    

    
}
