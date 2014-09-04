package proyectoinf156;

/*
 * Principal.java
 *
 * Created on 08-mar-2012, 17:23:47
 */
/**
 *
 * @author RuCo
 */
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public final class Principal extends javax.swing.JFrame {
    public Principal() {
        initComponents();
        ConfiguracionVentana();
        //AWTUtilities.setWindowOpacity (this, Float.valueOf (0.75f));
        panelInterno.setBorder(new ImagenFondo());
        
    }
    public void ConfiguracionVentana(){
	this.setSize(800,600);
	this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem6 = new javax.swing.JMenuItem();
        panelInterno = new javax.swing.JDesktopPane();
        barraMenus = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        nuevo = new javax.swing.JMenuItem();
        menuArchivoCerrar = new javax.swing.JMenuItem();
        jSeparador = new javax.swing.JPopupMenu.Separator();
        menuArchivoCerrarTodo = new javax.swing.JMenuItem();
        separador1 = new javax.swing.JPopupMenu.Separator();
        menuArchivoSalir = new javax.swing.JMenuItem();
        menuMetodos = new javax.swing.JMenu();
        menuCramer = new javax.swing.JMenuItem();
        menuDoolite = new javax.swing.JMenuItem();
        menuCholesky = new javax.swing.JMenuItem();
        menuGaussSeidel = new javax.swing.JMenuItem();
        menuVentana = new javax.swing.JMenu();
        cascada = new javax.swing.JMenuItem();
        ayuda = new javax.swing.JMenu();
        about = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        ayudaCramer = new javax.swing.JMenuItem();
        ayudaDoolite = new javax.swing.JMenuItem();
        ayudaCholesky = new javax.swing.JMenuItem();
        ayudaGaussSeidel = new javax.swing.JMenuItem();

        jMenuItem6.setText("jMenuItem6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Analisis Numerico INF - 156");

        panelInterno.setBackground(new java.awt.Color(18, 17, 19));
        getContentPane().add(panelInterno, java.awt.BorderLayout.CENTER);

        menuArchivo.setBorder(null);
        menuArchivo.setText("Archivo");

        nuevo.setText("Nueva Matriz");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });
        menuArchivo.add(nuevo);

        menuArchivoCerrar.setText("Cerrar");
        menuArchivoCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArchivoCerrarActionPerformed(evt);
            }
        });
        menuArchivo.add(menuArchivoCerrar);
        menuArchivo.add(jSeparador);

        menuArchivoCerrarTodo.setText("Cerrar Todo");
        menuArchivoCerrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArchivoCerrarTodoActionPerformed(evt);
            }
        });
        menuArchivo.add(menuArchivoCerrarTodo);
        menuArchivo.add(separador1);

        menuArchivoSalir.setText("Salir");
        menuArchivoSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArchivoSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(menuArchivoSalir);

        barraMenus.add(menuArchivo);

        menuMetodos.setBorder(null);
        menuMetodos.setText("Metodos");

        menuCramer.setText("Metodo De Cramer");
        menuCramer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCramerActionPerformed(evt);
            }
        });
        menuMetodos.add(menuCramer);

        menuDoolite.setText("Metodo De Doolite");
        menuDoolite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDooliteActionPerformed(evt);
            }
        });
        menuMetodos.add(menuDoolite);

        menuCholesky.setText("Metodo De Cholesky");
        menuCholesky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCholeskyActionPerformed(evt);
            }
        });
        menuMetodos.add(menuCholesky);

        menuGaussSeidel.setText("Metodo De Gauss - Seidel");
        menuGaussSeidel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGaussSeidelActionPerformed(evt);
            }
        });
        menuMetodos.add(menuGaussSeidel);

        barraMenus.add(menuMetodos);

        menuVentana.setText("Ventana");

        cascada.setText("Cascada");
        cascada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cascadaActionPerformed(evt);
            }
        });
        menuVentana.add(cascada);

        barraMenus.add(menuVentana);

        ayuda.setText("Ayuda");

        about.setText("Acerca de");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        ayuda.add(about);
        ayuda.add(jSeparator4);

        ayudaCramer.setText("Metodo De Cramer");
        ayudaCramer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaCramerActionPerformed(evt);
            }
        });
        ayuda.add(ayudaCramer);

        ayudaDoolite.setText("Metodo De Doolite");
        ayudaDoolite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaDooliteActionPerformed(evt);
            }
        });
        ayuda.add(ayudaDoolite);

        ayudaCholesky.setText("Metodod De Cholesky");
        ayudaCholesky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaCholeskyActionPerformed(evt);
            }
        });
        ayuda.add(ayudaCholesky);

        ayudaGaussSeidel.setText("Metodo De Gauss-Seidel");
        ayudaGaussSeidel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaGaussSeidelActionPerformed(evt);
            }
        });
        ayuda.add(ayudaGaussSeidel);

        barraMenus.add(ayuda);

        setJMenuBar(barraMenus);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuArchivoCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArchivoCerrarActionPerformed
        // TODO add your handling code here:
        FrameMatriz vactiva = (FrameMatriz) panelInterno.getSelectedFrame();        
        if (vactiva!=null){
            vactiva.dispose();
        }
        else{
            About sg = (About) panelInterno.getSelectedFrame();
            if (sg!=null){
                sg.dispose();
            }            
        }
    }//GEN-LAST:event_menuArchivoCerrarActionPerformed

    private void menuCramerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCramerActionPerformed
        // TODO add your handling code here:      
        FrameMatriz vactiva = (FrameMatriz) panelInterno.getSelectedFrame();
        if (vactiva!=null){
            int filas = FrameMatriz.modelo.getRowCount();
            int columnas = FrameMatriz.modelo.getColumnCount();
            double[][] matriz = new double[filas][columnas];
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    matriz[i][j] = Double.parseDouble(FrameMatriz.modelo.getValueAt(i, j).toString());
                }
            }                        
            
            FrameCramer fc = new FrameCramer(matriz, filas, columnas);
            
            //r.poner(vactiva.cadena());
            fc.setResizable(true);
            fc.setMaximizable(true);
            fc.setIconifiable(true);
            fc.setClosable(true);
            panelInterno.add(fc);
            fc.setTitle("Metodo de Cramer");
            fc.setVisible(true);
        }
        JOptionPane.showMessageDialog(this,"Sistema Resuelto Por El Metodo De Cramer");
    }//GEN-LAST:event_menuCramerActionPerformed

    private void cascadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cascadaActionPerformed
        // TODO add your handling code here:
        int i;
        int x,y;
        javax.swing.JInternalFrame v[]= panelInterno.getAllFrames();
        x=0;
        y=0;
        for(i=v.length-1;i>=0;i--){
            v[i].setSize(600,400);
            v[i].setLocation(x,y);
            x=x+30;
            y=y+30;
        }
    }//GEN-LAST:event_cascadaActionPerformed

    private void menuArchivoCerrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArchivoCerrarTodoActionPerformed
        // TODO add your handling code here:
        int i;
        javax.swing.JInternalFrame v[]= panelInterno.getAllFrames();
        for(i=0;i<=v.length-1;i++){
            v[i].dispose();
        }
    }//GEN-LAST:event_menuArchivoCerrarTodoActionPerformed

    private void menuArchivoSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArchivoSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_menuArchivoSalirActionPerformed

    private void menuDooliteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDooliteActionPerformed
        // TODO add your handling code here:
        FrameMatriz vactiva = (FrameMatriz) panelInterno.getSelectedFrame();
        
        if (vactiva != null) {
            int filas = FrameMatriz.modelo.getRowCount();
            int columnas = FrameMatriz.modelo.getColumnCount();
            double[][] matriz = new double[filas][columnas];
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    matriz[i][j] = Double.parseDouble(FrameMatriz.modelo.getValueAt(i, j).toString());
                }
            }

            FrameDoolite frd = new FrameDoolite(matriz, filas, columnas);

            //r.poner(vactiva.cadena());
            frd.setResizable(true);
            frd.setMaximizable(true);
            frd.setIconifiable(true);
            frd.setClosable(true);
            panelInterno.add(frd);
            frd.setTitle("Metodo de Doolite");
            frd.setVisible(true);
        }
        JOptionPane.showMessageDialog(this, "Sistema Resuelto Por El Metodo De Doolite");

    }//GEN-LAST:event_menuDooliteActionPerformed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        // TODO add your handling code here:
        About a= new About();
        a.setClosable(true);
        panelInterno.add(a);
        
        a.setTitle("Acerca de nosotros");
        a.setVisible(true);
    }//GEN-LAST:event_aboutActionPerformed

    private void ayudaGaussSeidelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaGaussSeidelActionPerformed
        // TODO add your handling code here:
        AyudaGaussSeidel a= new AyudaGaussSeidel();
        a.setClosable(true);
        panelInterno.add(a);
        
        a.setTitle("Ayuda Metodo Gauss - Seidel");
        a.setVisible(true);
    }//GEN-LAST:event_ayudaGaussSeidelActionPerformed

    private void menuCholeskyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCholeskyActionPerformed
        // TODO add your handling code here:
        FrameMatriz vactiva = (FrameMatriz) panelInterno.getSelectedFrame();

        if (vactiva != null) {
            int filas = FrameMatriz.modelo.getRowCount();
            int columnas = FrameMatriz.modelo.getColumnCount();
            double[][] matriz = new double[filas][columnas];
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    matriz[i][j] = Double.parseDouble(FrameMatriz.modelo.getValueAt(i, j).toString());
                }
            }

            FrameCholesky e = new FrameCholesky(matriz, filas, columnas);

            //r.poner(vactiva.cadena());
            e.setResizable(true);
            e.setMaximizable(true);
            e.setIconifiable(true);
            e.setClosable(true);
            panelInterno.add(e);
            e.setTitle("Metodo de Cholesky");
            e.setVisible(true);
        }
        JOptionPane.showMessageDialog(this, "Sistema Resuelto Por El Metodo De Cholesky");
    }//GEN-LAST:event_menuCholeskyActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        // TODO add your handling code here:
        FrameMatriz vp = new FrameMatriz();
        vp.setResizable(true);
        vp.setMaximizable(true);
        vp.setIconifiable(true);
        vp.setClosable(true);

        panelInterno.add(vp);
        vp.setTitle("Nueva Matriz");
        vp.setVisible(true);
        
    }//GEN-LAST:event_nuevoActionPerformed

    private void menuGaussSeidelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGaussSeidelActionPerformed
        // TODO add your handling code here:
        FrameMatriz vactiva = (FrameMatriz) panelInterno.getSelectedFrame();

        if (vactiva != null) {
            int filas = FrameMatriz.modelo.getRowCount();
            int columnas = FrameMatriz.modelo.getColumnCount();
            double[][] matriz = new double[filas][columnas];
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    matriz[i][j] = Double.parseDouble(FrameMatriz.modelo.getValueAt(i, j).toString());
                }
            }              
            FrameGaussSeidel e = new FrameGaussSeidel(filas, matriz);
            //r.poner(vactiva.cadena());
            e.setResizable(true);
            e.setMaximizable(true);
            e.setIconifiable(true);
            e.setClosable(true);
            panelInterno.add(e);
            e.setTitle("Metodo de Gauss - Seidel");
            e.setVisible(true);
        }
        JOptionPane.showMessageDialog(this, "Introduzca Parametros Para El Metodo De Gauss - Seidel");
    }//GEN-LAST:event_menuGaussSeidelActionPerformed

    private void ayudaCramerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaCramerActionPerformed
        // TODO add your handling code here:
        AyudaCramer a= new AyudaCramer();
        a.setClosable(true);
        panelInterno.add(a);
        
        a.setTitle("Ayuda Metodo Cramer");
        a.setVisible(true);
    }//GEN-LAST:event_ayudaCramerActionPerformed

    private void ayudaDooliteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaDooliteActionPerformed
        // TODO add your handling code here:
        AyudaDoolite a= new AyudaDoolite();
        a.setClosable(true);
        panelInterno.add(a);
        
        a.setTitle("Ayuda Metodo Doolite");
        a.setVisible(true);
    }//GEN-LAST:event_ayudaDooliteActionPerformed

    private void ayudaCholeskyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaCholeskyActionPerformed
        // TODO add your handling code here:
        AyudaCholesky a= new AyudaCholesky();
        a.setClosable(true);
        panelInterno.add(a);
        
        a.setTitle("Ayuda Metodo Cholesky");
        a.setVisible(true);
    }//GEN-LAST:event_ayudaCholeskyActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem about;
    private javax.swing.JMenu ayuda;
    private javax.swing.JMenuItem ayudaCholesky;
    private javax.swing.JMenuItem ayudaCramer;
    private javax.swing.JMenuItem ayudaDoolite;
    private javax.swing.JMenuItem ayudaGaussSeidel;
    private javax.swing.JMenuBar barraMenus;
    private javax.swing.JMenuItem cascada;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPopupMenu.Separator jSeparador;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuItem menuArchivoCerrar;
    private javax.swing.JMenuItem menuArchivoCerrarTodo;
    private javax.swing.JMenuItem menuArchivoSalir;
    private javax.swing.JMenuItem menuCholesky;
    private javax.swing.JMenuItem menuCramer;
    private javax.swing.JMenuItem menuDoolite;
    private javax.swing.JMenuItem menuGaussSeidel;
    private javax.swing.JMenu menuMetodos;
    private javax.swing.JMenu menuVentana;
    private javax.swing.JMenuItem nuevo;
    private javax.swing.JDesktopPane panelInterno;
    private javax.swing.JPopupMenu.Separator separador1;
    // End of variables declaration//GEN-END:variables
   
}
