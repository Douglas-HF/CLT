package Inimigos;

public abstract class Inimigo {
    private String tipo;
    private int vidaInimigo, manaInimigo, xp, level;
    private int forca, destreza, inteligencia, sabedoria;

    public Inimigo(String tipo, int vidaInimigo, int manaInimigo, int xp, int level) {
        this.tipo = tipo;
        this.vidaInimigo = vidaInimigo;
        this.manaInimigo = manaInimigo;
        this.xp = xp;
        this.level = level;
        this.forca = 1;
        this.destreza = 1;
        this.inteligencia = 1;
        this.sabedoria = 1;
    }

    public String getTipo() {
        return tipo;
    }

    public int getVidaInimigo() {
        return vidaInimigo;
    }

    public int getManaInimigo() {
        return manaInimigo;
    }

    public int getXp() {
        return xp;
    }

    public int getLevel() {
        return level;
    }

    public int getForca() {
        return forca;
    }

    public int getDestreza() {
        return destreza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getSabedoria() {
        return sabedoria;
    }

    public void setVidaInimigo(int vidaInimigo) {
        if (vidaInimigo >= 0) {
            this.vidaInimigo = vidaInimigo;
        }
    }

    public void setManaInimigo(int manaInimigo) {
        if (manaInimigo >= 0) {
            this.manaInimigo = manaInimigo;
        }
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public void setSabedoria(int sabedoria) {
        this.sabedoria = sabedoria;
    }

    public void levelUp() {
        setLevel(getLevel() + 1);
        setForca(getForca() + 1);
        setDestreza(getDestreza() + 1);
        setInteligencia(getInteligencia() + 1);
        setSabedoria(getSabedoria() + 1);
    }

    public abstract String getClasse();
}
