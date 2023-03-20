package ej76;

public class Urna {

    private int bolasBlancas, bolasNegras;

    public Urna(int nBBlancas, int nBNegras) {
        this.bolasBlancas = nBBlancas;
        this.bolasNegras = nBNegras;
    }

    public int comprobarBolas() {
        return this.bolasBlancas + this.bolasNegras;
    }

    public char extrarBola() {
        char color;
        int ale = (int) (Math.random() * this.comprobarBolas() + 1);
        if (ale <= bolasBlancas) {
            if (this.bolasBlancas <= 0) {
                this.bolasNegras--;
                color = 'N';
            } else {
                color = 'B';
                this.bolasBlancas--;
            }
        } else {
            if (this.bolasNegras <= 0) {
                this.bolasBlancas--;
                color = 'B';
            } else {
                color = 'N';
                this.bolasNegras--;
            }
        }
        return color;
    }

    public void introducir(char color) {
        if (color == 'b' || color == 'B') {
            this.bolasBlancas++;
        } else if (color == 'n' || color == 'N') {
            this.bolasNegras++;
        }
    }

    public String toString() {
        return "Quedan " + this.comprobarBolas() + " en la urna\n"
                + "Blancas:" + this.bolasBlancas + "\nNegras: "+this.bolasNegras;
               
                
    }
}
