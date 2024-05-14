
/*
* Vamos criar um exemplo de uma classe para representar uma SmartTV, onde:
* - Ela tenha as características: ligada(boolean), canal (int) e volume (int)
* - Nossa TV poderá ligar e desligar e assim mudar o estado.
* - Nossa TV aumentará e diminuirá o volume sempre em +1  ou -1
* - Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente.
* */
public class SmartTv {

    boolean ligada = false;
    int canal = 0;
    int volume = 0;

    public void ligar(){
        if(!this.ligada){
            this.ligada = true;
        }
    }

    public void desligar(){
        if(this.ligada){
            this.ligada = false;
        }
    }

    public void aumentarVolume(){
        if(volume<30){
            this.volume++;
        }
    }

    public void diminuirVolume(){
        if(volume>0){
            this.volume--;
        }
    }

    public void mudarCanalMaior(){
        if(this.canal<=100){
            this.canal++;
        }
    }

    public void mudarCanalMenor(){
        if(this.canal>=0){
            this.canal--;
        }
    }

    public void mudarCanalEspecifico(int canal){
        this.canal = canal;
    }

    @Override
    public String toString() {
        return "SmartTv{" +
                "ligada=" + ligada +
                ", canal=" + canal +
                ", volume=" + volume +
                '}';
    }
}
