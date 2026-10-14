public class Stuhl
{
    private String  farbe;
    private int     hoehe;
    private boolean drehbar;
    
    public Stuhl(String neuFarbe, int neuHoehe, boolean neuDrehbar)
    {
        setFarbe(neuFarbe);
        setHoehe(neuHoehe);
        setDrehbar(neuDrehbar);
    }
    public Stuhl(String neuFarbe)
    {
        setFarbe(neuFarbe);
        setHoehe(45);
        setDrehbar(true);    
    }
    public Stuhl(int neuHoehe)
    {
        setFarbe("rot");
        setHoehe(neuHoehe);
        setDrehbar(false);
    }
    public Stuhl(boolean neuDrehbar)
    {
        setFarbe("blau");
        setHoehe(46);
        setDrehbar(neuDrehbar);
    }
    public void setFarbe(String neuFarbe)
    {
      farbe = neuFarbe;  
    }
    public void setHoehe(int neuHoehe)
    {
        hoehe = neuHoehe;
    }
    public void setDrehbar(boolean neuDrehbar)
    {
        drehbar = neuDrehbar;
    }
    public String getFarbe()
    {
        return farbe;
    }
    public String getHoehe()
    {
        return hoehe + " cm";
    }
    public boolean getDrehbar()
    {
        return drehbar; 
    }
    public void printstuhl()
    {
       // System.out.println("schwarz"+ " " + "Stuhl:" + "45cm"+ "-" + "true");
        System.out.println(getHoehe() + " " + getFarbe()+ " " + getDrehbar() );
    }
    
}