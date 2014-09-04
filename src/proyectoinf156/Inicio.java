package proyectoinf156;
import com.nilo.plaf.nimrod.NimRODLookAndFeel;
import com.nilo.plaf.nimrod.NimRODTheme;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
/**
 *
 * @author RuCo
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">        
        try {
            //UIManager.setLookAndFeel(new com.nilo.plaf.nimrod.NimRODLookAndFeel());
            NimRODTheme nt = new NimRODTheme();
            //Selection
            nt.setPrimary(Color.DARK_GRAY);
            nt.setPrimary1(new Color(15, 80, 134));
            nt.setPrimary2(new Color(26, 32, 76));
            nt.setPrimary3( new Color(10,30,20));
            //Background
            nt.setSecondary(Color.DARK_GRAY);
            nt.setSecondary1(Color.lightGray);
            nt.setSecondary2(Color.LIGHT_GRAY);
            nt.setSecondary3(Color.gray);
            
            nt.setMenuOpacity(50);
            //Black and White
            nt.setBlack(Color.WHITE);
            nt.setWhite(Color.DARK_GRAY);
            Font fuente= new Font("Verdara", 1, 12);
            nt.setFont(fuente);
            NimRODLookAndFeel NimRODLF = new NimRODLookAndFeel();
            NimRODLookAndFeel.setCurrentTheme(nt);
            UIManager.setLookAndFeel( NimRODLF);
        } catch (Exception e){
            e.printStackTrace();
        }
        //</editor-fold>
        VentanaSplash vs= new VentanaSplash();
        vs.show();
    }
}
