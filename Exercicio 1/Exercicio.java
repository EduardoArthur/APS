import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Exercicio{

    public static String userName = "";
    public static String senha = "";
    public static int min = 60;
    public static int hora = min * 60;
    public static int intervalo = 5 * hora;

    public static String getDataAtual() {
        SimpleDateFormat isoFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        isoFormat.setTimeZone(TimeZone.getTimeZone("America/Sao_Paulo"));
        Date data = new Date();
        return isoFormat.format(data);
    }

    public static long getDataInmilies(String horario) throws ParseException {
        SimpleDateFormat isoFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        isoFormat.setTimeZone(TimeZone.getTimeZone("America/Sao_Paulo"));
        return isoFormat.parse(horario).getTime();

    }

    public static void main(String[] args) throws ParseException, InterruptedException {
        // cadastrando novo usuario
        Usuario user = new Usuario("Silas Salviano","senha123","etc...");
        DitaData data = new DitaData();
        List<Dieta> dietas = new ArrayList<>();
        List<Prescription> prescriptions = new ArrayList<>();

        // lendo usuario e senha e atribuindo a uma variavel
        userName = "Silas Salviano";
        senha = "senha123";

        // simulando uma validacao para login
        if (userName.equals(user.getNome()) && senha.equals(user.getSenha())){

            // inserindo informacoes
            Dieta dieta = new Dieta("Queijo","Minas","TrenzimBao","fatias",2);
            dietas.add(dieta);
            Medico medico = new Medico("Dr. Resmin Salgado","endocrino,crn,etc...");

            Prescription prescription = new Prescription(getDataAtual(),"a cada hora",dietas,medico);
            prescriptions.add(prescription);

            data.setPrescriptions(prescriptions);

            //informa novo consumo
            Consumo consumo = new Consumo(getDataAtual(),dieta);

            data.addConsumo(consumo);
            data.addConsumo(consumo);

            user.setDita_data(data);

        }

        TimeUnit.SECONDS.sleep(5);

        // verifica se existe Dita_data
        if (user.getDita_data() != null){

            boolean horaDoRango = true;
            long horaAtual = getDataInmilies(getDataAtual());

            // verifica todos os consumos do usuario, se algum deles possuir um intervalo menor que o definido pelo sistema
            // significa que ele ainda está dentro do horario e não precisa ser notificado
            for (Consumo c : data.getConsumo()){

                // converte o intervalo de milisegundo para segundos
                long intervaloDetectado = (horaAtual - getDataInmilies(c.getTimestamp()))/1000;
                System.out.println("Um intervalo de " + intervaloDetectado + " segundos foi detectado");

                if ( intervaloDetectado < intervalo ){
                    horaDoRango = false;
                }
            }
            // caso todos os intervalos sejam maiores que o estabelecido ele sera notificado pelo sistema
            if (horaDoRango){
                System.out.println("notify user");
            }else {
                System.out.println("o paciente ainda esta dentro do horario estabelecido pela dieta");
            }
        }

        // Adiciona o consumo do almoco
        String dataHoje = "2021-10-10 13:01:00";

        data.addConsumo(new Consumo(dataHoje,new Dieta("Arroz","Branco","","colher",4)));
        data.addConsumo(new Consumo(dataHoje,new Dieta("Feijao","","","colher",4)));
        data.addConsumo(new Consumo(dataHoje,new Dieta("Carne","Bovino","","Bife",1)));
        data.addConsumo(new Consumo(dataHoje,new Dieta("Tomate","","","fatia",4)));
        data.addConsumo(new Consumo(dataHoje,new Dieta("Cenoura","","","colher",3)));

        System.out.println("sistema encerrado");

    }
}