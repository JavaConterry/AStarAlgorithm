public class Field {

    private int length;
    private String[][] field;


    public Field(int _length){
        length = _length;
        field = new String[length][length];

        for(int i=0; i<length; i++){
            for(int j=0; j<length; j++){
                field[i][j] = "";
            }
        }

    }

    public int getLength(){
        return length;
    }

    public void ToString(){
        for(int i=0; i<length; i++){
            for(int j=0; j<length; j++){
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }

}
