/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khmit
 */
class Data {
    private int posotita;
    private double timi;
    private String eidos,sxolio;
    
public Data(int posotita,double timi,String eidos,String sxolio){
    this.posotita=posotita;
    this.timi=timi;
    this.eidos=eidos;
    this.sxolio=sxolio;
}
public int getposotita(){
    return posotita;
}
public double gettimi(){
    return timi;
}
public String geteidos(){
    return eidos;
}
public String getsxolio(){
    return sxolio;
}

}
