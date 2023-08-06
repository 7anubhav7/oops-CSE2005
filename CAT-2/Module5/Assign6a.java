package Module5; //22BCE9109
class Assign6a {
    synchronized public void getLine() {
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
            try
            {
                Thread.sleep(400);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }}}