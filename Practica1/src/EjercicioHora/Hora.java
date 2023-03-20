/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioHora;

/**
 *
 * @author usuario
 */
public class Hora {
    int horas,minutos,segundos;
    public Hora(int horas, int minutos,int segundos){
        this.horas=horas;
        this.minutos=minutos;
        this.segundos=segundos;
        if (this.segundos>59) {
            this.segundos%=60;
            this.minutos+=(this.segundos/60);
        }
        if (this.minutos>59) {
            this.minutos%=60;
            this.horas+=(this.minutos/60);
        }
    }
    public Hora(int horas, int minutos){
          if (this.minutos>59) {
            this.minutos%=60;
            this.horas+=(this.minutos/60);
        }
    }
    public Hora(int horas){
        this.horas=horas;
    }
    public void cambiarHora(int horas, int minutos, int segundos){
        this.horas=horas;
        this.minutos=minutos;
        this.segundos=segundos;
        if (this.segundos>59) {
            this.segundos%=60;
            this.minutos+=(this.segundos/60);
        }
        if (this.minutos>59) {
            this.minutos%=60;
            this.horas+=(this.minutos/60);
        }
    }
    public String toString(){
        String res="";
        res+="La hora actual es " + this.horas + " : " + this.minutos + " : " + this.segundos;
        
        return res;
    }
   
}
