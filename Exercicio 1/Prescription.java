import java.util.List;

public class Prescription {
    private String timestamp;
    private String meal;
    private List<Dieta> foods;
    private Medico medico;

    public Prescription(String timestamp, String meal, List<Dieta> foods, Medico medico) {
        this.timestamp = timestamp;
        this.meal = meal;
        this.foods = foods;
        this.medico = medico;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public List<Dieta> getFoods() {
        return foods;
    }

    public void setFoods(List<Dieta> foods) {
        this.foods = foods;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    @Override
    public String toString() {
        return "Prescription{" +
                "timestamp='" + timestamp + '\'' +
                ", meal='" + meal + '\'' +
                ", foods=" + foods +
                '}';
    }
}
