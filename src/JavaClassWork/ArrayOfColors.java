package JavaClassWork;

public class ArrayOfColors {

    public static void main(String[] args) {

//        String [] colours = new String[7];

        String [] colours = {"Red","Blue","Yellow","Green","Black","Black","Orange","Pink"};

//        colours[0] = "Red";
//        colours[1] = "Blue";
//        colours[2] = "Yellow";
//        colours[3] = "Green";
//        colours[4] = "Black";
//        colours[5] = "Orange";
//        colours[6] = "Pink";

        for(int index = 0; index < colours.length; index++){
            System.out.println(index + " " + colours[index]);
        }
    }
}
