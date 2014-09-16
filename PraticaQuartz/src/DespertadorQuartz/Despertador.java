/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DespertadorQuartz;

import ScheduleQuartz.TarefaDespertador;
import ScheduleQuartz.TriggerDespertador;
import java.util.Date;

/**
 *
 * @author 3db
 */
public class Despertador implements Runnable {

    private int chamadaMetodo;

    public void setCallBack() {
        System.out.println("Chamou setCallBack(): " + new Date());
    }

    public void despertar() {
        System.out.println("Chamou despertar(): " + new Date());
    }

    public void remover() {
        System.out.println("Chamou remove(): " + new Date());
    }

    @Override
    public void run() {
        if (this.chamadaMetodo == VariaveisFinaisEstaticas.ESCOLHE_METODO_SETCALLBACK) {
            TarefaDespertador.escolheMetodo = VariaveisFinaisEstaticas.ESCOLHE_METODO_SETCALLBACK;
            TriggerDespertador trigger = new TriggerDespertador();
            trigger.agendamentoDespertador();
           
        } else if (this.chamadaMetodo == VariaveisFinaisEstaticas.ESCOLHE_METODO_DESPERTAR) {
            TarefaDespertador.escolheMetodo = VariaveisFinaisEstaticas.ESCOLHE_METODO_DESPERTAR;
            TriggerDespertador trigger = new TriggerDespertador();
            trigger.agendamentoDespertador();
           
        } else if (this.chamadaMetodo == VariaveisFinaisEstaticas.ESCOLHE_METODO_REMOVER) {
            TarefaDespertador.escolheMetodo = VariaveisFinaisEstaticas.ESCOLHE_METODO_REMOVER;
            TriggerDespertador trigger = new TriggerDespertador();
            trigger.agendamentoDespertador();
           
        }
    }

    public int getChamadaMetodo() {
        return chamadaMetodo;
    }

    public void setChamadaMetodo(int chamadaMetodo) {
        this.chamadaMetodo = chamadaMetodo;
    }
}
