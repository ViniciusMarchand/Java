package JavaPOOaula14;

public class Visualizacao {
    private Inscrito espectador;
    private Video videoYT;

    public Visualizacao(){
        this.videoYT.setViews(this.videoYT.getViews()+1);
    }

    public Inscrito getEspectador() {
        return espectador;
    }
    public void setEspectador(Inscrito espectador) {
        this.espectador = espectador;
    }
    public Video getVideoYT() {
        return videoYT;
    }
    public void setVideoYT(Video videoYT) {
        this.videoYT = videoYT;
    }
    

}
