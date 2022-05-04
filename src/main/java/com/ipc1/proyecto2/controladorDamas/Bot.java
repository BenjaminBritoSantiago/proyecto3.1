package com.ipc1.proyecto2.controladorDamas;

public class Bot {

    private Ficha[] fichas = new Ficha[12];
    private Cuadricula[] cuadros = new Cuadricula[32];
    private boolean arriba;
    private boolean derecha;
    private int idfichaMover;

    private boolean norOe;
    private boolean norEs;
    private boolean SurOe;
    private boolean SurEs;


    public Bot() {
    }

    public boolean fichaFilaPar(int i) {

        if ((fichas[i].getIdCuadroActual() >= 0 && fichas[i].getIdCuadroActual() < 4) ||
                (fichas[i].getIdCuadroActual() >= 8 && fichas[i].getIdCuadroActual() < 12) ||
                (fichas[i].getIdCuadroActual() >= 16 && fichas[i].getIdCuadroActual() < 20) ||
                (fichas[i].getIdCuadroActual() >= 24 && fichas[i].getIdCuadroActual() < 28)) {
            return true;
        }
        return false;

    }

    public void MejorMovimiento() {

    }

    public void analizarMovimiento() {
        int PesoMovimiento = 0;

        for (int i = 11; i >= 0; i--) {

            if (fichas[i].getDisponible()) {

                if (fichaFilaPar(i)) {

                    // ANALISIS HACIA ABAJO /IZQUIERDA
                    if ( hayCuadroNorOeste( fichas[i].getIdCuadroActual()) ) {
                        
                    }









                    if (cuadros[fichas[i].getIdCuadroActual() + 4].getOcupado() ||
                            !cuadros[fichas[i].getIdCuadroActual() + 7].getOcupado()) {
                        if (cuadros[fichas[i].getIdCuadroActual() + 4].getTipoOcupa12() != 2) {
                            if (PesoMovimiento < 2) {
                                PesoMovimiento = 2;
                                idfichaMover = i;

                            }

                        }
                    }

                    // ANALISIS HACIA ABAJO/DERECHA

                    // ANALISIS HACIA ARRIBA/IZQUIERDA

                    // ANALISIS HACIA ARRIBA/DERECHA

                } else {

                }
            }
        }

    }

    public void moverSurOe(Ficha ficha) {

        if (hayCuadroSurOeste(ficha.getIdCuadroActual()) ) {

            if (!cuadros[ficha.getIdCuadroActual()+4].getOcupado()) {
                SurOe= true;
            }
        }
        SurOe=false; 
    }
    



    public int FilaCuadro(int idCuadro) {

        if (idCuadro >= 0 && idCuadro < 4) {
            return 0;
        }
        if (idCuadro >= 4 && idCuadro < 8) {
            return 1;
        }
        if (idCuadro >= 8 && idCuadro < 12) {
            return 2;
        }
        if (idCuadro >= 12 && idCuadro < 16) {
            return 3;
        }
        if (idCuadro >= 16 && idCuadro < 20) {
            return 4;
        }
        if (idCuadro >= 20 && idCuadro < 24) {
            return 5;
        }
        if (idCuadro >= 24 && idCuadro < 28) {
            return 6;
        }
        if (idCuadro >= 28 && idCuadro < 32) {
            return 7;
        }
        return 0;
    }

      // Abajo Izquierda
      public boolean hayCuadroSurOeste(int idCuadro) {
        if ((idCuadro >= 28 && idCuadro < 32) || idCuadro == 4 || idCuadro == 12 || idCuadro == 20) {
            return false;
        }
        return true;
    }

    // Abajo Derecha
    public boolean hayCuadroSurEste(int idCuadro) {
        if ((idCuadro >= 27 && idCuadro < 32) || idCuadro == 3 || idCuadro == 11 || idCuadro == 19) {
            return false;
        }
        return true;
    }


    // arriba Izquierda
    public boolean hayCuadroNorOeste(int idCuadro) {
        if ((idCuadro >= 0 && idCuadro < 5) || idCuadro == 12 || idCuadro == 20 || idCuadro == 28) {
            return false;
        }
        return true;
    }

    // arriba Derecha
    public boolean hayCuadroNorEste(int idCuadro) {
        if ((idCuadro >= 0 && idCuadro < 4) || idCuadro == 11 || idCuadro == 19 || idCuadro == 27) {
            return false;
        }
        return true;
    }

  
}
