package proyectoinf156;

import javax.swing.JProgressBar;

/**
 *
 * @author RuCo
 */
public class HiloProgreso extends Thread{
    JProgressBar progreso;

    public HiloProgreso(JProgressBar progreso1)
    {        
        super();
        this.progreso=progreso1;
    }
    @Override
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            progreso.setValue(i);
            pausa(100);
        }
    }
    public void pausa(int mlSeg)
    {
        try
        {   // pausa para el splash
            Thread.sleep(mlSeg);
        }catch(Exception e){}
    }
}
