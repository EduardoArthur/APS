import java.util.ArrayList;
import java.util.List;

public class DitaData {
    private List<Prescription> prescriptions;
    private List<Consumo> consumo;

    public DitaData() {
        this.prescriptions = new ArrayList<>();
        this.consumo = new ArrayList<>();
    }

    public List<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(List<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }

    public List<Consumo> getConsumo() {
        return consumo;
    }

    public void setConsumo(List<Consumo> consumo) {
        this.consumo = consumo;
    }

    public void addConsumo(Consumo consumo){
        this.consumo.add(consumo);
    }

    @Override
    public String toString() {
        return "DitaData{" +
                "prescriptions=" + prescriptions +
                '}';
    }
}
