package calccolor;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.opencv.core.Core;
import org.opencv.core.CvException;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

public class CalcColor extends javax.swing.JFrame {

    private JFileChooser fileChooser;
    private final JViewport view;
    private Mat image;
    private final EstadisticasImagen imageStatistics;
    
    static{
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }
    
    private class ManejadorBarra implements AdjustmentListener{

        @Override
        public void adjustmentValueChanged(AdjustmentEvent e) {
            if(image != null) calculateColors();
        }
    
    }
    
    public CalcColor() {
        imageStatistics = new EstadisticasImagen();
        initComponents();
        setMinimumSize(getPreferredSize());
        
        setMnemonic();
        setFileFilter();
        
        setColorLabels("red", 0, 0, 0);
        setColorLabels("green", 0, 0, 0);
        setColorLabels("blue", 0, 0, 0);
        
        view = scrollPane.getViewport();
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.getHorizontalScrollBar().addAdjustmentListener(new ManejadorBarra());
        scrollPane.getVerticalScrollBar().addAdjustmentListener(new ManejadorBarra());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane = new javax.swing.JScrollPane();
        imageBoard = new calccolor.Board();
        statisticsPanel = new javax.swing.JPanel();
        redLabel = new javax.swing.JLabel();
        blueLabel = new javax.swing.JLabel();
        greenLabel = new javax.swing.JLabel();
        maxRedLabel = new javax.swing.JLabel();
        minRedLabel = new javax.swing.JLabel();
        meanRedLabel = new javax.swing.JLabel();
        meanGreenLabel = new javax.swing.JLabel();
        minGreenLabel = new javax.swing.JLabel();
        maxGreenLabel = new javax.swing.JLabel();
        maxBlueLabel = new javax.swing.JLabel();
        minBlueLabel = new javax.swing.JLabel();
        meanBlueLabel = new javax.swing.JLabel();
        marLabel = new javax.swing.JLabel();
        mirLabel = new javax.swing.JLabel();
        merLabel = new javax.swing.JLabel();
        megLabel = new javax.swing.JLabel();
        magLabel = new javax.swing.JLabel();
        migLabel = new javax.swing.JLabel();
        mibLabel = new javax.swing.JLabel();
        mebLabel = new javax.swing.JLabel();
        mabLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        loadImageItem = new javax.swing.JMenuItem();
        exitItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        javax.swing.GroupLayout imageBoardLayout = new javax.swing.GroupLayout(imageBoard);
        imageBoard.setLayout(imageBoardLayout);
        imageBoardLayout.setHorizontalGroup(
            imageBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 622, Short.MAX_VALUE)
        );
        imageBoardLayout.setVerticalGroup(
            imageBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 361, Short.MAX_VALUE)
        );

        scrollPane.setViewportView(imageBoard);

        statisticsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Estadísticas"));

        redLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        redLabel.setText("Rojo:");

        blueLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        blueLabel.setText("Azul:");

        greenLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        greenLabel.setText("Verde:");

        maxRedLabel.setText("Máximo:");

        minRedLabel.setText("Mínimo:");

        meanRedLabel.setText("Promedio:");

        meanGreenLabel.setText("Promedio:");

        minGreenLabel.setText("Mínimo:");

        maxGreenLabel.setText("Máximo:");

        maxBlueLabel.setText("Máximo:");

        minBlueLabel.setText("Mínimo:");

        meanBlueLabel.setText("Promedio:");

        marLabel.setText("mar");

        mirLabel.setText("mir");

        merLabel.setText("mer");

        megLabel.setText("mer");

        magLabel.setText("mag");

        migLabel.setText("mig");

        mibLabel.setText("mib");

        mebLabel.setText("mer");

        mabLabel.setText("mab");

        javax.swing.GroupLayout statisticsPanelLayout = new javax.swing.GroupLayout(statisticsPanel);
        statisticsPanel.setLayout(statisticsPanelLayout);
        statisticsPanelLayout.setHorizontalGroup(
            statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(redLabel)
                    .addComponent(blueLabel)
                    .addComponent(greenLabel)
                    .addGroup(statisticsPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(statisticsPanelLayout.createSequentialGroup()
                                .addGroup(statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(meanBlueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(minBlueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(maxBlueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mabLabel)
                                    .addComponent(mibLabel)
                                    .addComponent(mebLabel)))
                            .addGroup(statisticsPanelLayout.createSequentialGroup()
                                .addGroup(statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(meanGreenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(minGreenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(maxGreenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(magLabel)
                                    .addComponent(migLabel)
                                    .addComponent(megLabel)))
                            .addGroup(statisticsPanelLayout.createSequentialGroup()
                                .addGroup(statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(meanRedLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(minRedLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(maxRedLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(marLabel)
                                    .addComponent(mirLabel)
                                    .addComponent(merLabel))))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        statisticsPanelLayout.setVerticalGroup(
            statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(redLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maxRedLabel)
                    .addComponent(marLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minRedLabel)
                    .addComponent(mirLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meanRedLabel)
                    .addComponent(merLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(greenLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(statisticsPanelLayout.createSequentialGroup()
                        .addComponent(maxGreenLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minGreenLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(meanGreenLabel))
                    .addGroup(statisticsPanelLayout.createSequentialGroup()
                        .addComponent(magLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(migLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(megLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(blueLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(statisticsPanelLayout.createSequentialGroup()
                        .addComponent(maxBlueLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minBlueLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(meanBlueLabel))
                    .addGroup(statisticsPanelLayout.createSequentialGroup()
                        .addComponent(mabLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mibLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mebLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ESTADÍSTICAS SUBIMAGEN - CALCCOLOR");

        fileMenu.setText("Archivo");

        loadImageItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        loadImageItem.setText("Cargar Imagen");
        loadImageItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadImageItemActionPerformed(evt);
            }
        });
        fileMenu.add(loadImageItem);

        exitItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        exitItem.setText("Salir");
        exitItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);

        helpMenu.setText("Ayuda");

        aboutItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        aboutItem.setText("Acerca De");
        aboutItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(statisticsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(statisticsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadImageItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadImageItemActionPerformed
        if(fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
            File file = fileChooser.getSelectedFile();
            if(!imageBoard.loadImage(file.getAbsolutePath(), getImageFormat(file.getAbsolutePath()))){
                JOptionPane.showMessageDialog(null, "No se ha podido cargar la imagen.", 
                        "Error al cargar la imagen", JOptionPane.ERROR_MESSAGE);
            }else{
                image = Imgcodecs.imread(file.getAbsolutePath());
                calculateColors();
            }
            repaint();
        }
    }//GEN-LAST:event_loadImageItemActionPerformed

    private void exitItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitItemActionPerformed
        if(closeWindow()) System.exit(0);
    }//GEN-LAST:event_exitItemActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if(closeWindow()) System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    private void aboutItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutItemActionPerformed
        JOptionPane.showMessageDialog(null, "Práctica realizada por:\nRaúl "
                + "Lozano Ponce\nPablo Perdomo Falcón", "Acerca De", 
                JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_aboutItemActionPerformed
    
    private void setMnemonic() {
        fileMenu.setMnemonic('A');
        helpMenu.setMnemonic('U');
        loadImageItem.setMnemonic('C');
        exitItem.setMnemonic('S');
        aboutItem.setMnemonic('A');
    }
    
    private void setFileFilter() {
        fileChooser = new JFileChooser();
        fileChooser.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter filter = null;
        filter = new FileNameExtensionFilter("Todos los formatos (BMP,GIF,JPEG,"
                + "PNG,TIFF)", "bmp", "gif", "jpeg", "jpg", "png", "tiff", "tif");
        fileChooser.addChoosableFileFilter(filter);
        filter = new FileNameExtensionFilter("Imágenes BMP", "bmp");
        fileChooser.addChoosableFileFilter(filter);
        filter = new FileNameExtensionFilter("Imágenes GIF", "gif");
        fileChooser.addChoosableFileFilter(filter);
        filter = new FileNameExtensionFilter("Imágenes JPEG", "jpeg", "jpg");
        fileChooser.addChoosableFileFilter(filter);
        filter = new FileNameExtensionFilter("Imágenes PNG", "png");
        fileChooser.addChoosableFileFilter(filter);
        filter = new FileNameExtensionFilter("Imágenes TIFF", "tiff", "tif");
        fileChooser.addChoosableFileFilter(filter);
    }
    
    private String getImageFormat(String name) {
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i) == '.') return name.substring(i+1);
        }
        return "";
    }
    
    private boolean closeWindow(){
        return (JOptionPane.showConfirmDialog(null, "¿Desea salir de Image Editor?", 
                "Salir", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
    }
    
    private void calculateColors(){
        int x, width, y, height;
        if(view.getExtentSize().getWidth() > imageBoard.getImageWidth()){
            x = 0;
            width = imageBoard.getImageWidth();
        }else{
            x = (int) view.getViewPosition().getX();
            width = (int) view.getExtentSize().getWidth();
        }
        if(view.getExtentSize().getHeight()> imageBoard.getImageHeight()){
            y = 0;
            height = imageBoard.getImageHeight();
        }else{
            y = (int) view.getViewPosition().getY();
            height = (int) view.getExtentSize().getHeight();
        }
        Point upLeftCorner = new Point(x, y);
        Dimension size = new Dimension(width, height);
        try{
            imageStatistics.calculaEstadisticas(image, upLeftCorner, size);
            setColorLabels("red", imageStatistics.getMaximo()[2], imageStatistics.getMinimo()[2], imageStatistics.getPromedio()[2]);
            setColorLabels("green", imageStatistics.getMaximo()[1], imageStatistics.getMinimo()[1], imageStatistics.getPromedio()[1]);
            setColorLabels("blue", imageStatistics.getMaximo()[0], imageStatistics.getMinimo()[0], imageStatistics.getPromedio()[0]);
        }catch(CvException e){
            JOptionPane.showMessageDialog(null, "No se ha podido calcular los colores de la imagen.", 
                        "Error al calcular los colores de la imagen", JOptionPane.ERROR_MESSAGE);
            imageBoard.resetImage();
            image = null;
        }
    }
    
    private void setColorLabels(String color, int max, int min, int mean){
        switch(color){
            case "red":
                marLabel.setText(Integer.toString(max));
                mirLabel.setText(Integer.toString(min));
                merLabel.setText(Integer.toString(mean));
                break;
            case "green":
                magLabel.setText(Integer.toString(max));
                migLabel.setText(Integer.toString(min));
                megLabel.setText(Integer.toString(mean));
                break;
            case "blue":
                mabLabel.setText(Integer.toString(max));
                mibLabel.setText(Integer.toString(min));
                mebLabel.setText(Integer.toString(mean));
                break;
        }
    }
    
    public static void main(String args[]) throws Exception {
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        java.awt.EventQueue.invokeLater(() -> { new CalcColor().setVisible(true); });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutItem;
    private javax.swing.JLabel blueLabel;
    private javax.swing.JMenuItem exitItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel greenLabel;
    private javax.swing.JMenu helpMenu;
    private calccolor.Board imageBoard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem loadImageItem;
    private javax.swing.JLabel mabLabel;
    private javax.swing.JLabel magLabel;
    private javax.swing.JLabel marLabel;
    private javax.swing.JLabel maxBlueLabel;
    private javax.swing.JLabel maxGreenLabel;
    private javax.swing.JLabel maxRedLabel;
    private javax.swing.JLabel meanBlueLabel;
    private javax.swing.JLabel meanGreenLabel;
    private javax.swing.JLabel meanRedLabel;
    private javax.swing.JLabel mebLabel;
    private javax.swing.JLabel megLabel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel merLabel;
    private javax.swing.JLabel mibLabel;
    private javax.swing.JLabel migLabel;
    private javax.swing.JLabel minBlueLabel;
    private javax.swing.JLabel minGreenLabel;
    private javax.swing.JLabel minRedLabel;
    private javax.swing.JLabel mirLabel;
    private javax.swing.JLabel redLabel;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JPanel statisticsPanel;
    // End of variables declaration//GEN-END:variables
}
