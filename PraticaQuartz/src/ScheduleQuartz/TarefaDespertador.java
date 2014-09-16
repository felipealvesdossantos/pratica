package ScheduleQuartz;

import DespertadorQuartz.Despertador;
import DespertadorQuartz.VariaveisFinaisEstaticas;
import java.util.Date;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class TarefaDespertador implements Job {
  
    public static int escolheMetodo;
    private Despertador despertador = new Despertador();

    public void execute(JobExecutionContext context) throws JobExecutionException {
        //Aqui executamos nossa tarefa
        if (escolheMetodo == VariaveisFinaisEstaticas.ESCOLHE_METODO_SETCALLBACK) {
            despertador.setCallBack();
            //System.out.println("Executando tarefa setCallBack: " + new Date());
        } else if (escolheMetodo == VariaveisFinaisEstaticas.ESCOLHE_METODO_DESPERTAR) {
            despertador.despertar();
            //System.out.println("Executando tarefa Remove: " + new Date());
        } else if (escolheMetodo == VariaveisFinaisEstaticas.ESCOLHE_METODO_REMOVER) {
            despertador.remover();
            //System.out.println("Executando tarefa Despertar: " + new Date());
        }
    }
}
