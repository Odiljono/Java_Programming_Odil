package sunday_live_classes.week14.bank;

public class MultipleExample {
    public static void main(String[] args) throws NullPointerException, InterruptedException{


        try {

        } catch (StringIndexOutOfBoundsException e) {

        } catch (NullPointerException e) {

        } catch (ArrayIndexOutOfBoundsException e) {

        }

        // variation

        try {

        }catch (IndexOutOfBoundsException e){

        }

        // variation

        try{

            int[] a = {1, 3, 4};
            a[100] = 10;

            int[] b = null;
            b[0] = 1;

        } catch (NullPointerException | IndexOutOfBoundsException e){
            e.printStackTrace();
        }


    }
}