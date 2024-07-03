package Jour08.Job3;

public class Collect {
    
    private Form collect[];
    private int index;

    public Collect(int indexMax){
        collect = new Form[indexMax];
        index = -1;
    }

    public void add(Form a){
        if(index < collect.length - 1){
            index++;
            collect[index] = a;
        }
    }

    public void draw(){
        for(int i=0; i<=index; i++){
            collect[i].draw();
        }
    }
}