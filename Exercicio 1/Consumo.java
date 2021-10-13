public class Consumo {
    private String timestamp;
    private Dieta food;

    public Consumo(String timestamp, Dieta food) {
        this.timestamp = timestamp;
        this.food = food;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Dieta getFood() {
        return food;
    }

    public void setFood(Dieta food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Consumo{" +
                "timestamp='" + timestamp + '\'' +
                ", food=" + food +
                '}';
    }
}
