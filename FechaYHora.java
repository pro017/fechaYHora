
/**
 * Write a description of class CalendarioBasico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FechaYHora
{
    // instance variables - replace the example below with your own
    private DisplayDosCaracteres ano;
    private DisplayDosCaracteres mes;
    private DisplayDosCaracteres dia;
    private NumberDisplay hora;
    private NumberDisplay min;

    /**
     * Constructor for objects of class CalendarioBasico
     */
    public FechaYHora()
    {
        // initialise instance variables
        ano = new  DisplayDosCaracteres(100);
        mes = new  DisplayDosCaracteres(13);
        dia = new  DisplayDosCaracteres(31);
        hora = new NumberDisplay(24);
        min = new NumberDisplay(60);
    }

    /**
     * Fija fecha introducida
     */
    public void fijarFechaYHora(int nDia , int nMes , int nAno , int nHora , int nMin)
    {
        dia.setValorAlmacenado(nDia);
        mes.setValorAlmacenado(nMes);
        ano.setValorAlmacenado(nAno);
        hora.setValue(nHora);
        min.setValue(nMin);
    }

    /**
     * muestra fecha por pantalla
     */
    public String getFechaYHora()
    {        
        String fechaYHora = dia.getTextoDelDisplay() + "-" + mes.getTextoDelDisplay() + "-" + ano.getTextoDelDisplay() +" " + hora.getDisplayValue() + ":" + min.getDisplayValue();
        return fechaYHora;
    }

    /**
     * Avanza la fecha en un dia
     */
    public void avanzarFechaYHora()
    {
        {   min.increment();
            if(min.getValue()==0){
                hora.increment();
                if(hora.getValue()==0){
                    dia.incrementaValorAlmacenado();
                    if (dia.getValorAlmacenado() == 1){
                        mes.incrementaValorAlmacenado();
                        if (mes.getValorAlmacenado() == 1){
                            ano.incrementaValorAlmacenado();
                        }
                    }

                }
            }
        }}
}