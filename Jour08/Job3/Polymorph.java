package Jour08.Job3;

public class Polymorph {
    
    public static void main(String[] args) {
       Form[] tabForms =
       {
            new Circle("red"),
            new Triangle("yellow")
       };
       
       Collect forms = new Collect(10);

       for(int i = 0; i < tabForms.length; i++){
           forms.add((tabForms[i]));
           // forms.add(new Form(tabForms[i]));                Creating a new Form loses the specificities of the Triangle and Circle classes
       }

        forms.draw();

    }

    // Output:
    // One form red
    // One form red
    // One form yellow
}