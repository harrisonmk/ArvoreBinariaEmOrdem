package arvorebinariaemordem;

/**
 *
 * @author Harrison
 */
public class No {

    private No esq;
    private No dir;
    int chave;

    No(int chave) {
        this.chave = chave;
        esq = null;
        dir = null;

    }

    public No() {

    }

    public int getChave() {

        return chave;
    }

    public No getEsq() {
        return esq;
    }

    public void setEsq(No no) {
        this.esq = no;
    }

    public No getDir() {
        return dir;
    }

    public void setDir(No no) {
        this.dir = no;
    }

}
