
record Radiator(String name,int power, String color,
                String producer, double axis_len, int ratting) {

    public Radiator(String name,int power, String color,
                    String producer) {
        this(name, power, color, producer, 0.0, 0);
    }

    public Radiator(){
        this("huh", 56, "gay", "gay");
    }

    public static final String RADIATOR_NAME = "uu-122";

    public static String radiatoring(){
        return RADIATOR_NAME;
    }

    @Override
    public String toString(){
        return "introducing:"+ this.name+ " power:"+ this.power+
                " color:"+ this.color+" producer:"+ this.producer+
                "axis length:"+ this.axis_len+ " ratting:"+ this.ratting;
    }
}
