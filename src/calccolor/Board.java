package calccolor;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Board extends JPanel {
    
    private BufferedImage image;
    private List<String> formatList;
    
    public Board(){
        formatList = new ArrayList<>();
        formatList.add("bmp");
        formatList.add("gif");
        formatList.add("jpeg");
        formatList.add("jpg");
        formatList.add("png");
        formatList.add("tiff");
        formatList.add("tif");
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if(image != null){
            this.setPreferredSize(new Dimension(image.getWidth(), image.getHeight()));
            int x = image.getWidth() < getWidth() ? getImageX() : 0;
            int y = image.getHeight() < getHeight() ? getImageY() : 0;
            g.drawImage(image, x, y, this);
        }
    }
    
    private int getImageX(){
        return (getWidth() - image.getWidth())/2;
    }
    
    private int getImageY(){
        return (getHeight()- image.getHeight())/2;
    }
    
    public int getImageWidth(){
        return image.getWidth();
    }
    
    public int getImageHeight(){
        return image.getHeight();
    }
    
    public boolean loadImage(String path, String imageFormat){
        if(formatList.contains(imageFormat)){
            try {
                image = ImageIO.read(new File(path));
                return true;
            } catch (IOException ex) {
                return false;
            }
        }
        return false;
    }
    
    public void resetImage(){
        image = null;
    }    
}
