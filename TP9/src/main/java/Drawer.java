import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.input.KeyEvent;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Drawer extends Canvas {
    private List<Shape> shapes;

    public Drawer(double width, double height){
        super(width, height);
        setFocusTraversable(true);
        shapes = new ArrayList<>();
        setOnKeyPressed(this::keyPressed);
    }

    public void keyPressed(KeyEvent event){
        switch (event.getCode()){
            case S:
                save();
                break;
            case L:
                load();
            default:
                break;
        }
    }

    private void save(){
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save");
        File file = fileChooser.showSaveDialog(getScene().getWindow());
        if(file == null)
            return;
        try{
            ShapeWriter.write(file, shapes);
        } catch (IOException e) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Erreur dialog");
            alert.setHeaderText(null);
            alert.setContentText("T NUL");
            alert.showAndWait();
        }
    }

    private void load(){
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Load");
        File file = fileChooser.showOpenDialog(getScene().getWindow());
        if (file == null) return;
        try {
            shapes = ShapeReader.read(file);
            repaint();
        } catch (IOException e) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error Dialog");
            alert.setHeaderText(null);
            alert.setContentText("Ooops, there was an error!");
            alert.showAndWait();
        }
    }

    public void add(Shape shape){
        shapes.add(shape);
    }

    public void repaint(){
        GraphicsContext gc = getGraphicsContext2D();
        gc.clearRect(0, 0, getWidth(), getHeight());
        drawShapes(gc);
    }

    private void drawShapes(GraphicsContext gc){
        for(Shape shape : shapes){
            shape.paint(gc);
        }
    }

    public Shape shapeContaining(double x, double y){
        // on renvoie celle qui est au dessus des autres s'il y a en a plusieurs.
        // Balayage de la droite vers la gauche dans shapes
        // On renvoie null si on ne trouve rien

        for(int i=shapes.size() - 1; i >= 0; --i){
            Shape shape = shapes.get(i);
            if(shape.contains(x,y)) return shape;
        }
        return null;
    }
}