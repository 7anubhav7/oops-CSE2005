class Assign51 {
    int x = 10;
    int display()
    {
        System.out.println("x = " + x);
        return 0;
    }
    public static void main(String[] args)
    {
        Assign51 D1 = new Assign51(); //reference variable
        System.out.println(D1); 
        System.out.println(D1.display());
    }}