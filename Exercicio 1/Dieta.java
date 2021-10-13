public class Dieta {

    private String name;
    private String type;
    private String brand_name;
    private String unity_of_measure;
    private int amount;

    public Dieta(String name, String type, String brand_name, String unity_of_measure, int amount) {
        this.name = name;
        this.type = type;
        this.brand_name = brand_name;
        this.unity_of_measure = unity_of_measure;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getUnity_of_measure() {
        return unity_of_measure;
    }

    public void setUnity_of_measure(String unity_of_measure) {
        this.unity_of_measure = unity_of_measure;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Dieta{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", brand_name='" + brand_name + '\'' +
                ", unity_of_measure='" + unity_of_measure + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
