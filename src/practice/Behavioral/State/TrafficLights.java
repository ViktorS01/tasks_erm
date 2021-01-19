package practice.Behavioral.State;

public class TrafficLights {
    ColorLights colorLights;
    boolean isGreen;

    public void setColorLights(ColorLights colorLights){
        this.colorLights = colorLights;
    }

    public void nextColor(){
        if (colorLights instanceof Green){
            setColorLights(new Yellow());
            isGreen = true;
        }
        else if ((colorLights instanceof Yellow) && isGreen){
            setColorLights(new Red());
        }
        else if(colorLights instanceof Red){
            setColorLights(new Yellow());
            isGreen = false;
        }
        else if (colorLights instanceof Yellow){
            setColorLights(new Green());
        }
    }

    public void showColor (){
        colorLights.showColor();
    }
}
